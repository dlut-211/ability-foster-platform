package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmHadrAvailabilityGroupStates {
    private String groupId;

    private String primaryReplica;

    private Byte primaryRecoveryHealth;

    private String primaryRecoveryHealthDesc;

    private Byte secondaryRecoveryHealth;

    private String secondaryRecoveryHealthDesc;

    private Byte synchronizationHealth;

    private String synchronizationHealthDesc;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getPrimaryReplica() {
        return primaryReplica;
    }

    public void setPrimaryReplica(String primaryReplica) {
        this.primaryReplica = primaryReplica == null ? null : primaryReplica.trim();
    }

    public Byte getPrimaryRecoveryHealth() {
        return primaryRecoveryHealth;
    }

    public void setPrimaryRecoveryHealth(Byte primaryRecoveryHealth) {
        this.primaryRecoveryHealth = primaryRecoveryHealth;
    }

    public String getPrimaryRecoveryHealthDesc() {
        return primaryRecoveryHealthDesc;
    }

    public void setPrimaryRecoveryHealthDesc(String primaryRecoveryHealthDesc) {
        this.primaryRecoveryHealthDesc = primaryRecoveryHealthDesc == null ? null : primaryRecoveryHealthDesc.trim();
    }

    public Byte getSecondaryRecoveryHealth() {
        return secondaryRecoveryHealth;
    }

    public void setSecondaryRecoveryHealth(Byte secondaryRecoveryHealth) {
        this.secondaryRecoveryHealth = secondaryRecoveryHealth;
    }

    public String getSecondaryRecoveryHealthDesc() {
        return secondaryRecoveryHealthDesc;
    }

    public void setSecondaryRecoveryHealthDesc(String secondaryRecoveryHealthDesc) {
        this.secondaryRecoveryHealthDesc = secondaryRecoveryHealthDesc == null ? null : secondaryRecoveryHealthDesc.trim();
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
}