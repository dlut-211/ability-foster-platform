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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTermType() {
        return termType;
    }

    public void setTermType(Integer termType) {
        this.termType = termType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getDailyPerformanceWeight() {
        return dailyPerformanceWeight;
    }

    public void setDailyPerformanceWeight(BigDecimal dailyPerformanceWeight) {
        this.dailyPerformanceWeight = dailyPerformanceWeight;
    }

    public BigDecimal getTestPerformaceWeight() {
        return testPerformaceWeight;
    }

    public void setTestPerformaceWeight(BigDecimal testPerformaceWeight) {
        this.testPerformaceWeight = testPerformaceWeight;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseSyllabusPath() {
        return courseSyllabusPath;
    }

    public void setCourseSyllabusPath(String courseSyllabusPath) {
        this.courseSyllabusPath = courseSyllabusPath;
    }

    public String getCourseDescribe() {
        return courseDescribe;
    }

    public void setCourseDescribe(String courseDescribe) {
        this.courseDescribe = courseDescribe;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getTermTypeName() {
        return termTypeName;
    }

    public void setTermTypeName(String termTypeName) {
        this.termTypeName = termTypeName;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
}