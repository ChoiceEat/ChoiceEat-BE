package com.choiceeat.backend.global.init;

import com.choiceeat.backend.domain.menuPick.data.SeedMenuPick;
import com.choiceeat.backend.domain.menuPick.data.SeedMenuPickData;
import com.choiceeat.backend.domain.menuPick.entity.MenuPick;
import com.choiceeat.backend.domain.menuPick.repository.MenuPickRepository;
import com.choiceeat.backend.domain.recommendation.data.SeedRestaurant;
import com.choiceeat.backend.domain.recommendation.data.SeedRestaurantData;
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

        SeedRestaurantData.findAll().stream()
                .map(this::toEntity)
                .forEach(restaurantRepository::save);

        System.out.println("✅ " + SeedRestaurantData.findAll().size() + "개의 식당 데이터를 저장했습니다.");

        saveMenuPicks();
    }

    private Restaurant toEntity(SeedRestaurant seed) {
        // 영업시간 파싱 (예: "11:30 - 22:00")
        LocalTime openTime = null;
        LocalTime closeTime = null;
        try {
            String[] times = seed.businessHours().split(" - ");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            openTime = LocalTime.parse(times[0].trim(), formatter);
            closeTime = LocalTime.parse(times[1].trim(), formatter);
        } catch (Exception e) {
            // 시간 형식이 이상하면 기본값(null)으로 둠.
        }

        Restaurant restaurant = restaurantRepository.findByKakaoPlaceId(seed.kakaoPlaceId())
                .orElseGet(() -> Restaurant.builder()
                        .kakaoPlaceId(seed.kakaoPlaceId())
                        .name(seed.placeName())
                        .address(seed.address())
                        .latitude(seed.latitude())
                        .longitude(seed.longitude())
                        .build());

        restaurant.updateSeedData(
                seed.kakaoPlaceId(),
                seed.placeName(),
                seed.address(),
                seed.roadAddress(),
                seed.latitude(),
                seed.longitude(),
                seed.rating().floatValue(),
                seed.reviewCount(),
                seed.phone(),
                seed.placeUrl(),
                seed.imageUrl(),
                seed.menuType(),
                seed.moodTags(),
                openTime,
                closeTime,
                seed.averagePrice(),
                seed.minPrice(),
                seed.maxPrice(),
                seed.businessHours(),
                seed.parkingAvailable()
        );

        return restaurant;
    }

    private void saveMenuPicks() {
        SeedMenuPickData.findAll().forEach((kakaoPlaceId, seedMenus) ->
                restaurantRepository.findByKakaoPlaceId(kakaoPlaceId)
                        .ifPresent(restaurant -> {
                            menuPickRepository.deleteByRestaurant(restaurant);

                            for (int i = 0; i < seedMenus.size(); i++) {
                                SeedMenuPick seedMenu = seedMenus.get(i);
                                MenuPick menuPick = MenuPick.builder()
                                        .restaurant(restaurant)
                                        .menuName(seedMenu.menuName())
                                        .price(seedMenu.price())
                                        .imageUrl(seedMenu.imageUrl())
                                        .rankNum(i + 1)
                                        .mentionCount(150 - (i * 30))
                                        .build();
                                menuPickRepository.save(menuPick);
                            }
                        })
        );

        int totalMenuCount = SeedMenuPickData.findAll().values().stream()
                .mapToInt(java.util.List::size)
                .sum();
        System.out.println("✅ " + totalMenuCount + "개의 메뉴 데이터를 저장했습니다.");
    }
}
