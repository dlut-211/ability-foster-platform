package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsWaitingTasks {
    private Short sessionId;

    private Integer execContextId;

    private Long waitDurationMs;

    private String waitType;

    private Short blockingSessionId;

    private Integer blockingExecContextId;

    private String resourceDescription;

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getExecContextId() {
        return execContextId;
    }

    public void setExecContextId(Integer execContextId) {
        this.execContextId = execContextId;
    }

    public Long getWaitDurationMs() {
        return waitDurationMs;
    }

    public void setWaitDurationMs(Long waitDurationMs) {
        this.waitDurationMs = waitDurationMs;
    }

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType == null ? null : waitType.trim();
    }

    public Short getBlockingSessionId() {
        return blockingSessionId;
    }

    public void setBlockingSessionId(Short blockingSessionId) {
        this.blockingSessionId = blockingSessionId;
    }

    public Integer getBlockingExecContextId() {
        return blockingExecContextId;
    }

    public void setBlockingExecContextId(Integer blockingExecContextId) {
        this.blockingExecContextId = blockingExecContextId;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription == null ? null : resourceDescription.trim();
    }
}