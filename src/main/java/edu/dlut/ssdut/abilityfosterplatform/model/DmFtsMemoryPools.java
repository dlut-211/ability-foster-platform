package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsMemoryPools {
    private Integer poolId;

    private Integer bufferSize;

    private Integer minBufferLimit;

    private Integer maxBufferLimit;

    private Integer bufferCount;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Integer getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(Integer bufferSize) {
        this.bufferSize = bufferSize;
    }

    public Integer getMinBufferLimit() {
        return minBufferLimit;
    }

    public void setMinBufferLimit(Integer minBufferLimit) {
        this.minBufferLimit = minBufferLimit;
    }

    public Integer getMaxBufferLimit() {
        return maxBufferLimit;
    }

    public void setMaxBufferLimit(Integer maxBufferLimit) {
        this.maxBufferLimit = maxBufferLimit;
    }

    public Integer getBufferCount() {
        return bufferCount;
    }

    public void setBufferCount(Integer bufferCount) {
        this.bufferCount = bufferCount;
    }
}