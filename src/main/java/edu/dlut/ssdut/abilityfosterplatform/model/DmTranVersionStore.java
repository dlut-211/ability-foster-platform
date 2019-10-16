package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmTranVersionStore {
    private Long transactionSequenceNum;

    private Long versionSequenceNum;

    private Short databaseId;

    private Long rowsetId;

    private Byte status;

    private Short minLengthInBytes;

    private Short recordLengthFirstPartInBytes;

    private Short recordLengthSecondPartInBytes;

    public Long getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(Long transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }

    public Long getVersionSequenceNum() {
        return versionSequenceNum;
    }

    public void setVersionSequenceNum(Long versionSequenceNum) {
        this.versionSequenceNum = versionSequenceNum;
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Long getRowsetId() {
        return rowsetId;
    }

    public void setRowsetId(Long rowsetId) {
        this.rowsetId = rowsetId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Short getMinLengthInBytes() {
        return minLengthInBytes;
    }

    public void setMinLengthInBytes(Short minLengthInBytes) {
        this.minLengthInBytes = minLengthInBytes;
    }

    public Short getRecordLengthFirstPartInBytes() {
        return recordLengthFirstPartInBytes;
    }

    public void setRecordLengthFirstPartInBytes(Short recordLengthFirstPartInBytes) {
        this.recordLengthFirstPartInBytes = recordLengthFirstPartInBytes;
    }

    public Short getRecordLengthSecondPartInBytes() {
        return recordLengthSecondPartInBytes;
    }

    public void setRecordLengthSecondPartInBytes(Short recordLengthSecondPartInBytes) {
        this.recordLengthSecondPartInBytes = recordLengthSecondPartInBytes;
    }
}