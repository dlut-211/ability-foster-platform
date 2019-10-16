package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class VStudentclassroomabilitypaperscore {
    private Integer classroomid;

    private String classroomname;

    private Integer courseid;

    private String coursename;

    private Integer abilityid;

    private String abilityname;

    private Integer studentid;

    private String studentname;

    private BigDecimal score;

    private BigDecimal totalscore;

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

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public Integer getAbilityid() {
        return abilityid;
    }

    public void setAbilityid(Integer abilityid) {
        this.abilityid = abilityid;
    }

    public String getAbilityname() {
        return abilityname;
    }

    public void setAbilityname(String abilityname) {
        this.abilityname = abilityname == null ? null : abilityname.trim();
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

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(BigDecimal totalscore) {
        this.totalscore = totalscore;
    }
}