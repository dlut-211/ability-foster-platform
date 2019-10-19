package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class OperationLogDetail {

    @Id
    private Integer id;

    private Integer operationLogId;

    private String columnName;

    private String columnCode;

    private String columnType;

    private String oldValue;

    private String newValue;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}