package com.choiceeat.backend.domain.restaurantPick.repository;

import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import com.choiceeat.backend.domain.restaurantPick.entity.PickType;
import com.choiceeat.backend.domain.restaurantPick.entity.RestaurantPick;
import com.choiceeat.backend.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantPickRepository extends JpaRepository<RestaurantPick, Long> {
    Optional<RestaurantPick> findByUserAndRestaurantAndPickType(User user, Restaurant restaurant, PickType pickType);
}
