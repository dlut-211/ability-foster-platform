package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer chapterLevel;

    private Integer courseId;

    private String name;

    private Integer parentId;

    private String sort;

    private Integer number;

    private String description;

    private Integer createdBy;

    private Date createdOn = new Date();

    private Integer modifiedBy;

    private Date modifiedOn = new Date();

}
