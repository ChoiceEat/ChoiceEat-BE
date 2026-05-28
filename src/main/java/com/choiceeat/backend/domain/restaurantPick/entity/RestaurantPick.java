package com.choiceeat.backend.domain.restaurantPick.entity;

import com.choiceeat.backend.domain.condition.entity.Condition;
import com.choiceeat.backend.domain.recommendation.entity.Recommendation;
import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "restaurant_picks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantPick extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_pick_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "pick_type", nullable = false, length = 100)
    private PickType pickType; // ENUM 타입 (밸런스, 퀄리티, 가성비)

    @Column(name = "rank_num", nullable = false)
    private int rank;

    @Builder.Default
    @Column(name = "is_rerolled", nullable = false)
    private Boolean isRerolled = false;

    // Recommendation과의 N:1 단방향 매핑
    // 어떤 추천 세션(묶음)에 속한 카드인지 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recommendation_id")
    private Recommendation recommendation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "condition_id")
    private Condition condition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Restaurant와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

}
