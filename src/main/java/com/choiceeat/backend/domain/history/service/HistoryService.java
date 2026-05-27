package com.choiceeat.backend.domain.history.service;

import com.choiceeat.backend.domain.history.dto.HistoryCreateRequest;
import com.choiceeat.backend.domain.history.dto.HistoryHomeResponse;
import com.choiceeat.backend.domain.history.dto.HistoryListResponse;
import com.choiceeat.backend.domain.history.entity.History;
import com.choiceeat.backend.domain.history.repository.HistoryRepository;
import com.choiceeat.backend.domain.recommendation.type.RecommendationType;
import com.choiceeat.backend.domain.restaurantPick.entity.PickType;
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

        // 1. 넘어온 카카오 ID로 DB에서 식당 찾기
        Restaurant restaurant = restaurantRepository.findByKakaoPlaceId(request.getKakaoPlaceId())
                .orElseThrow(() -> new IllegalArgumentException("DB에 해당 식당 정보가 없습니다."));

        // 2. 프론트엔드가 보낸 문자열("밸런스")을 서버의 PickType Enum(BALANCE)으로 변환
        PickType pickType = PickType.fromString(request.getRecommendationType());

        // 3. 식당과 픽 타입으로 픽 정보 찾기 (없으면 새로 만들어서 저장)
        RestaurantPick restaurantPick = restaurantPickRepository.findByRestaurantAndPickType(restaurant, pickType)
                .orElseGet(() -> {
                    RestaurantPick newPick = RestaurantPick.builder()
                            .restaurant(restaurant)
                            .pickType(pickType)
                            .build();
                    return restaurantPickRepository.save(newPick);
                });

        // 4. 히스토리 생성 및 저장
        History history = History.builder()
                .user(user)
                .restaurant(restaurant)
                .restaurantPick(restaurantPick)
                .build();

        historyRepository.save(history);
    }


}