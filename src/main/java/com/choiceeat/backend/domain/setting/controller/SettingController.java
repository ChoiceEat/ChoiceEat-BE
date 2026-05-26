package com.choiceeat.backend.domain.setting.controller;

import com.choiceeat.backend.domain.setting.dto.SettingRequestDto;
import com.choiceeat.backend.domain.setting.dto.SettingResponseDto;
import com.choiceeat.backend.domain.setting.service.SettingService;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.global.annotation.CurrentUser; // 프로젝트에서 사용 중인 어노테이션
import com.choiceeat.backend.global.response.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/settings")
@RequiredArgsConstructor
@Tag(name = "Setting", description = "설정 API")
public class SettingController {

    private final SettingService settingService;

    // 설정 조회
    @GetMapping
    @Operation(summary = "설정 조회", description = "사용자의 현재 환경 설정을 조회합니다.")
    public ResponseEntity<SuccessResponse<SettingResponseDto>> getSettings(@CurrentUser User user) {
        return ResponseEntity.ok(SuccessResponse.from(settingService.getSetting(user)));
    }

    // 설정 수정
    @PatchMapping
    @Operation(summary = "설정 수정", description = "사용자의 환경 설정을 수정합니다.")
    public ResponseEntity<SuccessResponse<SettingResponseDto>> updateSettings(
            @CurrentUser User user,
            @RequestBody SettingRequestDto request) {
        // 서비스에서 반환된 최신 설정값을 받아서
        SettingResponseDto updatedSetting = settingService.updateSetting(user, request);
        // 응답에 담아 보낸다.
        return ResponseEntity.ok(SuccessResponse.from(updatedSetting));
    }
}