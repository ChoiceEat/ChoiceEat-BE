package com.choiceeat.domain;

import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
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

    @Column(name = "pick_type", nullable = false, length = 100)
    private String pickType;

    @Column(name = "rank_num", nullable = false) // rank는 SQL 예약어일 수 있으므로 컬럼명 변경 추천
    private int rank;

    @Column(name = "is_rerolled", nullable = false)
    private boolean isRerolled;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // 외부 도메인 연관관계 매핑 (N:1)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "condition_id", nullable = false)
    private com.choiceeat.domain.Condition condition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    // ★ 가장 고난도였던 다시 뽑기 체인 추적용 자기 참조 (Self-Join, Null 허용)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rerolled_from_id", nullable = true)
    private RestaurantPick rerolledFrom;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}