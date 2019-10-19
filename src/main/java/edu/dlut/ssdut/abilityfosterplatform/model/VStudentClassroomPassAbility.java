package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

@Data
public class VStudentClassroomPassAbility {

    private Integer studentId;

    private Integer classroomId;

    private String classroomName;

    private Integer abilityId;

    private String abilityName;

    private Integer isPass;

}