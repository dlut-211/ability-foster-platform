package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmTranTopVersionGenerators {
    private Short databaseId;

    private Long rowsetId;

    private Integer aggregatedRecordLengthInBytes;

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Long getRowsetId() {
        return rowsetId;
    }

    public void setRowsetId(Long rowsetId) {
        this.rowsetId = rowsetId;
    }

    public Integer getAggregatedRecordLengthInBytes() {
        return aggregatedRecordLengthInBytes;
    }

    public void setAggregatedRecordLengthInBytes(Integer aggregatedRecordLengthInBytes) {
        this.aggregatedRecordLengthInBytes = aggregatedRecordLengthInBytes;
    }
}