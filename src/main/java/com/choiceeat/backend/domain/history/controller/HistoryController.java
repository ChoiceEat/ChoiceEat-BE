package com.choiceeat.backend.domain.history.controller;

import com.choiceeat.backend.domain.history.dto.HistoryHomeResponse;
import com.choiceeat.backend.domain.history.dto.HistoryListResponse;
import com.choiceeat.backend.domain.history.service.HistoryService;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.global.annotation.CurrentUser;
import com.choiceeat.backend.global.response.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/histories")
@RequiredArgsConstructor
@Tag(name = "History", description = "히스토리 API")
public class HistoryController {

    private final HistoryService historyService;

    @GetMapping("/home")
    @Operation(summary = "홈 화면 히스토리 조회", description = "홈 화면에 노출될 최근 4개의 히스토리를 조회합니다.")
    public ResponseEntity<SuccessResponse<List<HistoryHomeResponse>>> getHomeHistories(@CurrentUser User user) {
        List<HistoryHomeResponse> response = historyService.getHomeHistories(user);
        return ResponseEntity.ok(SuccessResponse.from(response));
    }

    @GetMapping
    @Operation(summary = "히스토리 전체 목록 조회", description = "사용자의 모든 히스토리 목록을 최신순으로 조회합니다.")
    public ResponseEntity<SuccessResponse<List<HistoryListResponse>>> getFullHistories(@CurrentUser User user) {
        List<HistoryListResponse> response = historyService.getFullHistories(user);
        return ResponseEntity.ok(SuccessResponse.from(response));
    }
}