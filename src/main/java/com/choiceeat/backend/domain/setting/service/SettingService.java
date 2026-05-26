package com.choiceeat.backend.domain.setting.service;

import com.choiceeat.backend.domain.setting.dto.SettingRequestDto;
import com.choiceeat.backend.domain.setting.dto.SettingResponseDto;
import com.choiceeat.backend.domain.setting.entity.Setting;
import com.choiceeat.backend.domain.setting.exception.SettingErrorCode;
import com.choiceeat.backend.domain.setting.repository.SettingRepository;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.global.exception.BaseException;
import com.choiceeat.backend.global.response.code.ErrorResponseCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SettingService {

    private final SettingRepository settingRepository;

    // 1. 설정 조회
    public SettingResponseDto getSetting(User user) {
        Setting setting = settingRepository.findByUser(user)
                .orElseThrow(() -> new BaseException(SettingErrorCode.SETTING_NOT_FOUND));
        return SettingResponseDto.from(setting);
    }

    // 2. 설정 수정
    @Transactional
    public SettingResponseDto updateSetting(User user, SettingRequestDto request) {
        Setting setting = settingRepository.findByUser(user)
                .orElseThrow(() -> new BaseException(SettingErrorCode.SETTING_NOT_FOUND));

        setting.updateSettings(
                request.isLocationEnabled(),
                request.isNotificationEnabled(),
                request.isMarketingEnabled(),
                request.getSearchRadiusKm()
        );
        // 트랜잭션 종료 시 자동 반영(Dirty Checking)
        return SettingResponseDto.from(setting);
    }
}