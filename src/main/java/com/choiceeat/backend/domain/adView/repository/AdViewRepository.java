package com.choiceeat.backend.domain.adView.repository;

import com.choiceeat.backend.domain.adView.entity.AdView;
import com.choiceeat.backend.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdViewRepository extends JpaRepository<AdView, Long> {
    // used=false인 데이터가 있는지 확인
    boolean existsByUserAndCompletedTrueAndUsedFalse(User user);

    // 재추천 로직에서 실제 사용(used-true) 처리
    Optional<AdView> findFirstByUserAndCompletedTrueAndUsedFalse(User user);
}