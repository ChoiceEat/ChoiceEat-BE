package com.choiceeat.backend.domain.menuPick.service;

import com.choiceeat.backend.domain.menuPick.dto.MenuPickRecommendationResponse;
import com.choiceeat.backend.domain.menuPick.dto.MenuPickResponse;
import com.choiceeat.backend.domain.menuPick.exception.MenuPickErrorCode;
import com.choiceeat.backend.domain.menuPick.repository.MenuPickRepository;
import com.choiceeat.backend.global.exception.BaseException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuPickService {

    private final MenuPickRepository menuPickRepository;

    public MenuPickRecommendationResponse recommendMenus(String kakaoPlaceId) {
        List<MenuPickResponse> menus = menuPickRepository.findByRestaurant_KakaoPlaceIdOrderByRankNumAsc(kakaoPlaceId).stream()
                .map(MenuPickResponse::from)
                .toList();

        if (menus.isEmpty()) {
            throw new BaseException(MenuPickErrorCode.MENU_PICK_NOT_FOUND);
        }

        return new MenuPickRecommendationResponse(kakaoPlaceId, menus);
    }
}
