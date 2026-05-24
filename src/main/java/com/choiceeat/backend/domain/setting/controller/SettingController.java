package com.choiceeat.backend.domain.setting.controller;

import com.choiceeat.backend.domain.setting.dto.SettingRequestDto;
import com.choiceeat.backend.domain.setting.dto.SettingResponseDto;
import com.choiceeat.backend.domain.setting.service.SettingService;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.global.annotation.CurrentUser; // 프로젝트에서 사용 중인 어노테이션
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/settings")
@RequiredArgsConstructor
public class SettingController {

    private final SettingService settingService;

    // 설정 조회
    @GetMapping
    public ResponseEntity<SettingResponseDto> getSettings(@CurrentUser User user) {
        return ResponseEntity.ok(settingService.getSetting(user));
    }

    // 설정 수정
    @PatchMapping
    public ResponseEntity<Void> updateSettings(@CurrentUser User user, @RequestBody SettingRequestDto request) {
        settingService.updateSetting(user, request);
        return ResponseEntity.ok().build();
    }
}