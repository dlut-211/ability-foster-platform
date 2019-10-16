package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFilestreamFileIoHandlesWithBLOBs extends DmFilestreamFileIoHandles {
    private byte[] handleContextAddress;

    private byte[] creationClientThreadId;

    private byte[] creationClientProcessId;

    private byte[] filestreamTransactionId;

    public byte[] getHandleContextAddress() {
        return handleContextAddress;
    }

    public void setHandleContextAddress(byte[] handleContextAddress) {
        this.handleContextAddress = handleContextAddress;
    }

    public byte[] getCreationClientThreadId() {
        return creationClientThreadId;
    }

    public void setCreationClientThreadId(byte[] creationClientThreadId) {
        this.creationClientThreadId = creationClientThreadId;
    }

    public byte[] getCreationClientProcessId() {
        return creationClientProcessId;
    }

    public void setCreationClientProcessId(byte[] creationClientProcessId) {
        this.creationClientProcessId = creationClientProcessId;
    }

    public byte[] getFilestreamTransactionId() {
        return filestreamTransactionId;
    }

    public void setFilestreamTransactionId(byte[] filestreamTransactionId) {
        this.filestreamTransactionId = filestreamTransactionId;
    }
}