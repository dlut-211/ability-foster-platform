package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "v_student_work_detail")
public class VStudentWorkDetail {

    @Id
    private Integer id;

    private String studentNumber;

    private String studentName;

    private Date submitTime;

    private Long useTime;

    private Integer studentWorkId;

    private String workPath;

    private Integer casePassedCount;

    /** 代码圈复杂度 **/
    private BigDecimal complexity;

    /** 代码行数 **/
    private Integer lineOfCode;

    private Integer createdBy;

    private Date createdOn = new Date();

    private Integer modifiedBy;

    private Date modifiedOn = new Date();

}