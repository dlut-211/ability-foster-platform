package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VStudentClassroomAbilityWorkScore {

    private Integer classroomId;

    private String classroomName;

    private Integer courseId;

    private String courseName;

    private Integer abilityId;

    private String abilityName;

    private Integer studentId;

    private String studentName;

    private BigDecimal score;

    private BigDecimal totalScore;

}