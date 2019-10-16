package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmCdcErrors {
    private Integer sessionId;

    private Integer phaseNumber;

    private Date entryTime;

    private Integer errorNumber;

    private Integer errorSeverity;

    private Integer errorState;

    private String errorMessage;

    private String startLsn;

    private String beginLsn;

    private String sequenceValue;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getPhaseNumber() {
        return phaseNumber;
    }

    public void setPhaseNumber(Integer phaseNumber) {
        this.phaseNumber = phaseNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(Integer errorNumber) {
        this.errorNumber = errorNumber;
    }

    public Integer getErrorSeverity() {
        return errorSeverity;
    }

    public void setErrorSeverity(Integer errorSeverity) {
        this.errorSeverity = errorSeverity;
    }

    public Integer getErrorState() {
        return errorState;
    }

    public void setErrorState(Integer errorState) {
        this.errorState = errorState;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public String getStartLsn() {
        return startLsn;
    }

    public void setStartLsn(String startLsn) {
        this.startLsn = startLsn == null ? null : startLsn.trim();
    }

    public String getBeginLsn() {
        return beginLsn;
    }

    public void setBeginLsn(String beginLsn) {
        this.beginLsn = beginLsn == null ? null : beginLsn.trim();
    }

    public String getSequenceValue() {
        return sequenceValue;
    }

    public void setSequenceValue(String sequenceValue) {
        this.sequenceValue = sequenceValue == null ? null : sequenceValue.trim();
    }
}