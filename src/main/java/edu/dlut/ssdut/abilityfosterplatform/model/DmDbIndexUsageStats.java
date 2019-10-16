package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmDbIndexUsageStats {
    private Short databaseId;

    private Integer objectId;

    private Integer indexId;

    private Long userSeeks;

    private Long userScans;

    private Long userLookups;

    private Long userUpdates;

    private Date lastUserSeek;

    private Date lastUserScan;

    private Date lastUserLookup;

    private Date lastUserUpdate;

    private Long systemSeeks;

    private Long systemScans;

    private Long systemLookups;

    private Long systemUpdates;

    private Date lastSystemSeek;

    private Date lastSystemScan;

    private Date lastSystemLookup;

    private Date lastSystemUpdate;

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

    public Long getUserLookups() {
        return userLookups;
    }

    public void setUserLookups(Long userLookups) {
        this.userLookups = userLookups;
    }

    public Long getUserUpdates() {
        return userUpdates;
    }

    public void setUserUpdates(Long userUpdates) {
        this.userUpdates = userUpdates;
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

    public Date getLastUserLookup() {
        return lastUserLookup;
    }

    public void setLastUserLookup(Date lastUserLookup) {
        this.lastUserLookup = lastUserLookup;
    }

    public Date getLastUserUpdate() {
        return lastUserUpdate;
    }

    public void setLastUserUpdate(Date lastUserUpdate) {
        this.lastUserUpdate = lastUserUpdate;
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

    public Long getSystemLookups() {
        return systemLookups;
    }

    public void setSystemLookups(Long systemLookups) {
        this.systemLookups = systemLookups;
    }

    public Long getSystemUpdates() {
        return systemUpdates;
    }

    public void setSystemUpdates(Long systemUpdates) {
        this.systemUpdates = systemUpdates;
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

    public Date getLastSystemLookup() {
        return lastSystemLookup;
    }

    public void setLastSystemLookup(Date lastSystemLookup) {
        this.lastSystemLookup = lastSystemLookup;
    }

    public Date getLastSystemUpdate() {
        return lastSystemUpdate;
    }

    public void setLastSystemUpdate(Date lastSystemUpdate) {
        this.lastSystemUpdate = lastSystemUpdate;
    }
}