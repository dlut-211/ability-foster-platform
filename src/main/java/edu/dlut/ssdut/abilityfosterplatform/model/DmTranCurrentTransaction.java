package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmTranCurrentTransaction {
    private Long transactionId;

    private Long transactionSequenceNum;

    private Boolean transactionIsSnapshot;

    private Long firstSnapshotSequenceNum;

    private Long lastTransactionSequenceNum;

    private Long firstUsefulSequenceNum;

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

    public Boolean getTransactionIsSnapshot() {
        return transactionIsSnapshot;
    }

    public void setTransactionIsSnapshot(Boolean transactionIsSnapshot) {
        this.transactionIsSnapshot = transactionIsSnapshot;
    }

    public Long getFirstSnapshotSequenceNum() {
        return firstSnapshotSequenceNum;
    }

    public void setFirstSnapshotSequenceNum(Long firstSnapshotSequenceNum) {
        this.firstSnapshotSequenceNum = firstSnapshotSequenceNum;
    }

    public Long getLastTransactionSequenceNum() {
        return lastTransactionSequenceNum;
    }

    public void setLastTransactionSequenceNum(Long lastTransactionSequenceNum) {
        this.lastTransactionSequenceNum = lastTransactionSequenceNum;
    }

    public Long getFirstUsefulSequenceNum() {
        return firstUsefulSequenceNum;
    }

    public void setFirstUsefulSequenceNum(Long firstUsefulSequenceNum) {
        this.firstUsefulSequenceNum = firstUsefulSequenceNum;
    }
}