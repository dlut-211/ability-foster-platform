package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class StudentWork {

    @Id
    private Integer id;

    private Integer classroomStudentId;

    private Integer score;

    private String workMessage;

    private Integer classroomWorkId;

    private Boolean isScored;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}