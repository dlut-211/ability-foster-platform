package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecQueryProfiles {
    private Short sessionId;

    private Integer requestId;

    private String physicalOperatorName;

    private Integer nodeId;

    private Integer threadId;

    private Long rowCount;

    private Long rewindCount;

    private Long rebindCount;

    private Long endOfScanCount;

    private Long estimateRowCount;

    private Long firstActiveTime;

    private Long lastActiveTime;

    private Long openTime;

    private Long firstRowTime;

    private Long lastRowTime;

    private Long closeTime;

    private Long elapsedTimeMs;

    private Long cpuTimeMs;

    private Short databaseId;

    private Integer objectId;

    private Integer indexId;

    private Long scanCount;

    private Long logicalReadCount;

    private Long physicalReadCount;

    private Long readAheadCount;

    private Long writePageCount;

    private Long lobLogicalReadCount;

    private Long lobPhysicalReadCount;

    private Long lobReadAheadCount;

    private Integer segmentReadCount;

    private Integer segmentSkipCount;

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getPhysicalOperatorName() {
        return physicalOperatorName;
    }

    public void setPhysicalOperatorName(String physicalOperatorName) {
        this.physicalOperatorName = physicalOperatorName == null ? null : physicalOperatorName.trim();
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    public Long getRewindCount() {
        return rewindCount;
    }

    public void setRewindCount(Long rewindCount) {
        this.rewindCount = rewindCount;
    }

    public Long getRebindCount() {
        return rebindCount;
    }

    public void setRebindCount(Long rebindCount) {
        this.rebindCount = rebindCount;
    }

    public Long getEndOfScanCount() {
        return endOfScanCount;
    }

    public void setEndOfScanCount(Long endOfScanCount) {
        this.endOfScanCount = endOfScanCount;
    }

    public Long getEstimateRowCount() {
        return estimateRowCount;
    }

    public void setEstimateRowCount(Long estimateRowCount) {
        this.estimateRowCount = estimateRowCount;
    }

    public Long getFirstActiveTime() {
        return firstActiveTime;
    }

    public void setFirstActiveTime(Long firstActiveTime) {
        this.firstActiveTime = firstActiveTime;
    }

    public Long getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Long lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public Long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Long openTime) {
        this.openTime = openTime;
    }

    public Long getFirstRowTime() {
        return firstRowTime;
    }

    public void setFirstRowTime(Long firstRowTime) {
        this.firstRowTime = firstRowTime;
    }

    public Long getLastRowTime() {
        return lastRowTime;
    }

    public void setLastRowTime(Long lastRowTime) {
        this.lastRowTime = lastRowTime;
    }

    public Long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
    }

    public Long getElapsedTimeMs() {
        return elapsedTimeMs;
    }

    public void setElapsedTimeMs(Long elapsedTimeMs) {
        this.elapsedTimeMs = elapsedTimeMs;
    }

    public Long getCpuTimeMs() {
        return cpuTimeMs;
    }

    public void setCpuTimeMs(Long cpuTimeMs) {
        this.cpuTimeMs = cpuTimeMs;
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Long getScanCount() {
        return scanCount;
    }

    public void setScanCount(Long scanCount) {
        this.scanCount = scanCount;
    }

    public Long getLogicalReadCount() {
        return logicalReadCount;
    }

    public void setLogicalReadCount(Long logicalReadCount) {
        this.logicalReadCount = logicalReadCount;
    }

    public Long getPhysicalReadCount() {
        return physicalReadCount;
    }

    public void setPhysicalReadCount(Long physicalReadCount) {
        this.physicalReadCount = physicalReadCount;
    }

    public Long getReadAheadCount() {
        return readAheadCount;
    }

    public void setReadAheadCount(Long readAheadCount) {
        this.readAheadCount = readAheadCount;
    }

    public Long getWritePageCount() {
        return writePageCount;
    }

    public void setWritePageCount(Long writePageCount) {
        this.writePageCount = writePageCount;
    }

    public Long getLobLogicalReadCount() {
        return lobLogicalReadCount;
    }

    public void setLobLogicalReadCount(Long lobLogicalReadCount) {
        this.lobLogicalReadCount = lobLogicalReadCount;
    }

    public Long getLobPhysicalReadCount() {
        return lobPhysicalReadCount;
    }

    public void setLobPhysicalReadCount(Long lobPhysicalReadCount) {
        this.lobPhysicalReadCount = lobPhysicalReadCount;
    }

    public Long getLobReadAheadCount() {
        return lobReadAheadCount;
    }

    public void setLobReadAheadCount(Long lobReadAheadCount) {
        this.lobReadAheadCount = lobReadAheadCount;
    }

    public Integer getSegmentReadCount() {
        return segmentReadCount;
    }

    public void setSegmentReadCount(Integer segmentReadCount) {
        this.segmentReadCount = segmentReadCount;
    }

    public Integer getSegmentSkipCount() {
        return segmentSkipCount;
    }

    public void setSegmentSkipCount(Integer segmentSkipCount) {
        this.segmentSkipCount = segmentSkipCount;
    }
}