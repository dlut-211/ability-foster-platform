package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecQueryMemoryGrants {
    private Short sessionId;

    private Integer requestId;

    private Integer schedulerId;

    private Short dop;

    private Date requestTime;

    private Date grantTime;

    private Long requestedMemoryKb;

    private Long grantedMemoryKb;

    private Long requiredMemoryKb;

    private Long usedMemoryKb;

    private Long maxUsedMemoryKb;

    private Double queryCost;

    private Integer timeoutSec;

    private Short resourceSemaphoreId;

    private Short queueId;

    private Integer waitOrder;

    private Boolean isNextCandidate;

    private Long waitTimeMs;

    private Integer groupId;

    private Integer poolId;

    private Boolean isSmall;

    private Long idealMemoryKb;

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(Integer schedulerId) {
        this.schedulerId = schedulerId;
    }

    public Short getDop() {
        return dop;
    }

    public void setDop(Short dop) {
        this.dop = dop;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getGrantTime() {
        return grantTime;
    }

    public void setGrantTime(Date grantTime) {
        this.grantTime = grantTime;
    }

    public Long getRequestedMemoryKb() {
        return requestedMemoryKb;
    }

    public void setRequestedMemoryKb(Long requestedMemoryKb) {
        this.requestedMemoryKb = requestedMemoryKb;
    }

    public Long getGrantedMemoryKb() {
        return grantedMemoryKb;
    }

    public void setGrantedMemoryKb(Long grantedMemoryKb) {
        this.grantedMemoryKb = grantedMemoryKb;
    }

    public Long getRequiredMemoryKb() {
        return requiredMemoryKb;
    }

    public void setRequiredMemoryKb(Long requiredMemoryKb) {
        this.requiredMemoryKb = requiredMemoryKb;
    }

    public Long getUsedMemoryKb() {
        return usedMemoryKb;
    }

    public void setUsedMemoryKb(Long usedMemoryKb) {
        this.usedMemoryKb = usedMemoryKb;
    }

    public Long getMaxUsedMemoryKb() {
        return maxUsedMemoryKb;
    }

    public void setMaxUsedMemoryKb(Long maxUsedMemoryKb) {
        this.maxUsedMemoryKb = maxUsedMemoryKb;
    }

    public Double getQueryCost() {
        return queryCost;
    }

    public void setQueryCost(Double queryCost) {
        this.queryCost = queryCost;
    }

    public Integer getTimeoutSec() {
        return timeoutSec;
    }

    public void setTimeoutSec(Integer timeoutSec) {
        this.timeoutSec = timeoutSec;
    }

    public Short getResourceSemaphoreId() {
        return resourceSemaphoreId;
    }

    public void setResourceSemaphoreId(Short resourceSemaphoreId) {
        this.resourceSemaphoreId = resourceSemaphoreId;
    }

    public Short getQueueId() {
        return queueId;
    }

    public void setQueueId(Short queueId) {
        this.queueId = queueId;
    }

    public Integer getWaitOrder() {
        return waitOrder;
    }

    public void setWaitOrder(Integer waitOrder) {
        this.waitOrder = waitOrder;
    }

    public Boolean getIsNextCandidate() {
        return isNextCandidate;
    }

    public void setIsNextCandidate(Boolean isNextCandidate) {
        this.isNextCandidate = isNextCandidate;
    }

    public Long getWaitTimeMs() {
        return waitTimeMs;
    }

    public void setWaitTimeMs(Long waitTimeMs) {
        this.waitTimeMs = waitTimeMs;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Boolean getIsSmall() {
        return isSmall;
    }

    public void setIsSmall(Boolean isSmall) {
        this.isSmall = isSmall;
    }

    public Long getIdealMemoryKb() {
        return idealMemoryKb;
    }

    public void setIdealMemoryKb(Long idealMemoryKb) {
        this.idealMemoryKb = idealMemoryKb;
    }
}