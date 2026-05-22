package com.choiceeat.backend.domain.recommendation.dto;

import java.util.List;

public record RecommendationResponse(
        String menuType,
        String mood,
        String budget,
        List<RecommendedRestaurantResponse> recommendations
) {
}
