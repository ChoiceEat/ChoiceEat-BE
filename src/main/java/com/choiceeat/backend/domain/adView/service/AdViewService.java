package com.choiceeat.backend.domain.adView.service;

import com.choiceeat.backend.domain.adView.dto.AdViewRequestDto;
import com.choiceeat.backend.domain.adView.entity.AdView;
import com.choiceeat.backend.domain.adView.exception.AdViewErrorCode;
import com.choiceeat.backend.domain.adView.repository.AdViewRepository;
import com.choiceeat.backend.domain.advertisement.entity.Advertisement;
import com.choiceeat.backend.domain.advertisement.exception.AdvertisementErrorCode;
import com.choiceeat.backend.domain.advertisement.repository.AdvertisementRepository;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.domain.user.exception.UserErrorCode;
import com.choiceeat.backend.domain.user.repository.UserRepository;
import com.choiceeat.backend.global.config.AdConfig;
import com.choiceeat.backend.global.exception.BaseException;
import com.choiceeat.backend.global.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class AdViewService {

    private final AdViewRepository adViewRepository;
    private final AdvertisementRepository adRepository;
    private final UserRepository userRepository;
    private final AdConfig adConfig;

    public void saveAdView(AdViewRequestDto requestDto) {

        if (!adConfig.isValidAdId(requestDto.getAdvertisementId())) {
            throw new BaseException(AdvertisementErrorCode.INVALID_AD_ID);
        }

        // 1 현재 로그인한 유저 ID 가져오기 (유틸 클래스로 변경)
        Long userId = SecurityUtil.getCurrentUserId();

        // 2 유저와 광고 엔티티 조회
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new BaseException(UserErrorCode.USER_NOT_FOUND));

        Advertisement ad = adRepository.findById(requestDto.getAdvertisementId())
                .orElseThrow(() -> new BaseException(AdvertisementErrorCode.AD_NOT_FOUND));

        // 3 AdView 엔티티 생성 및 저장
        AdView adView = AdView.builder()
                .user(user)
                .advertisement(ad)
                .completed(requestDto.isCompleted())
                .build();

        adViewRepository.save(adView);
    }
}