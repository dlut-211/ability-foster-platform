package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServerEventSessions {
    private Integer eventSessionId;

    private String name;

    private String eventRetentionMode;

    private String eventRetentionModeDesc;

    private Integer maxDispatchLatency;

    private Integer maxMemory;

    private Integer maxEventSize;

    private String memoryPartitionMode;

    private String memoryPartitionModeDesc;

    private Boolean trackCausality;

    private Boolean startupState;

    public Integer getEventSessionId() {
        return eventSessionId;
    }

    public void setEventSessionId(Integer eventSessionId) {
        this.eventSessionId = eventSessionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEventRetentionMode() {
        return eventRetentionMode;
    }

    public void setEventRetentionMode(String eventRetentionMode) {
        this.eventRetentionMode = eventRetentionMode == null ? null : eventRetentionMode.trim();
    }

    public String getEventRetentionModeDesc() {
        return eventRetentionModeDesc;
    }

    public void setEventRetentionModeDesc(String eventRetentionModeDesc) {
        this.eventRetentionModeDesc = eventRetentionModeDesc == null ? null : eventRetentionModeDesc.trim();
    }

    public Integer getMaxDispatchLatency() {
        return maxDispatchLatency;
    }

    public void setMaxDispatchLatency(Integer maxDispatchLatency) {
        this.maxDispatchLatency = maxDispatchLatency;
    }

    public Integer getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
    }

    public Integer getMaxEventSize() {
        return maxEventSize;
    }

    public void setMaxEventSize(Integer maxEventSize) {
        this.maxEventSize = maxEventSize;
    }

    public String getMemoryPartitionMode() {
        return memoryPartitionMode;
    }

    public void setMemoryPartitionMode(String memoryPartitionMode) {
        this.memoryPartitionMode = memoryPartitionMode == null ? null : memoryPartitionMode.trim();
    }

    public String getMemoryPartitionModeDesc() {
        return memoryPartitionModeDesc;
    }

    public void setMemoryPartitionModeDesc(String memoryPartitionModeDesc) {
        this.memoryPartitionModeDesc = memoryPartitionModeDesc == null ? null : memoryPartitionModeDesc.trim();
    }

    public Boolean getTrackCausality() {
        return trackCausality;
    }

    public void setTrackCausality(Boolean trackCausality) {
        this.trackCausality = trackCausality;
    }

    public Boolean getStartupState() {
        return startupState;
    }

    public void setStartupState(Boolean startupState) {
        this.startupState = startupState;
    }
}