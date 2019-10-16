package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsBufferDescriptors {
    private Integer databaseId;

    private Integer fileId;

    private Integer pageId;

    private Integer pageLevel;

    private Long allocationUnitId;

    private String pageType;

    private Integer rowCount;

    private Integer freeSpaceInBytes;

    private Boolean isModified;

    private Integer numaNode;

    private Long readMicrosec;

    private Boolean isInBpoolExtension;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getPageLevel() {
        return pageLevel;
    }

    public void setPageLevel(Integer pageLevel) {
        this.pageLevel = pageLevel;
    }

    public Long getAllocationUnitId() {
        return allocationUnitId;
    }

    public void setAllocationUnitId(Long allocationUnitId) {
        this.allocationUnitId = allocationUnitId;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType == null ? null : pageType.trim();
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getFreeSpaceInBytes() {
        return freeSpaceInBytes;
    }

    public void setFreeSpaceInBytes(Integer freeSpaceInBytes) {
        this.freeSpaceInBytes = freeSpaceInBytes;
    }

    public Boolean getIsModified() {
        return isModified;
    }

    public void setIsModified(Boolean isModified) {
        this.isModified = isModified;
    }

    public Integer getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(Integer numaNode) {
        this.numaNode = numaNode;
    }

    public Long getReadMicrosec() {
        return readMicrosec;
    }

    public void setReadMicrosec(Long readMicrosec) {
        this.readMicrosec = readMicrosec;
    }

    public Boolean getIsInBpoolExtension() {
        return isInBpoolExtension;
    }

    public void setIsInBpoolExtension(Boolean isInBpoolExtension) {
        this.isInBpoolExtension = isInBpoolExtension;
    }
}