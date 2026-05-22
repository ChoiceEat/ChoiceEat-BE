package com.choiceeat.backend.domain.recommendation.data;

import java.util.List;

public record MockRestaurant(
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
        Boolean parkingAvailable
) {
}
