package com.choiceeat.backend.domain.user.dto;

import com.choiceeat.backend.domain.user.entity.User;

public record LoginResponse(
        String tokenType,
        String accessToken,
        Long userId,
        String email,
        String nickname
) {
    public static LoginResponse from(User user, String accessToken) {
        return new LoginResponse(
                "Bearer",
                accessToken,
                user.getUserId(),
                user.getEmail(),
                user.getNickname()
        );
    }
}

