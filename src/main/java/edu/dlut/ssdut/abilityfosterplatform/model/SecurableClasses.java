package edu.dlut.ssdut.abilityfosterplatform.model;

public class SecurableClasses {
    private String classDesc;

    private Integer class;

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public Integer getClass() {
        return class;
    }

    public void setClass(Integer class) {
        this.class = class;
    }
}