package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmHadrAvailabilityReplicaStates {
    private String replicaId;

    private String groupId;

    private Boolean isLocal;

    private Byte role;

    private String roleDesc;

    private Byte operationalState;

    private String operationalStateDesc;

    private Byte connectedState;

    private String connectedStateDesc;

    private Byte recoveryHealth;

    private String recoveryHealthDesc;

    private Byte synchronizationHealth;

    private String synchronizationHealthDesc;

    private Integer lastConnectErrorNumber;

    private String lastConnectErrorDescription;

    private Date lastConnectErrorTimestamp;

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

    public Boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Byte getOperationalState() {
        return operationalState;
    }

    public void setOperationalState(Byte operationalState) {
        this.operationalState = operationalState;
    }

    public String getOperationalStateDesc() {
        return operationalStateDesc;
    }

    public void setOperationalStateDesc(String operationalStateDesc) {
        this.operationalStateDesc = operationalStateDesc == null ? null : operationalStateDesc.trim();
    }

    public Byte getConnectedState() {
        return connectedState;
    }

    public void setConnectedState(Byte connectedState) {
        this.connectedState = connectedState;
    }

    public String getConnectedStateDesc() {
        return connectedStateDesc;
    }

    public void setConnectedStateDesc(String connectedStateDesc) {
        this.connectedStateDesc = connectedStateDesc == null ? null : connectedStateDesc.trim();
    }

    public Byte getRecoveryHealth() {
        return recoveryHealth;
    }

    public void setRecoveryHealth(Byte recoveryHealth) {
        this.recoveryHealth = recoveryHealth;
    }

    public String getRecoveryHealthDesc() {
        return recoveryHealthDesc;
    }

    public void setRecoveryHealthDesc(String recoveryHealthDesc) {
        this.recoveryHealthDesc = recoveryHealthDesc == null ? null : recoveryHealthDesc.trim();
    }

    public Byte getSynchronizationHealth() {
        return synchronizationHealth;
    }

    public void setSynchronizationHealth(Byte synchronizationHealth) {
        this.synchronizationHealth = synchronizationHealth;
    }

    public String getSynchronizationHealthDesc() {
        return synchronizationHealthDesc;
    }

    public void setSynchronizationHealthDesc(String synchronizationHealthDesc) {
        this.synchronizationHealthDesc = synchronizationHealthDesc == null ? null : synchronizationHealthDesc.trim();
    }

    public Integer getLastConnectErrorNumber() {
        return lastConnectErrorNumber;
    }

    public void setLastConnectErrorNumber(Integer lastConnectErrorNumber) {
        this.lastConnectErrorNumber = lastConnectErrorNumber;
    }

    public String getLastConnectErrorDescription() {
        return lastConnectErrorDescription;
    }

    public void setLastConnectErrorDescription(String lastConnectErrorDescription) {
        this.lastConnectErrorDescription = lastConnectErrorDescription == null ? null : lastConnectErrorDescription.trim();
    }

    public Date getLastConnectErrorTimestamp() {
        return lastConnectErrorTimestamp;
    }

    public void setLastConnectErrorTimestamp(Date lastConnectErrorTimestamp) {
        this.lastConnectErrorTimestamp = lastConnectErrorTimestamp;
    }
}