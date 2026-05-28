package com.choiceeat.backend.domain.recommendation.repository;
import com.choiceeat.backend.domain.recommendation.entity.Recommendation;
import com.choiceeat.backend.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    // 가장 최근의 추천 기록을 가져오는 메서드
    Optional<Recommendation> findTopByUserOrderByCreatedAtDesc(User user);
}