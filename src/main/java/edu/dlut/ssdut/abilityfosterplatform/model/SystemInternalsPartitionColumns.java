package edu.dlut.ssdut.abilityfosterplatform.model;

public class SystemInternalsPartitionColumns {
    private Long partitionId;

    private Integer partitionColumnId;

    private Long modifiedCount;

    private Short maxInrowLength;

    private Boolean isReplicated;

    private Boolean isLoggedForReplication;

    private Boolean isDropped;

    private Byte systemTypeId;

    private Short maxLength;

    private Byte precision;

    private Byte scale;

    private String collationName;

    private Boolean isFilestream;

    private Short keyOrdinal;

    private Boolean isNullable;

    private Boolean isDescendingKey;

    private Boolean isUniqueifier;

    private Short leafOffset;

    private Short internalOffset;

    private Byte leafBitPosition;

    private Byte internalBitPosition;

    private Short leafNullBit;

    private Short internalNullBit;

    private Boolean isAntiMatter;

    private String partitionColumnGuid;

    private Boolean isSparse;

    private Boolean hasDefault;

    private Object defaultValue;

    public Long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Long partitionId) {
        this.partitionId = partitionId;
    }

    public Integer getPartitionColumnId() {
        return partitionColumnId;
    }

    public void setPartitionColumnId(Integer partitionColumnId) {
        this.partitionColumnId = partitionColumnId;
    }

    public Long getModifiedCount() {
        return modifiedCount;
    }

    public void setModifiedCount(Long modifiedCount) {
        this.modifiedCount = modifiedCount;
    }

    public Short getMaxInrowLength() {
        return maxInrowLength;
    }

    public void setMaxInrowLength(Short maxInrowLength) {
        this.maxInrowLength = maxInrowLength;
    }

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getIsLoggedForReplication() {
        return isLoggedForReplication;
    }

    public void setIsLoggedForReplication(Boolean isLoggedForReplication) {
        this.isLoggedForReplication = isLoggedForReplication;
    }

    public Boolean getIsDropped() {
        return isDropped;
    }

    public void setIsDropped(Boolean isDropped) {
        this.isDropped = isDropped;
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

    public Boolean getIsFilestream() {
        return isFilestream;
    }

    public void setIsFilestream(Boolean isFilestream) {
        this.isFilestream = isFilestream;
    }

    public Short getKeyOrdinal() {
        return keyOrdinal;
    }

    public void setKeyOrdinal(Short keyOrdinal) {
        this.keyOrdinal = keyOrdinal;
    }

    public Boolean getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    public Boolean getIsDescendingKey() {
        return isDescendingKey;
    }

    public void setIsDescendingKey(Boolean isDescendingKey) {
        this.isDescendingKey = isDescendingKey;
    }

    public Boolean getIsUniqueifier() {
        return isUniqueifier;
    }

    public void setIsUniqueifier(Boolean isUniqueifier) {
        this.isUniqueifier = isUniqueifier;
    }

    public Short getLeafOffset() {
        return leafOffset;
    }

    public void setLeafOffset(Short leafOffset) {
        this.leafOffset = leafOffset;
    }

    public Short getInternalOffset() {
        return internalOffset;
    }

    public void setInternalOffset(Short internalOffset) {
        this.internalOffset = internalOffset;
    }

    public Byte getLeafBitPosition() {
        return leafBitPosition;
    }

    public void setLeafBitPosition(Byte leafBitPosition) {
        this.leafBitPosition = leafBitPosition;
    }

    public Byte getInternalBitPosition() {
        return internalBitPosition;
    }

    public void setInternalBitPosition(Byte internalBitPosition) {
        this.internalBitPosition = internalBitPosition;
    }

    public Short getLeafNullBit() {
        return leafNullBit;
    }

    public void setLeafNullBit(Short leafNullBit) {
        this.leafNullBit = leafNullBit;
    }

    public Short getInternalNullBit() {
        return internalNullBit;
    }

    public void setInternalNullBit(Short internalNullBit) {
        this.internalNullBit = internalNullBit;
    }

    public Boolean getIsAntiMatter() {
        return isAntiMatter;
    }

    public void setIsAntiMatter(Boolean isAntiMatter) {
        this.isAntiMatter = isAntiMatter;
    }

    public String getPartitionColumnGuid() {
        return partitionColumnGuid;
    }

    public void setPartitionColumnGuid(String partitionColumnGuid) {
        this.partitionColumnGuid = partitionColumnGuid == null ? null : partitionColumnGuid.trim();
    }

    public Boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(Boolean isSparse) {
        this.isSparse = isSparse;
    }

    public Boolean getHasDefault() {
        return hasDefault;
    }

    public void setHasDefault(Boolean hasDefault) {
        this.hasDefault = hasDefault;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }
}