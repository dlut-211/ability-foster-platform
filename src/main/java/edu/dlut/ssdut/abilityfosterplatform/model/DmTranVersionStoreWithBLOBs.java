package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmTranVersionStoreWithBLOBs extends DmTranVersionStore {
    private byte[] recordImageFirstPart;

    private byte[] recordImageSecondPart;

    public byte[] getRecordImageFirstPart() {
        return recordImageFirstPart;
    }

    public void setRecordImageFirstPart(byte[] recordImageFirstPart) {
        this.recordImageFirstPart = recordImageFirstPart;
    }

    public byte[] getRecordImageSecondPart() {
        return recordImageSecondPart;
    }

    public void setRecordImageSecondPart(byte[] recordImageSecondPart) {
        this.recordImageSecondPart = recordImageSecondPart;
    }
}