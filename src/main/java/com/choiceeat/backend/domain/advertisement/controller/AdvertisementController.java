package com.choiceeat.backend.domain.advertisement.controller;

import com.choiceeat.backend.domain.advertisement.dto.AdvertisementResponseDto;
import com.choiceeat.backend.domain.advertisement.entity.Advertisement;
import com.choiceeat.backend.domain.advertisement.service.AdvertisementService;
import com.choiceeat.backend.global.response.SuccessResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ad")
@RequiredArgsConstructor
@Tag(name = "Advertisement", description = "광고 API")

public class AdvertisementController {

    private final AdvertisementService adService;

    // 랜덤 광고 하나 조회 API
    @GetMapping("/random")
    public SuccessResponse<AdvertisementResponseDto> getRandomAd() {
        return SuccessResponse.<AdvertisementResponseDto>from(adService.getRandomAd());
    }
}