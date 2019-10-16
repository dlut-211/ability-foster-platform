package edu.dlut.ssdut.abilityfosterplatform.model;

public class CryptProperties {
    private Byte class;

    private String classDesc;

    private Integer majorId;

    private String cryptType;

    private String cryptTypeDesc;

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

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getCryptType() {
        return cryptType;
    }

    public void setCryptType(String cryptType) {
        this.cryptType = cryptType == null ? null : cryptType.trim();
    }

    public String getCryptTypeDesc() {
        return cryptTypeDesc;
    }

    public void setCryptTypeDesc(String cryptTypeDesc) {
        this.cryptTypeDesc = cryptTypeDesc == null ? null : cryptTypeDesc.trim();
    }
}