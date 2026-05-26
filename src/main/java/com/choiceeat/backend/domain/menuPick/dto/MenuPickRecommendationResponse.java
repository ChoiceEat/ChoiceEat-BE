package com.choiceeat.backend.domain.menuPick.dto;

import java.util.List;

public record MenuPickRecommendationResponse(
        String kakaoPlaceId,
        List<MenuPickResponse> menus
) {
}
