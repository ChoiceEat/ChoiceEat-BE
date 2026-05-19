package com.choiceeat.backend.domain.valueScore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "value_scores")
public class ValueScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Builder.Default
    @Column(name = "cei_score", nullable = false)
    private Double ceiScore = 0.0;

    @Builder.Default
    @Column(name = "price_index", nullable = false)
    private Double priceIndex = 0.0;

    @Builder.Default
    @Column(name = "satisfaction_index", nullable = false)
    private Double satisfactionIndex = 0.0;

    @Builder.Default
    @Column(name = "area_avg_price", nullable = false)
    private Integer areaAvgPrice = 0;

    @Column(columnDefinition = "TEXT")
    private String keywords;

    @CreationTimestamp
    @Column(name = "calculated_at", nullable = false, updatable = false)
    private LocalDateTime calculatedAt;

    @Column(name = "restaurant_id", nullable = false, unique = true)
    private Long restaurantId;
}
