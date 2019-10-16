package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecQueryResourceSemaphores {
    private Short resourceSemaphoreId;

    private Long targetMemoryKb;

    private Long maxTargetMemoryKb;

    private Long totalMemoryKb;

    private Long availableMemoryKb;

    private Long grantedMemoryKb;

    private Long usedMemoryKb;

    private Integer granteeCount;

    private Integer waiterCount;

    private Long timeoutErrorCount;

    private Long forcedGrantCount;

    private Integer poolId;

    public Short getResourceSemaphoreId() {
        return resourceSemaphoreId;
    }

    public void setResourceSemaphoreId(Short resourceSemaphoreId) {
        this.resourceSemaphoreId = resourceSemaphoreId;
    }

    public Long getTargetMemoryKb() {
        return targetMemoryKb;
    }

    public void setTargetMemoryKb(Long targetMemoryKb) {
        this.targetMemoryKb = targetMemoryKb;
    }

    public Long getMaxTargetMemoryKb() {
        return maxTargetMemoryKb;
    }

    public void setMaxTargetMemoryKb(Long maxTargetMemoryKb) {
        this.maxTargetMemoryKb = maxTargetMemoryKb;
    }

    public Long getTotalMemoryKb() {
        return totalMemoryKb;
    }

    public void setTotalMemoryKb(Long totalMemoryKb) {
        this.totalMemoryKb = totalMemoryKb;
    }

    public Long getAvailableMemoryKb() {
        return availableMemoryKb;
    }

    public void setAvailableMemoryKb(Long availableMemoryKb) {
        this.availableMemoryKb = availableMemoryKb;
    }

    public Long getGrantedMemoryKb() {
        return grantedMemoryKb;
    }

    public void setGrantedMemoryKb(Long grantedMemoryKb) {
        this.grantedMemoryKb = grantedMemoryKb;
    }

    public Long getUsedMemoryKb() {
        return usedMemoryKb;
    }

    public void setUsedMemoryKb(Long usedMemoryKb) {
        this.usedMemoryKb = usedMemoryKb;
    }

    public Integer getGranteeCount() {
        return granteeCount;
    }

    public void setGranteeCount(Integer granteeCount) {
        this.granteeCount = granteeCount;
    }

    public Integer getWaiterCount() {
        return waiterCount;
    }

    public void setWaiterCount(Integer waiterCount) {
        this.waiterCount = waiterCount;
    }

    public Long getTimeoutErrorCount() {
        return timeoutErrorCount;
    }

    public void setTimeoutErrorCount(Long timeoutErrorCount) {
        this.timeoutErrorCount = timeoutErrorCount;
    }

    public Long getForcedGrantCount() {
        return forcedGrantCount;
    }

    public void setForcedGrantCount(Long forcedGrantCount) {
        this.forcedGrantCount = forcedGrantCount;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }
}