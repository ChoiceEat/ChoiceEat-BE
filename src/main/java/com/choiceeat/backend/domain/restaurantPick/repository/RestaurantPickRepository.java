package com.choiceeat.backend.domain.restaurantPick.repository;

import com.choiceeat.backend.domain.restaurantPick.entity.RestaurantPick;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantPickRepository extends JpaRepository<RestaurantPick, Long> {

}