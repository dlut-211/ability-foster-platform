package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmResourceGovernorWorkloadGroups {
    private Integer groupId;

    private String name;

    private Integer poolId;

    private Date statisticsStartTime;

    private Long totalRequestCount;

    private Long totalQueuedRequestCount;

    private Integer activeRequestCount;

    private Integer queuedRequestCount;

    private Long totalCpuLimitViolationCount;

    private Long totalCpuUsageMs;

    private Long maxRequestCpuTimeMs;

    private Integer blockedTaskCount;

    private Long totalLockWaitCount;

    private Long totalLockWaitTimeMs;

    private Long totalQueryOptimizationCount;

    private Long totalSuboptimalPlanGenerationCount;

    private Long totalReducedMemgrantCount;

    private Long maxRequestGrantMemoryKb;

    private Long activeParallelThreadCount;

    private String importance;

    private Integer requestMaxMemoryGrantPercent;

    private Integer requestMaxCpuTimeSec;

    private Integer requestMemoryGrantTimeoutSec;

    private Integer groupMaxRequests;

    private Integer maxDop;

    private Integer effectiveMaxDop;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Date getStatisticsStartTime() {
        return statisticsStartTime;
    }

    public void setStatisticsStartTime(Date statisticsStartTime) {
        this.statisticsStartTime = statisticsStartTime;
    }

    public Long getTotalRequestCount() {
        return totalRequestCount;
    }

    public void setTotalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
    }

    public Long getTotalQueuedRequestCount() {
        return totalQueuedRequestCount;
    }

    public void setTotalQueuedRequestCount(Long totalQueuedRequestCount) {
        this.totalQueuedRequestCount = totalQueuedRequestCount;
    }

    public Integer getActiveRequestCount() {
        return activeRequestCount;
    }

    public void setActiveRequestCount(Integer activeRequestCount) {
        this.activeRequestCount = activeRequestCount;
    }

    public Integer getQueuedRequestCount() {
        return queuedRequestCount;
    }

    public void setQueuedRequestCount(Integer queuedRequestCount) {
        this.queuedRequestCount = queuedRequestCount;
    }

    public Long getTotalCpuLimitViolationCount() {
        return totalCpuLimitViolationCount;
    }

    public void setTotalCpuLimitViolationCount(Long totalCpuLimitViolationCount) {
        this.totalCpuLimitViolationCount = totalCpuLimitViolationCount;
    }

    public Long getTotalCpuUsageMs() {
        return totalCpuUsageMs;
    }

    public void setTotalCpuUsageMs(Long totalCpuUsageMs) {
        this.totalCpuUsageMs = totalCpuUsageMs;
    }

    public Long getMaxRequestCpuTimeMs() {
        return maxRequestCpuTimeMs;
    }

    public void setMaxRequestCpuTimeMs(Long maxRequestCpuTimeMs) {
        this.maxRequestCpuTimeMs = maxRequestCpuTimeMs;
    }

    public Integer getBlockedTaskCount() {
        return blockedTaskCount;
    }

    public void setBlockedTaskCount(Integer blockedTaskCount) {
        this.blockedTaskCount = blockedTaskCount;
    }

    public Long getTotalLockWaitCount() {
        return totalLockWaitCount;
    }

    public void setTotalLockWaitCount(Long totalLockWaitCount) {
        this.totalLockWaitCount = totalLockWaitCount;
    }

    public Long getTotalLockWaitTimeMs() {
        return totalLockWaitTimeMs;
    }

    public void setTotalLockWaitTimeMs(Long totalLockWaitTimeMs) {
        this.totalLockWaitTimeMs = totalLockWaitTimeMs;
    }

    public Long getTotalQueryOptimizationCount() {
        return totalQueryOptimizationCount;
    }

    public void setTotalQueryOptimizationCount(Long totalQueryOptimizationCount) {
        this.totalQueryOptimizationCount = totalQueryOptimizationCount;
    }

    public Long getTotalSuboptimalPlanGenerationCount() {
        return totalSuboptimalPlanGenerationCount;
    }

    public void setTotalSuboptimalPlanGenerationCount(Long totalSuboptimalPlanGenerationCount) {
        this.totalSuboptimalPlanGenerationCount = totalSuboptimalPlanGenerationCount;
    }

    public Long getTotalReducedMemgrantCount() {
        return totalReducedMemgrantCount;
    }

    public void setTotalReducedMemgrantCount(Long totalReducedMemgrantCount) {
        this.totalReducedMemgrantCount = totalReducedMemgrantCount;
    }

    public Long getMaxRequestGrantMemoryKb() {
        return maxRequestGrantMemoryKb;
    }

    public void setMaxRequestGrantMemoryKb(Long maxRequestGrantMemoryKb) {
        this.maxRequestGrantMemoryKb = maxRequestGrantMemoryKb;
    }

    public Long getActiveParallelThreadCount() {
        return activeParallelThreadCount;
    }

    public void setActiveParallelThreadCount(Long activeParallelThreadCount) {
        this.activeParallelThreadCount = activeParallelThreadCount;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance == null ? null : importance.trim();
    }

    public Integer getRequestMaxMemoryGrantPercent() {
        return requestMaxMemoryGrantPercent;
    }

    public void setRequestMaxMemoryGrantPercent(Integer requestMaxMemoryGrantPercent) {
        this.requestMaxMemoryGrantPercent = requestMaxMemoryGrantPercent;
    }

    public Integer getRequestMaxCpuTimeSec() {
        return requestMaxCpuTimeSec;
    }

    public void setRequestMaxCpuTimeSec(Integer requestMaxCpuTimeSec) {
        this.requestMaxCpuTimeSec = requestMaxCpuTimeSec;
    }

    public Integer getRequestMemoryGrantTimeoutSec() {
        return requestMemoryGrantTimeoutSec;
    }

    public void setRequestMemoryGrantTimeoutSec(Integer requestMemoryGrantTimeoutSec) {
        this.requestMemoryGrantTimeoutSec = requestMemoryGrantTimeoutSec;
    }

    public Integer getGroupMaxRequests() {
        return groupMaxRequests;
    }

    public void setGroupMaxRequests(Integer groupMaxRequests) {
        this.groupMaxRequests = groupMaxRequests;
    }

    public Integer getMaxDop() {
        return maxDop;
    }

    public void setMaxDop(Integer maxDop) {
        this.maxDop = maxDop;
    }

    public Integer getEffectiveMaxDop() {
        return effectiveMaxDop;
    }

    public void setEffectiveMaxDop(Integer effectiveMaxDop) {
        this.effectiveMaxDop = effectiveMaxDop;
    }
}