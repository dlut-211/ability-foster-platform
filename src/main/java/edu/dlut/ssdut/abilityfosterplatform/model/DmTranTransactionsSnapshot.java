package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmTranTransactionsSnapshot {
    private Long transactionSequenceNum;

    private Integer snapshotId;

    private Long snapshotSequenceNum;

    public Long getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(Long transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }

    public Integer getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(Integer snapshotId) {
        this.snapshotId = snapshotId;
    }

    public Long getSnapshotSequenceNum() {
        return snapshotSequenceNum;
    }

    public void setSnapshotSequenceNum(Long snapshotSequenceNum) {
        this.snapshotSequenceNum = snapshotSequenceNum;
    }
}