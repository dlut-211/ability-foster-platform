package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class TestPaperDetail {
    private Integer id;

    private Integer detailnumber;

    private Integer score;

    private Integer testpaperid;

    private String title;

    private Integer detailtype;

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

    public Integer getDetailnumber() {
        return detailnumber;
    }

    public void setDetailnumber(Integer detailnumber) {
        this.detailnumber = detailnumber;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTestpaperid() {
        return testpaperid;
    }

    public void setTestpaperid(Integer testpaperid) {
        this.testpaperid = testpaperid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getDetailtype() {
        return detailtype;
    }

    public void setDetailtype(Integer detailtype) {
        this.detailtype = detailtype;
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