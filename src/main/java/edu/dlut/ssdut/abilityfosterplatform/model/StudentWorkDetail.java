package edu.dlut.ssdut.abilityfosterplatform.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
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
