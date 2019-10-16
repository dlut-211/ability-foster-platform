package edu.dlut.ssdut.abilityfosterplatform.model;

public class PartitionParameters {
    private Integer functionId;

    private Integer parameterId;

    private Byte systemTypeId;

    private Short maxLength;

    private Byte precision;

    private Byte scale;

    private String collationName;

    private Integer userTypeId;

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public Byte getSystemTypeId() {
        return systemTypeId;
    }

    public void setSystemTypeId(Byte systemTypeId) {
        this.systemTypeId = systemTypeId;
    }

    public Short getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Short maxLength) {
        this.maxLength = maxLength;
    }

    public Byte getPrecision() {
        return precision;
    }

    public void setPrecision(Byte precision) {
        this.precision = precision;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName == null ? null : collationName.trim();
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }
}