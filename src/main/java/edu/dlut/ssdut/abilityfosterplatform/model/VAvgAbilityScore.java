package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VAvgAbilityScore {
    private Integer subjectId;

    private Integer courseId;

    private Integer classroomId;

    private Integer abilityId;

    private String abilityName;

    private BigDecimal avgScore;

}