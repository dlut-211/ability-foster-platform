package edu.dlut.ssdut.abilityfosterplatform.model;

public class HashIndexes {
    private Integer objectId;

    private String name;

    private Integer indexId;

    private Byte type;

    private String typeDesc;

    private Boolean isUnique;

    private Integer dataSpaceId;

    private Boolean ignoreDupKey;

    private Boolean isPrimaryKey;

    private Boolean isUniqueConstraint;

    private Byte fillFactor;

    private Boolean isPadded;

    private Boolean isDisabled;

    private Boolean isHypothetical;

    private Boolean allowRowLocks;

    private Boolean allowPageLocks;

    private Boolean hasFilter;

    private String filterDefinition;

    private Integer bucketCount;

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

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Boolean getIsUnique() {
        return isUnique;
    }

    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    public Integer getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(Integer dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public Boolean getIgnoreDupKey() {
        return ignoreDupKey;
    }

    public void setIgnoreDupKey(Boolean ignoreDupKey) {
        this.ignoreDupKey = ignoreDupKey;
    }

    public Boolean getIsPrimaryKey() {
        return isPrimaryKey;
    }

    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public Boolean getIsUniqueConstraint() {
        return isUniqueConstraint;
    }

    public void setIsUniqueConstraint(Boolean isUniqueConstraint) {
        this.isUniqueConstraint = isUniqueConstraint;
    }

    public Byte getFillFactor() {
        return fillFactor;
    }

    public void setFillFactor(Byte fillFactor) {
        this.fillFactor = fillFactor;
    }

    public Boolean getIsPadded() {
        return isPadded;
    }

    public void setIsPadded(Boolean isPadded) {
        this.isPadded = isPadded;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsHypothetical() {
        return isHypothetical;
    }

    public void setIsHypothetical(Boolean isHypothetical) {
        this.isHypothetical = isHypothetical;
    }

    public Boolean getAllowRowLocks() {
        return allowRowLocks;
    }

    public void setAllowRowLocks(Boolean allowRowLocks) {
        this.allowRowLocks = allowRowLocks;
    }

    public Boolean getAllowPageLocks() {
        return allowPageLocks;
    }

    public void setAllowPageLocks(Boolean allowPageLocks) {
        this.allowPageLocks = allowPageLocks;
    }

    public Boolean getHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(Boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public String getFilterDefinition() {
        return filterDefinition;
    }

    public void setFilterDefinition(String filterDefinition) {
        this.filterDefinition = filterDefinition == null ? null : filterDefinition.trim();
    }

    public Integer getBucketCount() {
        return bucketCount;
    }

    public void setBucketCount(Integer bucketCount) {
        this.bucketCount = bucketCount;
    }
}