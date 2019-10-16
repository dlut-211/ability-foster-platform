package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class DmDbXtpCheckpointStats {
    private Long logToProcessInBytes;

    private Long totalLogBlocksProcessed;

    private Long totalLogRecordsProcessed;

    private Long xtpLogRecordsProcessed;

    private Long totalWaitTimeInMs;

    private Long waitsForIo;

    private Long ioWaitTimeInMs;

    private Long waitsForNewLog;

    private Long newLogWaitTimeInMs;

    private Long logGeneratedSinceLastCheckpointInBytes;

    private Long timeSinceLastCheckpointInMs;

    private BigDecimal checkpointLsn;

    private BigDecimal currentLsn;

    private BigDecimal endOfLogLsn;

    private byte[] taskAddress;

    public Long getLogToProcessInBytes() {
        return logToProcessInBytes;
    }

    public void setLogToProcessInBytes(Long logToProcessInBytes) {
        this.logToProcessInBytes = logToProcessInBytes;
    }

    public Long getTotalLogBlocksProcessed() {
        return totalLogBlocksProcessed;
    }

    public void setTotalLogBlocksProcessed(Long totalLogBlocksProcessed) {
        this.totalLogBlocksProcessed = totalLogBlocksProcessed;
    }

    public Long getTotalLogRecordsProcessed() {
        return totalLogRecordsProcessed;
    }

    public void setTotalLogRecordsProcessed(Long totalLogRecordsProcessed) {
        this.totalLogRecordsProcessed = totalLogRecordsProcessed;
    }

    public Long getXtpLogRecordsProcessed() {
        return xtpLogRecordsProcessed;
    }

    public void setXtpLogRecordsProcessed(Long xtpLogRecordsProcessed) {
        this.xtpLogRecordsProcessed = xtpLogRecordsProcessed;
    }

    public Long getTotalWaitTimeInMs() {
        return totalWaitTimeInMs;
    }

    public void setTotalWaitTimeInMs(Long totalWaitTimeInMs) {
        this.totalWaitTimeInMs = totalWaitTimeInMs;
    }

    public Long getWaitsForIo() {
        return waitsForIo;
    }

    public void setWaitsForIo(Long waitsForIo) {
        this.waitsForIo = waitsForIo;
    }

    public Long getIoWaitTimeInMs() {
        return ioWaitTimeInMs;
    }

    public void setIoWaitTimeInMs(Long ioWaitTimeInMs) {
        this.ioWaitTimeInMs = ioWaitTimeInMs;
    }

    public Long getWaitsForNewLog() {
        return waitsForNewLog;
    }

    public void setWaitsForNewLog(Long waitsForNewLog) {
        this.waitsForNewLog = waitsForNewLog;
    }

    public Long getNewLogWaitTimeInMs() {
        return newLogWaitTimeInMs;
    }

    public void setNewLogWaitTimeInMs(Long newLogWaitTimeInMs) {
        this.newLogWaitTimeInMs = newLogWaitTimeInMs;
    }

    public Long getLogGeneratedSinceLastCheckpointInBytes() {
        return logGeneratedSinceLastCheckpointInBytes;
    }

    public void setLogGeneratedSinceLastCheckpointInBytes(Long logGeneratedSinceLastCheckpointInBytes) {
        this.logGeneratedSinceLastCheckpointInBytes = logGeneratedSinceLastCheckpointInBytes;
    }

    public Long getTimeSinceLastCheckpointInMs() {
        return timeSinceLastCheckpointInMs;
    }

    public void setTimeSinceLastCheckpointInMs(Long timeSinceLastCheckpointInMs) {
        this.timeSinceLastCheckpointInMs = timeSinceLastCheckpointInMs;
    }

    public BigDecimal getCheckpointLsn() {
        return checkpointLsn;
    }

    public void setCheckpointLsn(BigDecimal checkpointLsn) {
        this.checkpointLsn = checkpointLsn;
    }

    public BigDecimal getCurrentLsn() {
        return currentLsn;
    }

    public void setCurrentLsn(BigDecimal currentLsn) {
        this.currentLsn = currentLsn;
    }

    public BigDecimal getEndOfLogLsn() {
        return endOfLogLsn;
    }

    public void setEndOfLogLsn(BigDecimal endOfLogLsn) {
        this.endOfLogLsn = endOfLogLsn;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }
}