package com.choiceeat.backend.domain.destination.dto;

import com.choiceeat.backend.domain.destination.entity.SelectedDestination;

public record SelectedDestinationResponse(
        Long selectedDestinationId,
        String kakaoPlaceId,
        String placeName,
        String address,
        String roadAddress,
        Double latitude,
        Double longitude,
        String placeUrl
) {
    public static SelectedDestinationResponse from(SelectedDestination selectedDestination) {
        return new SelectedDestinationResponse(
                selectedDestination.getSelectedDestinationId(),
                selectedDestination.getKakaoPlaceId(),
                selectedDestination.getPlaceName(),
                selectedDestination.getAddress(),
                selectedDestination.getRoadAddress(),
                selectedDestination.getLatitude(),
                selectedDestination.getLongitude(),
                selectedDestination.getPlaceUrl()
        );
    }
}
