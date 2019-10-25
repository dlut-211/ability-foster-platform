package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class Chapter {

    @Id
    private Integer id;

    private Integer chapterLevel;

    private Integer courseId;

    private String name;

    private Integer parentId;

    private String sort;

    private Integer number;

    private String description;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}