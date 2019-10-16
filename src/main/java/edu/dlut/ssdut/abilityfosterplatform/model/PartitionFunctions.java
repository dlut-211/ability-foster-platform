package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class PartitionFunctions {
    private String name;

    private Integer functionId;

    private String type;

    private String typeDesc;

    private Integer fanout;

    private Boolean boundaryValueOnRight;

    private Boolean isSystem;

    private Date createDate;

    private Date modifyDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
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

    public Integer getFanout() {
        return fanout;
    }

    public void setFanout(Integer fanout) {
        this.fanout = fanout;
    }

    public Boolean getBoundaryValueOnRight() {
        return boundaryValueOnRight;
    }

    public void setBoundaryValueOnRight(Boolean boundaryValueOnRight) {
        this.boundaryValueOnRight = boundaryValueOnRight;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
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
}