package com.choiceeat.backend.global.init;

import com.choiceeat.backend.domain.menuPick.data.MockMenuPick;
import com.choiceeat.backend.domain.menuPick.data.MockMenuPickData;
import com.choiceeat.backend.domain.menuPick.entity.MenuPick;
import com.choiceeat.backend.domain.menuPick.repository.MenuPickRepository;
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
    private final MenuPickRepository menuPickRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        System.out.println("데이터 초기화 시작...");

        MockRestaurantData.findAll().stream()
                .map(this::toEntity)
                .forEach(restaurantRepository::save);

        System.out.println("✅ " + MockRestaurantData.findAll().size() + "개의 식당 데이터를 저장했습니다.");

        saveMenuPicks();
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

    private void saveMenuPicks() {
        MockMenuPickData.findAll().forEach((kakaoPlaceId, mockMenus) ->
                restaurantRepository.findByKakaoPlaceId(kakaoPlaceId)
                        .ifPresent(restaurant -> {
                            menuPickRepository.deleteByRestaurant(restaurant);

                            for (int i = 0; i < mockMenus.size(); i++) {
                                MockMenuPick mockMenu = mockMenus.get(i);
                                MenuPick menuPick = MenuPick.builder()
                                        .restaurant(restaurant)
                                        .menuName(mockMenu.menuName())
                                        .price(mockMenu.price())
                                        .imageUrl(mockMenu.imageUrl())
                                        .rankNum(i + 1)
                                        .mentionCount(150 - (i * 30))
                                        .build();
                                menuPickRepository.save(menuPick);
                            }
                        })
        );

        int totalMenuCount = MockMenuPickData.findAll().values().stream()
                .mapToInt(java.util.List::size)
                .sum();
        System.out.println("✅ " + totalMenuCount + "개의 메뉴 데이터를 저장했습니다.");
    }
}
