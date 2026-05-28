package com.choiceeat.backend.domain.menuPick.repository;

import com.choiceeat.backend.domain.menuPick.entity.MenuPick;
import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuPickRepository extends JpaRepository<MenuPick, Long> {
    List<MenuPick> findByRestaurant_KakaoPlaceIdOrderByRankNumAsc(String kakaoPlaceId);

    void deleteByRestaurant(Restaurant restaurant);
}
