package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbPartitionStats {
    private Long partitionId;

    private Integer objectId;

    private Integer indexId;

    private Integer partitionNumber;

    private Long inRowDataPageCount;

    private Long inRowUsedPageCount;

    private Long inRowReservedPageCount;

    private Long lobUsedPageCount;

    private Long lobReservedPageCount;

    private Long rowOverflowUsedPageCount;

    private Long rowOverflowReservedPageCount;

    private Long usedPageCount;

    private Long reservedPageCount;

    private Long rowCount;

    public Long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Long partitionId) {
        this.partitionId = partitionId;
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

    public Long getInRowDataPageCount() {
        return inRowDataPageCount;
    }

    public void setInRowDataPageCount(Long inRowDataPageCount) {
        this.inRowDataPageCount = inRowDataPageCount;
    }

    public Long getInRowUsedPageCount() {
        return inRowUsedPageCount;
    }

    public void setInRowUsedPageCount(Long inRowUsedPageCount) {
        this.inRowUsedPageCount = inRowUsedPageCount;
    }

    public Long getInRowReservedPageCount() {
        return inRowReservedPageCount;
    }

    public void setInRowReservedPageCount(Long inRowReservedPageCount) {
        this.inRowReservedPageCount = inRowReservedPageCount;
    }

    public Long getLobUsedPageCount() {
        return lobUsedPageCount;
    }

    public void setLobUsedPageCount(Long lobUsedPageCount) {
        this.lobUsedPageCount = lobUsedPageCount;
    }

    public Long getLobReservedPageCount() {
        return lobReservedPageCount;
    }

    public void setLobReservedPageCount(Long lobReservedPageCount) {
        this.lobReservedPageCount = lobReservedPageCount;
    }

    public Long getRowOverflowUsedPageCount() {
        return rowOverflowUsedPageCount;
    }

    public void setRowOverflowUsedPageCount(Long rowOverflowUsedPageCount) {
        this.rowOverflowUsedPageCount = rowOverflowUsedPageCount;
    }

    public Long getRowOverflowReservedPageCount() {
        return rowOverflowReservedPageCount;
    }

    public void setRowOverflowReservedPageCount(Long rowOverflowReservedPageCount) {
        this.rowOverflowReservedPageCount = rowOverflowReservedPageCount;
    }

    public Long getUsedPageCount() {
        return usedPageCount;
    }

    public void setUsedPageCount(Long usedPageCount) {
        this.usedPageCount = usedPageCount;
    }

    public Long getReservedPageCount() {
        return reservedPageCount;
    }

    public void setReservedPageCount(Long reservedPageCount) {
        this.reservedPageCount = reservedPageCount;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }
}