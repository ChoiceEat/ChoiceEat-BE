package com.choiceeat.backend.domain.recommendation.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record RecommendationRerollRequest(
        @NotBlank(message = "메뉴는 필수입니다.")
        String menuType,

        @NotBlank(message = "분위기는 필수입니다.")
        String mood,

        @NotBlank(message = "예산은 필수입니다.")
        String budget,

        List<String> excludedKakaoPlaceIds
) {
}
