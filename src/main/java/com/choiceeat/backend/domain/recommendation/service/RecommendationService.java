package com.choiceeat.backend.domain.recommendation.service;

import com.choiceeat.backend.domain.adView.service.AdViewService;

import com.choiceeat.backend.domain.destination.entity.SelectedDestination;

import com.choiceeat.backend.domain.destination.service.DestinationService;

import com.choiceeat.backend.domain.recommendation.dto.RecommendationRequest;

import com.choiceeat.backend.domain.recommendation.dto.RecommendationRerollRequest;

import com.choiceeat.backend.domain.recommendation.dto.RecommendationResponse;

import com.choiceeat.backend.domain.recommendation.dto.RecommendedRestaurantResponse;

import com.choiceeat.backend.domain.recommendation.exception.RecommendationErrorCode;

import com.choiceeat.backend.domain.recommendation.type.RecommendationType;

import com.choiceeat.backend.domain.restaurant.entity.Restaurant;

import com.choiceeat.backend.domain.restaurant.repository.RestaurantRepository;

import com.choiceeat.backend.domain.setting.entity.Setting;

import com.choiceeat.backend.domain.setting.exception.SettingErrorCode;

import com.choiceeat.backend.domain.setting.repository.SettingRepository;

import com.choiceeat.backend.domain.user.entity.User;

import com.choiceeat.backend.domain.user.exception.UserErrorCode;

import com.choiceeat.backend.domain.user.repository.UserRepository;

import com.choiceeat.backend.global.exception.BaseException;

import com.choiceeat.backend.global.util.SecurityUtil;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;



import java.util.ArrayList;

import java.util.Comparator;

import java.util.HashSet;

import java.util.LinkedHashMap;

import java.util.List;

import java.util.Map;

import java.util.Set;

