package com.choiceeat.backend.domain.destination.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SelectedDestinationRequest(
        @NotBlank(message = "카카오 장소 ID는 필수입니다.")
        String kakaoPlaceId,

        @NotBlank(message = "목적지명은 필수입니다.")
        String placeName,

        String address,

        String roadAddress,

        @NotNull(message = "위도는 필수입니다.")
        Double latitude,

        @NotNull(message = "경도는 필수입니다.")
        Double longitude,

        String placeUrl
) {
}
