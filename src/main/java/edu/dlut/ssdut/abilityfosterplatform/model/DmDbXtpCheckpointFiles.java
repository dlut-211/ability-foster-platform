package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class DmDbXtpCheckpointFiles {
    private Integer containerId;

    private String containerGuid;

    private String checkpointFileId;

    private String relativeFilePath;

    private Short fileType;

    private String fileTypeDesc;

    private Integer internalStorageSlot;

    private String checkpointPairFileId;

    private Long fileSizeInBytes;

    private Long fileSizeUsedInBytes;

    private Long insertedRowCount;

    private Long deletedRowCount;

    private Long dropTableDeletedRowCount;

    private Short state;

    private String stateDesc;

    private Long lowerBoundTsn;

    private Long upperBoundTsn;

    private Integer lastBackupPageCount;

    private Long deltaWatermarkTsn;

    private BigDecimal lastCheckpointRecoveryLsn;

    private BigDecimal tombstoneOperationLsn;

    private Long logicalDeletionLogBlockId;

    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public String getContainerGuid() {
        return containerGuid;
    }

    public void setContainerGuid(String containerGuid) {
        this.containerGuid = containerGuid == null ? null : containerGuid.trim();
    }

    public String getCheckpointFileId() {
        return checkpointFileId;
    }

    public void setCheckpointFileId(String checkpointFileId) {
        this.checkpointFileId = checkpointFileId == null ? null : checkpointFileId.trim();
    }

    public String getRelativeFilePath() {
        return relativeFilePath;
    }

    public void setRelativeFilePath(String relativeFilePath) {
        this.relativeFilePath = relativeFilePath == null ? null : relativeFilePath.trim();
    }

    public Short getFileType() {
        return fileType;
    }

    public void setFileType(Short fileType) {
        this.fileType = fileType;
    }

    public String getFileTypeDesc() {
        return fileTypeDesc;
    }

    public void setFileTypeDesc(String fileTypeDesc) {
        this.fileTypeDesc = fileTypeDesc == null ? null : fileTypeDesc.trim();
    }

    public Integer getInternalStorageSlot() {
        return internalStorageSlot;
    }

    public void setInternalStorageSlot(Integer internalStorageSlot) {
        this.internalStorageSlot = internalStorageSlot;
    }

    public String getCheckpointPairFileId() {
        return checkpointPairFileId;
    }

    public void setCheckpointPairFileId(String checkpointPairFileId) {
        this.checkpointPairFileId = checkpointPairFileId == null ? null : checkpointPairFileId.trim();
    }

    public Long getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    public void setFileSizeInBytes(Long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
    }

    public Long getFileSizeUsedInBytes() {
        return fileSizeUsedInBytes;
    }

    public void setFileSizeUsedInBytes(Long fileSizeUsedInBytes) {
        this.fileSizeUsedInBytes = fileSizeUsedInBytes;
    }

    public Long getInsertedRowCount() {
        return insertedRowCount;
    }

    public void setInsertedRowCount(Long insertedRowCount) {
        this.insertedRowCount = insertedRowCount;
    }

    public Long getDeletedRowCount() {
        return deletedRowCount;
    }

    public void setDeletedRowCount(Long deletedRowCount) {
        this.deletedRowCount = deletedRowCount;
    }

    public Long getDropTableDeletedRowCount() {
        return dropTableDeletedRowCount;
    }

    public void setDropTableDeletedRowCount(Long dropTableDeletedRowCount) {
        this.dropTableDeletedRowCount = dropTableDeletedRowCount;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public Long getLowerBoundTsn() {
        return lowerBoundTsn;
    }

    public void setLowerBoundTsn(Long lowerBoundTsn) {
        this.lowerBoundTsn = lowerBoundTsn;
    }

    public Long getUpperBoundTsn() {
        return upperBoundTsn;
    }

    public void setUpperBoundTsn(Long upperBoundTsn) {
        this.upperBoundTsn = upperBoundTsn;
    }

    public Integer getLastBackupPageCount() {
        return lastBackupPageCount;
    }

    public void setLastBackupPageCount(Integer lastBackupPageCount) {
        this.lastBackupPageCount = lastBackupPageCount;
    }

    public Long getDeltaWatermarkTsn() {
        return deltaWatermarkTsn;
    }

    public void setDeltaWatermarkTsn(Long deltaWatermarkTsn) {
        this.deltaWatermarkTsn = deltaWatermarkTsn;
    }

    public BigDecimal getLastCheckpointRecoveryLsn() {
        return lastCheckpointRecoveryLsn;
    }

    public void setLastCheckpointRecoveryLsn(BigDecimal lastCheckpointRecoveryLsn) {
        this.lastCheckpointRecoveryLsn = lastCheckpointRecoveryLsn;
    }

    public BigDecimal getTombstoneOperationLsn() {
        return tombstoneOperationLsn;
    }

    public void setTombstoneOperationLsn(BigDecimal tombstoneOperationLsn) {
        this.tombstoneOperationLsn = tombstoneOperationLsn;
    }

    public Long getLogicalDeletionLogBlockId() {
        return logicalDeletionLogBlockId;
    }

    public void setLogicalDeletionLogBlockId(Long logicalDeletionLogBlockId) {
        this.logicalDeletionLogBlockId = logicalDeletionLogBlockId;
    }
}