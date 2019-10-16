package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServerAuditSpecificationDetails {
    private Integer serverSpecificationId;

    private String auditActionId;

    private String auditActionName;

    private Byte class;

    private String classDesc;

    private Integer majorId;

    private Integer minorId;

    private Integer auditedPrincipalId;

    private String auditedResult;

    private Boolean isGroup;

    public Integer getServerSpecificationId() {
        return serverSpecificationId;
    }

    public void setServerSpecificationId(Integer serverSpecificationId) {
        this.serverSpecificationId = serverSpecificationId;
    }

    public String getAuditActionId() {
        return auditActionId;
    }

    public void setAuditActionId(String auditActionId) {
        this.auditActionId = auditActionId == null ? null : auditActionId.trim();
    }

    public String getAuditActionName() {
        return auditActionName;
    }

    public void setAuditActionName(String auditActionName) {
        this.auditActionName = auditActionName == null ? null : auditActionName.trim();
    }

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getMinorId() {
        return minorId;
    }

    public void setMinorId(Integer minorId) {
        this.minorId = minorId;
    }

    public Integer getAuditedPrincipalId() {
        return auditedPrincipalId;
    }

    public void setAuditedPrincipalId(Integer auditedPrincipalId) {
        this.auditedPrincipalId = auditedPrincipalId;
    }

    public String getAuditedResult() {
        return auditedResult;
    }

    public void setAuditedResult(String auditedResult) {
        this.auditedResult = auditedResult == null ? null : auditedResult.trim();
    }

    public Boolean getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }
}