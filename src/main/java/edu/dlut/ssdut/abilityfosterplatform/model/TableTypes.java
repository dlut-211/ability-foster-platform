package edu.dlut.ssdut.abilityfosterplatform.model;

public class TableTypes {
    private String name;

    private Byte systemTypeId;

    private Integer userTypeId;

    private Integer schemaId;

    private Integer principalId;

    private Short maxLength;

    private Byte precision;

    private Byte scale;

    private String collationName;

    private Boolean isNullable;

    private Boolean isUserDefined;

    private Boolean isAssemblyType;

    private Integer defaultObjectId;

    private Integer ruleObjectId;

    private Boolean isTableType;

    private Integer typeTableObjectId;

    private Boolean isMemoryOptimized;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
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

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public Boolean getIsUserDefined() {
        return isUserDefined;
    }

    public void setIsUserDefined(Boolean isUserDefined) {
        this.isUserDefined = isUserDefined;
    }

    public Boolean getIsAssemblyType() {
        return isAssemblyType;
    }

    public void setIsAssemblyType(Boolean isAssemblyType) {
        this.isAssemblyType = isAssemblyType;
    }

    public Integer getDefaultObjectId() {
        return defaultObjectId;
    }

    public void setDefaultObjectId(Integer defaultObjectId) {
        this.defaultObjectId = defaultObjectId;
    }

    public Integer getRuleObjectId() {
        return ruleObjectId;
    }

    public void setRuleObjectId(Integer ruleObjectId) {
        this.ruleObjectId = ruleObjectId;
    }

    public Boolean getIsTableType() {
        return isTableType;
    }

    public void setIsTableType(Boolean isTableType) {
        this.isTableType = isTableType;
    }

    public Integer getTypeTableObjectId() {
        return typeTableObjectId;
    }

    public void setTypeTableObjectId(Integer typeTableObjectId) {
        this.typeTableObjectId = typeTableObjectId;
    }

    public Boolean getIsMemoryOptimized() {
        return isMemoryOptimized;
    }

    public void setIsMemoryOptimized(Boolean isMemoryOptimized) {
        this.isMemoryOptimized = isMemoryOptimized;
    }
}