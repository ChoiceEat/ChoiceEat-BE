package com.choiceeat.backend.domain.destination.controller;

import com.choiceeat.backend.domain.destination.dto.DestinationSearchResponse;
import com.choiceeat.backend.domain.destination.dto.SelectedDestinationRequest;
import com.choiceeat.backend.domain.destination.dto.SelectedDestinationResponse;
import com.choiceeat.backend.domain.destination.service.DestinationService;
import com.choiceeat.backend.domain.user.entity.User;
import com.choiceeat.backend.global.annotation.CurrentUser;
import com.choiceeat.backend.global.response.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/destinations")
@RequiredArgsConstructor
@Validated
@Tag(name = "Destination", description = "목적지 검색 API")
public class DestinationController {

    private final DestinationService destinationService;

    @GetMapping("/search")
    @Operation(summary = "목적지 검색", description = "카카오 키워드 검색으로 목적지를 조회합니다.")
    public ResponseEntity<SuccessResponse<DestinationSearchResponse>> searchDestinations(
            @RequestParam @NotBlank(message = "query는 필수입니다.") String query
    ) {
        DestinationSearchResponse response = destinationService.searchDestinations(query, 15);
        return ResponseEntity.ok(SuccessResponse.from(response));
    }

    @GetMapping("/selected")
    @Operation(summary = "선택 목적지 조회", description = "사용자가 현재 선택한 목적지를 조회합니다.")
    public ResponseEntity<SuccessResponse<SelectedDestinationResponse>> getSelectedDestination(@CurrentUser User user) {
        return ResponseEntity.ok(SuccessResponse.from(destinationService.getSelectedDestination(user)));
    }

    @PatchMapping("/selected")
    @Operation(summary = "선택 목적지 저장", description = "사용자가 선택한 목적지를 저장하거나 기존 목적지를 변경합니다.")
    public ResponseEntity<SuccessResponse<SelectedDestinationResponse>> updateSelectedDestination(
            @CurrentUser User user,
            @Valid @RequestBody SelectedDestinationRequest request
    ) {
        return ResponseEntity.ok(SuccessResponse.from(destinationService.updateSelectedDestination(user, request)));
    }
}
