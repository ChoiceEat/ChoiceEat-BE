package com.choiceeat.backend.domain.advertisement.dto;

import com.choiceeat.backend.domain.advertisement.entity.Advertisement;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AdvertisementResponseDto {
    private Long id;
    private String imageUrl;
    private String linkUrl;

    // 엔티티를 DTO로 변환하는 정적 메서드
    public static AdvertisementResponseDto from(Advertisement advertisement) {
        return AdvertisementResponseDto.builder()
                .id(advertisement.getId())
                .imageUrl(advertisement.getImageUrl())
                .linkUrl(advertisement.getLinkUrl())
                .build();
    }
}