package com.choiceeat.backend.domain.destination.service;

import com.choiceeat.backend.domain.destination.client.KakaoLocalClient;
import com.choiceeat.backend.domain.destination.dto.DestinationPlace;
import com.choiceeat.backend.domain.destination.dto.DestinationSearchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DestinationService {

    private final KakaoLocalClient kakaoLocalClient;

    public DestinationSearchResponse searchDestinations(String query, int size) {
        List<DestinationPlace> destinations = kakaoLocalClient.searchDestinations(query, size);
        return new DestinationSearchResponse(destinations.size(), destinations);
    }
}

