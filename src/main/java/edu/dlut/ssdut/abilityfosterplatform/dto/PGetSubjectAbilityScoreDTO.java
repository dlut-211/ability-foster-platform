package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class PGetSubjectAbilityScoreDTO {
    private int subjectId;
    private int studentId;
    private String studentNumber;
    private String studentName;
    private int abilityId;
    private String abilityName;
    private float abilityScore;
    private float abilityScoreSum;
}
