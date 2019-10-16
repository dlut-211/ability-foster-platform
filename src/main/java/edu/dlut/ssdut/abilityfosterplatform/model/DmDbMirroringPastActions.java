package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbMirroringPastActions {
    private String mirroringGuid;

    private String stateMachineName;

    private String actionType;

    private String name;

    private String currentState;

    private Integer actionSequence;

    public String getMirroringGuid() {
        return mirroringGuid;
    }

    public void setMirroringGuid(String mirroringGuid) {
        this.mirroringGuid = mirroringGuid == null ? null : mirroringGuid.trim();
    }

    public String getStateMachineName() {
        return stateMachineName;
    }

    public void setStateMachineName(String stateMachineName) {
        this.stateMachineName = stateMachineName == null ? null : stateMachineName.trim();
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType == null ? null : actionType.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState == null ? null : currentState.trim();
    }

    public Integer getActionSequence() {
        return actionSequence;
    }

    public void setActionSequence(Integer actionSequence) {
        this.actionSequence = actionSequence;
    }
}