package com.choiceeat.backend.domain.user.dto;

import com.choiceeat.backend.domain.user.entity.User;

public record LoginResponse(
        Long userId,
        String email,
        String nickname
) {
    public static LoginResponse from(User user) {
        return new LoginResponse(
                user.getUserId(),
                user.getEmail(),
                user.getNickname()
        );
    }
}

