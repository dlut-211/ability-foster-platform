package edu.dlut.ssdut.abilityfosterplatform.model;

public class SelectiveXmlIndexPaths {
    private Integer objectId;

    private Integer indexId;

    private Integer pathId;

    private String path;

    private String name;

    private Byte pathType;

    private String pathTypeDesc;

    private Integer xmlComponentId;

    private String xqueryTypeDescription;

    private Boolean isXqueryTypeInferred;

    private Integer xqueryMaxLength;

    private Boolean isXqueryMaxLengthInferred;

    private Boolean isNode;

    private Byte systemTypeId;

    private Byte userTypeId;

    private Short maxLength;

    private Byte precision;

    private Byte scale;

    private String collationName;

    private Boolean isSingleton;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getPathType() {
        return pathType;
    }

    public void setPathType(Byte pathType) {
        this.pathType = pathType;
    }

    public String getPathTypeDesc() {
        return pathTypeDesc;
    }

    public void setPathTypeDesc(String pathTypeDesc) {
        this.pathTypeDesc = pathTypeDesc == null ? null : pathTypeDesc.trim();
    }

    public Integer getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(Integer xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public String getXqueryTypeDescription() {
        return xqueryTypeDescription;
    }

    public void setXqueryTypeDescription(String xqueryTypeDescription) {
        this.xqueryTypeDescription = xqueryTypeDescription == null ? null : xqueryTypeDescription.trim();
    }

    public Boolean getIsXqueryTypeInferred() {
        return isXqueryTypeInferred;
    }

    public void setIsXqueryTypeInferred(Boolean isXqueryTypeInferred) {
        this.isXqueryTypeInferred = isXqueryTypeInferred;
    }

    public Integer getXqueryMaxLength() {
        return xqueryMaxLength;
    }

    public void setXqueryMaxLength(Integer xqueryMaxLength) {
        this.xqueryMaxLength = xqueryMaxLength;
    }

    public Boolean getIsXqueryMaxLengthInferred() {
        return isXqueryMaxLengthInferred;
    }

    public void setIsXqueryMaxLengthInferred(Boolean isXqueryMaxLengthInferred) {
        this.isXqueryMaxLengthInferred = isXqueryMaxLengthInferred;
    }

    public Boolean getIsNode() {
        return isNode;
    }

    public void setIsNode(Boolean isNode) {
        this.isNode = isNode;
    }

    public Byte getSystemTypeId() {
        return systemTypeId;
    }

    public void setSystemTypeId(Byte systemTypeId) {
        this.systemTypeId = systemTypeId;
    }

    public Byte getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Byte userTypeId) {
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

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName == null ? null : collationName.trim();
    }

    public Boolean getIsSingleton() {
        return isSingleton;
    }

    public void setIsSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
    }
}