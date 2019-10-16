package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsLatchStats {
    private String latchClass;

    private Long waitingRequestsCount;

    private Long waitTimeMs;

    private Long maxWaitTimeMs;

    public String getLatchClass() {
        return latchClass;
    }

    public void setLatchClass(String latchClass) {
        this.latchClass = latchClass == null ? null : latchClass.trim();
    }

    public Long getWaitingRequestsCount() {
        return waitingRequestsCount;
    }

    public void setWaitingRequestsCount(Long waitingRequestsCount) {
        this.waitingRequestsCount = waitingRequestsCount;
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
}