package com.choiceeat.backend.domain.menuPick.dto;

import com.choiceeat.backend.domain.menuPick.data.MockMenuPick;

public record MenuPickResponse(
        String menuName,
        Integer price,
        String imageUrl
) {
    public static MenuPickResponse from(MockMenuPick menu) {
        return new MenuPickResponse(
                menu.menuName(),
                menu.price(),
                menu.imageUrl()
        );
    }
}
