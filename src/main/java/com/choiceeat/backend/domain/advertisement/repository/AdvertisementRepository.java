package com.choiceeat.backend.domain.advertisement.repository;

import com.choiceeat.backend.domain.advertisement.entity.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {
    // 활성화된 광고 목록을 조회.
    List<Advertisement> findByIsActiveTrue();
}