import java.util.function.ToDoubleFunction;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private static final double EARTH_RADIUS_KM = 6371.0;
    private final AdViewService adViewService;
    private final DestinationService destinationService;
    private final RestaurantRepository restaurantRepository;
    private final SettingRepository settingRepository;
    private final UserRepository userRepository;

    public RecommendationResponse recommend(RecommendationRequest request) {
        SelectedDestination selectedDestination = getCurrentUserSelectedDestination();
        RecommendationCriteria criteria = new RecommendationCriteria(
                request.menuType(),
                request.mood(),
                request.budget(),
                selectedDestination.getLatitude(),
                selectedDestination.getLongitude(),
                Set.of(),
                getCurrentUserSearchRadiusKm()
        );
        return recommendByCriteria(criteria);
    }

    public RecommendationResponse reroll(RecommendationRerollRequest request) {
        SelectedDestination selectedDestination = getCurrentUserSelectedDestination();
        Set<String> excludedKakaoPlaceIds = request.excludedKakaoPlaceIds() == null
                ? Set.of()
                : new HashSet<>(request.excludedKakaoPlaceIds());
        RecommendationCriteria criteria = new RecommendationCriteria(
                request.menuType(),
                request.mood(),
                request.budget(),
                selectedDestination.getLatitude(),
                selectedDestination.getLongitude(),
                excludedKakaoPlaceIds,
                getCurrentUserSearchRadiusKm()
        );

        RecommendationResponse response = recommendByCriteria(criteria);
        adViewService.consumeCompletedAdViewForReroll();
        return response;
    }

    private RecommendationResponse recommendByCriteria(RecommendationCriteria criteria) {
        // 1차 후보 필터링
        List<ScoredRestaurant> exactCandidates = restaurantRepository.findAll().stream()
                .filter(restaurant -> !criteria.excludedKakaoPlaceIds().contains(restaurant.getKakaoPlaceId()))
                .filter(restaurant -> criteria.menuType().equals(restaurant.getCategory()))
                .filter(restaurant -> containsMood(restaurant, criteria.mood()))
                .filter(restaurant -> matchesBudget(restaurant, criteria.budget()))
                .map(restaurant -> toScoredRestaurant(criteria, restaurant))
                .filter(candidate -> candidate.distanceKm() <= criteria.searchRadiusKm())
                .toList();

        // 보충 후보 추가
        List<ScoredRestaurant> candidates = new ArrayList<>(exactCandidates);
        appendFallbackCandidates(candidates, criteria);
        if (candidates.size() < 3) {
            throw new BaseException(RecommendationErrorCode.RECOMMENDATION_NOT_FOUND);
        }

        ScoreContext scoreContext = createScoreContext(candidates);
        // 추천 타입별 선정
        Map<RecommendationType, ScoredRestaurant> recommendations = new LinkedHashMap<>();
        addBestRecommendation(recommendations, RecommendationType.BALANCE, candidates, candidate -> calculateBalanceScore(candidate, scoreContext));
        addBestRecommendation(recommendations, RecommendationType.VALUE, candidates, this::calculateValueRawScore);
        addBestRecommendation(recommendations, RecommendationType.QUALITY, candidates, this::calculateQualityRawScore);

        // 응답 DTO 변환
        List<RecommendedRestaurantResponse> responseItems = recommendations.entrySet().stream()
                .map(entry -> RecommendedRestaurantResponse.from(
                        entry.getKey(),
                        entry.getValue().restaurant(),
                        entry.getValue().distanceKm()
                ))
                .toList();
        return new RecommendationResponse(
                criteria.menuType(),
                criteria.mood(),
                criteria.budget(),
                responseItems
        );
    }

    private void appendFallbackCandidates(List<ScoredRestaurant> candidates, RecommendationCriteria criteria) {
        if (candidates.size() >= 3) {
            return;
        }

        // 조건 일부 일치 후보
        restaurantRepository.findAll().stream()
                .filter(restaurant -> !criteria.excludedKakaoPlaceIds().contains(restaurant.getKakaoPlaceId()))
                .filter(restaurant -> criteria.menuType().equals(restaurant.getCategory()))
                .filter(restaurant -> containsMood(restaurant, criteria.mood())
                        || matchesBudget(restaurant, criteria.budget()))
                .map(restaurant -> toScoredRestaurant(criteria, restaurant))
                .filter(candidate -> candidate.distanceKm() <= criteria.searchRadiusKm())
                .filter(candidate -> !containsRestaurant(candidates, candidate.restaurant().getKakaoPlaceId()))
                .forEach(candidates::add);
    }

    private int getCurrentUserSearchRadiusKm() {
        User user = getCurrentUser();
        Setting setting = settingRepository.findByUser(user)
                .orElseThrow(() -> new BaseException(SettingErrorCode.SETTING_NOT_FOUND));
        return setting.getSearchRadiusKm();
    }

    private SelectedDestination getCurrentUserSelectedDestination() {
        return destinationService.getSelectedDestinationEntity(getCurrentUser());
    }

    private User getCurrentUser() {
        Long userId = SecurityUtil.getCurrentUserId();
        return userRepository.findById(userId)
                .orElseThrow(() -> new BaseException(UserErrorCode.USER_NOT_FOUND));
    }

    private ScoredRestaurant toScoredRestaurant(RecommendationCriteria criteria, Restaurant restaurant) {
        return new ScoredRestaurant(
                restaurant,
                calculateDistanceKm(
                        criteria.latitude(),
                        criteria.longitude(),
                        restaurant.getLatitude(),
                        restaurant.getLongitude()
                )
        );
    }

    private void addBestRecommendation(
            Map<RecommendationType, ScoredRestaurant> recommendations,
            RecommendationType recommendationType,
            List<ScoredRestaurant> candidates,
            ToDoubleFunction<ScoredRestaurant> scoreCalculator
    ) {
        candidates.stream()
                .filter(candidate -> !containsRestaurant(
                        recommendations.values(),
                        candidate.restaurant().getKakaoPlaceId()
                ))
                .max(Comparator.comparingDouble(scoreCalculator))
                .ifPresent(candidate -> recommendations.put(recommendationType, candidate));
    }

    private boolean containsRestaurant(Iterable<ScoredRestaurant> candidates, String kakaoPlaceId) {
        for (ScoredRestaurant candidate : candidates) {
            if (candidate.restaurant().getKakaoPlaceId().equals(kakaoPlaceId)) {
                return true;
            }
        }
        return false;
    }

    private boolean matchesBudget(Restaurant restaurant, String budget) {
        PriceRange selectedBudget = toPriceRange(budget);
        int minPrice = restaurant.getMinPrice() == null ? 0 : restaurant.getMinPrice();
        int maxPrice = restaurant.getMaxPrice() == null ? Integer.MAX_VALUE : restaurant.getMaxPrice();
        return maxPrice >= selectedBudget.minPrice()
                && minPrice <= selectedBudget.maxPrice();
    }

    private PriceRange toPriceRange(String budget) {
        return switch (normalizeBudget(budget)) {
            case "1만원미만" -> new PriceRange(0, 9999);
            case "1만원~2만원", "1만원-2만원" -> new PriceRange(10000, 20000);
            case "2만원~3만원", "2만원-3만원" -> new PriceRange(20000, 30000);
            case "3만원초과" -> new PriceRange(30001, Integer.MAX_VALUE);
            default -> new PriceRange(0, Integer.MAX_VALUE);
        };
    }

    private boolean containsMood(Restaurant restaurant, String mood) {
        String normalizedMood = normalizeMood(mood);
        if (restaurant.getMoodTags() == null) {
            return false;
        }
        return restaurant.getMoodTags().stream()
                .map(this::normalizeMood)
                .anyMatch(normalizedMood::equals);
    }

    private String normalizeMood(String mood) {
        return switch (mood) {
            case "혼밥하기 좋은" -> "혼밥";
            case "분위기 좋은" -> "데이트하기 좋은";
            default -> mood;
        };
    }

    private String normalizeBudget(String budget) {
        return budget.replace(" ", "");
    }

    private double calculateValueRawScore(ScoredRestaurant candidate) {
        Restaurant restaurant = candidate.restaurant();
        // 가성비 점수
        double priceScore = 100.0 - Math.min(getAveragePrice(restaurant) / 500.0, 80.0);
        double reviewScore = Math.min(getReviewCount(restaurant) / 20.0, 20.0);
        double distancePenalty = Math.min(candidate.distanceKm() * 4.0, 20.0);
        return priceScore + reviewScore + getRating(restaurant) * 4.0 - distancePenalty;
    }

    private double calculateQualityRawScore(ScoredRestaurant candidate) {
        Restaurant restaurant = candidate.restaurant();
        // 퀄리티 점수
        double ratingScore = getRating(restaurant) * 20.0;
        double reviewScore = Math.min(getReviewCount(restaurant) / 15.0, 25.0);
        double distancePenalty = Math.min(candidate.distanceKm() * 2.0, 15.0);
        return ratingScore + reviewScore - distancePenalty;
    }

    private int getAveragePrice(Restaurant restaurant) {
        return restaurant.getAveragePrice() == null ? 0 : restaurant.getAveragePrice();
    }

    private int getReviewCount(Restaurant restaurant) {
        return restaurant.getReviewCount() == null ? 0 : restaurant.getReviewCount();
    }

    private double getRating(Restaurant restaurant) {
        return restaurant.getRating() == null ? 0.0 : restaurant.getRating();
    }

    private ScoreContext createScoreContext(List<ScoredRestaurant> candidates) {
        double minValueScore = candidates.stream()
                .mapToDouble(this::calculateValueRawScore)
                .min()
                .orElse(0.0);
        double maxValueScore = candidates.stream()
                .mapToDouble(this::calculateValueRawScore)
                .max()
                .orElse(0.0);
        double minQualityScore = candidates.stream()
                .mapToDouble(this::calculateQualityRawScore)
                .min()
                .orElse(0.0);
        double maxQualityScore= candidates.stream()
                .mapToDouble(this::calculateQualityRawScore)
                .max()
                .orElse(0.0);

        return new ScoreContext(minValueScore, maxValueScore, minQualityScore, maxQualityScore);
    }

    private double calculateBalanceScore(ScoredRestaurant candidate, ScoreContext scoreContext) {
        // 밸런스 점수
        return normalize(calculateValueRawScore(candidate), scoreContext.minValueScore(), scoreContext.maxValueScore()) * 0.45
                + normalize(calculateQualityRawScore(candidate), scoreContext.minQualityScore(), scoreContext.maxQualityScore()) * 0.45
                + calculateDistanceScore(candidate.distanceKm()) * 0.10;
    }

    private double normalize(double score, double minScore, double maxScore) {
        if (Double.compare(minScore, maxScore) == 0) {
            return 0.0;
        }
        return Math.max(0.0, Math.min(100.0, (score - minScore) / (maxScore - minScore) * 100.0));
    }

    private double calculateDistanceScore(double distanceKm) {
        return Math.max(0.0, Math.min(100.0, 100.0 - distanceKm * 10.0));
    }

    private double calculateDistanceKm(double startLatitude, double startLongitude, double endLatitude, double endLongitude) {
        double latitudeDistance = Math.toRadians(endLatitude - startLatitude);
        double longitudeDistance = Math.toRadians(endLongitude - startLongitude);
        double startLatitudeRad = Math.toRadians(startLatitude);
        double endLatitudeRad = Math.toRadians(endLatitude);

        double haversine = Math.sin(latitudeDistance / 2) * Math.sin(latitudeDistance / 2)
                + Math.cos(startLatitudeRad) * Math.cos(endLatitudeRad)
                * Math.sin(longitudeDistance / 2) * Math.sin(longitudeDistance / 2);
        double centralAngle = 2 * Math.atan2(Math.sqrt(haversine), Math.sqrt(1 - haversine));

        return EARTH_RADIUS_KM * centralAngle;
    }

    private record ScoredRestaurant(
            Restaurant restaurant,
            double distanceKm
    ) {
    }

    private record RecommendationCriteria(
            String menuType,
            String mood,
            String budget,
            Double latitude,
            Double longitude,
            Set<String> excludedKakaoPlaceIds,
            int searchRadiusKm
    ) {
    }

    private record PriceRange(
            int minPrice,
            int maxPrice
    ) {
    }

    private record ScoreContext(
            double minValueScore,
            double maxValueScore,
            double minQualityScore,
            double maxQualityScore
    ) {
    }
}
