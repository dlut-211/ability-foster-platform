package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXtpGcQueueStats {
    private Integer queueId;

    private Long totalEnqueues;

    private Long totalDequeues;

    private Long currentQueueDepth;

    private Long maximumQueueDepth;

    private Long lastServiceTicks;

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public Long getTotalEnqueues() {
        return totalEnqueues;
    }

    public void setTotalEnqueues(Long totalEnqueues) {
        this.totalEnqueues = totalEnqueues;
    }

    public Long getTotalDequeues() {
        return totalDequeues;
    }

    public void setTotalDequeues(Long totalDequeues) {
        this.totalDequeues = totalDequeues;
    }

    public Long getCurrentQueueDepth() {
        return currentQueueDepth;
    }

    public void setCurrentQueueDepth(Long currentQueueDepth) {
        this.currentQueueDepth = currentQueueDepth;
    }

    public Long getMaximumQueueDepth() {
        return maximumQueueDepth;
    }

    public void setMaximumQueueDepth(Long maximumQueueDepth) {
        this.maximumQueueDepth = maximumQueueDepth;
    }

    public Long getLastServiceTicks() {
        return lastServiceTicks;
    }

    public void setLastServiceTicks(Long lastServiceTicks) {
        this.lastServiceTicks = lastServiceTicks;
    }
}