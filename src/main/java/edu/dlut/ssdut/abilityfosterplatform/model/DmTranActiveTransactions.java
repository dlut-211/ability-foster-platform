package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmTranActiveTransactions {
    private Long transactionId;

    private String name;

    private Date transactionBeginTime;

    private Integer transactionType;

    private String transactionUow;

    private Integer transactionState;

    private Integer transactionStatus;

    private Integer transactionStatus2;

    private Integer dtcState;

    private Integer dtcStatus;

    private Integer dtcIsolationLevel;

    private byte[] filestreamTransactionId;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTransactionBeginTime() {
        return transactionBeginTime;
    }

    public void setTransactionBeginTime(Date transactionBeginTime) {
        this.transactionBeginTime = transactionBeginTime;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionUow() {
        return transactionUow;
    }

    public void setTransactionUow(String transactionUow) {
        this.transactionUow = transactionUow == null ? null : transactionUow.trim();
    }

    public Integer getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(Integer transactionState) {
        this.transactionState = transactionState;
    }

    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Integer getTransactionStatus2() {
        return transactionStatus2;
    }

    public void setTransactionStatus2(Integer transactionStatus2) {
        this.transactionStatus2 = transactionStatus2;
    }

    public Integer getDtcState() {
        return dtcState;
    }

    public void setDtcState(Integer dtcState) {
        this.dtcState = dtcState;
    }

    public Integer getDtcStatus() {
        return dtcStatus;
    }

    public void setDtcStatus(Integer dtcStatus) {
        this.dtcStatus = dtcStatus;
    }

    public Integer getDtcIsolationLevel() {
        return dtcIsolationLevel;
    }

    public void setDtcIsolationLevel(Integer dtcIsolationLevel) {
        this.dtcIsolationLevel = dtcIsolationLevel;
    }

    public byte[] getFilestreamTransactionId() {
        return filestreamTransactionId;
    }

    public void setFilestreamTransactionId(byte[] filestreamTransactionId) {
        this.filestreamTransactionId = filestreamTransactionId;
    }
}