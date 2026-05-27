package com.choiceeat.backend.domain.history.service;

import com.choiceeat.backend.domain.history.dto.HistoryCreateRequest;
import com.choiceeat.backend.domain.history.dto.HistoryHomeResponse;
import com.choiceeat.backend.domain.history.dto.HistoryListResponse;
import com.choiceeat.backend.domain.history.entity.History;
import com.choiceeat.backend.domain.history.repository.HistoryRepository;
import com.choiceeat.backend.domain.restaurantPick.entity.RestaurantPick;
import com.choiceeat.backend.domain.restaurantPick.repository.RestaurantPickRepository;
import com.choiceeat.backend.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import com.choiceeat.backend.domain.restaurant.repository.RestaurantRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HistoryService {

    private final HistoryRepository historyRepository;
    private final RestaurantRepository restaurantRepository;
    private final RestaurantPickRepository restaurantPickRepository;

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

    @Transactional
    public void createHistory(User user, HistoryCreateRequest request) {

        Restaurant restaurant = restaurantRepository.findById(request.getRestaurantId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 식당입니다."));

        RestaurantPick restaurantPick = restaurantPickRepository.findById(request.getRestaurantPickId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 픽 정보입니다."));

        History history = History.builder()
                .user(user)
                .restaurant(restaurant)
                .restaurantPick(restaurantPick)
                .build();

        historyRepository.save(history);
    }


}