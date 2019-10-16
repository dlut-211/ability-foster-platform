package edu.dlut.ssdut.abilityfosterplatform.model;

public class ColumnStoreSegments {
    private Long partitionId;

    private Long hobtId;

    private Integer columnId;

    private Integer segmentId;

    private Integer version;

    private Integer encodingType;

    private Integer rowCount;

    private Boolean hasNulls;

    private Long baseId;

    private Double magnitude;

    private Integer primaryDictionaryId;

    private Integer secondaryDictionaryId;

    private Long minDataId;

    private Long maxDataId;

    private Long nullValue;

    private Long onDiskSize;

    public Long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Long partitionId) {
        this.partitionId = partitionId;
    }

    public Long getHobtId() {
        return hobtId;
    }

    public void setHobtId(Long hobtId) {
        this.hobtId = hobtId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(Integer encodingType) {
        this.encodingType = encodingType;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Boolean getHasNulls() {
        return hasNulls;
    }

    public void setHasNulls(Boolean hasNulls) {
        this.hasNulls = hasNulls;
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Double magnitude) {
        this.magnitude = magnitude;
    }

    public Integer getPrimaryDictionaryId() {
        return primaryDictionaryId;
    }

    public void setPrimaryDictionaryId(Integer primaryDictionaryId) {
        this.primaryDictionaryId = primaryDictionaryId;
    }

    public Integer getSecondaryDictionaryId() {
        return secondaryDictionaryId;
    }

    public void setSecondaryDictionaryId(Integer secondaryDictionaryId) {
        this.secondaryDictionaryId = secondaryDictionaryId;
    }

    public Long getMinDataId() {
        return minDataId;
    }

    public void setMinDataId(Long minDataId) {
        this.minDataId = minDataId;
    }

    public Long getMaxDataId() {
        return maxDataId;
    }

    public void setMaxDataId(Long maxDataId) {
        this.maxDataId = maxDataId;
    }

    public Long getNullValue() {
        return nullValue;
    }

    public void setNullValue(Long nullValue) {
        this.nullValue = nullValue;
    }

    public Long getOnDiskSize() {
        return onDiskSize;
    }

    public void setOnDiskSize(Long onDiskSize) {
        this.onDiskSize = onDiskSize;
    }
}