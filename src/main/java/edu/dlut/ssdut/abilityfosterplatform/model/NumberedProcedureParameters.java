package edu.dlut.ssdut.abilityfosterplatform.model;

public class NumberedProcedureParameters {
    private Integer objectId;

    private Short procedureNumber;

    private String name;

    private Integer parameterId;

    private Byte systemTypeId;

    private Integer userTypeId;

    private Short maxLength;

    private Byte precision;

    private Byte scale;

    private Boolean isOutput;

    private Boolean isCursorRef;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Short getProcedureNumber() {
        return procedureNumber;
    }

    public void setProcedureNumber(Short procedureNumber) {
        this.procedureNumber = procedureNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
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

    public Boolean getIsOutput() {
        return isOutput;
    }

    public void setIsOutput(Boolean isOutput) {
        this.isOutput = isOutput;
    }

    public Boolean getIsCursorRef() {
        return isCursorRef;
    }

    public void setIsCursorRef(Boolean isCursorRef) {
        this.isCursorRef = isCursorRef;
    }
}