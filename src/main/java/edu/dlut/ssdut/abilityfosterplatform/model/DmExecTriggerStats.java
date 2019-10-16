package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecTriggerStats {
    private Integer databaseId;

    private Integer objectId;

    private String type;

    private String typeDesc;

    private Date cachedTime;

    private Date lastExecutionTime;

    private Long executionCount;

    private Long totalWorkerTime;

    private Long lastWorkerTime;

    private Long minWorkerTime;

    private Long maxWorkerTime;

    private Long totalPhysicalReads;

    private Long lastPhysicalReads;

    private Long minPhysicalReads;

    private Long maxPhysicalReads;

    private Long totalLogicalWrites;

    private Long lastLogicalWrites;

    private Long minLogicalWrites;

    private Long maxLogicalWrites;

    private Long totalLogicalReads;

    private Long lastLogicalReads;

    private Long minLogicalReads;

    private Long maxLogicalReads;

    private Long totalElapsedTime;

    private Long lastElapsedTime;

    private Long minElapsedTime;

    private Long maxElapsedTime;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Date getCachedTime() {
        return cachedTime;
    }

    public void setCachedTime(Date cachedTime) {
        this.cachedTime = cachedTime;
    }

    public Date getLastExecutionTime() {
        return lastExecutionTime;
    }

    public void setLastExecutionTime(Date lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }

    public Long getExecutionCount() {
        return executionCount;
    }

    public void setExecutionCount(Long executionCount) {
        this.executionCount = executionCount;
    }

    public Long getTotalWorkerTime() {
        return totalWorkerTime;
    }

    public void setTotalWorkerTime(Long totalWorkerTime) {
        this.totalWorkerTime = totalWorkerTime;
    }

    public Long getLastWorkerTime() {
        return lastWorkerTime;
    }

    public void setLastWorkerTime(Long lastWorkerTime) {
        this.lastWorkerTime = lastWorkerTime;
    }

    public Long getMinWorkerTime() {
        return minWorkerTime;
    }

    public void setMinWorkerTime(Long minWorkerTime) {
        this.minWorkerTime = minWorkerTime;
    }

    public Long getMaxWorkerTime() {
        return maxWorkerTime;
    }

    public void setMaxWorkerTime(Long maxWorkerTime) {
        this.maxWorkerTime = maxWorkerTime;
    }

    public Long getTotalPhysicalReads() {
        return totalPhysicalReads;
    }

    public void setTotalPhysicalReads(Long totalPhysicalReads) {
        this.totalPhysicalReads = totalPhysicalReads;
    }

    public Long getLastPhysicalReads() {
        return lastPhysicalReads;
    }

    public void setLastPhysicalReads(Long lastPhysicalReads) {
        this.lastPhysicalReads = lastPhysicalReads;
    }

    public Long getMinPhysicalReads() {
        return minPhysicalReads;
    }

    public void setMinPhysicalReads(Long minPhysicalReads) {
        this.minPhysicalReads = minPhysicalReads;
    }

    public Long getMaxPhysicalReads() {
        return maxPhysicalReads;
    }

    public void setMaxPhysicalReads(Long maxPhysicalReads) {
        this.maxPhysicalReads = maxPhysicalReads;
    }

    public Long getTotalLogicalWrites() {
        return totalLogicalWrites;
    }

    public void setTotalLogicalWrites(Long totalLogicalWrites) {
        this.totalLogicalWrites = totalLogicalWrites;
    }

    public Long getLastLogicalWrites() {
        return lastLogicalWrites;
    }

    public void setLastLogicalWrites(Long lastLogicalWrites) {
        this.lastLogicalWrites = lastLogicalWrites;
    }

    public Long getMinLogicalWrites() {
        return minLogicalWrites;
    }

    public void setMinLogicalWrites(Long minLogicalWrites) {
        this.minLogicalWrites = minLogicalWrites;
    }

    public Long getMaxLogicalWrites() {
        return maxLogicalWrites;
    }

    public void setMaxLogicalWrites(Long maxLogicalWrites) {
        this.maxLogicalWrites = maxLogicalWrites;
    }

    public Long getTotalLogicalReads() {
        return totalLogicalReads;
    }

    public void setTotalLogicalReads(Long totalLogicalReads) {
        this.totalLogicalReads = totalLogicalReads;
    }

    public Long getLastLogicalReads() {
        return lastLogicalReads;
    }

    public void setLastLogicalReads(Long lastLogicalReads) {
        this.lastLogicalReads = lastLogicalReads;
    }

    public Long getMinLogicalReads() {
        return minLogicalReads;
    }

    public void setMinLogicalReads(Long minLogicalReads) {
        this.minLogicalReads = minLogicalReads;
    }

    public Long getMaxLogicalReads() {
        return maxLogicalReads;
    }

    public void setMaxLogicalReads(Long maxLogicalReads) {
        this.maxLogicalReads = maxLogicalReads;
    }

    public Long getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(Long totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public Long getLastElapsedTime() {
        return lastElapsedTime;
    }

    public void setLastElapsedTime(Long lastElapsedTime) {
        this.lastElapsedTime = lastElapsedTime;
    }

    public Long getMinElapsedTime() {
        return minElapsedTime;
    }

    public void setMinElapsedTime(Long minElapsedTime) {
        this.minElapsedTime = minElapsedTime;
    }

    public Long getMaxElapsedTime() {
        return maxElapsedTime;
    }

    public void setMaxElapsedTime(Long maxElapsedTime) {
        this.maxElapsedTime = maxElapsedTime;
    }
}