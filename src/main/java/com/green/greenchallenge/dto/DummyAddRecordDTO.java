package com.green.greenchallenge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DummyAddRecordDTO {
    private Long challengeId;
    private Long userId;
    private double achieved;
    private int year;
    private int month;
    private int day;
    private int range;
    private int defaultDistance;
}
