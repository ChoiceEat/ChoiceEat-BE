package com.choiceeat.backend.global.init;

import com.choiceeat.backend.domain.recommendation.data.MockRestaurant;
import com.choiceeat.backend.domain.recommendation.data.MockRestaurantData;
import com.choiceeat.backend.domain.restaurant.entity.Restaurant;
import com.choiceeat.backend.domain.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RestaurantRepository restaurantRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        System.out.println("데이터 초기화 시작...");

        MockRestaurantData.findAll().stream()
                .map(this::toEntity)
                .forEach(restaurantRepository::save);

        System.out.println("✅ " + MockRestaurantData.findAll().size() + "개의 식당 데이터를 저장했습니다.");
    }

    private Restaurant toEntity(MockRestaurant mock) {
        // 영업시간 파싱 (예: "11:30 - 22:00")
        LocalTime openTime = null;
        LocalTime closeTime = null;
        try {
            String[] times = mock.businessHours().split(" - ");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            openTime = LocalTime.parse(times[0].trim(), formatter);
            closeTime = LocalTime.parse(times[1].trim(), formatter);
        } catch (Exception e) {
            // 시간 형식이 이상하면 기본값(null)으로 둠.
        }

        Restaurant restaurant = restaurantRepository.findByKakaoPlaceId(mock.kakaoPlaceId())
                .orElseGet(() -> Restaurant.builder()
                        .kakaoPlaceId(mock.kakaoPlaceId())
                        .name(mock.placeName())
                        .address(mock.address())
                        .latitude(mock.latitude())
                        .longitude(mock.longitude())
                        .build());

        restaurant.updateMockData(
                mock.kakaoPlaceId(),
                mock.placeName(),
                mock.address(),
                mock.roadAddress(),
                mock.latitude(),
                mock.longitude(),
                mock.rating().floatValue(),
                mock.reviewCount(),
                mock.phone(),
                mock.placeUrl(),
                mock.imageUrl(),
                mock.menuType(),
                mock.moodTags(),
                openTime,
                closeTime,
                mock.averagePrice(),
                mock.minPrice(),
                mock.maxPrice(),
                mock.businessHours(),
                mock.parkingAvailable()
        );

        return restaurant;
    }
}
