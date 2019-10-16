package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class StudentTestPaper {
    private Integer id;

    private Integer classroomstudentid;

    private Integer testpaperdetailid;

    private Integer score;

    private Integer createdby;

    private Date createdon;

    private Integer modifiedby;

    private Date modifiedon;

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

    public Integer getTestpaperdetailid() {
        return testpaperdetailid;
    }

    public void setTestpaperdetailid(Integer testpaperdetailid) {
        this.testpaperdetailid = testpaperdetailid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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

    public byte[] getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(byte[] versionnumber) {
        this.versionnumber = versionnumber;
    }
}