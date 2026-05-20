package com.choiceeat.backend.domain.user.dto;

import com.choiceeat.backend.domain.user.entity.User;

public record SignUpResponse(
        Long userId,
        String email,
        String nickname
) {
    public static SignUpResponse from(User user) {
        return new SignUpResponse(user.getUserId(), user.getEmail(), user.getNickname());
    }
}