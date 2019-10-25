package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;


@Data
public class Operation {

    @Id
    private Integer id;

    private String operationName;

    private String operationCode;

    private Integer menuId;

    private Boolean isDeleted;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}