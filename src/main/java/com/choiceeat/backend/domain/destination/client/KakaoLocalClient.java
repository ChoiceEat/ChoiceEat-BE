package com.choiceeat.backend.domain.destination.client;

import com.choiceeat.backend.domain.destination.dto.DestinationPlace;
import com.choiceeat.backend.domain.destination.exception.DestinationErrorCode;
import com.choiceeat.backend.global.exception.BaseException;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

@Component
@Slf4j
public class KakaoLocalClient {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${kakao.local.base-url:https://dapi.kakao.com}")
    private String kakaoBaseUrl;

    @Value("${kakao.rest-api-key:}")
    private String kakaoRestApiKey;

    public List<DestinationPlace> searchDestinations(String query, int size) {
        if (!StringUtils.hasText(kakaoRestApiKey)) {
            throw new BaseException(DestinationErrorCode.KAKAO_API_KEY_MISSING);
        }

        URI requestUri = UriComponentsBuilder.fromUriString(kakaoBaseUrl)
                .path("/v2/local/search/keyword.json")
                .queryParam("query", query)
                .queryParam("size", size)
                .encode(StandardCharsets.UTF_8)
                .build()
                .toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION, "KakaoAK " + kakaoRestApiKey);

        try {
            ResponseEntity<KakaoKeywordSearchResponse> response = restTemplate.exchange(
                    requestUri,
                    HttpMethod.GET,
                    new HttpEntity<>(headers),
                    KakaoKeywordSearchResponse.class
            );

            if (response.getBody() == null || response.getBody().documents() == null) {
                return Collections.emptyList();
            }

            return response.getBody().documents().stream()
                    .map(document -> new DestinationPlace(
                            document.id(),
                            document.placeName(),
                            document.addressName(),
                            document.roadAddressName(),
                            parseCoordinate(document.y()),
                            parseCoordinate(document.x()),
                            document.placeUrl()
                    ))
                    .toList();
        } catch (RestClientResponseException e) {
            log.error("카카오 API 에러 - 상태: {}, 응답: {}", e.getStatusCode(), e.getResponseBodyAsString(), e);
            int status = e.getStatusCode().value();
            if (status == 401) {
                throw new BaseException(DestinationErrorCode.KAKAO_API_UNAUTHORIZED);
            }
            if (status == 403) {
                throw new BaseException(DestinationErrorCode.KAKAO_API_FORBIDDEN);
            }
            throw new BaseException(DestinationErrorCode.KAKAO_API_CALL_FAILED);
        } catch (RestClientException e) {
            log.error("카카오 API 호출 실패", e);
            throw new BaseException(DestinationErrorCode.KAKAO_API_CALL_FAILED);
        }
    }

    private Double parseCoordinate(String value) {
        if (!StringUtils.hasText(value)) {
            return null;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private record KakaoKeywordSearchResponse(
            List<KakaoKeywordDocument> documents
    ) {
    }

    private record KakaoKeywordDocument(
            @JsonProperty("id") String id,
            @JsonProperty("place_name") String placeName,
            @JsonProperty("address_name") String addressName,
            @JsonProperty("road_address_name") String roadAddressName,
            @JsonProperty("x") String x,
            @JsonProperty("y") String y,
            @JsonProperty("place_url") String placeUrl
    ) {
    }
}
