package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class StudentWorkDetail {

    @Id
    private Integer id;

    private Date submitTime;

    private String workPath;

    private Integer useTime;

    private Integer casePassedCount;

    private BigDecimal complexity;

    private Integer lineOfCode;

    private Integer studentWorkId;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}