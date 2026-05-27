package com.choiceeat.backend.domain.history.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HistoryCreateRequest {

    @Schema(description = "카카오 장소 ID", example = "10644213")
    private String kakaoPlaceId;

    @Schema(description = "추천 픽 종류 (밸런스, 가성비, 퀄리티)", example = "밸런스")
    private String recommendationType;

}