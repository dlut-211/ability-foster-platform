package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmResourceGovernorResourcePools {
    private Integer poolId;

    private String name;

    private Date statisticsStartTime;

    private Long totalCpuUsageMs;

    private Long cacheMemoryKb;

    private Long compileMemoryKb;

    private Long usedMemgrantKb;

    private Long totalMemgrantCount;

    private Long totalMemgrantTimeoutCount;

    private Integer activeMemgrantCount;

    private Long activeMemgrantKb;

    private Integer memgrantWaiterCount;

    private Long maxMemoryKb;

    private Long usedMemoryKb;

    private Long targetMemoryKb;

    private Long outOfMemoryCount;

    private Integer minCpuPercent;

    private Integer maxCpuPercent;

    private Integer minMemoryPercent;

    private Integer maxMemoryPercent;

    private Integer capCpuPercent;

    private Integer minIopsPerVolume;

    private Integer maxIopsPerVolume;

    private Integer readIoQueuedTotal;

    private Integer readIoIssuedTotal;

    private Integer readIoCompletedTotal;

    private Integer readIoThrottledTotal;

    private Long readBytesTotal;

    private Long readIoStallTotalMs;

    private Long readIoStallQueuedMs;

    private Integer writeIoQueuedTotal;

    private Integer writeIoIssuedTotal;

    private Integer writeIoCompletedTotal;

    private Integer writeIoThrottledTotal;

    private Long writeBytesTotal;

    private Long writeIoStallTotalMs;

    private Long writeIoStallQueuedMs;

    private Integer ioIssueViolationsTotal;

    private Long ioIssueDelayTotalMs;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStatisticsStartTime() {
        return statisticsStartTime;
    }

    public void setStatisticsStartTime(Date statisticsStartTime) {
        this.statisticsStartTime = statisticsStartTime;
    }

    public Long getTotalCpuUsageMs() {
        return totalCpuUsageMs;
    }

    public void setTotalCpuUsageMs(Long totalCpuUsageMs) {
        this.totalCpuUsageMs = totalCpuUsageMs;
    }

    public Long getCacheMemoryKb() {
        return cacheMemoryKb;
    }

    public void setCacheMemoryKb(Long cacheMemoryKb) {
        this.cacheMemoryKb = cacheMemoryKb;
    }

    public Long getCompileMemoryKb() {
        return compileMemoryKb;
    }

    public void setCompileMemoryKb(Long compileMemoryKb) {
        this.compileMemoryKb = compileMemoryKb;
    }

    public Long getUsedMemgrantKb() {
        return usedMemgrantKb;
    }

    public void setUsedMemgrantKb(Long usedMemgrantKb) {
        this.usedMemgrantKb = usedMemgrantKb;
    }

    public Long getTotalMemgrantCount() {
        return totalMemgrantCount;
    }

    public void setTotalMemgrantCount(Long totalMemgrantCount) {
        this.totalMemgrantCount = totalMemgrantCount;
    }

    public Long getTotalMemgrantTimeoutCount() {
        return totalMemgrantTimeoutCount;
    }

    public void setTotalMemgrantTimeoutCount(Long totalMemgrantTimeoutCount) {
        this.totalMemgrantTimeoutCount = totalMemgrantTimeoutCount;
    }

    public Integer getActiveMemgrantCount() {
        return activeMemgrantCount;
    }

    public void setActiveMemgrantCount(Integer activeMemgrantCount) {
        this.activeMemgrantCount = activeMemgrantCount;
    }

    public Long getActiveMemgrantKb() {
        return activeMemgrantKb;
    }

    public void setActiveMemgrantKb(Long activeMemgrantKb) {
        this.activeMemgrantKb = activeMemgrantKb;
    }

    public Integer getMemgrantWaiterCount() {
        return memgrantWaiterCount;
    }

    public void setMemgrantWaiterCount(Integer memgrantWaiterCount) {
        this.memgrantWaiterCount = memgrantWaiterCount;
    }

    public Long getMaxMemoryKb() {
        return maxMemoryKb;
    }

    public void setMaxMemoryKb(Long maxMemoryKb) {
        this.maxMemoryKb = maxMemoryKb;
    }

    public Long getUsedMemoryKb() {
        return usedMemoryKb;
    }

    public void setUsedMemoryKb(Long usedMemoryKb) {
        this.usedMemoryKb = usedMemoryKb;
    }

    public Long getTargetMemoryKb() {
        return targetMemoryKb;
    }

    public void setTargetMemoryKb(Long targetMemoryKb) {
        this.targetMemoryKb = targetMemoryKb;
    }

    public Long getOutOfMemoryCount() {
        return outOfMemoryCount;
    }

    public void setOutOfMemoryCount(Long outOfMemoryCount) {
        this.outOfMemoryCount = outOfMemoryCount;
    }

    public Integer getMinCpuPercent() {
        return minCpuPercent;
    }

    public void setMinCpuPercent(Integer minCpuPercent) {
        this.minCpuPercent = minCpuPercent;
    }

    public Integer getMaxCpuPercent() {
        return maxCpuPercent;
    }

    public void setMaxCpuPercent(Integer maxCpuPercent) {
        this.maxCpuPercent = maxCpuPercent;
    }

    public Integer getMinMemoryPercent() {
        return minMemoryPercent;
    }

    public void setMinMemoryPercent(Integer minMemoryPercent) {
        this.minMemoryPercent = minMemoryPercent;
    }

    public Integer getMaxMemoryPercent() {
        return maxMemoryPercent;
    }

    public void setMaxMemoryPercent(Integer maxMemoryPercent) {
        this.maxMemoryPercent = maxMemoryPercent;
    }

    public Integer getCapCpuPercent() {
        return capCpuPercent;
    }

    public void setCapCpuPercent(Integer capCpuPercent) {
        this.capCpuPercent = capCpuPercent;
    }

    public Integer getMinIopsPerVolume() {
        return minIopsPerVolume;
    }

    public void setMinIopsPerVolume(Integer minIopsPerVolume) {
        this.minIopsPerVolume = minIopsPerVolume;
    }

    public Integer getMaxIopsPerVolume() {
        return maxIopsPerVolume;
    }

    public void setMaxIopsPerVolume(Integer maxIopsPerVolume) {
        this.maxIopsPerVolume = maxIopsPerVolume;
    }

    public Integer getReadIoQueuedTotal() {
        return readIoQueuedTotal;
    }

    public void setReadIoQueuedTotal(Integer readIoQueuedTotal) {
        this.readIoQueuedTotal = readIoQueuedTotal;
    }

    public Integer getReadIoIssuedTotal() {
        return readIoIssuedTotal;
    }

    public void setReadIoIssuedTotal(Integer readIoIssuedTotal) {
        this.readIoIssuedTotal = readIoIssuedTotal;
    }

    public Integer getReadIoCompletedTotal() {
        return readIoCompletedTotal;
    }

    public void setReadIoCompletedTotal(Integer readIoCompletedTotal) {
        this.readIoCompletedTotal = readIoCompletedTotal;
    }

    public Integer getReadIoThrottledTotal() {
        return readIoThrottledTotal;
    }

    public void setReadIoThrottledTotal(Integer readIoThrottledTotal) {
        this.readIoThrottledTotal = readIoThrottledTotal;
    }

    public Long getReadBytesTotal() {
        return readBytesTotal;
    }

    public void setReadBytesTotal(Long readBytesTotal) {
        this.readBytesTotal = readBytesTotal;
    }

    public Long getReadIoStallTotalMs() {
        return readIoStallTotalMs;
    }

    public void setReadIoStallTotalMs(Long readIoStallTotalMs) {
        this.readIoStallTotalMs = readIoStallTotalMs;
    }

    public Long getReadIoStallQueuedMs() {
        return readIoStallQueuedMs;
    }

    public void setReadIoStallQueuedMs(Long readIoStallQueuedMs) {
        this.readIoStallQueuedMs = readIoStallQueuedMs;
    }

    public Integer getWriteIoQueuedTotal() {
        return writeIoQueuedTotal;
    }

    public void setWriteIoQueuedTotal(Integer writeIoQueuedTotal) {
        this.writeIoQueuedTotal = writeIoQueuedTotal;
    }

    public Integer getWriteIoIssuedTotal() {
        return writeIoIssuedTotal;
    }

    public void setWriteIoIssuedTotal(Integer writeIoIssuedTotal) {
        this.writeIoIssuedTotal = writeIoIssuedTotal;
    }

    public Integer getWriteIoCompletedTotal() {
        return writeIoCompletedTotal;
    }

    public void setWriteIoCompletedTotal(Integer writeIoCompletedTotal) {
        this.writeIoCompletedTotal = writeIoCompletedTotal;
    }

    public Integer getWriteIoThrottledTotal() {
        return writeIoThrottledTotal;
    }

    public void setWriteIoThrottledTotal(Integer writeIoThrottledTotal) {
        this.writeIoThrottledTotal = writeIoThrottledTotal;
    }

    public Long getWriteBytesTotal() {
        return writeBytesTotal;
    }

    public void setWriteBytesTotal(Long writeBytesTotal) {
        this.writeBytesTotal = writeBytesTotal;
    }

    public Long getWriteIoStallTotalMs() {
        return writeIoStallTotalMs;
    }

    public void setWriteIoStallTotalMs(Long writeIoStallTotalMs) {
        this.writeIoStallTotalMs = writeIoStallTotalMs;
    }

    public Long getWriteIoStallQueuedMs() {
        return writeIoStallQueuedMs;
    }

    public void setWriteIoStallQueuedMs(Long writeIoStallQueuedMs) {
        this.writeIoStallQueuedMs = writeIoStallQueuedMs;
    }

    public Integer getIoIssueViolationsTotal() {
        return ioIssueViolationsTotal;
    }

    public void setIoIssueViolationsTotal(Integer ioIssueViolationsTotal) {
        this.ioIssueViolationsTotal = ioIssueViolationsTotal;
    }

    public Long getIoIssueDelayTotalMs() {
        return ioIssueDelayTotalMs;
    }

    public void setIoIssueDelayTotalMs(Long ioIssueDelayTotalMs) {
        this.ioIssueDelayTotalMs = ioIssueDelayTotalMs;
    }
}