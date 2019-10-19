package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VAvgClassroomScore {

    private Integer classroomId;

    private BigDecimal avgScore;

    private String classroomName;

    private Integer studentId;

}