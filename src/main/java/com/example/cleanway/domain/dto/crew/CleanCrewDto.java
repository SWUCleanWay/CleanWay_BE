package com.example.cleanway.domain.dto.crew;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CleanCrewDto {
    private Long crewNumber;
    private Long userNumber;
    private String crewName;
    private String crewWriteTime;
    private String crewContent;
    private Long crewRecruitment;
    private Long crewRoleNumber;
}