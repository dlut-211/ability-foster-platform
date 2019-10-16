package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;
import java.util.Date;

public class Studentworkdetail {
    private Integer id;

    private Date submittime;

    private Integer usetime;

    private String workpath;

    private Integer casepasscount;

    private BigDecimal complexity;

    private Integer coderownumber;

    private Integer studentworkid;

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

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public Integer getUsetime() {
        return usetime;
    }

    public void setUsetime(Integer usetime) {
        this.usetime = usetime;
    }

    public String getWorkpath() {
        return workpath;
    }

    public void setWorkpath(String workpath) {
        this.workpath = workpath == null ? null : workpath.trim();
    }

    public Integer getCasepasscount() {
        return casepasscount;
    }

    public void setCasepasscount(Integer casepasscount) {
        this.casepasscount = casepasscount;
    }

    public BigDecimal getComplexity() {
        return complexity;
    }

    public void setComplexity(BigDecimal complexity) {
        this.complexity = complexity;
    }

    public Integer getCoderownumber() {
        return coderownumber;
    }

    public void setCoderownumber(Integer coderownumber) {
        this.coderownumber = coderownumber;
    }

    public Integer getStudentworkid() {
        return studentworkid;
    }

    public void setStudentworkid(Integer studentworkid) {
        this.studentworkid = studentworkid;
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