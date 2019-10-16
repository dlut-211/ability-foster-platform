package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXeSessionEventActions {
    private String actionName;

    private String actionPackageGuid;

    private String eventName;

    private String eventPackageGuid;

    private byte[] eventSessionAddress;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public String getActionPackageGuid() {
        return actionPackageGuid;
    }

    public void setActionPackageGuid(String actionPackageGuid) {
        this.actionPackageGuid = actionPackageGuid == null ? null : actionPackageGuid.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public String getEventPackageGuid() {
        return eventPackageGuid;
    }

    public void setEventPackageGuid(String eventPackageGuid) {
        this.eventPackageGuid = eventPackageGuid == null ? null : eventPackageGuid.trim();
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }
}