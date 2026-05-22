package com.choiceeat.backend.domain.recommendation.dto;

import com.choiceeat.backend.domain.recommendation.data.MockRestaurant;

import java.util.List;

public record RecommendedRestaurantResponse(
        String recommendationType,
        String placeName,
        String address,
        String roadAddress,
        Double latitude,
        Double longitude,
        String phone,
        String placeUrl,
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
    public static RecommendedRestaurantResponse from(String recommendationType, MockRestaurant restaurant, double distanceKm) {
        return new RecommendedRestaurantResponse(
                recommendationType,
                restaurant.placeName(),
                restaurant.address(),
                restaurant.roadAddress(),
                restaurant.latitude(),
                restaurant.longitude(),
                restaurant.phone(),
                restaurant.placeUrl(),
                restaurant.menuType(),
                restaurant.moodTags(),
                restaurant.minPrice(),
                restaurant.maxPrice(),
                restaurant.averagePrice(),
                restaurant.rating(),
                restaurant.reviewCount(),
                restaurant.businessHours(),
                restaurant.parkingAvailable(),
                Math.round(distanceKm * 10.0) / 10.0
        );
    }
}
