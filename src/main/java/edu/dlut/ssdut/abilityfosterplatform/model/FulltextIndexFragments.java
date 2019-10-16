package edu.dlut.ssdut.abilityfosterplatform.model;

public class FulltextIndexFragments {
    private Integer tableId;

    private Integer fragmentId;

    private Integer fragmentObjectId;

    private Integer status;

    private Long dataSize;

    private Long rowCount;

    private byte[] timestamp;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getFragmentId() {
        return fragmentId;
    }

    public void setFragmentId(Integer fragmentId) {
        this.fragmentId = fragmentId;
    }

    public Integer getFragmentObjectId() {
        return fragmentObjectId;
    }

    public void setFragmentObjectId(Integer fragmentObjectId) {
        this.fragmentObjectId = fragmentObjectId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getDataSize() {
        return dataSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }
}