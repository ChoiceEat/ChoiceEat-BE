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
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RestaurantRepository restaurantRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (restaurantRepository.count() > 0) {
            return;
        }

        System.out.println("데이터 초기화 시작...");

        List<Restaurant> restaurants = MockRestaurantData.findAll().stream()
                .map(this::toEntity)
                .toList();

        restaurantRepository.saveAll(restaurants);
        System.out.println("✅ " + restaurants.size() + "개의 식당 데이터를 저장했습니다.");
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

        return Restaurant.builder()
                .kakaoPlaceId(mock.kakaoPlaceId())
                .name(mock.placeName())
                .address(mock.address())
                .latitude(mock.latitude())
                .longitude(mock.longitude())
                .rating(mock.rating().floatValue()) // Double -> Float 변환
                .reviewCount(mock.reviewCount())
                .category(mock.menuType())
                .openTime(openTime)
                .closeTime(closeTime)
                .averagePrice(mock.averagePrice())
                .isOpen(true) // 기본값 설정
                .build();
    }
}