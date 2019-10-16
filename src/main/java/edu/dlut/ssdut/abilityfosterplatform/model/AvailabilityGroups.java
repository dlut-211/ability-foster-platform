package edu.dlut.ssdut.abilityfosterplatform.model;

public class AvailabilityGroups {
    private String groupId;

    private String name;

    private String resourceId;

    private String resourceGroupId;

    private Integer failureConditionLevel;

    private Integer healthCheckTimeout;

    private Byte automatedBackupPreference;

    private String automatedBackupPreferenceDesc;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId == null ? null : resourceGroupId.trim();
    }

    public Integer getFailureConditionLevel() {
        return failureConditionLevel;
    }

    public void setFailureConditionLevel(Integer failureConditionLevel) {
        this.failureConditionLevel = failureConditionLevel;
    }

    public Integer getHealthCheckTimeout() {
        return healthCheckTimeout;
    }

    public void setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
    }

    public Byte getAutomatedBackupPreference() {
        return automatedBackupPreference;
    }

    public void setAutomatedBackupPreference(Byte automatedBackupPreference) {
        this.automatedBackupPreference = automatedBackupPreference;
    }

    public String getAutomatedBackupPreferenceDesc() {
        return automatedBackupPreferenceDesc;
    }

    public void setAutomatedBackupPreferenceDesc(String automatedBackupPreferenceDesc) {
        this.automatedBackupPreferenceDesc = automatedBackupPreferenceDesc == null ? null : automatedBackupPreferenceDesc.trim();
    }
}