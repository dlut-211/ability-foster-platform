package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;
import java.util.Date;

public class Allworkscore {
    private Integer classroomid;

    private String classroomname;

    private BigDecimal dailyperformanceweight;

    private BigDecimal testperformaceweight;

    private Integer studentid;

    private String studentname;

    private Integer score;

    private String workmessage;

    private Integer classroomworkid;

    private Date layouttime;

    private Integer classroomworkstatus;

    private String workname;

    private String workdescribe;

    private Integer count1;

    private BigDecimal workscore;

    private Integer workid;

    private Integer courseid;

    private Integer subjectid;

    private Integer knowledgeid;

    private String name;

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname == null ? null : classroomname.trim();
    }

    public BigDecimal getDailyperformanceweight() {
        return dailyperformanceweight;
    }

    public void setDailyperformanceweight(BigDecimal dailyperformanceweight) {
        this.dailyperformanceweight = dailyperformanceweight;
    }

    public BigDecimal getTestperformaceweight() {
        return testperformaceweight;
    }

    public void setTestperformaceweight(BigDecimal testperformaceweight) {
        this.testperformaceweight = testperformaceweight;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getWorkmessage() {
        return workmessage;
    }

    public void setWorkmessage(String workmessage) {
        this.workmessage = workmessage == null ? null : workmessage.trim();
    }

    public Integer getClassroomworkid() {
        return classroomworkid;
    }

    public void setClassroomworkid(Integer classroomworkid) {
        this.classroomworkid = classroomworkid;
    }

    public Date getLayouttime() {
        return layouttime;
    }

    public void setLayouttime(Date layouttime) {
        this.layouttime = layouttime;
    }

    public Integer getClassroomworkstatus() {
        return classroomworkstatus;
    }

    public void setClassroomworkstatus(Integer classroomworkstatus) {
        this.classroomworkstatus = classroomworkstatus;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname == null ? null : workname.trim();
    }

    public String getWorkdescribe() {
        return workdescribe;
    }

    public void setWorkdescribe(String workdescribe) {
        this.workdescribe = workdescribe == null ? null : workdescribe.trim();
    }

    public Integer getCount1() {
        return count1;
    }

    public void setCount1(Integer count1) {
        this.count1 = count1;
    }

    public BigDecimal getWorkscore() {
        return workscore;
    }

    public void setWorkscore(BigDecimal workscore) {
        this.workscore = workscore;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public Integer getKnowledgeid() {
        return knowledgeid;
    }

    public void setKnowledgeid(Integer knowledgeid) {
        this.knowledgeid = knowledgeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}