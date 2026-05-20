package com.choiceeat.domain;

import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu_picks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuPick {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_pick_id")
    private Long id;

    @Column(name = "menu_name", nullable = false)
    private String menuName;

    @Column(name = "mention_count", nullable = false)
    private int mentionCount;

    @Column(name = "rank_num", nullable = false)
    private int rankNum;

    // 식당 도메인과의 N:1 연관관계 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;
}