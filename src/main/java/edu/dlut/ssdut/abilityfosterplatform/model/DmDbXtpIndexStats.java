package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbXtpIndexStats {
    private Integer objectId;

    private Integer indexId;

    private Long scansStarted;

    private Long scansRetries;

    private Long rowsReturned;

    private Long rowsTouched;

    private Long rowsExpiring;

    private Long rowsExpired;

    private Long rowsExpiredRemoved;

    private Long phantomScansStarted;

    private Long phantomScansRetries;

    private Long phantomRowsTouched;

    private Long phantomExpiringRowsEncountered;

    private Long phantomExpiredRemovedRowsEncountered;

    private Long phantomExpiredRowsRemoved;

    private byte[] objectAddress;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Long getScansStarted() {
        return scansStarted;
    }

    public void setScansStarted(Long scansStarted) {
        this.scansStarted = scansStarted;
    }

    public Long getScansRetries() {
        return scansRetries;
    }

    public void setScansRetries(Long scansRetries) {
        this.scansRetries = scansRetries;
    }

    public Long getRowsReturned() {
        return rowsReturned;
    }

    public void setRowsReturned(Long rowsReturned) {
        this.rowsReturned = rowsReturned;
    }

    public Long getRowsTouched() {
        return rowsTouched;
    }

    public void setRowsTouched(Long rowsTouched) {
        this.rowsTouched = rowsTouched;
    }

    public Long getRowsExpiring() {
        return rowsExpiring;
    }

    public void setRowsExpiring(Long rowsExpiring) {
        this.rowsExpiring = rowsExpiring;
    }

    public Long getRowsExpired() {
        return rowsExpired;
    }

    public void setRowsExpired(Long rowsExpired) {
        this.rowsExpired = rowsExpired;
    }

    public Long getRowsExpiredRemoved() {
        return rowsExpiredRemoved;
    }

    public void setRowsExpiredRemoved(Long rowsExpiredRemoved) {
        this.rowsExpiredRemoved = rowsExpiredRemoved;
    }

    public Long getPhantomScansStarted() {
        return phantomScansStarted;
    }

    public void setPhantomScansStarted(Long phantomScansStarted) {
        this.phantomScansStarted = phantomScansStarted;
    }

    public Long getPhantomScansRetries() {
        return phantomScansRetries;
    }

    public void setPhantomScansRetries(Long phantomScansRetries) {
        this.phantomScansRetries = phantomScansRetries;
    }

    public Long getPhantomRowsTouched() {
        return phantomRowsTouched;
    }

    public void setPhantomRowsTouched(Long phantomRowsTouched) {
        this.phantomRowsTouched = phantomRowsTouched;
    }

    public Long getPhantomExpiringRowsEncountered() {
        return phantomExpiringRowsEncountered;
    }

    public void setPhantomExpiringRowsEncountered(Long phantomExpiringRowsEncountered) {
        this.phantomExpiringRowsEncountered = phantomExpiringRowsEncountered;
    }

    public Long getPhantomExpiredRemovedRowsEncountered() {
        return phantomExpiredRemovedRowsEncountered;
    }

    public void setPhantomExpiredRemovedRowsEncountered(Long phantomExpiredRemovedRowsEncountered) {
        this.phantomExpiredRemovedRowsEncountered = phantomExpiredRemovedRowsEncountered;
    }

    public Long getPhantomExpiredRowsRemoved() {
        return phantomExpiredRowsRemoved;
    }

    public void setPhantomExpiredRowsRemoved(Long phantomExpiredRowsRemoved) {
        this.phantomExpiredRowsRemoved = phantomExpiredRowsRemoved;
    }

    public byte[] getObjectAddress() {
        return objectAddress;
    }

    public void setObjectAddress(byte[] objectAddress) {
        this.objectAddress = objectAddress;
    }
}