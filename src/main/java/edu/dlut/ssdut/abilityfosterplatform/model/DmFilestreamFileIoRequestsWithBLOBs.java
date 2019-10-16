package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFilestreamFileIoRequestsWithBLOBs extends DmFilestreamFileIoRequests {
    private byte[] requestContextAddress;

    private byte[] clientThreadId;

    private byte[] clientProcessId;

    private byte[] handleContextAddress;

    private byte[] filestreamTransactionId;

    public byte[] getRequestContextAddress() {
        return requestContextAddress;
    }

    public void setRequestContextAddress(byte[] requestContextAddress) {
        this.requestContextAddress = requestContextAddress;
    }

    public byte[] getClientThreadId() {
        return clientThreadId;
    }

    public void setClientThreadId(byte[] clientThreadId) {
        this.clientThreadId = clientThreadId;
    }

    public byte[] getClientProcessId() {
        return clientProcessId;
    }

    public void setClientProcessId(byte[] clientProcessId) {
        this.clientProcessId = clientProcessId;
    }

    public byte[] getHandleContextAddress() {
        return handleContextAddress;
    }

    public void setHandleContextAddress(byte[] handleContextAddress) {
        this.handleContextAddress = handleContextAddress;
    }

    public byte[] getFilestreamTransactionId() {
        return filestreamTransactionId;
    }

    public void setFilestreamTransactionId(byte[] filestreamTransactionId) {
        this.filestreamTransactionId = filestreamTransactionId;
    }
}