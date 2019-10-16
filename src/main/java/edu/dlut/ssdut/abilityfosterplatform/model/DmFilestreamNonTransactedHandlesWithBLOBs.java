package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFilestreamNonTransactedHandlesWithBLOBs extends DmFilestreamNonTransactedHandles {
    private byte[] correlationProcessId;

    private byte[] correlationThreadId;

    private byte[] fileContext;

    private byte[] itemId;

    private byte[] loginSid;

    public byte[] getCorrelationProcessId() {
        return correlationProcessId;
    }

    public void setCorrelationProcessId(byte[] correlationProcessId) {
        this.correlationProcessId = correlationProcessId;
    }

    public byte[] getCorrelationThreadId() {
        return correlationThreadId;
    }

    public void setCorrelationThreadId(byte[] correlationThreadId) {
        this.correlationThreadId = correlationThreadId;
    }

    public byte[] getFileContext() {
        return fileContext;
    }

    public void setFileContext(byte[] fileContext) {
        this.fileContext = fileContext;
    }

    public byte[] getItemId() {
        return itemId;
    }

    public void setItemId(byte[] itemId) {
        this.itemId = itemId;
    }

    public byte[] getLoginSid() {
        return loginSid;
    }

    public void setLoginSid(byte[] loginSid) {
        this.loginSid = loginSid;
    }
}