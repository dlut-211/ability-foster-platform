package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXtpThreads {
    private Integer threadType;

    private String threadTypeDesc;

    private Integer retiredRowCount;

    private Integer retiredTransactionCount;

    private byte[] threadAddress;

    public Integer getThreadType() {
        return threadType;
    }

    public void setThreadType(Integer threadType) {
        this.threadType = threadType;
    }

    public String getThreadTypeDesc() {
        return threadTypeDesc;
    }

    public void setThreadTypeDesc(String threadTypeDesc) {
        this.threadTypeDesc = threadTypeDesc == null ? null : threadTypeDesc.trim();
    }

    public Integer getRetiredRowCount() {
        return retiredRowCount;
    }

    public void setRetiredRowCount(Integer retiredRowCount) {
        this.retiredRowCount = retiredRowCount;
    }

    public Integer getRetiredTransactionCount() {
        return retiredTransactionCount;
    }

    public void setRetiredTransactionCount(Integer retiredTransactionCount) {
        this.retiredTransactionCount = retiredTransactionCount;
    }

    public byte[] getThreadAddress() {
        return threadAddress;
    }

    public void setThreadAddress(byte[] threadAddress) {
        this.threadAddress = threadAddress;
    }
}