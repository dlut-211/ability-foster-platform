package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class OperationLog {

    @Id
    private Integer id;

    private Integer userId;

    private Date operationTime;

    private String ip;

    private Integer menuId;

    private Integer operationId;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}