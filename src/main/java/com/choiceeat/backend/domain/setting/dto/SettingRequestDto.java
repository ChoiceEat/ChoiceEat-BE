package com.choiceeat.backend.domain.setting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SettingRequestDto {
    @JsonProperty("locationEnabled")
    private boolean locationEnabled;
    @JsonProperty("notificationEnabled")
    private boolean notificationEnabled;
    @JsonProperty("marketingEnabled")
    private boolean marketingEnabled;

    @Min(1)
    @Max(3)
    @JsonProperty("searchRadiusKm")
    private int searchRadiusKm;
}
