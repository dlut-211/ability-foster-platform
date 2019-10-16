package edu.dlut.ssdut.abilityfosterplatform.model;

public class IdentityColumns {
    private Integer objectId;

    private String name;

    private Integer columnId;

    private Byte systemTypeId;

    private Integer userTypeId;

    private Short maxLength;

    private Byte precision;

    private Byte scale;

    private String collationName;

    private Boolean isNullable;

    private Boolean isAnsiPadded;

    private Boolean isRowguidcol;

    private Boolean isIdentity;

    private Boolean isFilestream;

    private Boolean isReplicated;

    private Boolean isNonSqlSubscribed;

    private Boolean isMergePublished;

    private Boolean isDtsReplicated;

    private Boolean isXmlDocument;

    private Integer xmlCollectionId;

    private Integer defaultObjectId;

    private Integer ruleObjectId;

    private Object seedValue;

    private Object incrementValue;

    private Object lastValue;

    private Boolean isNotForReplication;

    private Boolean isComputed;

    private Boolean isSparse;

    private Boolean isColumnSet;

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

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
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

    public Boolean getIsAnsiPadded() {
        return isAnsiPadded;
    }

    public void setIsAnsiPadded(Boolean isAnsiPadded) {
        this.isAnsiPadded = isAnsiPadded;
    }

    public Boolean getIsRowguidcol() {
        return isRowguidcol;
    }

    public void setIsRowguidcol(Boolean isRowguidcol) {
        this.isRowguidcol = isRowguidcol;
    }

    public Boolean getIsIdentity() {
        return isIdentity;
    }

    public void setIsIdentity(Boolean isIdentity) {
        this.isIdentity = isIdentity;
    }

    public Boolean getIsFilestream() {
        return isFilestream;
    }

    public void setIsFilestream(Boolean isFilestream) {
        this.isFilestream = isFilestream;
    }

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getIsNonSqlSubscribed() {
        return isNonSqlSubscribed;
    }

    public void setIsNonSqlSubscribed(Boolean isNonSqlSubscribed) {
        this.isNonSqlSubscribed = isNonSqlSubscribed;
    }

    public Boolean getIsMergePublished() {
        return isMergePublished;
    }

    public void setIsMergePublished(Boolean isMergePublished) {
        this.isMergePublished = isMergePublished;
    }

    public Boolean getIsDtsReplicated() {
        return isDtsReplicated;
    }

    public void setIsDtsReplicated(Boolean isDtsReplicated) {
        this.isDtsReplicated = isDtsReplicated;
    }

    public Boolean getIsXmlDocument() {
        return isXmlDocument;
    }

    public void setIsXmlDocument(Boolean isXmlDocument) {
        this.isXmlDocument = isXmlDocument;
    }

    public Integer getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(Integer xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
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

    public Object getSeedValue() {
        return seedValue;
    }

    public void setSeedValue(Object seedValue) {
        this.seedValue = seedValue;
    }

    public Object getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(Object incrementValue) {
        this.incrementValue = incrementValue;
    }

    public Object getLastValue() {
        return lastValue;
    }

    public void setLastValue(Object lastValue) {
        this.lastValue = lastValue;
    }

    public Boolean getIsNotForReplication() {
        return isNotForReplication;
    }

    public void setIsNotForReplication(Boolean isNotForReplication) {
        this.isNotForReplication = isNotForReplication;
    }

    public Boolean getIsComputed() {
        return isComputed;
    }

    public void setIsComputed(Boolean isComputed) {
        this.isComputed = isComputed;
    }

    public Boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(Boolean isSparse) {
        this.isSparse = isSparse;
    }

    public Boolean getIsColumnSet() {
        return isColumnSet;
    }

    public void setIsColumnSet(Boolean isColumnSet) {
        this.isColumnSet = isColumnSet;
    }
}