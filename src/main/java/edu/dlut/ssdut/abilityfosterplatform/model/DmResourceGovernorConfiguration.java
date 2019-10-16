package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmResourceGovernorConfiguration {
    private Integer classifierFunctionId;

    private Byte isReconfigurationPending;

    private Integer maxOutstandingIoPerVolume;

    public Integer getClassifierFunctionId() {
        return classifierFunctionId;
    }

    public void setClassifierFunctionId(Integer classifierFunctionId) {
        this.classifierFunctionId = classifierFunctionId;
    }

    public Byte getIsReconfigurationPending() {
        return isReconfigurationPending;
    }

    public void setIsReconfigurationPending(Byte isReconfigurationPending) {
        this.isReconfigurationPending = isReconfigurationPending;
    }

    public Integer getMaxOutstandingIoPerVolume() {
        return maxOutstandingIoPerVolume;
    }

    public void setMaxOutstandingIoPerVolume(Integer maxOutstandingIoPerVolume) {
        this.maxOutstandingIoPerVolume = maxOutstandingIoPerVolume;
    }
}