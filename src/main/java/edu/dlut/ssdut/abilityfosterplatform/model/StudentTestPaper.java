package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class StudentTestPaper {

    @Id
    private Integer id;

    private Integer classroomStudentId;

    private Integer testPaperDetailId;

    private Integer score;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}