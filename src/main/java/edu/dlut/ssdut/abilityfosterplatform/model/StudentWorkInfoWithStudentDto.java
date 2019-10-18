package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

@Data
public class StudentWorkInfoWithStudentDto {
    private Integer studentId;
    private int nowPage;
    private int pageSize;
    private int startSize;
}
