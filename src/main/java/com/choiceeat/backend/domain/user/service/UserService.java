package com.choiceeat.backend.domain.user.service;

import com.choiceeat.backend.domain.user.dto.SignUpRequest;
import com.choiceeat.backend.domain.user.dto.SignUpResponse;
import com.choiceeat.backend.domain.user.dto.EmailCheckResponse;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.domain.user.exception.UserErrorCode;
import com.choiceeat.backend.domain.user.repository.UserRepository;
import com.choiceeat.backend.global.exception.BaseException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public SignUpResponse signUp(SignUpRequest request) {
        if (userRepository.existsByEmail(request.email())) {
            throw new BaseException(UserErrorCode.USER_EMAIL_DUPLICATE);
        }

        User user = User.builder()
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .nickname(request.nickname())
                .build();

        User savedUser = userRepository.save(user);
        return SignUpResponse.from(savedUser);
    }

    public EmailCheckResponse checkEmailAvailability(String email) {
        boolean available = !userRepository.existsByEmail(email);
        String message = available ? "사용 가능한 이메일입니다." : "이미 사용 중인 이메일입니다.";
        return new EmailCheckResponse(available, message);
    }
}