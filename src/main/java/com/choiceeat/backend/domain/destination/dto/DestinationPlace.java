package com.choiceeat.backend.domain.destination.dto;

public record DestinationPlace(
        String placeName,
        String address,
        String roadAddress,
        Double latitude,
        Double longitude,
        String placeUrl
) {
}

