package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class ServerFileAudits {
    private Integer auditId;

    private String name;

    private String auditGuid;

    private Date createDate;

    private Date modifyDate;

    private Integer principalId;

    private String type;

    private String typeDesc;

    private Byte onFailure;

    private String onFailureDesc;

    private Boolean isStateEnabled;

    private Integer queueDelay;

    private String predicate;

    private Long maxFileSize;

    private Integer maxRolloverFiles;

    private Integer maxFiles;

    private Boolean reserveDiskSpace;

    private String logFilePath;

    private String logFileName;

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

    public String getAuditGuid() {
        return auditGuid;
    }

    public void setAuditGuid(String auditGuid) {
        this.auditGuid = auditGuid == null ? null : auditGuid.trim();
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

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Byte getOnFailure() {
        return onFailure;
    }

    public void setOnFailure(Byte onFailure) {
        this.onFailure = onFailure;
    }

    public String getOnFailureDesc() {
        return onFailureDesc;
    }

    public void setOnFailureDesc(String onFailureDesc) {
        this.onFailureDesc = onFailureDesc == null ? null : onFailureDesc.trim();
    }

    public Boolean getIsStateEnabled() {
        return isStateEnabled;
    }

    public void setIsStateEnabled(Boolean isStateEnabled) {
        this.isStateEnabled = isStateEnabled;
    }

    public Integer getQueueDelay() {
        return queueDelay;
    }

    public void setQueueDelay(Integer queueDelay) {
        this.queueDelay = queueDelay;
    }

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate == null ? null : predicate.trim();
    }

    public Long getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public Integer getMaxRolloverFiles() {
        return maxRolloverFiles;
    }

    public void setMaxRolloverFiles(Integer maxRolloverFiles) {
        this.maxRolloverFiles = maxRolloverFiles;
    }

    public Integer getMaxFiles() {
        return maxFiles;
    }

    public void setMaxFiles(Integer maxFiles) {
        this.maxFiles = maxFiles;
    }

    public Boolean getReserveDiskSpace() {
        return reserveDiskSpace;
    }

    public void setReserveDiskSpace(Boolean reserveDiskSpace) {
        this.reserveDiskSpace = reserveDiskSpace;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath == null ? null : logFilePath.trim();
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName == null ? null : logFileName.trim();
    }
}