package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnColumnStoreRowGroups {
    private Integer objectId;

    private Integer indexId;

    private Integer partitionNumber;

    private Integer rowGroupId;

    private Long deltaStoreHobtId;

    private Byte state;

    private String stateDescription;

    private Long totalRows;

    private Long deletedRows;

    private Long sizeInBytes;

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

    public Integer getRowGroupId() {
        return rowGroupId;
    }

    public void setRowGroupId(Integer rowGroupId) {
        this.rowGroupId = rowGroupId;
    }

    public Long getDeltaStoreHobtId() {
        return deltaStoreHobtId;
    }

    public void setDeltaStoreHobtId(Long deltaStoreHobtId) {
        this.deltaStoreHobtId = deltaStoreHobtId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription == null ? null : stateDescription.trim();
    }

    public Long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Long totalRows) {
        this.totalRows = totalRows;
    }

    public Long getDeletedRows() {
        return deletedRows;
    }

    public void setDeletedRows(Long deletedRows) {
        this.deletedRows = deletedRows;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
}