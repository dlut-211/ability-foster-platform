package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmIoPendingIoRequests {
    private String ioType;

    private Long ioPendingMsTicks;

    private Integer ioPending;

    private Long ioOffset;

    private String ioHandlePath;

    public String getIoType() {
        return ioType;
    }

    public void setIoType(String ioType) {
        this.ioType = ioType == null ? null : ioType.trim();
    }

    public Long getIoPendingMsTicks() {
        return ioPendingMsTicks;
    }

    public void setIoPendingMsTicks(Long ioPendingMsTicks) {
        this.ioPendingMsTicks = ioPendingMsTicks;
    }

    public Integer getIoPending() {
        return ioPending;
    }

    public void setIoPending(Integer ioPending) {
        this.ioPending = ioPending;
    }

    public Long getIoOffset() {
        return ioOffset;
    }

    public void setIoOffset(Long ioOffset) {
        this.ioOffset = ioOffset;
    }

    public String getIoHandlePath() {
        return ioHandlePath;
    }

    public void setIoHandlePath(String ioHandlePath) {
        this.ioHandlePath = ioHandlePath == null ? null : ioHandlePath.trim();
    }
}