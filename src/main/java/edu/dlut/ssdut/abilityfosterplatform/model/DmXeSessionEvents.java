package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXeSessionEvents {
    private String eventName;

    private String eventPackageGuid;

    private String eventPredicate;

    private byte[] eventSessionAddress;

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

    public String getEventPredicate() {
        return eventPredicate;
    }

    public void setEventPredicate(String eventPredicate) {
        this.eventPredicate = eventPredicate == null ? null : eventPredicate.trim();
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }
}