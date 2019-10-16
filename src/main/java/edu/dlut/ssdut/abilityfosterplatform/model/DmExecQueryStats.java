package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecQueryStats {
    private Integer statementStartOffset;

    private Integer statementEndOffset;

    private Long planGenerationNum;

    private Date creationTime;

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

    private Long totalClrTime;

    private Long lastClrTime;

    private Long minClrTime;

    private Long maxClrTime;

    private Long totalElapsedTime;

    private Long lastElapsedTime;

    private Long minElapsedTime;

    private Long maxElapsedTime;

    private Long totalRows;

    private Long lastRows;

    private Long minRows;

    private Long maxRows;

    private Long statementContextId;

    public Integer getStatementStartOffset() {
        return statementStartOffset;
    }

    public void setStatementStartOffset(Integer statementStartOffset) {
        this.statementStartOffset = statementStartOffset;
    }

    public Integer getStatementEndOffset() {
        return statementEndOffset;
    }

    public void setStatementEndOffset(Integer statementEndOffset) {
        this.statementEndOffset = statementEndOffset;
    }

    public Long getPlanGenerationNum() {
        return planGenerationNum;
    }

    public void setPlanGenerationNum(Long planGenerationNum) {
        this.planGenerationNum = planGenerationNum;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
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

    public Long getTotalClrTime() {
        return totalClrTime;
    }

    public void setTotalClrTime(Long totalClrTime) {
        this.totalClrTime = totalClrTime;
    }

    public Long getLastClrTime() {
        return lastClrTime;
    }

    public void setLastClrTime(Long lastClrTime) {
        this.lastClrTime = lastClrTime;
    }

    public Long getMinClrTime() {
        return minClrTime;
    }

    public void setMinClrTime(Long minClrTime) {
        this.minClrTime = minClrTime;
    }

    public Long getMaxClrTime() {
        return maxClrTime;
    }

    public void setMaxClrTime(Long maxClrTime) {
        this.maxClrTime = maxClrTime;
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

    public Long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Long totalRows) {
        this.totalRows = totalRows;
    }

    public Long getLastRows() {
        return lastRows;
    }

    public void setLastRows(Long lastRows) {
        this.lastRows = lastRows;
    }

    public Long getMinRows() {
        return minRows;
    }

    public void setMinRows(Long minRows) {
        this.minRows = minRows;
    }

    public Long getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(Long maxRows) {
        this.maxRows = maxRows;
    }

    public Long getStatementContextId() {
        return statementContextId;
    }

    public void setStatementContextId(Long statementContextId) {
        this.statementContextId = statementContextId;
    }
}