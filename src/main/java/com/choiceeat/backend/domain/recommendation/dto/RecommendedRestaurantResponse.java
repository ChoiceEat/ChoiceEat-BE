package com.choiceeat.backend.domain.recommendation.dto;

import com.choiceeat.backend.domain.recommendation.type.RecommendationType;
import com.choiceeat.backend.domain.restaurant.entity.Restaurant;

import java.util.List;

public record RecommendedRestaurantResponse(
        String recommendationType,
        String recommendationDescription,
        String kakaoPlaceId,
        String placeName,
        String address,
        String roadAddress,
        Double latitude,
        Double longitude,
        String phone,
        String placeUrl,
        String imageUrl,
        String menuType,
        List<String> moodTags,
        Integer minPrice,
        Integer maxPrice,
        Integer averagePrice,
        Double rating,
        Integer reviewCount,
        String businessHours,
        Boolean parkingAvailable,
        Double distanceKm
) {
    public static RecommendedRestaurantResponse from(RecommendationType recommendationType, Restaurant restaurant, double distanceKm) {

        return new RecommendedRestaurantResponse(
                recommendationType.getDisplayName(),
                recommendationType.getDescription(),
                restaurant.getKakaoPlaceId(),
                restaurant.getName(),
                restaurant.getAddress(),
                restaurant.getRoadAddress(),
                restaurant.getLatitude(),
                restaurant.getLongitude(),
                restaurant.getPhone(),
                restaurant.getPlaceUrl(),
                restaurant.getImageUrl(),
                restaurant.getCategory(),
                restaurant.getMoodTags(),
                restaurant.getMinPrice(),
                restaurant.getMaxPrice(),
                restaurant.getAveragePrice(),
                restaurant.getRating() == null ? null : restaurant.getRating().doubleValue(),
                restaurant.getReviewCount(),
                restaurant.getBusinessHours(),
                restaurant.getParkingAvailable(),
                Math.round(distanceKm * 10.0) / 10.0
        );
    }
}
