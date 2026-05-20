package com.choiceeat.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "advertisements")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "advertisement_id")
    private Long id;

    @Column(name = "image_url", nullable = false, columnDefinition = "TEXT")
    private String imageUrl;

    @Column(name = "link_url", nullable = false, columnDefinition = "TEXT")
    private String linkUrl;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;
}
