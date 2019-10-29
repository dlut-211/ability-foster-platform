package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.util.Date;

@Data
public class VWork {

    private Integer id;

    private String description;

    private Integer chapterId;

    private String name;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

    private String createdByName;

    private String modifiedByName;

    private String nameExp12;

}