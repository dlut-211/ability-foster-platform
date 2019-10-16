package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryBrokers {
    private Integer poolId;

    private String memoryBrokerType;

    private Long allocationsKb;

    private Long allocationsKbPerSec;

    private Long predictedAllocationsKb;

    private Long targetAllocationsKb;

    private Long futureAllocationsKb;

    private Long overallLimitKb;

    private String lastNotification;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getMemoryBrokerType() {
        return memoryBrokerType;
    }

    public void setMemoryBrokerType(String memoryBrokerType) {
        this.memoryBrokerType = memoryBrokerType == null ? null : memoryBrokerType.trim();
    }

    public Long getAllocationsKb() {
        return allocationsKb;
    }

    public void setAllocationsKb(Long allocationsKb) {
        this.allocationsKb = allocationsKb;
    }

    public Long getAllocationsKbPerSec() {
        return allocationsKbPerSec;
    }

    public void setAllocationsKbPerSec(Long allocationsKbPerSec) {
        this.allocationsKbPerSec = allocationsKbPerSec;
    }

    public Long getPredictedAllocationsKb() {
        return predictedAllocationsKb;
    }

    public void setPredictedAllocationsKb(Long predictedAllocationsKb) {
        this.predictedAllocationsKb = predictedAllocationsKb;
    }

    public Long getTargetAllocationsKb() {
        return targetAllocationsKb;
    }

    public void setTargetAllocationsKb(Long targetAllocationsKb) {
        this.targetAllocationsKb = targetAllocationsKb;
    }

    public Long getFutureAllocationsKb() {
        return futureAllocationsKb;
    }

    public void setFutureAllocationsKb(Long futureAllocationsKb) {
        this.futureAllocationsKb = futureAllocationsKb;
    }

    public Long getOverallLimitKb() {
        return overallLimitKb;
    }

    public void setOverallLimitKb(Long overallLimitKb) {
        this.overallLimitKb = overallLimitKb;
    }

    public String getLastNotification() {
        return lastNotification;
    }

    public void setLastNotification(String lastNotification) {
        this.lastNotification = lastNotification == null ? null : lastNotification.trim();
    }
}