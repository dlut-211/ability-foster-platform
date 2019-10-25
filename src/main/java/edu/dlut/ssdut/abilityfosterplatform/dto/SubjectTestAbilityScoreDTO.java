package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class SubjectTestAbilityScoreDTO {
    private Integer subjectid;
    private Integer studentid;
    private String studentnumber;
    private String studentname;
    private Integer abilityid;
    private String abilityname;
    private float abilityscore;
    private float abilityscoresum;
}
