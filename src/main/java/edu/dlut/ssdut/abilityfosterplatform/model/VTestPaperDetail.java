package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.util.Date;

@Data
public class VTestPaperDetail {

    private Integer id;

    private Integer detailNumber;

    private Integer score;

    private Integer testPaperId;

    private String title;

    private Integer detailType;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

    private String nameExp12;

}