package com.choiceeat.backend.domain.menuPick.exception;

import com.choiceeat.backend.global.response.code.BaseResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.choiceeat.backend.global.constant.StaticValue.NOT_FOUND;

@Getter
@AllArgsConstructor
public enum MenuPickErrorCode implements BaseResponseCode {
    MENU_PICK_NOT_FOUND("MENU_PICK_404_1", NOT_FOUND, "추천할 메뉴가 없습니다.");

    private final String code;
    private final int httpStatus;
    private final String message;
}
