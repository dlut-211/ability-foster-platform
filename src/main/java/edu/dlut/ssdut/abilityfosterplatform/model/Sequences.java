package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sequences {
    private String name;

    private Integer objectId;

    private Integer principalId;

    private Integer schemaId;

    private Integer parentObjectId;

    private String type;

    private String typeDesc;

    private Date createDate;

    private Date modifyDate;

    private Boolean isMsShipped;

    private Boolean isPublished;

    private Boolean isSchemaPublished;

    private Object startValue;

    private Object increment;

    private Object minimumValue;

    private Object maximumValue;

    private Boolean isCycling;

    private Boolean isCached;

    private Integer cacheSize;

    private Byte systemTypeId;

    private Integer userTypeId;

    private Byte precision;

    private Byte scale;

    private Object currentValue;

    private Boolean isExhausted;

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

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Integer getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(Integer parentObjectId) {
        this.parentObjectId = parentObjectId;
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

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(Boolean isSchemaPublished) {
        this.isSchemaPublished = isSchemaPublished;
    }

    public Object getStartValue() {
        return startValue;
    }

    public void setStartValue(Object startValue) {
        this.startValue = startValue;
    }

    public Object getIncrement() {
        return increment;
    }

    public void setIncrement(Object increment) {
        this.increment = increment;
    }

    public Object getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(Object minimumValue) {
        this.minimumValue = minimumValue;
    }

    public Object getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Object maximumValue) {
        this.maximumValue = maximumValue;
    }

    public Boolean getIsCycling() {
        return isCycling;
    }

    public void setIsCycling(Boolean isCycling) {
        this.isCycling = isCycling;
    }

    public Boolean getIsCached() {
        return isCached;
    }

    public void setIsCached(Boolean isCached) {
        this.isCached = isCached;
    }

    public Integer getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(Integer cacheSize) {
        this.cacheSize = cacheSize;
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

    public Object getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Object currentValue) {
        this.currentValue = currentValue;
    }

    public Boolean getIsExhausted() {
        return isExhausted;
    }

    public void setIsExhausted(Boolean isExhausted) {
        this.isExhausted = isExhausted;
    }
}