package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsTasks {
    private String taskState;

    private Integer contextSwitchesCount;

    private Integer pendingIoCount;

    private Long pendingIoByteCount;

    private Integer pendingIoByteAverage;

    private Integer schedulerId;

    private Short sessionId;

    private Integer execContextId;

    private Integer requestId;

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState == null ? null : taskState.trim();
    }

    public Integer getContextSwitchesCount() {
        return contextSwitchesCount;
    }

    public void setContextSwitchesCount(Integer contextSwitchesCount) {
        this.contextSwitchesCount = contextSwitchesCount;
    }

    public Integer getPendingIoCount() {
        return pendingIoCount;
    }

    public void setPendingIoCount(Integer pendingIoCount) {
        this.pendingIoCount = pendingIoCount;
    }

    public Long getPendingIoByteCount() {
        return pendingIoByteCount;
    }

    public void setPendingIoByteCount(Long pendingIoByteCount) {
        this.pendingIoByteCount = pendingIoByteCount;
    }

    public Integer getPendingIoByteAverage() {
        return pendingIoByteAverage;
    }

    public void setPendingIoByteAverage(Integer pendingIoByteAverage) {
        this.pendingIoByteAverage = pendingIoByteAverage;
    }

    public Integer getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(Integer schedulerId) {
        this.schedulerId = schedulerId;
    }

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

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }
}