package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.List;

@Data
public class PStudentTestPaperDTO {
    private String  studentNumber;
    private String studentName;
    private Integer testPaperId;
    private Integer detailType;
    private List<Integer> list;
    private Integer totalScore;
}
