package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Assemblies {
    private String name;

    private Integer principalId;

    private Integer assemblyId;

    private String clrName;

    private Byte permissionSet;

    private String permissionSetDesc;

    private Boolean isVisible;

    private Date createDate;

    private Date modifyDate;

    private Boolean isUserDefined;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Integer getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(Integer assemblyId) {
        this.assemblyId = assemblyId;
    }

    public String getClrName() {
        return clrName;
    }

    public void setClrName(String clrName) {
        this.clrName = clrName == null ? null : clrName.trim();
    }

    public Byte getPermissionSet() {
        return permissionSet;
    }

    public void setPermissionSet(Byte permissionSet) {
        this.permissionSet = permissionSet;
    }

    public String getPermissionSetDesc() {
        return permissionSetDesc;
    }

    public void setPermissionSetDesc(String permissionSetDesc) {
        this.permissionSetDesc = permissionSetDesc == null ? null : permissionSetDesc.trim();
    }

    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
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

    public Boolean getIsUserDefined() {
        return isUserDefined;
    }

    public void setIsUserDefined(Boolean isUserDefined) {
        this.isUserDefined = isUserDefined;
    }
}