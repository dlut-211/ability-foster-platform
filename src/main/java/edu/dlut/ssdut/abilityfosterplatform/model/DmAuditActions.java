package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmAuditActions {
    private String actionId;

    private String name;

    private String classDesc;

    private String coveringActionName;

    private String parentClassDesc;

    private String coveringParentActionName;

    private String configurationLevel;

    private String containingGroupName;

    private Boolean actionInLog;

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId == null ? null : actionId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public String getCoveringActionName() {
        return coveringActionName;
    }

    public void setCoveringActionName(String coveringActionName) {
        this.coveringActionName = coveringActionName == null ? null : coveringActionName.trim();
    }

    public String getParentClassDesc() {
        return parentClassDesc;
    }

    public void setParentClassDesc(String parentClassDesc) {
        this.parentClassDesc = parentClassDesc == null ? null : parentClassDesc.trim();
    }

    public String getCoveringParentActionName() {
        return coveringParentActionName;
    }

    public void setCoveringParentActionName(String coveringParentActionName) {
        this.coveringParentActionName = coveringParentActionName == null ? null : coveringParentActionName.trim();
    }

    public String getConfigurationLevel() {
        return configurationLevel;
    }

    public void setConfigurationLevel(String configurationLevel) {
        this.configurationLevel = configurationLevel == null ? null : configurationLevel.trim();
    }

    public String getContainingGroupName() {
        return containingGroupName;
    }

    public void setContainingGroupName(String containingGroupName) {
        this.containingGroupName = containingGroupName == null ? null : containingGroupName.trim();
    }

    public Boolean getActionInLog() {
        return actionInLog;
    }

    public void setActionInLog(Boolean actionInLog) {
        this.actionInLog = actionInLog;
    }
}