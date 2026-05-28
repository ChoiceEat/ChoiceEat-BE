package com.choiceeat.backend.domain.history.controller;

import com.choiceeat.backend.domain.history.dto.HistoryCreateRequest;
import com.choiceeat.backend.domain.history.dto.HistoryHomeResponse;
import com.choiceeat.backend.domain.history.dto.HistoryListResponse;
import com.choiceeat.backend.domain.history.service.HistoryService;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.global.annotation.CurrentUser;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/histories")
@RequiredArgsConstructor
@Tag(name = "History", description = "히스토리 관련 API")
public class HistoryController {

    private final HistoryService historyService;

    @Operation(summary = "홈 화면용 히스토리 조회", description = "최근 저장된 히스토리 4개를 반환합니다.")
    @GetMapping("/home")
    public ResponseEntity<List<HistoryHomeResponse>> getHomeHistories(@CurrentUser User user) {
        return ResponseEntity.ok(historyService.getHomeHistories(user));
    }

    @Operation(summary = "전체 히스토리 조회", description = "유저의 전체 히스토리 목록을 반환합니다.")
    @GetMapping
    public ResponseEntity<List<HistoryListResponse>> getFullHistories(@CurrentUser User user) {
        return ResponseEntity.ok(historyService.getFullHistories(user));
    }

    @Operation(summary = "히스토리 저장", description = "선택한 식당을 히스토리에 저장합니다.")
    @PostMapping
    public ResponseEntity<Void> createHistory(@CurrentUser User user,
                                              @RequestBody HistoryCreateRequest request) {
        historyService.createHistory(user, request);
        return ResponseEntity.ok().build();
    }
}
