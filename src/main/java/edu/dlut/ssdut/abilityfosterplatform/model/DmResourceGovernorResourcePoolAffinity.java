package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmResourceGovernorResourcePoolAffinity {
    private Integer poolId;

    private Short processorGroup;

    private Long schedulerMask;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(Short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public Long getSchedulerMask() {
        return schedulerMask;
    }

    public void setSchedulerMask(Long schedulerMask) {
        this.schedulerMask = schedulerMask;
    }
}