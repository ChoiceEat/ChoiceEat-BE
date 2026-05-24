package com.choiceeat.backend.domain.advertisement.exception;

import com.choiceeat.backend.global.response.code.BaseResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.choiceeat.backend.global.constant.StaticValue.*;

@Getter
@AllArgsConstructor
public enum AdvertisementErrorCode implements BaseResponseCode {

    AD_NOT_FOUND("AD_404_1", NOT_FOUND, "활성화된 광고를 찾을 수 없습니다."),
    INVALID_AD_ID("AD_400_1", BAD_REQUEST, "유효하지 않은 광고 ID입니다.");
    private final String code;
    private final int httpStatus;
    private final String message;
}
