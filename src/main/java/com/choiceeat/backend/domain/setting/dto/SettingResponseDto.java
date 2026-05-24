package com.choiceeat.backend.domain.setting.dto;

import com.choiceeat.backend.domain.setting.entity.Setting;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class SettingResponseDto {
    private boolean locationEnabled;
    private boolean notificationEnabled;
    private boolean marketingEnabled;
    private int searchRadiusKm;

    // 엔터티를 받아 DTO로 변환하는 정적 팩토리 메서드
    public static SettingResponseDto from(Setting setting) {
        return SettingResponseDto.builder()
                .locationEnabled(setting.isLocationEnabled())
                .notificationEnabled(setting.isNotificationEnabled())
                .marketingEnabled(setting.isMarketingEnabled())
                .searchRadiusKm(setting.getSearchRadiusKm())
                .build();
    }
}
