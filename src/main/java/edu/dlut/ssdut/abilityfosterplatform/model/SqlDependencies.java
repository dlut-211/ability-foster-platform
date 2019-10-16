package edu.dlut.ssdut.abilityfosterplatform.model;

public class SqlDependencies {
    private Byte class;

    private String classDesc;

    private Integer objectId;

    private Integer columnId;

    private Integer referencedMajorId;

    private Integer referencedMinorId;

    private Boolean isSelected;

    private Boolean isUpdated;

    private Boolean isSelectAll;

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getReferencedMajorId() {
        return referencedMajorId;
    }

    public void setReferencedMajorId(Integer referencedMajorId) {
        this.referencedMajorId = referencedMajorId;
    }

    public Integer getReferencedMinorId() {
        return referencedMinorId;
    }

    public void setReferencedMinorId(Integer referencedMinorId) {
        this.referencedMinorId = referencedMinorId;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Boolean getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(Boolean isUpdated) {
        this.isUpdated = isUpdated;
    }

    public Boolean getIsSelectAll() {
        return isSelectAll;
    }

    public void setIsSelectAll(Boolean isSelectAll) {
        this.isSelectAll = isSelectAll;
    }
}