package com.choiceeat.backend.domain.setting.entity;

import com.choiceeat.backend.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "settings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Setting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "setting_id")
    private Long id;

    @Column(name = "location_enabled", nullable = false)
    private boolean locationEnabled;

    @Column(name = "notification_enabled", nullable = false)
    private boolean notificationEnabled;

    // DB 생성 시 TINYINT 적용
    @Column(name = "search_radius_km", nullable = false, columnDefinition = "TINYINT UNSIGNED")
    private int searchRadiusKm;

    // User와의 1:1 단방향 매핑
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}