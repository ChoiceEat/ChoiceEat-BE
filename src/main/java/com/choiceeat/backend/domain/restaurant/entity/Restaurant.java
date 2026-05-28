package com.choiceeat.backend.domain.restaurant.entity;

import com.choiceeat.backend.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "restaurants")
public class Restaurant extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column(name = "kakao_place_id")
    private String kakaoPlaceId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String address;

    @Column(name = "road_address", length = 255)
    private String roadAddress;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column
    private Float rating;

    @Column(name = "review_count")
    private Integer reviewCount;

    @Column(length = 30)
    private String phone;

    @Column(name = "place_url", length = 500)
    private String placeUrl;

    @Column(name = "image_url", length = 2048)
    private String imageUrl;

    @Column(length = 30)
    private String category;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name = "restaurant_mood_tags",
            joinColumns = @JoinColumn(name = "restaurant_id")
    )
    @Column(name = "mood_tag", length = 50)
    @Builder.Default
    private List<String> moodTags = new ArrayList<>();

    @Column(name = "open_time")
    private LocalTime openTime;

    @Column(name = "close_time")
    private LocalTime closeTime;

    @Builder.Default
    @Column(name = "is_open", nullable = false, columnDefinition = "boolean default false")
    private Boolean isOpen = false;

    @Column(name = "average_price")
    private Integer averagePrice;

    @Column(name = "min_price")
    private Integer minPrice;

    @Column(name = "max_price")
    private Integer maxPrice;

    @Column(name = "business_hours", length = 50)
    private String businessHours;

    @Column(name = "parking_available")
    private Boolean parkingAvailable;

    public void updateMockData(
            String kakaoPlaceId,
            String name,
            String address,
            String roadAddress,
            Double latitude,
            Double longitude,
            Float rating,
            Integer reviewCount,
            String phone,
            String placeUrl,
            String imageUrl,
            String category,
            List<String> moodTags,
            LocalTime openTime,
            LocalTime closeTime,
            Integer averagePrice,
            Integer minPrice,
            Integer maxPrice,
            String businessHours,
            Boolean parkingAvailable
    ) {
        this.kakaoPlaceId = kakaoPlaceId;
        this.name = name;
        this.address = address;
        this.roadAddress = roadAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.phone = phone;
        this.placeUrl = placeUrl;
        this.imageUrl = imageUrl;
        this.category = category;
        this.moodTags = new ArrayList<>(moodTags);
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.averagePrice = averagePrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.businessHours = businessHours;
        this.parkingAvailable = parkingAvailable;
        this.isOpen = true;
    }
}
