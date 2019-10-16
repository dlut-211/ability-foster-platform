package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXtpGcStats {
    private Long rowsExamined;

    private Long rowsNoSweepNeeded;

    private Long rowsFirstInBucket;

    private Long rowsFirstInBucketRemoved;

    private Long rowsMarkedForUnlink;

    private Long parallelAssistCount;

    private Long idleWorkerCount;

    private Long sweepScansStarted;

    private Long sweepScanRetries;

    private Long sweepRowsTouched;

    private Long sweepRowsExpiring;

    private Long sweepRowsExpired;

    private Long sweepRowsExpiredRemoved;

    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public Long getRowsNoSweepNeeded() {
        return rowsNoSweepNeeded;
    }

    public void setRowsNoSweepNeeded(Long rowsNoSweepNeeded) {
        this.rowsNoSweepNeeded = rowsNoSweepNeeded;
    }

    public Long getRowsFirstInBucket() {
        return rowsFirstInBucket;
    }

    public void setRowsFirstInBucket(Long rowsFirstInBucket) {
        this.rowsFirstInBucket = rowsFirstInBucket;
    }

    public Long getRowsFirstInBucketRemoved() {
        return rowsFirstInBucketRemoved;
    }

    public void setRowsFirstInBucketRemoved(Long rowsFirstInBucketRemoved) {
        this.rowsFirstInBucketRemoved = rowsFirstInBucketRemoved;
    }

    public Long getRowsMarkedForUnlink() {
        return rowsMarkedForUnlink;
    }

    public void setRowsMarkedForUnlink(Long rowsMarkedForUnlink) {
        this.rowsMarkedForUnlink = rowsMarkedForUnlink;
    }

    public Long getParallelAssistCount() {
        return parallelAssistCount;
    }

    public void setParallelAssistCount(Long parallelAssistCount) {
        this.parallelAssistCount = parallelAssistCount;
    }

    public Long getIdleWorkerCount() {
        return idleWorkerCount;
    }

    public void setIdleWorkerCount(Long idleWorkerCount) {
        this.idleWorkerCount = idleWorkerCount;
    }

    public Long getSweepScansStarted() {
        return sweepScansStarted;
    }

    public void setSweepScansStarted(Long sweepScansStarted) {
        this.sweepScansStarted = sweepScansStarted;
    }

    public Long getSweepScanRetries() {
        return sweepScanRetries;
    }

    public void setSweepScanRetries(Long sweepScanRetries) {
        this.sweepScanRetries = sweepScanRetries;
    }

    public Long getSweepRowsTouched() {
        return sweepRowsTouched;
    }

    public void setSweepRowsTouched(Long sweepRowsTouched) {
        this.sweepRowsTouched = sweepRowsTouched;
    }

    public Long getSweepRowsExpiring() {
        return sweepRowsExpiring;
    }

    public void setSweepRowsExpiring(Long sweepRowsExpiring) {
        this.sweepRowsExpiring = sweepRowsExpiring;
    }

    public Long getSweepRowsExpired() {
        return sweepRowsExpired;
    }

    public void setSweepRowsExpired(Long sweepRowsExpired) {
        this.sweepRowsExpired = sweepRowsExpired;
    }

    public Long getSweepRowsExpiredRemoved() {
        return sweepRowsExpiredRemoved;
    }

    public void setSweepRowsExpiredRemoved(Long sweepRowsExpiredRemoved) {
        this.sweepRowsExpiredRemoved = sweepRowsExpiredRemoved;
    }
}