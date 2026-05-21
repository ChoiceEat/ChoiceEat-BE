package com.choiceeat.backend.domain.destination.dto;

import java.util.List;

public record DestinationSearchResponse(
        int count,
        List<DestinationPlace> destinations
) {
}

