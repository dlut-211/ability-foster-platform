package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class ClassroomWork {

    @Id
    private Integer id;

    private Integer classroomId;

    private Integer workId;

    private Integer status;

    private Date endTime;

    private Date layoutTime;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;
}