package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbXtpTransactions {
    private Long xtpTransactionId;

    private Long transactionId;

    private Short sessionId;

    private Long beginTsn;

    private Long endTsn;

    private Integer state;

    private String stateDesc;

    private Integer result;

    private String resultDesc;

    private Integer lastError;

    private Boolean isSpeculative;

    private Boolean isPrepared;

    private Boolean isDelayedDurability;

    private Integer threadId;

    private Integer readSetRowCount;

    private Integer writeSetRowCount;

    private Integer scanSetCount;

    private Integer savepointGarbageCount;

    private Long logBytesRequired;

    private Integer countOfAllocations;

    private Integer allocatedBytes;

    private Integer reservedBytes;

    private Integer commitDependencyCount;

    private Integer commitDependencyTotalAttemptCount;

    private Integer scanArea;

    private String scanAreaDesc;

    private Integer scanLocation;

    public Long getXtpTransactionId() {
        return xtpTransactionId;
    }

    public void setXtpTransactionId(Long xtpTransactionId) {
        this.xtpTransactionId = xtpTransactionId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Long getBeginTsn() {
        return beginTsn;
    }

    public void setBeginTsn(Long beginTsn) {
        this.beginTsn = beginTsn;
    }

    public Long getEndTsn() {
        return endTsn;
    }

    public void setEndTsn(Long endTsn) {
        this.endTsn = endTsn;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc == null ? null : resultDesc.trim();
    }

    public Integer getLastError() {
        return lastError;
    }

    public void setLastError(Integer lastError) {
        this.lastError = lastError;
    }

    public Boolean getIsSpeculative() {
        return isSpeculative;
    }

    public void setIsSpeculative(Boolean isSpeculative) {
        this.isSpeculative = isSpeculative;
    }

    public Boolean getIsPrepared() {
        return isPrepared;
    }

    public void setIsPrepared(Boolean isPrepared) {
        this.isPrepared = isPrepared;
    }

    public Boolean getIsDelayedDurability() {
        return isDelayedDurability;
    }

    public void setIsDelayedDurability(Boolean isDelayedDurability) {
        this.isDelayedDurability = isDelayedDurability;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Integer getReadSetRowCount() {
        return readSetRowCount;
    }

    public void setReadSetRowCount(Integer readSetRowCount) {
        this.readSetRowCount = readSetRowCount;
    }

    public Integer getWriteSetRowCount() {
        return writeSetRowCount;
    }

    public void setWriteSetRowCount(Integer writeSetRowCount) {
        this.writeSetRowCount = writeSetRowCount;
    }

    public Integer getScanSetCount() {
        return scanSetCount;
    }

    public void setScanSetCount(Integer scanSetCount) {
        this.scanSetCount = scanSetCount;
    }

    public Integer getSavepointGarbageCount() {
        return savepointGarbageCount;
    }

    public void setSavepointGarbageCount(Integer savepointGarbageCount) {
        this.savepointGarbageCount = savepointGarbageCount;
    }

    public Long getLogBytesRequired() {
        return logBytesRequired;
    }

    public void setLogBytesRequired(Long logBytesRequired) {
        this.logBytesRequired = logBytesRequired;
    }

    public Integer getCountOfAllocations() {
        return countOfAllocations;
    }

    public void setCountOfAllocations(Integer countOfAllocations) {
        this.countOfAllocations = countOfAllocations;
    }

    public Integer getAllocatedBytes() {
        return allocatedBytes;
    }

    public void setAllocatedBytes(Integer allocatedBytes) {
        this.allocatedBytes = allocatedBytes;
    }

    public Integer getReservedBytes() {
        return reservedBytes;
    }

    public void setReservedBytes(Integer reservedBytes) {
        this.reservedBytes = reservedBytes;
    }

    public Integer getCommitDependencyCount() {
        return commitDependencyCount;
    }

    public void setCommitDependencyCount(Integer commitDependencyCount) {
        this.commitDependencyCount = commitDependencyCount;
    }

    public Integer getCommitDependencyTotalAttemptCount() {
        return commitDependencyTotalAttemptCount;
    }

    public void setCommitDependencyTotalAttemptCount(Integer commitDependencyTotalAttemptCount) {
        this.commitDependencyTotalAttemptCount = commitDependencyTotalAttemptCount;
    }

    public Integer getScanArea() {
        return scanArea;
    }

    public void setScanArea(Integer scanArea) {
        this.scanArea = scanArea;
    }

    public String getScanAreaDesc() {
        return scanAreaDesc;
    }

    public void setScanAreaDesc(String scanAreaDesc) {
        this.scanAreaDesc = scanAreaDesc == null ? null : scanAreaDesc.trim();
    }

    public Integer getScanLocation() {
        return scanLocation;
    }

    public void setScanLocation(Integer scanLocation) {
        this.scanLocation = scanLocation;
    }
}