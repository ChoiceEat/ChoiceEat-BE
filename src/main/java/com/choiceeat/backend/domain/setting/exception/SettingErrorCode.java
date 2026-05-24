package com.choiceeat.backend.domain.setting.exception;

import com.choiceeat.backend.global.response.code.BaseResponseCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import static com.choiceeat.backend.global.constant.StaticValue.NOT_FOUND;

@Getter
@RequiredArgsConstructor
public enum SettingErrorCode implements BaseResponseCode {
    SETTING_NOT_FOUND("SETTING_404_1", NOT_FOUND, "설정 정보를 찾을 수 없습니다.");

    private final String code;
    private final int httpStatus;
    private final String message;
}
