package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

@Data
public class VStudentTestPaper {

    private String studentNumber;

    private String studentName;

    private Integer testPaperId;

    private Integer detailType;

    private Integer detailNumber;

    private Integer detailScore;

    private Integer score;

}