package com.choiceeat.backend.global.util;

import com.choiceeat.backend.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SecurityUtil {

    public static Long getCurrentUserId() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || authentication.getName() == null || authentication.getName().equals("anonymousUser")) {
            throw new RuntimeException("인증 정보가 없습니다.");
        }
        Object principal = authentication.getPrincipal();
        if (principal instanceof User) {
            return ((User) principal).getUserId(); // 여기서 직접 ID를 가져옵니다.
        }
        throw new RuntimeException("인증 객체의 형식이 올바르지 않습니다.");
    }
}