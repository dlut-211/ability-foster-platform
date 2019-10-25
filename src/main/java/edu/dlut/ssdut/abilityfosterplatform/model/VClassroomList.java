package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author YuJunMing
 * @Date 2019/10/25 14:06
 * DESCRIPTION:
 */
@Data
public class VClassroomList {
    private Integer id;

    private Date beginDate;

    private Date endDate;

    private Integer courseId;

    private Integer termType;

    private String name;

    private Integer status;

    private BigDecimal dailyPerformanceWeight;

    private BigDecimal  testPerformaceWeight;//

    private Integer createdBy;

    private Date createdOn;

    private String courseCode;//

    private String courseName;//

    private String courseSyllabusPath;//

    private String courseDescribe;//

    private String createdByName;//

    private String statusName;//"已结课"
    private String termTypeName;//"夏季学期"
    private String dateFormat;//"2019-09-27 - 2019-09-30"


}