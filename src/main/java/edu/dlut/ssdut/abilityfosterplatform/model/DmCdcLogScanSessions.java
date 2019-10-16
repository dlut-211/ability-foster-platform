package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmCdcLogScanSessions {
    private Integer sessionId;

    private Date startTime;

    private Date endTime;

    private Integer duration;

    private String scanPhase;

    private Integer errorCount;

    private String startLsn;

    private String currentLsn;

    private String endLsn;

    private Long tranCount;

    private String lastCommitLsn;

    private Date lastCommitTime;

    private Long logRecordCount;

    private Integer schemaChangeCount;

    private Long commandCount;

    private String firstBeginCdcLsn;

    private String lastCommitCdcLsn;

    private Date lastCommitCdcTime;

    private Integer latency;

    private Integer emptyScanCount;

    private Integer failedSessionsCount;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getScanPhase() {
        return scanPhase;
    }

    public void setScanPhase(String scanPhase) {
        this.scanPhase = scanPhase == null ? null : scanPhase.trim();
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public String getStartLsn() {
        return startLsn;
    }

    public void setStartLsn(String startLsn) {
        this.startLsn = startLsn == null ? null : startLsn.trim();
    }

    public String getCurrentLsn() {
        return currentLsn;
    }

    public void setCurrentLsn(String currentLsn) {
        this.currentLsn = currentLsn == null ? null : currentLsn.trim();
    }

    public String getEndLsn() {
        return endLsn;
    }

    public void setEndLsn(String endLsn) {
        this.endLsn = endLsn == null ? null : endLsn.trim();
    }

    public Long getTranCount() {
        return tranCount;
    }

    public void setTranCount(Long tranCount) {
        this.tranCount = tranCount;
    }

    public String getLastCommitLsn() {
        return lastCommitLsn;
    }

    public void setLastCommitLsn(String lastCommitLsn) {
        this.lastCommitLsn = lastCommitLsn == null ? null : lastCommitLsn.trim();
    }

    public Date getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(Date lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
    }

    public Long getLogRecordCount() {
        return logRecordCount;
    }

    public void setLogRecordCount(Long logRecordCount) {
        this.logRecordCount = logRecordCount;
    }

    public Integer getSchemaChangeCount() {
        return schemaChangeCount;
    }

    public void setSchemaChangeCount(Integer schemaChangeCount) {
        this.schemaChangeCount = schemaChangeCount;
    }

    public Long getCommandCount() {
        return commandCount;
    }

    public void setCommandCount(Long commandCount) {
        this.commandCount = commandCount;
    }

    public String getFirstBeginCdcLsn() {
        return firstBeginCdcLsn;
    }

    public void setFirstBeginCdcLsn(String firstBeginCdcLsn) {
        this.firstBeginCdcLsn = firstBeginCdcLsn == null ? null : firstBeginCdcLsn.trim();
    }

    public String getLastCommitCdcLsn() {
        return lastCommitCdcLsn;
    }

    public void setLastCommitCdcLsn(String lastCommitCdcLsn) {
        this.lastCommitCdcLsn = lastCommitCdcLsn == null ? null : lastCommitCdcLsn.trim();
    }

    public Date getLastCommitCdcTime() {
        return lastCommitCdcTime;
    }

    public void setLastCommitCdcTime(Date lastCommitCdcTime) {
        this.lastCommitCdcTime = lastCommitCdcTime;
    }

    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    public Integer getEmptyScanCount() {
        return emptyScanCount;
    }

    public void setEmptyScanCount(Integer emptyScanCount) {
        this.emptyScanCount = emptyScanCount;
    }

    public Integer getFailedSessionsCount() {
        return failedSessionsCount;
    }

    public void setFailedSessionsCount(Integer failedSessionsCount) {
        this.failedSessionsCount = failedSessionsCount;
    }
}