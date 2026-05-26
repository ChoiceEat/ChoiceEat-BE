package com.choiceeat.backend.domain.history.repository;

import com.choiceeat.backend.domain.history.entity.History;
import com.choiceeat.backend.domain.user.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Long> {

    // 홈 화면용: 최신순으로 상위 4개만 딱 잘라서 가져오기
    @EntityGraph(attributePaths = {"restaurant", "restaurantPick"})
    List<History> findTop4ByUserOrderBySelectedAtDesc(User user);

    // 전체 목록용: 해당 유저의 모든 기록을 최신순으로 가져오기
    @EntityGraph(attributePaths = {"restaurant", "restaurantPick"})
    List<History> findByUserOrderBySelectedAtDesc(User user);
}