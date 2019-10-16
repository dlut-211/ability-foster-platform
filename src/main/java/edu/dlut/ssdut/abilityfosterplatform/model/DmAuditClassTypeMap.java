package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmAuditClassTypeMap {
    private String classType;

    private String classTypeDesc;

    private String securableClassDesc;

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType == null ? null : classType.trim();
    }

    public String getClassTypeDesc() {
        return classTypeDesc;
    }

    public void setClassTypeDesc(String classTypeDesc) {
        this.classTypeDesc = classTypeDesc == null ? null : classTypeDesc.trim();
    }

    public String getSecurableClassDesc() {
        return securableClassDesc;
    }

    public void setSecurableClassDesc(String securableClassDesc) {
        this.securableClassDesc = securableClassDesc == null ? null : securableClassDesc.trim();
    }
}