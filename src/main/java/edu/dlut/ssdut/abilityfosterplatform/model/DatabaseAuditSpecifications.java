package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DatabaseAuditSpecifications {
    private Integer databaseSpecificationId;

    private String name;

    private Date createDate;

    private Date modifyDate;

    private String auditGuid;

    private Boolean isStateEnabled;

    public Integer getDatabaseSpecificationId() {
        return databaseSpecificationId;
    }

    public void setDatabaseSpecificationId(Integer databaseSpecificationId) {
        this.databaseSpecificationId = databaseSpecificationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getAuditGuid() {
        return auditGuid;
    }

    public void setAuditGuid(String auditGuid) {
        this.auditGuid = auditGuid == null ? null : auditGuid.trim();
    }

    public Boolean getIsStateEnabled() {
        return isStateEnabled;
    }

    public void setIsStateEnabled(Boolean isStateEnabled) {
        this.isStateEnabled = isStateEnabled;
    }
}