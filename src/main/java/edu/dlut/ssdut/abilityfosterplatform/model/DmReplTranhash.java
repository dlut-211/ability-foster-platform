package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmReplTranhash {
    private Integer buckets;

    private Integer hashedTrans;

    private Integer completedTrans;

    private Integer compensatedTrans;

    private String firstBeginLsn;

    private String lastCommitLsn;

    public Integer getBuckets() {
        return buckets;
    }

    public void setBuckets(Integer buckets) {
        this.buckets = buckets;
    }

    public Integer getHashedTrans() {
        return hashedTrans;
    }

    public void setHashedTrans(Integer hashedTrans) {
        this.hashedTrans = hashedTrans;
    }

    public Integer getCompletedTrans() {
        return completedTrans;
    }

    public void setCompletedTrans(Integer completedTrans) {
        this.completedTrans = completedTrans;
    }

    public Integer getCompensatedTrans() {
        return compensatedTrans;
    }

    public void setCompensatedTrans(Integer compensatedTrans) {
        this.compensatedTrans = compensatedTrans;
    }

    public String getFirstBeginLsn() {
        return firstBeginLsn;
    }

    public void setFirstBeginLsn(String firstBeginLsn) {
        this.firstBeginLsn = firstBeginLsn == null ? null : firstBeginLsn.trim();
    }

    public String getLastCommitLsn() {
        return lastCommitLsn;
    }

    public void setLastCommitLsn(String lastCommitLsn) {
        this.lastCommitLsn = lastCommitLsn == null ? null : lastCommitLsn.trim();
    }
}