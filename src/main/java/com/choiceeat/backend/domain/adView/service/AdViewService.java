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
import com.choiceeat.backend.global.exception.BaseException;
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

    public void saveAdView(AdViewRequestDto requestDto) {
        // 1 현재 로그인한 유저 ID 가져오기
        // 추후 SecurityUtil.getCurrentUserId() 로 리팩토링 예정
        String currentUserId = SecurityContextHolder.getContext().getAuthentication().getName();
        Long userId = Long.valueOf(currentUserId);

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