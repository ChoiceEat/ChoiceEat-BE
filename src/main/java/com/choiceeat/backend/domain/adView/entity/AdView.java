package com.choiceeat.backend.domain.adView.entity;

import com.choiceeat.backend.domain.advertisement.entity.Advertisement;
import com.choiceeat.backend.domain.recommendation.entity.Recommendation;
import com.choiceeat.backend.domain.restaurantPick.entity.RestaurantPick;
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

    // 시청 기록 사용 여부 (재추천 시 사용 완료 처리됨.)
    @Column(name = "used", nullable = false)
    @Builder.Default
    private boolean used = false;

    @Column(name = "viewed_at", nullable = false, updatable = false)
    private LocalDateTime viewedAt;

    // Advertisement와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "advertisement_id", nullable = false)
    private Advertisement advertisement;

    // User와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Recommendation과의 N:1 단방향 매핑
    // 어떤 추천 묶음(세션)을 얻기 위해 광고를 봤는지 변경 (NULL 허용)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recommendation_id", nullable = true)
    private Recommendation recommendation;

    @PrePersist
    protected void onCreate() {
        this.viewedAt = LocalDateTime.now();
    }

    public void markAsUsed() {
        this.used = true;
    }
}