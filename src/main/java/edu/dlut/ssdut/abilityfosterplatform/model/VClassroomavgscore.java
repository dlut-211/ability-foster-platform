package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class VClassroomavgscore {
    private Integer classroomid;

    private BigDecimal avgscore;

    private String classroomname;

    private Integer studentid;

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public BigDecimal getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(BigDecimal avgscore) {
        this.avgscore = avgscore;
    }

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname == null ? null : classroomname.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }
}