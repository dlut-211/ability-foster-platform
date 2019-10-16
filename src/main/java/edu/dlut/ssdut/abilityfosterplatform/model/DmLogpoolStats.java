package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmLogpoolStats {
    private Long hashHitTotalSearchLength;

    private Long hashMissTotalSearchLength;

    private Long hashHits;

    private Long hashMisses;

    private Integer hashBucketCount;

    private Long memStatusStamp;

    private Integer memStatus;

    private Integer logpoolmgrCount;

    private Long totalPages;

    private Long privatePages;

    public Long getHashHitTotalSearchLength() {
        return hashHitTotalSearchLength;
    }

    public void setHashHitTotalSearchLength(Long hashHitTotalSearchLength) {
        this.hashHitTotalSearchLength = hashHitTotalSearchLength;
    }

    public Long getHashMissTotalSearchLength() {
        return hashMissTotalSearchLength;
    }

    public void setHashMissTotalSearchLength(Long hashMissTotalSearchLength) {
        this.hashMissTotalSearchLength = hashMissTotalSearchLength;
    }

    public Long getHashHits() {
        return hashHits;
    }

    public void setHashHits(Long hashHits) {
        this.hashHits = hashHits;
    }

    public Long getHashMisses() {
        return hashMisses;
    }

    public void setHashMisses(Long hashMisses) {
        this.hashMisses = hashMisses;
    }

    public Integer getHashBucketCount() {
        return hashBucketCount;
    }

    public void setHashBucketCount(Integer hashBucketCount) {
        this.hashBucketCount = hashBucketCount;
    }

    public Long getMemStatusStamp() {
        return memStatusStamp;
    }

    public void setMemStatusStamp(Long memStatusStamp) {
        this.memStatusStamp = memStatusStamp;
    }

    public Integer getMemStatus() {
        return memStatus;
    }

    public void setMemStatus(Integer memStatus) {
        this.memStatus = memStatus;
    }

    public Integer getLogpoolmgrCount() {
        return logpoolmgrCount;
    }

    public void setLogpoolmgrCount(Integer logpoolmgrCount) {
        this.logpoolmgrCount = logpoolmgrCount;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getPrivatePages() {
        return privatePages;
    }

    public void setPrivatePages(Long privatePages) {
        this.privatePages = privatePages;
    }
}