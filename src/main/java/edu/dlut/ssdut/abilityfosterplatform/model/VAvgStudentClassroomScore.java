package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VAvgStudentClassroomScore {

    private Integer studentId;

    private Integer classroomId;

    private String classroomName;

    private BigDecimal avgScore;

}