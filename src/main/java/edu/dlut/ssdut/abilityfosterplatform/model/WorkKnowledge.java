package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.util.Date;

@Data
public class WorkKnowledge {

    private Integer id;

    private Integer knowledgeId;

    private Integer workId;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}