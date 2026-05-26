package com.choiceeat.backend.domain.menuPick.service;

import com.choiceeat.backend.domain.menuPick.data.MockMenuPickData;
import com.choiceeat.backend.domain.menuPick.dto.MenuPickRecommendationResponse;
import com.choiceeat.backend.domain.menuPick.dto.MenuPickResponse;
import com.choiceeat.backend.domain.menuPick.exception.MenuPickErrorCode;
import com.choiceeat.backend.global.exception.BaseException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuPickService {

    public MenuPickRecommendationResponse recommendMenus(String kakaoPlaceId) {
        List<MenuPickResponse> menus = MockMenuPickData.findByKakaoPlaceId(kakaoPlaceId).stream()
                .map(MenuPickResponse::from)
                .toList();

        if (menus.isEmpty()) {
            throw new BaseException(MenuPickErrorCode.MENU_PICK_NOT_FOUND);
        }

        return new MenuPickRecommendationResponse(kakaoPlaceId, menus);
    }
}
