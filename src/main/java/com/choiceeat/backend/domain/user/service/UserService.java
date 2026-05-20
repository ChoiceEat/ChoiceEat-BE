package com.choiceeat.backend.domain.user.service;

import com.choiceeat.backend.domain.user.dto.SignUpRequest;
import com.choiceeat.backend.domain.user.dto.SignUpResponse;
import com.choiceeat.backend.domain.user.dto.EmailCheckResponse;
import com.choiceeat.backend.domain.user.dto.LoginRequest;
import com.choiceeat.backend.domain.user.dto.LoginResponse;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.domain.user.exception.UserErrorCode;
import com.choiceeat.backend.domain.user.repository.UserRepository;
import com.choiceeat.backend.global.exception.BaseException;
import com.choiceeat.backend.global.jwt.JwtTokenProvider;
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
    private final JwtTokenProvider jwtTokenProvider;

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

    public LoginResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> new BaseException(UserErrorCode.USER_NOT_FOUND));

        if (!passwordEncoder.matches(request.password(), user.getPassword())) {
            throw new BaseException(UserErrorCode.USER_PASSWORD_MISMATCH);
        }

        String accessToken = jwtTokenProvider.createAccessToken(user);
        return LoginResponse.from(user, accessToken);
    }
}