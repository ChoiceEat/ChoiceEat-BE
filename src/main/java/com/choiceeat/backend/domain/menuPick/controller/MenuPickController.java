package com.choiceeat.backend.domain.menuPick.controller;

import com.choiceeat.backend.domain.menuPick.dto.MenuPickRecommendationResponse;
import com.choiceeat.backend.domain.menuPick.service.MenuPickService;
import com.choiceeat.backend.global.response.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu-picks")
@RequiredArgsConstructor
@Validated
@Tag(name = "MenuPick", description = "메뉴 추천 API")
public class MenuPickController {

    private final MenuPickService menuPickService;

    @GetMapping("/recommendations")
    @Operation(summary = "메뉴 추천", description = "식당의 카카오 장소 ID를 기준으로 추천 메뉴 3개를 조회합니다.")
    public ResponseEntity<SuccessResponse<MenuPickRecommendationResponse>> recommendMenus(
            @RequestParam @NotBlank(message = "kakaoPlaceId는 필수입니다.") String kakaoPlaceId
    ) {
        MenuPickRecommendationResponse response = menuPickService.recommendMenus(kakaoPlaceId);
        return ResponseEntity.ok(SuccessResponse.from(response));
    }
}
