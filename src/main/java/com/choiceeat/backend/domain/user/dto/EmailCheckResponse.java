package com.choiceeat.backend.domain.user.dto;

public record EmailCheckResponse(
        boolean available,
        String message
) {
}

