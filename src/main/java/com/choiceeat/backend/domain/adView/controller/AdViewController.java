package com.choiceeat.backend.domain.adView.controller;

import com.choiceeat.backend.domain.adView.dto.AdViewRequestDto;
import com.choiceeat.backend.domain.adView.service.AdViewService;
import com.choiceeat.backend.global.response.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ad/view")
@RequiredArgsConstructor
public class AdViewController {

    private final AdViewService adViewService;

    // 광고 시청 기록 저장 API
    @PostMapping
    public SuccessResponse<?> saveAdView(@RequestBody AdViewRequestDto requestDto) {
        adViewService.saveAdView(requestDto);
        return SuccessResponse.empty();
    }
}