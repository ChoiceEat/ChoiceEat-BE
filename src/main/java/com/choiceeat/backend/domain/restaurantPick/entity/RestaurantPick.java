package com.choiceeat.domain;

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

    @Column(name = "is_rerolled", nullable = false)
    private boolean isRerolled;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // User와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Condition과의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "condition_id", nullable = false)
    private com.choiceeat.domain.Condition condition;

    // Restaurant와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}