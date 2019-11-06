package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
@Data
public class VStudentWorkDetailDTO {

    private Integer id;

    private String studentNumber;

    private String studentName;

    private Date submitTime;

    private Long useTime;

    private String useTimeFormat;

    private Integer studentWorkId;

    private String workPath;

    private Integer casePassedCount;

    /** 代码圈复杂度 **/
    private BigDecimal complexity;

    /** 代码行数 **/
    private Integer lineOfCode;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}
