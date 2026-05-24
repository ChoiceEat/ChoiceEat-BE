package com.choiceeat.backend.domain.recommendation.service;

import com.choiceeat.backend.domain.recommendation.data.MockRestaurant;
import com.choiceeat.backend.domain.recommendation.data.MockRestaurantData;
import com.choiceeat.backend.domain.recommendation.dto.RecommendationRequest;
import com.choiceeat.backend.domain.recommendation.dto.RecommendationRerollRequest;
import com.choiceeat.backend.domain.recommendation.dto.RecommendationResponse;
import com.choiceeat.backend.domain.recommendation.dto.RecommendedRestaurantResponse;
import com.choiceeat.backend.domain.recommendation.exception.RecommendationErrorCode;
import com.choiceeat.backend.global.exception.BaseException;
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
public class RecommendationService {

    private static final double EARTH_RADIUS_KM = 6371.0;
    private static final double DEFAULT_SEARCH_RADIUS_KM = 3.0; // TODO: 추후 설정 페이지에서 반경 선택 기능 붙으면 사용자 설정값으로 교체 예정

    public RecommendationResponse recommend(RecommendationRequest request) {
        RecommendationCriteria criteria = new RecommendationCriteria(
                request.menuType(),
                request.mood(),
                request.budget(),
                request.latitude(),
                request.longitude(),
                Set.of()
        );

        return recommendByCriteria(criteria);
    }

    public RecommendationResponse reroll(RecommendationRerollRequest request) {
        Set<String> excludedKakaoPlaceIds = request.excludedKakaoPlaceIds() == null
                ? Set.of()
                : new HashSet<>(request.excludedKakaoPlaceIds());

        RecommendationCriteria criteria = new RecommendationCriteria(
                request.menuType(),
                request.mood(),
                request.budget(),
                request.latitude(),
                request.longitude(),
                excludedKakaoPlaceIds
        );

        return recommendByCriteria(criteria);
    }

    private RecommendationResponse recommendByCriteria(RecommendationCriteria criteria) {
        // 1차 후보 필터링
        List<ScoredRestaurant> exactCandidates = MockRestaurantData.findAll().stream()
                .filter(restaurant -> !criteria.excludedKakaoPlaceIds().contains(restaurant.kakaoPlaceId()))
                .filter(restaurant -> restaurant.menuType().equals(criteria.menuType()))
                .filter(restaurant -> containsMood(restaurant, criteria.mood()))
                .filter(restaurant -> matchesBudget(restaurant, criteria.budget()))
                .map(restaurant -> toScoredRestaurant(criteria, restaurant))
                .filter(candidate -> candidate.distanceKm() <= DEFAULT_SEARCH_RADIUS_KM)
                .toList();

        // 보충 후보 추가
        List<ScoredRestaurant> candidates = new ArrayList<>(exactCandidates);
        appendFallbackCandidates(candidates, criteria);
        if (candidates.size() < 3) {
            throw new BaseException(RecommendationErrorCode.RECOMMENDATION_NOT_FOUND);
        }

        ScoreContext scoreContext = createScoreContext(candidates);

        // 추천 타입별 선정
        Map<String, ScoredRestaurant> recommendations = new LinkedHashMap<>();
        addBestRecommendation(recommendations, "밸런스", candidates, candidate -> calculateBalanceScore(candidate, scoreContext));
        addBestRecommendation(recommendations, "가성비", candidates, this::calculateValueRawScore);
        addBestRecommendation(recommendations, "퀄리티", candidates, this::calculateQualityRawScore);

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
        MockRestaurantData.findAll().stream()
                .filter(restaurant -> !criteria.excludedKakaoPlaceIds().contains(restaurant.kakaoPlaceId()))
                .filter(restaurant -> restaurant.menuType().equals(criteria.menuType()))
                .filter(restaurant -> containsMood(restaurant, criteria.mood())
                        || matchesBudget(restaurant, criteria.budget()))
                .map(restaurant -> toScoredRestaurant(criteria, restaurant))
                .filter(candidate -> candidate.distanceKm() <= DEFAULT_SEARCH_RADIUS_KM)
                .filter(candidate -> !containsRestaurant(candidates, candidate.restaurant().kakaoPlaceId()))
                .forEach(candidates::add);
    }

    private ScoredRestaurant toScoredRestaurant(RecommendationCriteria criteria, MockRestaurant restaurant) {
        return new ScoredRestaurant(
                restaurant,
                calculateDistanceKm(
                        criteria.latitude(),
                        criteria.longitude(),
                        restaurant.latitude(),
                        restaurant.longitude()
                )
        );
    }

    private void addBestRecommendation(
            Map<String, ScoredRestaurant> recommendations,
            String recommendationType,
            List<ScoredRestaurant> candidates,
            ToDoubleFunction<ScoredRestaurant> scoreCalculator
    ) {
        candidates.stream()
                .filter(candidate -> !containsRestaurant(
                        recommendations.values(),
                        candidate.restaurant().kakaoPlaceId()
                ))
                .max(Comparator.comparingDouble(scoreCalculator))
                .ifPresent(candidate -> recommendations.put(recommendationType, candidate));
    }

    private boolean containsRestaurant(Iterable<ScoredRestaurant> candidates, String kakaoPlaceId) {
        for (ScoredRestaurant candidate : candidates) {
            if (candidate.restaurant().kakaoPlaceId().equals(kakaoPlaceId)) {
                return true;
            }
        }
        return false;
    }

    private boolean matchesBudget(MockRestaurant restaurant, String budget) {
        PriceRange selectedBudget = toPriceRange(budget);
        return restaurant.maxPrice() >= selectedBudget.minPrice()
                && restaurant.minPrice() <= selectedBudget.maxPrice();
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

    private boolean containsMood(MockRestaurant restaurant, String mood) {
        String normalizedMood = normalizeMood(mood);
        return restaurant.moodTags().stream()
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
        MockRestaurant restaurant = candidate.restaurant();
        // 가성비 점수
        double priceScore = 100.0 - Math.min(restaurant.averagePrice() / 500.0, 80.0);
        double reviewScore = Math.min(restaurant.reviewCount() / 20.0, 20.0);
        double distancePenalty = Math.min(candidate.distanceKm() * 4.0, 20.0);
        return priceScore + reviewScore + restaurant.rating() * 4.0 - distancePenalty;
    }

    private double calculateQualityRawScore(ScoredRestaurant candidate) {
        MockRestaurant restaurant = candidate.restaurant();
        // 퀄리티 점수
        double ratingScore = restaurant.rating() * 20.0;
        double reviewScore = Math.min(restaurant.reviewCount() / 15.0, 25.0);
        double distancePenalty = Math.min(candidate.distanceKm() * 2.0, 15.0);
        return ratingScore + reviewScore - distancePenalty;
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
        double maxQualityScore = candidates.stream()
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
            MockRestaurant restaurant,
            double distanceKm
    ) {
    }

    private record RecommendationCriteria(
            String menuType,
            String mood,
            String budget,
            Double latitude,
            Double longitude,
            Set<String> excludedKakaoPlaceIds
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
