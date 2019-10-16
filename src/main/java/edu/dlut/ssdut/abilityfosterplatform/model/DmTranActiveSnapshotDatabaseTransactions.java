package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmTranActiveSnapshotDatabaseTransactions {
    private Long transactionId;

    private Long transactionSequenceNum;

    private Long commitSequenceNum;

    private Integer sessionId;

    private Boolean isSnapshot;

    private Long firstSnapshotSequenceNum;

    private Integer maxVersionChainTraversed;

    private Double averageVersionChainTraversed;

    private Long elapsedTimeSeconds;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(Long transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }

    public Long getCommitSequenceNum() {
        return commitSequenceNum;
    }

    public void setCommitSequenceNum(Long commitSequenceNum) {
        this.commitSequenceNum = commitSequenceNum;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Boolean getIsSnapshot() {
        return isSnapshot;
    }

    public void setIsSnapshot(Boolean isSnapshot) {
        this.isSnapshot = isSnapshot;
    }

    public Long getFirstSnapshotSequenceNum() {
        return firstSnapshotSequenceNum;
    }

    public void setFirstSnapshotSequenceNum(Long firstSnapshotSequenceNum) {
        this.firstSnapshotSequenceNum = firstSnapshotSequenceNum;
    }

    public Integer getMaxVersionChainTraversed() {
        return maxVersionChainTraversed;
    }

    public void setMaxVersionChainTraversed(Integer maxVersionChainTraversed) {
        this.maxVersionChainTraversed = maxVersionChainTraversed;
    }

    public Double getAverageVersionChainTraversed() {
        return averageVersionChainTraversed;
    }

    public void setAverageVersionChainTraversed(Double averageVersionChainTraversed) {
        this.averageVersionChainTraversed = averageVersionChainTraversed;
    }

    public Long getElapsedTimeSeconds() {
        return elapsedTimeSeconds;
    }

    public void setElapsedTimeSeconds(Long elapsedTimeSeconds) {
        this.elapsedTimeSeconds = elapsedTimeSeconds;
    }
}