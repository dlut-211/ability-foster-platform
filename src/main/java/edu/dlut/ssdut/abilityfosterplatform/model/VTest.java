package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class VTest {
    private Integer studentid;

    private Integer classroomid;

    private String classroomname;

    private BigDecimal avgscore;

    private Long rank;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

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

    public BigDecimal getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(BigDecimal avgscore) {
        this.avgscore = avgscore;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }
}