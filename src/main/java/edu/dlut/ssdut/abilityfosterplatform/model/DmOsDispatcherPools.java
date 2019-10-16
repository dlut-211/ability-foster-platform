package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsDispatcherPools {
    private String type;

    private String name;

    private Integer dispatcherCount;

    private Integer dispatcherIdealCount;

    private Integer dispatcherTimeoutMs;

    private Integer dispatcherWaitingCount;

    private Integer queueLength;

    private byte[] dispatcherPoolAddress;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDispatcherCount() {
        return dispatcherCount;
    }

    public void setDispatcherCount(Integer dispatcherCount) {
        this.dispatcherCount = dispatcherCount;
    }

    public Integer getDispatcherIdealCount() {
        return dispatcherIdealCount;
    }

    public void setDispatcherIdealCount(Integer dispatcherIdealCount) {
        this.dispatcherIdealCount = dispatcherIdealCount;
    }

    public Integer getDispatcherTimeoutMs() {
        return dispatcherTimeoutMs;
    }

    public void setDispatcherTimeoutMs(Integer dispatcherTimeoutMs) {
        this.dispatcherTimeoutMs = dispatcherTimeoutMs;
    }

    public Integer getDispatcherWaitingCount() {
        return dispatcherWaitingCount;
    }

    public void setDispatcherWaitingCount(Integer dispatcherWaitingCount) {
        this.dispatcherWaitingCount = dispatcherWaitingCount;
    }

    public Integer getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(Integer queueLength) {
        this.queueLength = queueLength;
    }

    public byte[] getDispatcherPoolAddress() {
        return dispatcherPoolAddress;
    }

    public void setDispatcherPoolAddress(byte[] dispatcherPoolAddress) {
        this.dispatcherPoolAddress = dispatcherPoolAddress;
    }
}