package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class VStudentclassroomavgscore {
    private Integer studentid;

    private Integer classroomid;

    private String classroomname;

    private BigDecimal avgscore;

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
}