package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "v_course")
public class VCourse {

    @Id
    private Integer id;

    private String code;

    private String name;

    private String syllabus;

    private String syllabusPath;

    private String description;

    private Integer createdBy;

    private Date createdOn;

    private String createdByName;

    private String subjectName;

}