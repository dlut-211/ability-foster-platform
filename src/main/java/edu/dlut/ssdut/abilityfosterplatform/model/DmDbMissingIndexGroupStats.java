package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmDbMissingIndexGroupStats {
    private Integer groupHandle;

    private Long uniqueCompiles;

    private Long userSeeks;

    private Long userScans;

    private Date lastUserSeek;

    private Date lastUserScan;

    private Double avgTotalUserCost;

    private Double avgUserImpact;

    private Long systemSeeks;

    private Long systemScans;

    private Date lastSystemSeek;

    private Date lastSystemScan;

    private Double avgTotalSystemCost;

    private Double avgSystemImpact;

    public Integer getGroupHandle() {
        return groupHandle;
    }

    public void setGroupHandle(Integer groupHandle) {
        this.groupHandle = groupHandle;
    }

    public Long getUniqueCompiles() {
        return uniqueCompiles;
    }

    public void setUniqueCompiles(Long uniqueCompiles) {
        this.uniqueCompiles = uniqueCompiles;
    }

    public Long getUserSeeks() {
        return userSeeks;
    }

    public void setUserSeeks(Long userSeeks) {
        this.userSeeks = userSeeks;
    }

    public Long getUserScans() {
        return userScans;
    }

    public void setUserScans(Long userScans) {
        this.userScans = userScans;
    }

    public Date getLastUserSeek() {
        return lastUserSeek;
    }

    public void setLastUserSeek(Date lastUserSeek) {
        this.lastUserSeek = lastUserSeek;
    }

    public Date getLastUserScan() {
        return lastUserScan;
    }

    public void setLastUserScan(Date lastUserScan) {
        this.lastUserScan = lastUserScan;
    }

    public Double getAvgTotalUserCost() {
        return avgTotalUserCost;
    }

    public void setAvgTotalUserCost(Double avgTotalUserCost) {
        this.avgTotalUserCost = avgTotalUserCost;
    }

    public Double getAvgUserImpact() {
        return avgUserImpact;
    }

    public void setAvgUserImpact(Double avgUserImpact) {
        this.avgUserImpact = avgUserImpact;
    }

    public Long getSystemSeeks() {
        return systemSeeks;
    }

    public void setSystemSeeks(Long systemSeeks) {
        this.systemSeeks = systemSeeks;
    }

    public Long getSystemScans() {
        return systemScans;
    }

    public void setSystemScans(Long systemScans) {
        this.systemScans = systemScans;
    }

    public Date getLastSystemSeek() {
        return lastSystemSeek;
    }

    public void setLastSystemSeek(Date lastSystemSeek) {
        this.lastSystemSeek = lastSystemSeek;
    }

    public Date getLastSystemScan() {
        return lastSystemScan;
    }

    public void setLastSystemScan(Date lastSystemScan) {
        this.lastSystemScan = lastSystemScan;
    }

    public Double getAvgTotalSystemCost() {
        return avgTotalSystemCost;
    }

    public void setAvgTotalSystemCost(Double avgTotalSystemCost) {
        this.avgTotalSystemCost = avgTotalSystemCost;
    }

    public Double getAvgSystemImpact() {
        return avgSystemImpact;
    }

    public void setAvgSystemImpact(Double avgSystemImpact) {
        this.avgSystemImpact = avgSystemImpact;
    }
}