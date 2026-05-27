package com.choiceeat.backend.domain.restaurant.repository;

import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}