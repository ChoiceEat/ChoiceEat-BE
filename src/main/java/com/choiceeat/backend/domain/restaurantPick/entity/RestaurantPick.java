package com.choiceeat.backend.domain.restaurantPick.entity;

import com.choiceeat.backend.domain.condition.entity.Condition;
import com.choiceeat.backend.domain.recommendation.entity.Recommendation;
import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import com.choiceeat.backend.domain.restaurantPick.entity.PickType;
import com.choiceeat.backend.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "restaurant_picks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantPick {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_pick_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "pick_type", nullable = false, length = 100)
    private PickType pickType; // ENUM 타입 (밸런스, 퀄리티, 가성비)

    @Column(name = "rank_num", nullable = false)
    private int rank;

    // Recommendation과의 N:1 단방향 매핑
    // 어떤 추천 세션(묶음)에 속한 카드인지 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recommendation_id", nullable = false)
    private Recommendation recommendation;

    // Restaurant와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

}