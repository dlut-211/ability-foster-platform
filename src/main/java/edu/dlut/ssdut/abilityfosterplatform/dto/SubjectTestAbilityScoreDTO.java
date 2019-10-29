package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class SubjectTestAbilityScoreDTO {
    private Integer subjectId;
    private Integer studentId;
    private String studentNumber;
    private String studentName;
    private Integer abilityId;
    private String abilityName;
    private float abilityScore;
    private float abilityScoreSum;
}
