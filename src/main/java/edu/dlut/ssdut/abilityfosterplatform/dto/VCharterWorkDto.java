package edu.dlut.ssdut.abilityfosterplatform.dto;


import lombok.Data;

@Data
public class VCharterWorkDto {
    //学生_我的课堂中的章节作业
    private Integer studentId;

    private Integer classroomId;

    private int nowPage;

    private int pageSize;
}
