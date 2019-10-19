package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.util.Date;

@Data
public class VSysOperator {

    private Integer id;

    private String code;

    private String name;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}