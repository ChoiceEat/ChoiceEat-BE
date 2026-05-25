package com.choiceeat.backend.domain.advertisement.service;

import com.choiceeat.backend.domain.advertisement.dto.AdvertisementResponseDto;
import com.choiceeat.backend.domain.advertisement.entity.Advertisement;
import com.choiceeat.backend.domain.advertisement.exception.AdvertisementErrorCode;
import com.choiceeat.backend.domain.advertisement.repository.AdvertisementRepository;
import com.choiceeat.backend.global.exception.BaseException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AdvertisementService {

    private final AdvertisementRepository adRepository;

    public AdvertisementResponseDto getRandomAd() {
        List<Advertisement> activeAds = adRepository.findByIsActiveTrue();

        if (activeAds.isEmpty()) {
            throw new BaseException(AdvertisementErrorCode.AD_NOT_FOUND);
        }
        Advertisement ad = activeAds.get(new Random().nextInt(activeAds.size()));
        return AdvertisementResponseDto.from(ad);    }
}