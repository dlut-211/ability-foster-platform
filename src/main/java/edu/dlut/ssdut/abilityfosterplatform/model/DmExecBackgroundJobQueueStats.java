package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecBackgroundJobQueueStats {
    private Integer queueMaxLen;

    private Integer enqueuedCount;

    private Integer startedCount;

    private Integer endedCount;

    private Integer failedLockCount;

    private Integer failedOtherCount;

    private Integer failedGiveupCount;

    private Integer enqueueFailedFullCount;

    private Integer enqueueFailedDuplicateCount;

    private Integer elapsedAvgMs;

    private Integer elapsedMaxMs;

    public Integer getQueueMaxLen() {
        return queueMaxLen;
    }

    public void setQueueMaxLen(Integer queueMaxLen) {
        this.queueMaxLen = queueMaxLen;
    }

    public Integer getEnqueuedCount() {
        return enqueuedCount;
    }

    public void setEnqueuedCount(Integer enqueuedCount) {
        this.enqueuedCount = enqueuedCount;
    }

    public Integer getStartedCount() {
        return startedCount;
    }

    public void setStartedCount(Integer startedCount) {
        this.startedCount = startedCount;
    }

    public Integer getEndedCount() {
        return endedCount;
    }

    public void setEndedCount(Integer endedCount) {
        this.endedCount = endedCount;
    }

    public Integer getFailedLockCount() {
        return failedLockCount;
    }

    public void setFailedLockCount(Integer failedLockCount) {
        this.failedLockCount = failedLockCount;
    }

    public Integer getFailedOtherCount() {
        return failedOtherCount;
    }

    public void setFailedOtherCount(Integer failedOtherCount) {
        this.failedOtherCount = failedOtherCount;
    }

    public Integer getFailedGiveupCount() {
        return failedGiveupCount;
    }

    public void setFailedGiveupCount(Integer failedGiveupCount) {
        this.failedGiveupCount = failedGiveupCount;
    }

    public Integer getEnqueueFailedFullCount() {
        return enqueueFailedFullCount;
    }

    public void setEnqueueFailedFullCount(Integer enqueueFailedFullCount) {
        this.enqueueFailedFullCount = enqueueFailedFullCount;
    }

    public Integer getEnqueueFailedDuplicateCount() {
        return enqueueFailedDuplicateCount;
    }

    public void setEnqueueFailedDuplicateCount(Integer enqueueFailedDuplicateCount) {
        this.enqueueFailedDuplicateCount = enqueueFailedDuplicateCount;
    }

    public Integer getElapsedAvgMs() {
        return elapsedAvgMs;
    }

    public void setElapsedAvgMs(Integer elapsedAvgMs) {
        this.elapsedAvgMs = elapsedAvgMs;
    }

    public Integer getElapsedMaxMs() {
        return elapsedMaxMs;
    }

    public void setElapsedMaxMs(Integer elapsedMaxMs) {
        this.elapsedMaxMs = elapsedMaxMs;
    }
}