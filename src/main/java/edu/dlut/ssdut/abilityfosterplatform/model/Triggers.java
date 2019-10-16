package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Triggers {
    private String name;

    private Integer objectId;

    private Byte parentClass;

    private String parentClassDesc;

    private Integer parentId;

    private String type;

    private String typeDesc;

    private Date createDate;

    private Date modifyDate;

    private Boolean isMsShipped;

    private Boolean isDisabled;

    private Boolean isNotForReplication;

    private Boolean isInsteadOfTrigger;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Byte getParentClass() {
        return parentClass;
    }

    public void setParentClass(Byte parentClass) {
        this.parentClass = parentClass;
    }

    public String getParentClassDesc() {
        return parentClassDesc;
    }

    public void setParentClassDesc(String parentClassDesc) {
        this.parentClassDesc = parentClassDesc == null ? null : parentClassDesc.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(Boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsNotForReplication() {
        return isNotForReplication;
    }

    public void setIsNotForReplication(Boolean isNotForReplication) {
        this.isNotForReplication = isNotForReplication;
    }

    public Boolean getIsInsteadOfTrigger() {
        return isInsteadOfTrigger;
    }

    public void setIsInsteadOfTrigger(Boolean isInsteadOfTrigger) {
        this.isInsteadOfTrigger = isInsteadOfTrigger;
    }
}