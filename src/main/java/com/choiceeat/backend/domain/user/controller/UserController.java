package com.choiceeat.backend.domain.user.controller;

import com.choiceeat.backend.domain.user.dto.*;
import com.choiceeat.backend.domain.user.service.UserService;
import com.choiceeat.backend.global.response.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Tag(name = "User", description = "사용자 관련 API")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    @Operation(summary = "회원가입", description = "사용자 회원가입 API입니다.")
    public ResponseEntity<SuccessResponse<SignUpResponse>> signUp(@Valid @RequestBody SignUpRequest request) {
        SignUpResponse response = userService.signUp(request);
        return ResponseEntity.status(201).body(SuccessResponse.created(response));
    }

    @GetMapping("/check-email")
    @Operation(summary = "이메일 중복확인", description = "이메일 중복 여부를 확인합니다.")
    public ResponseEntity<SuccessResponse<EmailCheckResponse>> checkEmail(@RequestParam String email) {
        EmailCheckResponse response = userService.checkEmailAvailability(email);
        return ResponseEntity.ok(SuccessResponse.from(response));
    }

    @PostMapping("/login")
    @Operation(summary = "로그인", description = "이메일과 비밀번호로 로그인합니다.")
    public ResponseEntity<SuccessResponse<LoginResponse>> login(@Valid @RequestBody LoginRequest request) {
        LoginResponse response = userService.login(request);
        return ResponseEntity.ok(SuccessResponse.from(response));
    }
}