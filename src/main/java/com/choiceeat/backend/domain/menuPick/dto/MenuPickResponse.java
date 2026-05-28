package com.choiceeat.backend.domain.menuPick.dto;

import com.choiceeat.backend.domain.menuPick.entity.MenuPick;

public record MenuPickResponse(
        String menuName,
        Integer price,
        String imageUrl
) {
    public static MenuPickResponse from(MenuPick menu) {
        return new MenuPickResponse(
                menu.getMenuName(),
                menu.getPrice(),
                menu.getImageUrl()
        );
    }
}
