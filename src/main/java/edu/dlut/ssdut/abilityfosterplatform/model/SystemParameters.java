package edu.dlut.ssdut.abilityfosterplatform.model;

public class SystemParameters {
    private Integer objectId;

    private String name;

    private Integer parameterId;

    private Byte systemTypeId;

    private Integer userTypeId;

    private Short maxLength;

    private Byte precision;

    private Byte scale;

    private Boolean isOutput;

    private Boolean isCursorRef;

    private Boolean hasDefaultValue;

    private Boolean isXmlDocument;

    private Object defaultValue;

    private Integer xmlCollectionId;

    private Boolean isReadonly;

    private Boolean isNullable;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
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

    public Boolean getHasDefaultValue() {
        return hasDefaultValue;
    }

    public void setHasDefaultValue(Boolean hasDefaultValue) {
        this.hasDefaultValue = hasDefaultValue;
    }

    public Boolean getIsXmlDocument() {
        return isXmlDocument;
    }

    public void setIsXmlDocument(Boolean isXmlDocument) {
        this.isXmlDocument = isXmlDocument;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Integer getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(Integer xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public Boolean getIsReadonly() {
        return isReadonly;
    }

    public void setIsReadonly(Boolean isReadonly) {
        this.isReadonly = isReadonly;
    }

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }
}