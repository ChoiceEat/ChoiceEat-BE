package com.choiceeat.backend.domain.restaurant.repository;

import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<Restaurant> findByKakaoPlaceId(String kakaoPlaceId);
}