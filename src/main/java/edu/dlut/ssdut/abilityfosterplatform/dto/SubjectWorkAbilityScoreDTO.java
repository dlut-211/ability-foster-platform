package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class SubjectWorkAbilityScoreDTO {
    private Integer studentId;
    private String studentNumber;
    private Integer subjectId;
    private float abilityScore;
    private float abilityScoreSum;
    private Integer abilityId;
    private String abilityName;
}
