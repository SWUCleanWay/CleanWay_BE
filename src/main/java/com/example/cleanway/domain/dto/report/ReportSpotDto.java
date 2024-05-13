package com.example.cleanway.domain.dto.report;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReportSpotDto {
    private Long spotNumber;
    private Double spotLat;
    private Double spotIng;
    private String spotName;
    @Schema(description = "제보번호")
    private Long reportNumber;
}
