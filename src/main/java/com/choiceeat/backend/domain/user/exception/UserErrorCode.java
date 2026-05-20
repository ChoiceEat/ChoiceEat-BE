package com.choiceeat.backend.domain.user.exception;

import com.choiceeat.backend.global.response.code.BaseResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.choiceeat.backend.global.constant.StaticValue.*;

@Getter
@AllArgsConstructor
public enum UserErrorCode implements BaseResponseCode {
    USER_EMAIL_DUPLICATE("USER_409_1", CONFLICT, "이미 사용 중인 이메일입니다."),
    USER_NOT_FOUND("USER_404_1", NOT_FOUND, "존재하지 않는 사용자입니다."),
    USER_PASSWORD_MISMATCH("USER_401_1", UNAUTHORIZED, "비밀번호가 일치하지 않습니다.");

    private final String code;
    private final int httpStatus;
    private final String message;
}