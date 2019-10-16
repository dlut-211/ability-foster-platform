package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Studentwork {
    private Integer id;

    private Integer classroomstudentid;

    private Integer score;

    private String workmessage;

    private Integer classroomworkid;

    private Integer createdby;

    private Date createdon;

    private Integer modifiedby;

    private Date modifiedon;

    private Boolean isscore;

    private byte[] versionnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassroomstudentid() {
        return classroomstudentid;
    }

    public void setClassroomstudentid(Integer classroomstudentid) {
        this.classroomstudentid = classroomstudentid;
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

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Date getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }

    public Boolean getIsscore() {
        return isscore;
    }

    public void setIsscore(Boolean isscore) {
        this.isscore = isscore;
    }

    public byte[] getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(byte[] versionnumber) {
        this.versionnumber = versionnumber;
    }
}