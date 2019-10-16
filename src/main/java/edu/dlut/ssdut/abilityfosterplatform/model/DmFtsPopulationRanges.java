package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsPopulationRanges {
    private Boolean isRetry;

    private Short sessionId;

    private Integer processedRowCount;

    private Integer errorCount;

    public Boolean getIsRetry() {
        return isRetry;
    }

    public void setIsRetry(Boolean isRetry) {
        this.isRetry = isRetry;
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getProcessedRowCount() {
        return processedRowCount;
    }

    public void setProcessedRowCount(Integer processedRowCount) {
        this.processedRowCount = processedRowCount;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }
}