package com.choiceeat.backend.domain.history.dto;

import com.choiceeat.backend.domain.history.entity.History;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HistoryHomeResponse {

    @Schema(description = "히스토리 ID", example = "1")
    private Long historyId;

    @Schema(description = "식당 이름", example = "나는야 짜장면")
    private String restaurantName;

    @Schema(description = "식당 이미지 URL", example = "https://example.com/default.jpg")
    private String imageUrl;

    @Schema(description = "픽 타입", example = "밸런스 픽")
    private String pickType;

    public static HistoryHomeResponse from(History history) {
        // ✅ 기존 ENUM의 getDisplayName()을 사용해 한 줄로 처리 (null 방어막 포함)
        String reason = (history.getRestaurantPick() != null && history.getRestaurantPick().getPickType() != null)
                ? history.getRestaurantPick().getPickType().getDisplayName()
                : "일반 픽";

        return HistoryHomeResponse.builder()
                .historyId(history.getHistoryId())
                .restaurantName(history.getRestaurant().getName())
                .imageUrl("https://example.com/default.jpg")
                .pickType(reason)
                .build();
    }
}