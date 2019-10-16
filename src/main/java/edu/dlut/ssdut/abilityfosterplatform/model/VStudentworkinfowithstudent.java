package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class VStudentworkinfowithstudent {
    private Integer studentid;

    private String studentname;

    private String classroomname;

    private String workname;

    private Integer studentworkid;

    private Integer score;

    private Boolean isscore;

    private Integer classroomworkid;

    private Integer classroomstudentid;

    private Date layouttime;

    private Integer studenttotalcount;

    private Integer submitcount;

    private Long rank;

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

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname == null ? null : classroomname.trim();
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname == null ? null : workname.trim();
    }

    public Integer getStudentworkid() {
        return studentworkid;
    }

    public void setStudentworkid(Integer studentworkid) {
        this.studentworkid = studentworkid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean getIsscore() {
        return isscore;
    }

    public void setIsscore(Boolean isscore) {
        this.isscore = isscore;
    }

    public Integer getClassroomworkid() {
        return classroomworkid;
    }

    public void setClassroomworkid(Integer classroomworkid) {
        this.classroomworkid = classroomworkid;
    }

    public Integer getClassroomstudentid() {
        return classroomstudentid;
    }

    public void setClassroomstudentid(Integer classroomstudentid) {
        this.classroomstudentid = classroomstudentid;
    }

    public Date getLayouttime() {
        return layouttime;
    }

    public void setLayouttime(Date layouttime) {
        this.layouttime = layouttime;
    }

    public Integer getStudenttotalcount() {
        return studenttotalcount;
    }

    public void setStudenttotalcount(Integer studenttotalcount) {
        this.studenttotalcount = studenttotalcount;
    }

    public Integer getSubmitcount() {
        return submitcount;
    }

    public void setSubmitcount(Integer submitcount) {
        this.submitcount = submitcount;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }
}