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

    @Schema(description = "거리(m)", example = "350")
    private int distance;

    @Schema(description = "선택된 시간", example = "2026-05-24T14:30:00")
    private LocalDateTime selectedAt;

    public static HistoryListResponse from(History history) {
        return HistoryListResponse.builder()
                .historyId(history.getHistoryId())
                .restaurantName(history.getRestaurant().getName())
                .imageUrl("https://example.com/default.jpg") // Restaurant의 이미지 필드값 임의 설정
                .category(history.getRestaurant().getCategory())
                .distance(350) // Restaurant에 거리 필드가 없으므로 우선 350m 더미 고정
                .selectedAt(history.getSelectedAt())
                .build();
    }
}