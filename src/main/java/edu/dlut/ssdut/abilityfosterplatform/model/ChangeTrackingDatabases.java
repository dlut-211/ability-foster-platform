package edu.dlut.ssdut.abilityfosterplatform.model;

public class ChangeTrackingDatabases {
    private Integer databaseId;

    private Byte isAutoCleanupOn;

    private Integer retentionPeriod;

    private Byte retentionPeriodUnits;

    private String retentionPeriodUnitsDesc;

    private Long maxCleanupVersion;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Byte getIsAutoCleanupOn() {
        return isAutoCleanupOn;
    }

    public void setIsAutoCleanupOn(Byte isAutoCleanupOn) {
        this.isAutoCleanupOn = isAutoCleanupOn;
    }

    public Integer getRetentionPeriod() {
        return retentionPeriod;
    }

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public Byte getRetentionPeriodUnits() {
        return retentionPeriodUnits;
    }

    public void setRetentionPeriodUnits(Byte retentionPeriodUnits) {
        this.retentionPeriodUnits = retentionPeriodUnits;
    }

    public String getRetentionPeriodUnitsDesc() {
        return retentionPeriodUnitsDesc;
    }

    public void setRetentionPeriodUnitsDesc(String retentionPeriodUnitsDesc) {
        this.retentionPeriodUnitsDesc = retentionPeriodUnitsDesc == null ? null : retentionPeriodUnitsDesc.trim();
    }

    public Long getMaxCleanupVersion() {
        return maxCleanupVersion;
    }

    public void setMaxCleanupVersion(Long maxCleanupVersion) {
        this.maxCleanupVersion = maxCleanupVersion;
    }
}