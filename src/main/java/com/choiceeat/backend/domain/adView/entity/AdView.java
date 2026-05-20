package com.choiceeat.domain;

import com.choiceeat.backend.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ad_views")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_view_id")
    private Long id;

    @Column(name = "completed", nullable = false)
    private boolean completed;

    @Column(name = "viewed_at", nullable = false, updatable = false)
    private LocalDateTime viewedAt;

    // Advertisement와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "advertisement_id", nullable = false)
    private com.choiceeat.domain.Advertisement advertisement;

    // User와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // RestaurantPick과의 N:1 단방향 매핑 (어떤 추천을 다시 뽑기 위해 봤는지.. )
    // 첫 진입 광고 등에서는 Null일 수 있으므로 Nullable 허용
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_pick_id", nullable = true)
    private com.choiceeat.domain.RestaurantPick restaurantPick;

    @PrePersist
    protected void onCreate() {
        this.viewedAt = LocalDateTime.now();
    }
}