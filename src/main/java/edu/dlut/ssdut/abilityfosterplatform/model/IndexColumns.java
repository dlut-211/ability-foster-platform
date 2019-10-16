package edu.dlut.ssdut.abilityfosterplatform.model;

public class IndexColumns {
    private Integer objectId;

    private Integer indexId;

    private Integer indexColumnId;

    private Integer columnId;

    private Byte keyOrdinal;

    private Byte partitionOrdinal;

    private Boolean isDescendingKey;

    private Boolean isIncludedColumn;

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

    public Integer getIndexColumnId() {
        return indexColumnId;
    }

    public void setIndexColumnId(Integer indexColumnId) {
        this.indexColumnId = indexColumnId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Byte getKeyOrdinal() {
        return keyOrdinal;
    }

    public void setKeyOrdinal(Byte keyOrdinal) {
        this.keyOrdinal = keyOrdinal;
    }

    public Byte getPartitionOrdinal() {
        return partitionOrdinal;
    }

    public void setPartitionOrdinal(Byte partitionOrdinal) {
        this.partitionOrdinal = partitionOrdinal;
    }

    public Boolean getIsDescendingKey() {
        return isDescendingKey;
    }

    public void setIsDescendingKey(Boolean isDescendingKey) {
        this.isDescendingKey = isDescendingKey;
    }

    public Boolean getIsIncludedColumn() {
        return isIncludedColumn;
    }

    public void setIsIncludedColumn(Boolean isIncludedColumn) {
        this.isIncludedColumn = isIncludedColumn;
    }
}