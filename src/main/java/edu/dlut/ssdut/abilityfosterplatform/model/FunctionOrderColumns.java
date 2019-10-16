package edu.dlut.ssdut.abilityfosterplatform.model;

public class FunctionOrderColumns {
    private Integer objectId;

    private Integer orderColumnId;

    private Integer columnId;

    private Boolean isDescending;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getOrderColumnId() {
        return orderColumnId;
    }

    public void setOrderColumnId(Integer orderColumnId) {
        this.orderColumnId = orderColumnId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Boolean getIsDescending() {
        return isDescending;
    }

    public void setIsDescending(Boolean isDescending) {
        this.isDescending = isDescending;
    }
}