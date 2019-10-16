package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXeSessionTargets {
    private String targetName;

    private String targetPackageGuid;

    private Long executionCount;

    private Long executionDurationMs;

    private String targetData;

    private byte[] eventSessionAddress;

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName == null ? null : targetName.trim();
    }

    public String getTargetPackageGuid() {
        return targetPackageGuid;
    }

    public void setTargetPackageGuid(String targetPackageGuid) {
        this.targetPackageGuid = targetPackageGuid == null ? null : targetPackageGuid.trim();
    }

    public Long getExecutionCount() {
        return executionCount;
    }

    public void setExecutionCount(Long executionCount) {
        this.executionCount = executionCount;
    }

    public Long getExecutionDurationMs() {
        return executionDurationMs;
    }

    public void setExecutionDurationMs(Long executionDurationMs) {
        this.executionDurationMs = executionDurationMs;
    }

    public String getTargetData() {
        return targetData;
    }

    public void setTargetData(String targetData) {
        this.targetData = targetData == null ? null : targetData.trim();
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }
}