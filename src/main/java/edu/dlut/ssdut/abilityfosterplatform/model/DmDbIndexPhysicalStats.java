package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbIndexPhysicalStats {
    private Short databaseId;

    private Integer objectId;

    private Integer indexId;

    private Integer partitionNumber;

    private String indexTypeDesc;

    private String allocUnitTypeDesc;

    private Byte indexDepth;

    private Byte indexLevel;

    private Double avgFragmentationInPercent;

    private Long fragmentCount;

    private Double avgFragmentSizeInPages;

    private Long pageCount;

    private Double avgPageSpaceUsedInPercent;

    private Long recordCount;

    private Long ghostRecordCount;

    private Long versionGhostRecordCount;

    private Integer minRecordSizeInBytes;

    private Integer maxRecordSizeInBytes;

    private Double avgRecordSizeInBytes;

    private Long forwardedRecordCount;

    private Long compressedPageCount;

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

    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public String getIndexTypeDesc() {
        return indexTypeDesc;
    }

    public void setIndexTypeDesc(String indexTypeDesc) {
        this.indexTypeDesc = indexTypeDesc == null ? null : indexTypeDesc.trim();
    }

    public String getAllocUnitTypeDesc() {
        return allocUnitTypeDesc;
    }

    public void setAllocUnitTypeDesc(String allocUnitTypeDesc) {
        this.allocUnitTypeDesc = allocUnitTypeDesc == null ? null : allocUnitTypeDesc.trim();
    }

    public Byte getIndexDepth() {
        return indexDepth;
    }

    public void setIndexDepth(Byte indexDepth) {
        this.indexDepth = indexDepth;
    }

    public Byte getIndexLevel() {
        return indexLevel;
    }

    public void setIndexLevel(Byte indexLevel) {
        this.indexLevel = indexLevel;
    }

    public Double getAvgFragmentationInPercent() {
        return avgFragmentationInPercent;
    }

    public void setAvgFragmentationInPercent(Double avgFragmentationInPercent) {
        this.avgFragmentationInPercent = avgFragmentationInPercent;
    }

    public Long getFragmentCount() {
        return fragmentCount;
    }

    public void setFragmentCount(Long fragmentCount) {
        this.fragmentCount = fragmentCount;
    }

    public Double getAvgFragmentSizeInPages() {
        return avgFragmentSizeInPages;
    }

    public void setAvgFragmentSizeInPages(Double avgFragmentSizeInPages) {
        this.avgFragmentSizeInPages = avgFragmentSizeInPages;
    }

    public Long getPageCount() {
        return pageCount;
    }

    public void setPageCount(Long pageCount) {
        this.pageCount = pageCount;
    }

    public Double getAvgPageSpaceUsedInPercent() {
        return avgPageSpaceUsedInPercent;
    }

    public void setAvgPageSpaceUsedInPercent(Double avgPageSpaceUsedInPercent) {
        this.avgPageSpaceUsedInPercent = avgPageSpaceUsedInPercent;
    }

    public Long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
    }

    public Long getGhostRecordCount() {
        return ghostRecordCount;
    }

    public void setGhostRecordCount(Long ghostRecordCount) {
        this.ghostRecordCount = ghostRecordCount;
    }

    public Long getVersionGhostRecordCount() {
        return versionGhostRecordCount;
    }

    public void setVersionGhostRecordCount(Long versionGhostRecordCount) {
        this.versionGhostRecordCount = versionGhostRecordCount;
    }

    public Integer getMinRecordSizeInBytes() {
        return minRecordSizeInBytes;
    }

    public void setMinRecordSizeInBytes(Integer minRecordSizeInBytes) {
        this.minRecordSizeInBytes = minRecordSizeInBytes;
    }

    public Integer getMaxRecordSizeInBytes() {
        return maxRecordSizeInBytes;
    }

    public void setMaxRecordSizeInBytes(Integer maxRecordSizeInBytes) {
        this.maxRecordSizeInBytes = maxRecordSizeInBytes;
    }

    public Double getAvgRecordSizeInBytes() {
        return avgRecordSizeInBytes;
    }

    public void setAvgRecordSizeInBytes(Double avgRecordSizeInBytes) {
        this.avgRecordSizeInBytes = avgRecordSizeInBytes;
    }

    public Long getForwardedRecordCount() {
        return forwardedRecordCount;
    }

    public void setForwardedRecordCount(Long forwardedRecordCount) {
        this.forwardedRecordCount = forwardedRecordCount;
    }

    public Long getCompressedPageCount() {
        return compressedPageCount;
    }

    public void setCompressedPageCount(Long compressedPageCount) {
        this.compressedPageCount = compressedPageCount;
    }
}