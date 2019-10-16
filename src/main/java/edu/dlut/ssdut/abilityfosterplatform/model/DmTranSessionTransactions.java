package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmTranSessionTransactions {
    private Integer sessionId;

    private Long transactionId;

    private Integer enlistCount;

    private Boolean isUserTransaction;

    private Boolean isLocal;

    private Boolean isEnlisted;

    private Boolean isBound;

    private Integer openTransactionCount;

    private byte[] transactionDescriptor;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getEnlistCount() {
        return enlistCount;
    }

    public void setEnlistCount(Integer enlistCount) {
        this.enlistCount = enlistCount;
    }

    public Boolean getIsUserTransaction() {
        return isUserTransaction;
    }

    public void setIsUserTransaction(Boolean isUserTransaction) {
        this.isUserTransaction = isUserTransaction;
    }

    public Boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Boolean getIsEnlisted() {
        return isEnlisted;
    }

    public void setIsEnlisted(Boolean isEnlisted) {
        this.isEnlisted = isEnlisted;
    }

    public Boolean getIsBound() {
        return isBound;
    }

    public void setIsBound(Boolean isBound) {
        this.isBound = isBound;
    }

    public Integer getOpenTransactionCount() {
        return openTransactionCount;
    }

    public void setOpenTransactionCount(Integer openTransactionCount) {
        this.openTransactionCount = openTransactionCount;
    }

    public byte[] getTransactionDescriptor() {
        return transactionDescriptor;
    }

    public void setTransactionDescriptor(byte[] transactionDescriptor) {
        this.transactionDescriptor = transactionDescriptor;
    }
}