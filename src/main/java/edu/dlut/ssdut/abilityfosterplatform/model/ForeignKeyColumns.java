package edu.dlut.ssdut.abilityfosterplatform.model;

public class ForeignKeyColumns {
    private Integer constraintObjectId;

    private Integer constraintColumnId;

    private Integer parentObjectId;

    private Integer parentColumnId;

    private Integer referencedObjectId;

    private Integer referencedColumnId;

    public Integer getConstraintObjectId() {
        return constraintObjectId;
    }

    public void setConstraintObjectId(Integer constraintObjectId) {
        this.constraintObjectId = constraintObjectId;
    }

    public Integer getConstraintColumnId() {
        return constraintColumnId;
    }

    public void setConstraintColumnId(Integer constraintColumnId) {
        this.constraintColumnId = constraintColumnId;
    }

    public Integer getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(Integer parentObjectId) {
        this.parentObjectId = parentObjectId;
    }

    public Integer getParentColumnId() {
        return parentColumnId;
    }

    public void setParentColumnId(Integer parentColumnId) {
        this.parentColumnId = parentColumnId;
    }

    public Integer getReferencedObjectId() {
        return referencedObjectId;
    }

    public void setReferencedObjectId(Integer referencedObjectId) {
        this.referencedObjectId = referencedObjectId;
    }

    public Integer getReferencedColumnId() {
        return referencedColumnId;
    }

    public void setReferencedColumnId(Integer referencedColumnId) {
        this.referencedColumnId = referencedColumnId;
    }
}