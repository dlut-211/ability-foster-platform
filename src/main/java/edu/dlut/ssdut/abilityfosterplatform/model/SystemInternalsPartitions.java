package edu.dlut.ssdut.abilityfosterplatform.model;

public class SystemInternalsPartitions {
    private Long partitionId;

    private Integer objectId;

    private Integer indexId;

    private Integer partitionNumber;

    private Long rows;

    private Short filestreamFilegroupId;

    private Boolean isOrphaned;

    private Byte droppedLobColumnState;

    private Boolean isUnique;

    private Boolean isReplicated;

    private Boolean isLoggedForReplication;

    private Boolean isSereplicated;

    private Short maxNullBitUsed;

    private Integer maxLeafLength;

    private Short minLeafLength;

    private Short maxInternalLength;

    private Short minInternalLength;

    private Boolean allowsNullableKeys;

    private Boolean allowRowLocks;

    private Boolean allowPageLocks;

    private Boolean isDataRowFormat;

    private Boolean isNotVersioned;

    private String filestreamGuid;

    private Byte ownertype;

    private Boolean isColumnstore;

    public Long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Long partitionId) {
        this.partitionId = partitionId;
    }

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

    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public Short getFilestreamFilegroupId() {
        return filestreamFilegroupId;
    }

    public void setFilestreamFilegroupId(Short filestreamFilegroupId) {
        this.filestreamFilegroupId = filestreamFilegroupId;
    }

    public Boolean getIsOrphaned() {
        return isOrphaned;
    }

    public void setIsOrphaned(Boolean isOrphaned) {
        this.isOrphaned = isOrphaned;
    }

    public Byte getDroppedLobColumnState() {
        return droppedLobColumnState;
    }

    public void setDroppedLobColumnState(Byte droppedLobColumnState) {
        this.droppedLobColumnState = droppedLobColumnState;
    }

    public Boolean getIsUnique() {
        return isUnique;
    }

    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
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

    public Boolean getIsSereplicated() {
        return isSereplicated;
    }

    public void setIsSereplicated(Boolean isSereplicated) {
        this.isSereplicated = isSereplicated;
    }

    public Short getMaxNullBitUsed() {
        return maxNullBitUsed;
    }

    public void setMaxNullBitUsed(Short maxNullBitUsed) {
        this.maxNullBitUsed = maxNullBitUsed;
    }

    public Integer getMaxLeafLength() {
        return maxLeafLength;
    }

    public void setMaxLeafLength(Integer maxLeafLength) {
        this.maxLeafLength = maxLeafLength;
    }

    public Short getMinLeafLength() {
        return minLeafLength;
    }

    public void setMinLeafLength(Short minLeafLength) {
        this.minLeafLength = minLeafLength;
    }

    public Short getMaxInternalLength() {
        return maxInternalLength;
    }

    public void setMaxInternalLength(Short maxInternalLength) {
        this.maxInternalLength = maxInternalLength;
    }

    public Short getMinInternalLength() {
        return minInternalLength;
    }

    public void setMinInternalLength(Short minInternalLength) {
        this.minInternalLength = minInternalLength;
    }

    public Boolean getAllowsNullableKeys() {
        return allowsNullableKeys;
    }

    public void setAllowsNullableKeys(Boolean allowsNullableKeys) {
        this.allowsNullableKeys = allowsNullableKeys;
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

    public Boolean getIsDataRowFormat() {
        return isDataRowFormat;
    }

    public void setIsDataRowFormat(Boolean isDataRowFormat) {
        this.isDataRowFormat = isDataRowFormat;
    }

    public Boolean getIsNotVersioned() {
        return isNotVersioned;
    }

    public void setIsNotVersioned(Boolean isNotVersioned) {
        this.isNotVersioned = isNotVersioned;
    }

    public String getFilestreamGuid() {
        return filestreamGuid;
    }

    public void setFilestreamGuid(String filestreamGuid) {
        this.filestreamGuid = filestreamGuid == null ? null : filestreamGuid.trim();
    }

    public Byte getOwnertype() {
        return ownertype;
    }

    public void setOwnertype(Byte ownertype) {
        this.ownertype = ownertype;
    }

    public Boolean getIsColumnstore() {
        return isColumnstore;
    }

    public void setIsColumnstore(Boolean isColumnstore) {
        this.isColumnstore = isColumnstore;
    }
}