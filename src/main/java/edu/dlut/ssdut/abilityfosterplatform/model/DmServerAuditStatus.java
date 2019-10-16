package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmServerAuditStatus {
    private Integer auditId;

    private String name;

    private Short status;

    private String statusDesc;

    private Date statusTime;

    private String auditFilePath;

    private Long auditFileSize;

    private byte[] eventSessionAddress;

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc == null ? null : statusDesc.trim();
    }

    public Date getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    public String getAuditFilePath() {
        return auditFilePath;
    }

    public void setAuditFilePath(String auditFilePath) {
        this.auditFilePath = auditFilePath == null ? null : auditFilePath.trim();
    }

    public Long getAuditFileSize() {
        return auditFileSize;
    }

    public void setAuditFileSize(Long auditFileSize) {
        this.auditFileSize = auditFileSize;
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }
}