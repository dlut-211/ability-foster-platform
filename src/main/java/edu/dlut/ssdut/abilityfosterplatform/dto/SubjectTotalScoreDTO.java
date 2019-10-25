package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class SubjectTotalScoreDTO {
    private Integer subjectId;
    private Integer classRoomId;
    private String classRoomName;
    private String studentName;
    private float testScore;
    private float workScore;
    private float totalScore;
    private String optionValue;
}
