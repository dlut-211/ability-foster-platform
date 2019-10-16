package edu.dlut.ssdut.abilityfosterplatform.model;

public class DatabaseMirroringWitnesses {
    private String databaseName;

    private String principalServerName;

    private String mirrorServerName;

    private Byte safetyLevel;

    private String safetyLevelDesc;

    private Integer safetySequenceNumber;

    private Integer roleSequenceNumber;

    private String mirroringGuid;

    private String familyGuid;

    private Boolean isSuspended;

    private Integer isSuspendedSequenceNumber;

    private Byte partnerSyncState;

    private String partnerSyncStateDesc;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public String getPrincipalServerName() {
        return principalServerName;
    }

    public void setPrincipalServerName(String principalServerName) {
        this.principalServerName = principalServerName == null ? null : principalServerName.trim();
    }

    public String getMirrorServerName() {
        return mirrorServerName;
    }

    public void setMirrorServerName(String mirrorServerName) {
        this.mirrorServerName = mirrorServerName == null ? null : mirrorServerName.trim();
    }

    public Byte getSafetyLevel() {
        return safetyLevel;
    }

    public void setSafetyLevel(Byte safetyLevel) {
        this.safetyLevel = safetyLevel;
    }

    public String getSafetyLevelDesc() {
        return safetyLevelDesc;
    }

    public void setSafetyLevelDesc(String safetyLevelDesc) {
        this.safetyLevelDesc = safetyLevelDesc == null ? null : safetyLevelDesc.trim();
    }

    public Integer getSafetySequenceNumber() {
        return safetySequenceNumber;
    }

    public void setSafetySequenceNumber(Integer safetySequenceNumber) {
        this.safetySequenceNumber = safetySequenceNumber;
    }

    public Integer getRoleSequenceNumber() {
        return roleSequenceNumber;
    }

    public void setRoleSequenceNumber(Integer roleSequenceNumber) {
        this.roleSequenceNumber = roleSequenceNumber;
    }

    public String getMirroringGuid() {
        return mirroringGuid;
    }

    public void setMirroringGuid(String mirroringGuid) {
        this.mirroringGuid = mirroringGuid == null ? null : mirroringGuid.trim();
    }

    public String getFamilyGuid() {
        return familyGuid;
    }

    public void setFamilyGuid(String familyGuid) {
        this.familyGuid = familyGuid == null ? null : familyGuid.trim();
    }

    public Boolean getIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }

    public Integer getIsSuspendedSequenceNumber() {
        return isSuspendedSequenceNumber;
    }

    public void setIsSuspendedSequenceNumber(Integer isSuspendedSequenceNumber) {
        this.isSuspendedSequenceNumber = isSuspendedSequenceNumber;
    }

    public Byte getPartnerSyncState() {
        return partnerSyncState;
    }

    public void setPartnerSyncState(Byte partnerSyncState) {
        this.partnerSyncState = partnerSyncState;
    }

    public String getPartnerSyncStateDesc() {
        return partnerSyncStateDesc;
    }

    public void setPartnerSyncStateDesc(String partnerSyncStateDesc) {
        this.partnerSyncStateDesc = partnerSyncStateDesc == null ? null : partnerSyncStateDesc.trim();
    }
}