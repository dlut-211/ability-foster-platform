package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class FulltextIndexes {
    private Integer objectId;

    private Integer uniqueIndexId;

    private Integer fulltextCatalogId;

    private Boolean isEnabled;

    private String changeTrackingState;

    private String changeTrackingStateDesc;

    private Boolean hasCrawlCompleted;

    private String crawlType;

    private String crawlTypeDesc;

    private Date crawlStartDate;

    private Date crawlEndDate;

    private Integer stoplistId;

    private Integer propertyListId;

    private Integer dataSpaceId;

    private byte[] incrementalTimestamp;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getUniqueIndexId() {
        return uniqueIndexId;
    }

    public void setUniqueIndexId(Integer uniqueIndexId) {
        this.uniqueIndexId = uniqueIndexId;
    }

    public Integer getFulltextCatalogId() {
        return fulltextCatalogId;
    }

    public void setFulltextCatalogId(Integer fulltextCatalogId) {
        this.fulltextCatalogId = fulltextCatalogId;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getChangeTrackingState() {
        return changeTrackingState;
    }

    public void setChangeTrackingState(String changeTrackingState) {
        this.changeTrackingState = changeTrackingState == null ? null : changeTrackingState.trim();
    }

    public String getChangeTrackingStateDesc() {
        return changeTrackingStateDesc;
    }

    public void setChangeTrackingStateDesc(String changeTrackingStateDesc) {
        this.changeTrackingStateDesc = changeTrackingStateDesc == null ? null : changeTrackingStateDesc.trim();
    }

    public Boolean getHasCrawlCompleted() {
        return hasCrawlCompleted;
    }

    public void setHasCrawlCompleted(Boolean hasCrawlCompleted) {
        this.hasCrawlCompleted = hasCrawlCompleted;
    }

    public String getCrawlType() {
        return crawlType;
    }

    public void setCrawlType(String crawlType) {
        this.crawlType = crawlType == null ? null : crawlType.trim();
    }

    public String getCrawlTypeDesc() {
        return crawlTypeDesc;
    }

    public void setCrawlTypeDesc(String crawlTypeDesc) {
        this.crawlTypeDesc = crawlTypeDesc == null ? null : crawlTypeDesc.trim();
    }

    public Date getCrawlStartDate() {
        return crawlStartDate;
    }

    public void setCrawlStartDate(Date crawlStartDate) {
        this.crawlStartDate = crawlStartDate;
    }

    public Date getCrawlEndDate() {
        return crawlEndDate;
    }

    public void setCrawlEndDate(Date crawlEndDate) {
        this.crawlEndDate = crawlEndDate;
    }

    public Integer getStoplistId() {
        return stoplistId;
    }

    public void setStoplistId(Integer stoplistId) {
        this.stoplistId = stoplistId;
    }

    public Integer getPropertyListId() {
        return propertyListId;
    }

    public void setPropertyListId(Integer propertyListId) {
        this.propertyListId = propertyListId;
    }

    public Integer getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(Integer dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public byte[] getIncrementalTimestamp() {
        return incrementalTimestamp;
    }

    public void setIncrementalTimestamp(byte[] incrementalTimestamp) {
        this.incrementalTimestamp = incrementalTimestamp;
    }
}