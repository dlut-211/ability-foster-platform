package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsWaitStats {
    private String waitType;

    private Long waitingTasksCount;

    private Long waitTimeMs;

    private Long maxWaitTimeMs;

    private Long signalWaitTimeMs;

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType == null ? null : waitType.trim();
    }

    public Long getWaitingTasksCount() {
        return waitingTasksCount;
    }

    public void setWaitingTasksCount(Long waitingTasksCount) {
        this.waitingTasksCount = waitingTasksCount;
    }

    public Long getWaitTimeMs() {
        return waitTimeMs;
    }

    public void setWaitTimeMs(Long waitTimeMs) {
        this.waitTimeMs = waitTimeMs;
    }

    public Long getMaxWaitTimeMs() {
        return maxWaitTimeMs;
    }

    public void setMaxWaitTimeMs(Long maxWaitTimeMs) {
        this.maxWaitTimeMs = maxWaitTimeMs;
    }

    public Long getSignalWaitTimeMs() {
        return signalWaitTimeMs;
    }

    public void setSignalWaitTimeMs(Long signalWaitTimeMs) {
        this.signalWaitTimeMs = signalWaitTimeMs;
    }
}