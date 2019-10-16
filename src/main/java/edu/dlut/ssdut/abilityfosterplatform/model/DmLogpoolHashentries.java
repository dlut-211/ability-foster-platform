package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmLogpoolHashentries {
    private Integer bucketNo;

    private Integer databaseId;

    private Integer recoveryUnitId;

    private Long logBlockId;

    private byte[] cacheBuffer;

    public Integer getBucketNo() {
        return bucketNo;
    }

    public void setBucketNo(Integer bucketNo) {
        this.bucketNo = bucketNo;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getRecoveryUnitId() {
        return recoveryUnitId;
    }

    public void setRecoveryUnitId(Integer recoveryUnitId) {
        this.recoveryUnitId = recoveryUnitId;
    }

    public Long getLogBlockId() {
        return logBlockId;
    }

    public void setLogBlockId(Long logBlockId) {
        this.logBlockId = logBlockId;
    }

    public byte[] getCacheBuffer() {
        return cacheBuffer;
    }

    public void setCacheBuffer(byte[] cacheBuffer) {
        this.cacheBuffer = cacheBuffer;
    }
}