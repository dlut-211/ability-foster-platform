package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class AvailabilityReplicas {
    private String replicaId;

    private String groupId;

    private Integer replicaMetadataId;

    private String replicaServerName;

    private String endpointUrl;

    private Byte availabilityMode;

    private String availabilityModeDesc;

    private Byte failoverMode;

    private String failoverModeDesc;

    private Integer sessionTimeout;

    private Byte primaryRoleAllowConnections;

    private String primaryRoleAllowConnectionsDesc;

    private Byte secondaryRoleAllowConnections;

    private String secondaryRoleAllowConnectionsDesc;

    private Date createDate;

    private Date modifyDate;

    private Integer backupPriority;

    private String readOnlyRoutingUrl;

    private byte[] ownerSid;

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId == null ? null : replicaId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public Integer getReplicaMetadataId() {
        return replicaMetadataId;
    }

    public void setReplicaMetadataId(Integer replicaMetadataId) {
        this.replicaMetadataId = replicaMetadataId;
    }

    public String getReplicaServerName() {
        return replicaServerName;
    }

    public void setReplicaServerName(String replicaServerName) {
        this.replicaServerName = replicaServerName == null ? null : replicaServerName.trim();
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl == null ? null : endpointUrl.trim();
    }

    public Byte getAvailabilityMode() {
        return availabilityMode;
    }

    public void setAvailabilityMode(Byte availabilityMode) {
        this.availabilityMode = availabilityMode;
    }

    public String getAvailabilityModeDesc() {
        return availabilityModeDesc;
    }

    public void setAvailabilityModeDesc(String availabilityModeDesc) {
        this.availabilityModeDesc = availabilityModeDesc == null ? null : availabilityModeDesc.trim();
    }

    public Byte getFailoverMode() {
        return failoverMode;
    }

    public void setFailoverMode(Byte failoverMode) {
        this.failoverMode = failoverMode;
    }

    public String getFailoverModeDesc() {
        return failoverModeDesc;
    }

    public void setFailoverModeDesc(String failoverModeDesc) {
        this.failoverModeDesc = failoverModeDesc == null ? null : failoverModeDesc.trim();
    }

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public Byte getPrimaryRoleAllowConnections() {
        return primaryRoleAllowConnections;
    }

    public void setPrimaryRoleAllowConnections(Byte primaryRoleAllowConnections) {
        this.primaryRoleAllowConnections = primaryRoleAllowConnections;
    }

    public String getPrimaryRoleAllowConnectionsDesc() {
        return primaryRoleAllowConnectionsDesc;
    }

    public void setPrimaryRoleAllowConnectionsDesc(String primaryRoleAllowConnectionsDesc) {
        this.primaryRoleAllowConnectionsDesc = primaryRoleAllowConnectionsDesc == null ? null : primaryRoleAllowConnectionsDesc.trim();
    }

    public Byte getSecondaryRoleAllowConnections() {
        return secondaryRoleAllowConnections;
    }

    public void setSecondaryRoleAllowConnections(Byte secondaryRoleAllowConnections) {
        this.secondaryRoleAllowConnections = secondaryRoleAllowConnections;
    }

    public String getSecondaryRoleAllowConnectionsDesc() {
        return secondaryRoleAllowConnectionsDesc;
    }

    public void setSecondaryRoleAllowConnectionsDesc(String secondaryRoleAllowConnectionsDesc) {
        this.secondaryRoleAllowConnectionsDesc = secondaryRoleAllowConnectionsDesc == null ? null : secondaryRoleAllowConnectionsDesc.trim();
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

    public Integer getBackupPriority() {
        return backupPriority;
    }

    public void setBackupPriority(Integer backupPriority) {
        this.backupPriority = backupPriority;
    }

    public String getReadOnlyRoutingUrl() {
        return readOnlyRoutingUrl;
    }

    public void setReadOnlyRoutingUrl(String readOnlyRoutingUrl) {
        this.readOnlyRoutingUrl = readOnlyRoutingUrl == null ? null : readOnlyRoutingUrl.trim();
    }

    public byte[] getOwnerSid() {
        return ownerSid;
    }

    public void setOwnerSid(byte[] ownerSid) {
        this.ownerSid = ownerSid;
    }
}