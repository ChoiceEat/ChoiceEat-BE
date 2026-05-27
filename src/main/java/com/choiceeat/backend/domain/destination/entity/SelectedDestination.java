package com.choiceeat.backend.domain.destination.entity;

import com.choiceeat.backend.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "selected_destinations")
public class SelectedDestination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "selected_destination_id")
    private Long selectedDestinationId;

    @Column(name = "place_name", nullable = false, length = 100)
    private String placeName;

    @Column(name = "kakao_place_id", length = 50)
    private String kakaoPlaceId;

    @Column(length = 255)
    private String address;

    @Column(name = "road_address", length = 255)
    private String roadAddress;

    @Column(name = "place_url", length = 500)
    private String placeUrl;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    public void update(String kakaoPlaceId, String placeName, String address, String roadAddress, Double latitude, Double longitude, String placeUrl) {
        this.kakaoPlaceId = kakaoPlaceId;
        this.placeName = placeName;
        this.address = address;
        this.roadAddress = roadAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.placeUrl = placeUrl;
    }
}
