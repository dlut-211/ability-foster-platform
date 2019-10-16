package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmResourceGovernorResourcePoolVolumes {
    private Integer poolId;

    private String volumeName;

    private Integer readIoQueuedTotal;

    private Integer readIoIssuedTotal;

    private Integer readIoCompletedTotal;

    private Integer readIoThrottledTotal;

    private Long readBytesTotal;

    private Long readIoStallTotalMs;

    private Long readIoStallQueuedMs;

    private Integer writeIoQueuedTotal;

    private Integer writeIoIssuedTotal;

    private Integer writeIoCompletedTotal;

    private Integer writeIoThrottledTotal;

    private Long writeBytesTotal;

    private Long writeIoStallTotalMs;

    private Long writeIoStallQueuedMs;

    private Integer ioIssueViolationsTotal;

    private Long ioIssueDelayTotalMs;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName == null ? null : volumeName.trim();
    }

    public Integer getReadIoQueuedTotal() {
        return readIoQueuedTotal;
    }

    public void setReadIoQueuedTotal(Integer readIoQueuedTotal) {
        this.readIoQueuedTotal = readIoQueuedTotal;
    }

    public Integer getReadIoIssuedTotal() {
        return readIoIssuedTotal;
    }

    public void setReadIoIssuedTotal(Integer readIoIssuedTotal) {
        this.readIoIssuedTotal = readIoIssuedTotal;
    }

    public Integer getReadIoCompletedTotal() {
        return readIoCompletedTotal;
    }

    public void setReadIoCompletedTotal(Integer readIoCompletedTotal) {
        this.readIoCompletedTotal = readIoCompletedTotal;
    }

    public Integer getReadIoThrottledTotal() {
        return readIoThrottledTotal;
    }

    public void setReadIoThrottledTotal(Integer readIoThrottledTotal) {
        this.readIoThrottledTotal = readIoThrottledTotal;
    }

    public Long getReadBytesTotal() {
        return readBytesTotal;
    }

    public void setReadBytesTotal(Long readBytesTotal) {
        this.readBytesTotal = readBytesTotal;
    }

    public Long getReadIoStallTotalMs() {
        return readIoStallTotalMs;
    }

    public void setReadIoStallTotalMs(Long readIoStallTotalMs) {
        this.readIoStallTotalMs = readIoStallTotalMs;
    }

    public Long getReadIoStallQueuedMs() {
        return readIoStallQueuedMs;
    }

    public void setReadIoStallQueuedMs(Long readIoStallQueuedMs) {
        this.readIoStallQueuedMs = readIoStallQueuedMs;
    }

    public Integer getWriteIoQueuedTotal() {
        return writeIoQueuedTotal;
    }

    public void setWriteIoQueuedTotal(Integer writeIoQueuedTotal) {
        this.writeIoQueuedTotal = writeIoQueuedTotal;
    }

    public Integer getWriteIoIssuedTotal() {
        return writeIoIssuedTotal;
    }

    public void setWriteIoIssuedTotal(Integer writeIoIssuedTotal) {
        this.writeIoIssuedTotal = writeIoIssuedTotal;
    }

    public Integer getWriteIoCompletedTotal() {
        return writeIoCompletedTotal;
    }

    public void setWriteIoCompletedTotal(Integer writeIoCompletedTotal) {
        this.writeIoCompletedTotal = writeIoCompletedTotal;
    }

    public Integer getWriteIoThrottledTotal() {
        return writeIoThrottledTotal;
    }

    public void setWriteIoThrottledTotal(Integer writeIoThrottledTotal) {
        this.writeIoThrottledTotal = writeIoThrottledTotal;
    }

    public Long getWriteBytesTotal() {
        return writeBytesTotal;
    }

    public void setWriteBytesTotal(Long writeBytesTotal) {
        this.writeBytesTotal = writeBytesTotal;
    }

    public Long getWriteIoStallTotalMs() {
        return writeIoStallTotalMs;
    }

    public void setWriteIoStallTotalMs(Long writeIoStallTotalMs) {
        this.writeIoStallTotalMs = writeIoStallTotalMs;
    }

    public Long getWriteIoStallQueuedMs() {
        return writeIoStallQueuedMs;
    }

    public void setWriteIoStallQueuedMs(Long writeIoStallQueuedMs) {
        this.writeIoStallQueuedMs = writeIoStallQueuedMs;
    }

    public Integer getIoIssueViolationsTotal() {
        return ioIssueViolationsTotal;
    }

    public void setIoIssueViolationsTotal(Integer ioIssueViolationsTotal) {
        this.ioIssueViolationsTotal = ioIssueViolationsTotal;
    }

    public Long getIoIssueDelayTotalMs() {
        return ioIssueDelayTotalMs;
    }

    public void setIoIssueDelayTotalMs(Long ioIssueDelayTotalMs) {
        this.ioIssueDelayTotalMs = ioIssueDelayTotalMs;
    }
}