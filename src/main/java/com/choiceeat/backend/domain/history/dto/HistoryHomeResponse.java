package com.choiceeat.backend.domain.history.dto;

import com.choiceeat.backend.domain.history.entity.History;
import com.choiceeat.backend.domain.restaurantPick.entity.PickType;
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

    @Schema(description = "초이스잇 픽 이유", example = "밸런스 픽")
    private String pickReason;

    public static HistoryHomeResponse from(History history) {
        // ENUM 상수를 -> 한글 텍스트로 변환 ; switch 표현식
        PickType pickType = history.getRestaurantPick().getPickType();
        String reason = switch (pickType) {
            case VALUE -> "가성비 픽";
            case BALANCE -> "밸런스 픽";
            case QUALITY -> "퀄리티 픽";
        };

        return HistoryHomeResponse.builder()
                .historyId(history.getHistoryId())
                .restaurantName(history.getRestaurant().getName())
                .imageUrl("https://example.com/default.jpg") // Restaurant의 이미지 필드값 임의 설정
                .pickReason(reason)
                .build();
    }
}