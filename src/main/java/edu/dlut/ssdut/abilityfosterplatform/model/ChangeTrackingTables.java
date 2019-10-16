package edu.dlut.ssdut.abilityfosterplatform.model;

public class ChangeTrackingTables {
    private Integer objectId;

    private Boolean isTrackColumnsUpdatedOn;

    private Long minValidVersion;

    private Long beginVersion;

    private Long cleanupVersion;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Boolean getIsTrackColumnsUpdatedOn() {
        return isTrackColumnsUpdatedOn;
    }

    public void setIsTrackColumnsUpdatedOn(Boolean isTrackColumnsUpdatedOn) {
        this.isTrackColumnsUpdatedOn = isTrackColumnsUpdatedOn;
    }

    public Long getMinValidVersion() {
        return minValidVersion;
    }

    public void setMinValidVersion(Long minValidVersion) {
        this.minValidVersion = minValidVersion;
    }

    public Long getBeginVersion() {
        return beginVersion;
    }

    public void setBeginVersion(Long beginVersion) {
        this.beginVersion = beginVersion;
    }

    public Long getCleanupVersion() {
        return cleanupVersion;
    }

    public void setCleanupVersion(Long cleanupVersion) {
        this.cleanupVersion = cleanupVersion;
    }
}