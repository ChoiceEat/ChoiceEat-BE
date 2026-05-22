package com.choiceeat.backend.domain.recommendation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RecommendationRequest(
        @NotBlank(message = "메뉴는 필수입니다.")
        String menuType,

        @NotBlank(message = "분위기는 필수입니다.")
        String mood,

        @NotBlank(message = "예산은 필수입니다.")
        String budget,

        @NotNull(message = "위도는 필수입니다.")
        Double latitude,

        @NotNull(message = "경도는 필수입니다.")
        Double longitude
) {
}
