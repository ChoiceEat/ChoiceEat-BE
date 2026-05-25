package com.choiceeat.backend.domain.adView.exception;

import com.choiceeat.backend.global.response.code.BaseResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import static com.choiceeat.backend.global.constant.StaticValue.*;

@Getter
@AllArgsConstructor
public enum AdViewErrorCode implements BaseResponseCode {

    AD_VIEW_RECORD_FAILED("ADVIEW_500_1", INTERNAL_SERVER_ERROR, "광고 시청 기록 저장에 실패했습니다."),
    COMPLETED_AD_VIEW_NOT_FOUND("ADVIEW_403_1", FORBIDDEN, "재추천에 사용할 완료된 광고 시청 기록이 없습니다.");

    private final String code;
    private final int httpStatus;
    private final String message;
}
