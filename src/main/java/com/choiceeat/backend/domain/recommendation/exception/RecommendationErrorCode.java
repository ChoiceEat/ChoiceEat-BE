package com.choiceeat.backend.domain.recommendation.exception;

import com.choiceeat.backend.global.response.code.BaseResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.choiceeat.backend.global.constant.StaticValue.NOT_FOUND;

@Getter
@AllArgsConstructor
public enum RecommendationErrorCode implements BaseResponseCode {
    RECOMMENDATION_NOT_FOUND("RECOMMENDATION_404_1", NOT_FOUND, "추천 조건에 맞는 식당이 없습니다.");

    private final String code;
    private final int httpStatus;
    private final String message;
}
