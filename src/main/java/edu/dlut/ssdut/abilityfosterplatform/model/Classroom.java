package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Classroom {

    @Id
    private Integer id;

    private Date beginDate;

    private Integer courseId;

    private Date endDate;

    private Integer termType;

    private String name;

    private Integer status;

    private BigDecimal dailyPerformanceWeight;

    private BigDecimal testPerformanceWeight;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}