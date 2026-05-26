package com.choiceeat.backend.domain.history.dto;

import com.choiceeat.backend.domain.history.entity.History;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@Builder
public class HistoryListResponse {

    @Schema(description = "히스토리 ID", example = "1")
    private Long historyId;

    @Schema(description = "식당 이름", example = "맛있는 김밥")
    private String restaurantName;

    @Schema(description = "식당 이미지 URL", example = "https://example.com/default.jpg")
    private String imageUrl;

    @Schema(description = "카테고리", example = "한식")
    private String category;

    @Schema(description = "픽 타입", example = "밸런스 픽")
    private String pickType;

    @Schema(description = "선택된 시간", example = "2026-05-24T14:30:00")
    private LocalDateTime selectedAt;

    public static HistoryListResponse from(History history) {
        // ✅ 1. 누락되었던 픽 타입 추출 및 기존 getDisplayName() 활용
        String reason = (history.getRestaurantPick() != null && history.getRestaurantPick().getPickType() != null)
                ? history.getRestaurantPick().getPickType().getDisplayName()
                : "일반 픽";

        // ✅ 2. 카테고리 null 방어 코드
        String category = history.getRestaurant().getCategory() != null
                ? history.getRestaurant().getCategory()
                : "미지정";

        return HistoryListResponse.builder()
                .historyId(history.getHistoryId())
                .restaurantName(history.getRestaurant().getName())
                .imageUrl("https://example.com/default.jpg")
                .category(category)
                .pickType(reason) // ✅ 3. 조립 완료!
                .selectedAt(history.getSelectedAt())
                .build();
    }
}