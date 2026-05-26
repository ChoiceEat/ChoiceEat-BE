package com.choiceeat.backend.domain.history.service;

import com.choiceeat.backend.domain.history.dto.HistoryHomeResponse;
import com.choiceeat.backend.domain.history.dto.HistoryListResponse;
import com.choiceeat.backend.domain.history.repository.HistoryRepository;
import com.choiceeat.backend.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HistoryService {

    private final HistoryRepository historyRepository;

    // 홈 화면용 히스토리 리스트 반환 (최대 4개)
    public List<HistoryHomeResponse> getHomeHistories(User user) {
        return historyRepository.findTop4ByUserOrderBySelectedAtDesc(user).stream()
                .map(HistoryHomeResponse::from)
                .collect(Collectors.toList());
    }

    // 전체 화면용 히스토리 리스트 반환
    public List<HistoryListResponse> getFullHistories(User user) {
        return historyRepository.findByUserOrderBySelectedAtDesc(user).stream()
                .map(HistoryListResponse::from)
                .collect(Collectors.toList());
    }
}