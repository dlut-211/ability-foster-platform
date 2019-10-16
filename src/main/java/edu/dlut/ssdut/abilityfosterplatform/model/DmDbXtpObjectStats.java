package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbXtpObjectStats {
    private Integer objectId;

    private Long rowInsertAttempts;

    private Long rowUpdateAttempts;

    private Long rowDeleteAttempts;

    private Long writeConflicts;

    private Long uniqueConstraintViolations;

    private byte[] objectAddress;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Long getRowInsertAttempts() {
        return rowInsertAttempts;
    }

    public void setRowInsertAttempts(Long rowInsertAttempts) {
        this.rowInsertAttempts = rowInsertAttempts;
    }

    public Long getRowUpdateAttempts() {
        return rowUpdateAttempts;
    }

    public void setRowUpdateAttempts(Long rowUpdateAttempts) {
        this.rowUpdateAttempts = rowUpdateAttempts;
    }

    public Long getRowDeleteAttempts() {
        return rowDeleteAttempts;
    }

    public void setRowDeleteAttempts(Long rowDeleteAttempts) {
        this.rowDeleteAttempts = rowDeleteAttempts;
    }

    public Long getWriteConflicts() {
        return writeConflicts;
    }

    public void setWriteConflicts(Long writeConflicts) {
        this.writeConflicts = writeConflicts;
    }

    public Long getUniqueConstraintViolations() {
        return uniqueConstraintViolations;
    }

    public void setUniqueConstraintViolations(Long uniqueConstraintViolations) {
        this.uniqueConstraintViolations = uniqueConstraintViolations;
    }

    public byte[] getObjectAddress() {
        return objectAddress;
    }

    public void setObjectAddress(byte[] objectAddress) {
        this.objectAddress = objectAddress;
    }
}