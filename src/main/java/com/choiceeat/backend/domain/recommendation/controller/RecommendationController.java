package com.choiceeat.backend.domain.recommendation.controller;

import com.choiceeat.backend.domain.recommendation.dto.RecommendationRequest;
import com.choiceeat.backend.domain.recommendation.dto.RecommendationRerollRequest;
import com.choiceeat.backend.domain.recommendation.dto.RecommendationResponse;
import com.choiceeat.backend.domain.recommendation.service.RecommendationService;
import com.choiceeat.backend.global.response.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recommendations")
@RequiredArgsConstructor
@Tag(name = "Recommendation", description = "식당 추천 API")
public class RecommendationController {

    private final RecommendationService recommendationService;

    @PostMapping
    @Operation(summary = "식당 추천", description = "메뉴, 분위기, 예산, 목적지 좌표를 기준으로 가성비/퀄리티/밸런스 식당을 추천합니다.")
    public ResponseEntity<SuccessResponse<RecommendationResponse>> recommend(
            @Valid @RequestBody RecommendationRequest request
    ) {
        RecommendationResponse response = recommendationService.recommend(request);
        return ResponseEntity.ok(SuccessResponse.from(response));
    }

    @PostMapping("/reroll")
    @Operation(summary = "식당 재추천", description = "기존 추천 식당을 제외하고 같은 조건에서 가성비/퀄리티/밸런스 식당을 다시 추천합니다.")
    public ResponseEntity<SuccessResponse<RecommendationResponse>> reroll(
            @Valid @RequestBody RecommendationRerollRequest request
    ) {
        RecommendationResponse response = recommendationService.reroll(request);
        return ResponseEntity.ok(SuccessResponse.from(response));
    }
}
