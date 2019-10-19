package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class Course {

    @Id
    private Integer id;

    private String code;

    private String name;

    private String syllabus;

    private String syllabusPath;

    private String description;

    private Integer subjectId;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}