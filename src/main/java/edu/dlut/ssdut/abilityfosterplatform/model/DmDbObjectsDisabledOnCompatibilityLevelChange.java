package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbObjectsDisabledOnCompatibilityLevelChange {
    private Integer class;

    private String classDesc;

    private Integer majorId;

    private Integer minorId;

    private String dependency;

    public Integer getClass() {
        return class;
    }

    public void setClass(Integer class) {
        this.class = class;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getMinorId() {
        return minorId;
    }

    public void setMinorId(Integer minorId) {
        this.minorId = minorId;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency == null ? null : dependency.trim();
    }
}