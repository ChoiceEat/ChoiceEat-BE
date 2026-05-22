package com.choiceeat.backend.domain.adView.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdViewRequestDto {
    private Long advertisementId;      // 시청한 광고 ID
    private Long recommendationId;     // 연관된 추천 세션 ID (NULL 가능)
    private boolean completed;         // 시청 완료 여부
}