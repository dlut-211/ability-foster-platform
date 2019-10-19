package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class TestPaper {

    @Id
    private Integer id;

    private String name;

    private Integer classroomId;

    private Integer testPaperType;

    private Integer status;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}