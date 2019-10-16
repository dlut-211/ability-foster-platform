package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbXtpHashIndexStats {
    private Integer objectId;

    private Integer indexId;

    private Long totalBucketCount;

    private Long emptyBucketCount;

    private Long avgChainLength;

    private Long maxChainLength;

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

    public Long getTotalBucketCount() {
        return totalBucketCount;
    }

    public void setTotalBucketCount(Long totalBucketCount) {
        this.totalBucketCount = totalBucketCount;
    }

    public Long getEmptyBucketCount() {
        return emptyBucketCount;
    }

    public void setEmptyBucketCount(Long emptyBucketCount) {
        this.emptyBucketCount = emptyBucketCount;
    }

    public Long getAvgChainLength() {
        return avgChainLength;
    }

    public void setAvgChainLength(Long avgChainLength) {
        this.avgChainLength = avgChainLength;
    }

    public Long getMaxChainLength() {
        return maxChainLength;
    }

    public void setMaxChainLength(Long maxChainLength) {
        this.maxChainLength = maxChainLength;
    }
}