package com.choiceeat.backend.domain.destination.service;

import com.choiceeat.backend.domain.destination.client.KakaoLocalClient;
import com.choiceeat.backend.domain.destination.dto.DestinationPlace;
import com.choiceeat.backend.domain.destination.dto.DestinationSearchResponse;
import com.choiceeat.backend.domain.destination.dto.SelectedDestinationRequest;
import com.choiceeat.backend.domain.destination.dto.SelectedDestinationResponse;
import com.choiceeat.backend.domain.destination.entity.SelectedDestination;
import com.choiceeat.backend.domain.destination.exception.DestinationErrorCode;
import com.choiceeat.backend.domain.destination.repository.SelectedDestinationRepository;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.global.exception.BaseException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DestinationService {

    private final KakaoLocalClient kakaoLocalClient;
    private final SelectedDestinationRepository selectedDestinationRepository;

    public DestinationSearchResponse searchDestinations(String query, int size) {
        List<DestinationPlace> destinations = kakaoLocalClient.searchDestinations(query, size);
        return new DestinationSearchResponse(destinations.size(), destinations);
    }

    public SelectedDestinationResponse getSelectedDestination(User user) {
        SelectedDestination selectedDestination = getSelectedDestinationEntity(user);
        return SelectedDestinationResponse.from(selectedDestination);
    }

    public SelectedDestination getSelectedDestinationEntity(User user) {
        return selectedDestinationRepository.findByUser_UserId(user.getUserId())
                .orElseThrow(() -> new BaseException(DestinationErrorCode.SELECTED_DESTINATION_NOT_FOUND));
    }

    @Transactional
    public SelectedDestinationResponse updateSelectedDestination(User user, SelectedDestinationRequest request) {
        SelectedDestination selectedDestination = selectedDestinationRepository.findByUser_UserId(user.getUserId())
                .orElseGet(() -> SelectedDestination.builder()
                        .user(user)
                        .build());

        selectedDestination.update(
                request.kakaoPlaceId(),
                request.placeName(),
                request.address(),
                request.roadAddress(),
                request.latitude(),
                request.longitude(),
                request.placeUrl()
        );

        return SelectedDestinationResponse.from(selectedDestinationRepository.save(selectedDestination));
    }
}
