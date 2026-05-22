package com.choiceeat.backend.domain.adView.repository;

import com.choiceeat.backend.domain.adView.entity.AdView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdViewRepository extends JpaRepository<AdView, Long> {
    // 나중에 특정 유저의 시청 기록 조회 등 추가 가능
}