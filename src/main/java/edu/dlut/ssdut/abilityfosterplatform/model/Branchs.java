package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Branchs {
    private Integer id;

    private String name;

    private String branchhead;

    private String headphone;

    private String branchphone;

    private String region;

    private String address;

    private String remark;

    private Integer companyid;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBranchhead() {
        return branchhead;
    }

    public void setBranchhead(String branchhead) {
        this.branchhead = branchhead == null ? null : branchhead.trim();
    }

    public String getHeadphone() {
        return headphone;
    }

    public void setHeadphone(String headphone) {
        this.headphone = headphone == null ? null : headphone.trim();
    }

    public String getBranchphone() {
        return branchphone;
    }

    public void setBranchphone(String branchphone) {
        this.branchphone = branchphone == null ? null : branchphone.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
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