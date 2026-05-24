package com.choiceeat.backend.domain.adView.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdViewRequestDto {

    @NotNull(message = "광고 ID는 필수입니다.")
    private Long advertisementId; // 시청한 광고 ID

    private Long recommendationId; // 연관된 추천 세션 ID (NULL 가능)

    @NotNull(message = "시청 완료 여부는 필수입니다.")
    private boolean completed; // 시청 완료 여부
}