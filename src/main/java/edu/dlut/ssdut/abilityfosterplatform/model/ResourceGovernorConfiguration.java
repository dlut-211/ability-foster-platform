package edu.dlut.ssdut.abilityfosterplatform.model;

public class ResourceGovernorConfiguration {
    private Integer classifierFunctionId;

    private Boolean isEnabled;

    private Integer maxOutstandingIoPerVolume;

    public Integer getClassifierFunctionId() {
        return classifierFunctionId;
    }

    public void setClassifierFunctionId(Integer classifierFunctionId) {
        this.classifierFunctionId = classifierFunctionId;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getMaxOutstandingIoPerVolume() {
        return maxOutstandingIoPerVolume;
    }

    public void setMaxOutstandingIoPerVolume(Integer maxOutstandingIoPerVolume) {
        this.maxOutstandingIoPerVolume = maxOutstandingIoPerVolume;
    }
}