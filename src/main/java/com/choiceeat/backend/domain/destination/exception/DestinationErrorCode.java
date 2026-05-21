package com.choiceeat.backend.domain.destination.exception;

import com.choiceeat.backend.global.response.code.BaseResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.choiceeat.backend.global.constant.StaticValue.*;

@Getter
@AllArgsConstructor
public enum DestinationErrorCode implements BaseResponseCode {
    DESTINATION_INVALID_PARAMETER("DESTINATION_400_1", BAD_REQUEST, "목적지 검색 파라미터가 올바르지 않습니다."),
    KAKAO_API_KEY_MISSING("DESTINATION_500_1", INTERNAL_SERVER_ERROR, "카카오 REST API 키가 설정되지 않았습니다."),
    KAKAO_API_UNAUTHORIZED("DESTINATION_401_1", UNAUTHORIZED, "카카오 API 인증에 실패했습니다."),
    KAKAO_API_FORBIDDEN("DESTINATION_403_1", FORBIDDEN, "카카오 로컬/지도 서비스가 비활성화되어 있습니다."),
    KAKAO_API_CALL_FAILED("DESTINATION_500_2", INTERNAL_SERVER_ERROR, "카카오 목적지 검색 호출에 실패했습니다.");

    private final String code;
    private final int httpStatus;
    private final String message;
}
