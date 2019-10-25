package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class SubjectWorkAbilityScoreDTO {
    private Integer studentid;
    private String studentnumber;
    private Integer subjectid;
    private float abilityscore;
    private float abilityscoresum;
    private Integer abilityid;
    private String abilityname;
}
