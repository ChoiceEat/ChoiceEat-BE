package com.choiceeat.backend.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AdConfig {

    private final String repickSlotId;

    public AdConfig(@Value("${ad.slots.repick}") String repickSlotId) {
        this.repickSlotId = repickSlotId;
    }

    public boolean isValidAdId(Long id) {
        // "다시 뽑기" 광고 ID인 3번만 유효
        return id != null && id == 3L;
    }
}