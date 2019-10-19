package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.util.Date;

@Data
public class VStudentWork {

    private Integer id;

    private Integer classroomStudentId;

    private Integer score;

    private String workMessage;

    private Integer classroomWorkId;

    private String studentNumber;

    private String studentName;

    private Date submitTime;

    private Integer useTime;

    private Long submitCount;

    private Integer isSubmit;

    private String workPath;

}