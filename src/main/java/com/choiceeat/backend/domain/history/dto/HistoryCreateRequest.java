package com.choiceeat.backend.domain.history.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HistoryCreateRequest {

    @Schema(description = "선택된 식당 ID", example = "1")
    private Long restaurantId;

    @Schema(description = "선택된 레스토랑 픽(Pick) ID", example = "10")
    private Long restaurantPickId;

}