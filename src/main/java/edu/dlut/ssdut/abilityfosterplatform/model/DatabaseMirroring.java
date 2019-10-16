package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class DatabaseMirroring {
    private Integer databaseId;

    private String mirroringGuid;

    private Byte mirroringState;

    private String mirroringStateDesc;

    private Byte mirroringRole;

    private String mirroringRoleDesc;

    private Integer mirroringRoleSequence;

    private Byte mirroringSafetyLevel;

    private String mirroringSafetyLevelDesc;

    private Integer mirroringSafetySequence;

    private String mirroringPartnerName;

    private String mirroringPartnerInstance;

    private String mirroringWitnessName;

    private Byte mirroringWitnessState;

    private String mirroringWitnessStateDesc;

    private BigDecimal mirroringFailoverLsn;

    private Integer mirroringConnectionTimeout;

    private Integer mirroringRedoQueue;

    private String mirroringRedoQueueType;

    private BigDecimal mirroringEndOfLogLsn;

    private BigDecimal mirroringReplicationLsn;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getMirroringGuid() {
        return mirroringGuid;
    }

    public void setMirroringGuid(String mirroringGuid) {
        this.mirroringGuid = mirroringGuid == null ? null : mirroringGuid.trim();
    }

    public Byte getMirroringState() {
        return mirroringState;
    }

    public void setMirroringState(Byte mirroringState) {
        this.mirroringState = mirroringState;
    }

    public String getMirroringStateDesc() {
        return mirroringStateDesc;
    }

    public void setMirroringStateDesc(String mirroringStateDesc) {
        this.mirroringStateDesc = mirroringStateDesc == null ? null : mirroringStateDesc.trim();
    }

    public Byte getMirroringRole() {
        return mirroringRole;
    }

    public void setMirroringRole(Byte mirroringRole) {
        this.mirroringRole = mirroringRole;
    }

    public String getMirroringRoleDesc() {
        return mirroringRoleDesc;
    }

    public void setMirroringRoleDesc(String mirroringRoleDesc) {
        this.mirroringRoleDesc = mirroringRoleDesc == null ? null : mirroringRoleDesc.trim();
    }

    public Integer getMirroringRoleSequence() {
        return mirroringRoleSequence;
    }

    public void setMirroringRoleSequence(Integer mirroringRoleSequence) {
        this.mirroringRoleSequence = mirroringRoleSequence;
    }

    public Byte getMirroringSafetyLevel() {
        return mirroringSafetyLevel;
    }

    public void setMirroringSafetyLevel(Byte mirroringSafetyLevel) {
        this.mirroringSafetyLevel = mirroringSafetyLevel;
    }

    public String getMirroringSafetyLevelDesc() {
        return mirroringSafetyLevelDesc;
    }

    public void setMirroringSafetyLevelDesc(String mirroringSafetyLevelDesc) {
        this.mirroringSafetyLevelDesc = mirroringSafetyLevelDesc == null ? null : mirroringSafetyLevelDesc.trim();
    }

    public Integer getMirroringSafetySequence() {
        return mirroringSafetySequence;
    }

    public void setMirroringSafetySequence(Integer mirroringSafetySequence) {
        this.mirroringSafetySequence = mirroringSafetySequence;
    }

    public String getMirroringPartnerName() {
        return mirroringPartnerName;
    }

    public void setMirroringPartnerName(String mirroringPartnerName) {
        this.mirroringPartnerName = mirroringPartnerName == null ? null : mirroringPartnerName.trim();
    }

    public String getMirroringPartnerInstance() {
        return mirroringPartnerInstance;
    }

    public void setMirroringPartnerInstance(String mirroringPartnerInstance) {
        this.mirroringPartnerInstance = mirroringPartnerInstance == null ? null : mirroringPartnerInstance.trim();
    }

    public String getMirroringWitnessName() {
        return mirroringWitnessName;
    }

    public void setMirroringWitnessName(String mirroringWitnessName) {
        this.mirroringWitnessName = mirroringWitnessName == null ? null : mirroringWitnessName.trim();
    }

    public Byte getMirroringWitnessState() {
        return mirroringWitnessState;
    }

    public void setMirroringWitnessState(Byte mirroringWitnessState) {
        this.mirroringWitnessState = mirroringWitnessState;
    }

    public String getMirroringWitnessStateDesc() {
        return mirroringWitnessStateDesc;
    }

    public void setMirroringWitnessStateDesc(String mirroringWitnessStateDesc) {
        this.mirroringWitnessStateDesc = mirroringWitnessStateDesc == null ? null : mirroringWitnessStateDesc.trim();
    }

    public BigDecimal getMirroringFailoverLsn() {
        return mirroringFailoverLsn;
    }

    public void setMirroringFailoverLsn(BigDecimal mirroringFailoverLsn) {
        this.mirroringFailoverLsn = mirroringFailoverLsn;
    }

    public Integer getMirroringConnectionTimeout() {
        return mirroringConnectionTimeout;
    }

    public void setMirroringConnectionTimeout(Integer mirroringConnectionTimeout) {
        this.mirroringConnectionTimeout = mirroringConnectionTimeout;
    }

    public Integer getMirroringRedoQueue() {
        return mirroringRedoQueue;
    }

    public void setMirroringRedoQueue(Integer mirroringRedoQueue) {
        this.mirroringRedoQueue = mirroringRedoQueue;
    }

    public String getMirroringRedoQueueType() {
        return mirroringRedoQueueType;
    }

    public void setMirroringRedoQueueType(String mirroringRedoQueueType) {
        this.mirroringRedoQueueType = mirroringRedoQueueType == null ? null : mirroringRedoQueueType.trim();
    }

    public BigDecimal getMirroringEndOfLogLsn() {
        return mirroringEndOfLogLsn;
    }

    public void setMirroringEndOfLogLsn(BigDecimal mirroringEndOfLogLsn) {
        this.mirroringEndOfLogLsn = mirroringEndOfLogLsn;
    }

    public BigDecimal getMirroringReplicationLsn() {
        return mirroringReplicationLsn;
    }

    public void setMirroringReplicationLsn(BigDecimal mirroringReplicationLsn) {
        this.mirroringReplicationLsn = mirroringReplicationLsn;
    }
}