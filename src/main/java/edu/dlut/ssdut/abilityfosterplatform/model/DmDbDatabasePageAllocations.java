package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbDatabasePageAllocations {
    private Integer databaseId;

    private Integer objectId;

    private Integer indexId;

    private Integer partitionId;

    private Long rowsetId;

    private Long allocationUnitId;

    private Integer allocationUnitType;

    private String allocationUnitTypeDesc;

    private Integer dataCloneId;

    private Integer cloneState;

    private String cloneStateDesc;

    private Short extentFileId;

    private Integer extentPageId;

    private Short allocatedPageIamFileId;

    private Integer allocatedPageIamPageId;

    private Short allocatedPageFileId;

    private Integer allocatedPagePageId;

    private Byte isAllocated;

    private Byte isIamPage;

    private Byte isMixedPageAllocation;

    private Integer pageFreeSpacePercent;

    private Integer pageType;

    private String pageTypeDesc;

    private Byte pageLevel;

    private Short nextPageFileId;

    private Integer nextPagePageId;

    private Short previousPageFileId;

    private Integer previousPagePageId;

    private Byte isPageCompressed;

    private Byte hasGhostRecords;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
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

    public Integer getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Integer partitionId) {
        this.partitionId = partitionId;
    }

    public Long getRowsetId() {
        return rowsetId;
    }

    public void setRowsetId(Long rowsetId) {
        this.rowsetId = rowsetId;
    }

    public Long getAllocationUnitId() {
        return allocationUnitId;
    }

    public void setAllocationUnitId(Long allocationUnitId) {
        this.allocationUnitId = allocationUnitId;
    }

    public Integer getAllocationUnitType() {
        return allocationUnitType;
    }

    public void setAllocationUnitType(Integer allocationUnitType) {
        this.allocationUnitType = allocationUnitType;
    }

    public String getAllocationUnitTypeDesc() {
        return allocationUnitTypeDesc;
    }

    public void setAllocationUnitTypeDesc(String allocationUnitTypeDesc) {
        this.allocationUnitTypeDesc = allocationUnitTypeDesc == null ? null : allocationUnitTypeDesc.trim();
    }

    public Integer getDataCloneId() {
        return dataCloneId;
    }

    public void setDataCloneId(Integer dataCloneId) {
        this.dataCloneId = dataCloneId;
    }

    public Integer getCloneState() {
        return cloneState;
    }

    public void setCloneState(Integer cloneState) {
        this.cloneState = cloneState;
    }

    public String getCloneStateDesc() {
        return cloneStateDesc;
    }

    public void setCloneStateDesc(String cloneStateDesc) {
        this.cloneStateDesc = cloneStateDesc == null ? null : cloneStateDesc.trim();
    }

    public Short getExtentFileId() {
        return extentFileId;
    }

    public void setExtentFileId(Short extentFileId) {
        this.extentFileId = extentFileId;
    }

    public Integer getExtentPageId() {
        return extentPageId;
    }

    public void setExtentPageId(Integer extentPageId) {
        this.extentPageId = extentPageId;
    }

    public Short getAllocatedPageIamFileId() {
        return allocatedPageIamFileId;
    }

    public void setAllocatedPageIamFileId(Short allocatedPageIamFileId) {
        this.allocatedPageIamFileId = allocatedPageIamFileId;
    }

    public Integer getAllocatedPageIamPageId() {
        return allocatedPageIamPageId;
    }

    public void setAllocatedPageIamPageId(Integer allocatedPageIamPageId) {
        this.allocatedPageIamPageId = allocatedPageIamPageId;
    }

    public Short getAllocatedPageFileId() {
        return allocatedPageFileId;
    }

    public void setAllocatedPageFileId(Short allocatedPageFileId) {
        this.allocatedPageFileId = allocatedPageFileId;
    }

    public Integer getAllocatedPagePageId() {
        return allocatedPagePageId;
    }

    public void setAllocatedPagePageId(Integer allocatedPagePageId) {
        this.allocatedPagePageId = allocatedPagePageId;
    }

    public Byte getIsAllocated() {
        return isAllocated;
    }

    public void setIsAllocated(Byte isAllocated) {
        this.isAllocated = isAllocated;
    }

    public Byte getIsIamPage() {
        return isIamPage;
    }

    public void setIsIamPage(Byte isIamPage) {
        this.isIamPage = isIamPage;
    }

    public Byte getIsMixedPageAllocation() {
        return isMixedPageAllocation;
    }

    public void setIsMixedPageAllocation(Byte isMixedPageAllocation) {
        this.isMixedPageAllocation = isMixedPageAllocation;
    }

    public Integer getPageFreeSpacePercent() {
        return pageFreeSpacePercent;
    }

    public void setPageFreeSpacePercent(Integer pageFreeSpacePercent) {
        this.pageFreeSpacePercent = pageFreeSpacePercent;
    }

    public Integer getPageType() {
        return pageType;
    }

    public void setPageType(Integer pageType) {
        this.pageType = pageType;
    }

    public String getPageTypeDesc() {
        return pageTypeDesc;
    }

    public void setPageTypeDesc(String pageTypeDesc) {
        this.pageTypeDesc = pageTypeDesc == null ? null : pageTypeDesc.trim();
    }

    public Byte getPageLevel() {
        return pageLevel;
    }

    public void setPageLevel(Byte pageLevel) {
        this.pageLevel = pageLevel;
    }

    public Short getNextPageFileId() {
        return nextPageFileId;
    }

    public void setNextPageFileId(Short nextPageFileId) {
        this.nextPageFileId = nextPageFileId;
    }

    public Integer getNextPagePageId() {
        return nextPagePageId;
    }

    public void setNextPagePageId(Integer nextPagePageId) {
        this.nextPagePageId = nextPagePageId;
    }

    public Short getPreviousPageFileId() {
        return previousPageFileId;
    }

    public void setPreviousPageFileId(Short previousPageFileId) {
        this.previousPageFileId = previousPageFileId;
    }

    public Integer getPreviousPagePageId() {
        return previousPagePageId;
    }

    public void setPreviousPagePageId(Integer previousPagePageId) {
        this.previousPagePageId = previousPagePageId;
    }

    public Byte getIsPageCompressed() {
        return isPageCompressed;
    }

    public void setIsPageCompressed(Byte isPageCompressed) {
        this.isPageCompressed = isPageCompressed;
    }

    public Byte getHasGhostRecords() {
        return hasGhostRecords;
    }

    public void setHasGhostRecords(Byte hasGhostRecords) {
        this.hasGhostRecords = hasGhostRecords;
    }
}