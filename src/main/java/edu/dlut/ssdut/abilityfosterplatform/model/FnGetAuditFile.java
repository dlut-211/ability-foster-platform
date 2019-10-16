package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class FnGetAuditFile {
    private Date eventTime;

    private Integer sequenceNumber;

    private String actionId;

    private Boolean succeeded;

    private Boolean isColumnPermission;

    private Short sessionId;

    private Integer serverPrincipalId;

    private Integer databasePrincipalId;

    private Integer targetServerPrincipalId;

    private Integer targetDatabasePrincipalId;

    private Integer objectId;

    private String classType;

    private String sessionServerPrincipalName;

    private String serverPrincipalName;

    private String databasePrincipalName;

    private String targetServerPrincipalName;

    private String targetDatabasePrincipalName;

    private String serverInstanceName;

    private String databaseName;

    private String schemaName;

    private String objectName;

    private String statement;

    private String additionalInformation;

    private String fileName;

    private Long auditFileOffset;

    private Short userDefinedEventId;

    private String userDefinedInformation;

    private Integer auditSchemaVersion;

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId == null ? null : actionId.trim();
    }

    public Boolean getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(Boolean succeeded) {
        this.succeeded = succeeded;
    }

    public Boolean getIsColumnPermission() {
        return isColumnPermission;
    }

    public void setIsColumnPermission(Boolean isColumnPermission) {
        this.isColumnPermission = isColumnPermission;
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getServerPrincipalId() {
        return serverPrincipalId;
    }

    public void setServerPrincipalId(Integer serverPrincipalId) {
        this.serverPrincipalId = serverPrincipalId;
    }

    public Integer getDatabasePrincipalId() {
        return databasePrincipalId;
    }

    public void setDatabasePrincipalId(Integer databasePrincipalId) {
        this.databasePrincipalId = databasePrincipalId;
    }

    public Integer getTargetServerPrincipalId() {
        return targetServerPrincipalId;
    }

    public void setTargetServerPrincipalId(Integer targetServerPrincipalId) {
        this.targetServerPrincipalId = targetServerPrincipalId;
    }

    public Integer getTargetDatabasePrincipalId() {
        return targetDatabasePrincipalId;
    }

    public void setTargetDatabasePrincipalId(Integer targetDatabasePrincipalId) {
        this.targetDatabasePrincipalId = targetDatabasePrincipalId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType == null ? null : classType.trim();
    }

    public String getSessionServerPrincipalName() {
        return sessionServerPrincipalName;
    }

    public void setSessionServerPrincipalName(String sessionServerPrincipalName) {
        this.sessionServerPrincipalName = sessionServerPrincipalName == null ? null : sessionServerPrincipalName.trim();
    }

    public String getServerPrincipalName() {
        return serverPrincipalName;
    }

    public void setServerPrincipalName(String serverPrincipalName) {
        this.serverPrincipalName = serverPrincipalName == null ? null : serverPrincipalName.trim();
    }

    public String getDatabasePrincipalName() {
        return databasePrincipalName;
    }

    public void setDatabasePrincipalName(String databasePrincipalName) {
        this.databasePrincipalName = databasePrincipalName == null ? null : databasePrincipalName.trim();
    }

    public String getTargetServerPrincipalName() {
        return targetServerPrincipalName;
    }

    public void setTargetServerPrincipalName(String targetServerPrincipalName) {
        this.targetServerPrincipalName = targetServerPrincipalName == null ? null : targetServerPrincipalName.trim();
    }

    public String getTargetDatabasePrincipalName() {
        return targetDatabasePrincipalName;
    }

    public void setTargetDatabasePrincipalName(String targetDatabasePrincipalName) {
        this.targetDatabasePrincipalName = targetDatabasePrincipalName == null ? null : targetDatabasePrincipalName.trim();
    }

    public String getServerInstanceName() {
        return serverInstanceName;
    }

    public void setServerInstanceName(String serverInstanceName) {
        this.serverInstanceName = serverInstanceName == null ? null : serverInstanceName.trim();
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName == null ? null : schemaName.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation == null ? null : additionalInformation.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Long getAuditFileOffset() {
        return auditFileOffset;
    }

    public void setAuditFileOffset(Long auditFileOffset) {
        this.auditFileOffset = auditFileOffset;
    }

    public Short getUserDefinedEventId() {
        return userDefinedEventId;
    }

    public void setUserDefinedEventId(Short userDefinedEventId) {
        this.userDefinedEventId = userDefinedEventId;
    }

    public String getUserDefinedInformation() {
        return userDefinedInformation;
    }

    public void setUserDefinedInformation(String userDefinedInformation) {
        this.userDefinedInformation = userDefinedInformation == null ? null : userDefinedInformation.trim();
    }

    public Integer getAuditSchemaVersion() {
        return auditSchemaVersion;
    }

    public void setAuditSchemaVersion(Integer auditSchemaVersion) {
        this.auditSchemaVersion = auditSchemaVersion;
    }
}