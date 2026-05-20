package com.choiceeat.backend.domain.condition.entity;

import com.choiceeat.backend.domain.condition.entity.LocationType;
import com.choiceeat.backend.domain.destination.entity.DestinationSearch;
import com.choiceeat.backend.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "conditions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Condition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "condition_id")
    private Long id;

    @Column(name = "budget_range", nullable = false)
    private String budgetRange;

    @Column(name = "atmosphere", nullable = false)
    private String atmosphere;

    @Column(name = "food_type", nullable = false)
    private String foodType;

    @Enumerated(EnumType.STRING)
    @Column(name = "location_type", nullable = false)
    private LocationType locationType; // ENUM 타입 (CURRENT, DESTINATION)

    // User와의 N:1 단방향 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // DestinationSearch와의 N:1 단방향 매핑]
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destination_search_id", nullable = true) // ★ nullable = true로 설정하여 NULL 허용
    private DestinationSearch destinationSearch;
}