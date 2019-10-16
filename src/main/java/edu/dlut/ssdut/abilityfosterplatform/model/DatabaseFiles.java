package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;
import java.util.Date;

public class DatabaseFiles {
    private Integer fileId;

    private String fileGuid;

    private Byte type;

    private String typeDesc;

    private Integer dataSpaceId;

    private String name;

    private String physicalName;

    private Byte state;

    private String stateDesc;

    private Integer size;

    private Integer maxSize;

    private Integer growth;

    private Boolean isMediaReadOnly;

    private Boolean isReadOnly;

    private Boolean isSparse;

    private Boolean isPercentGrowth;

    private Boolean isNameReserved;

    private BigDecimal createLsn;

    private BigDecimal dropLsn;

    private BigDecimal readOnlyLsn;

    private BigDecimal readWriteLsn;

    private BigDecimal differentialBaseLsn;

    private String differentialBaseGuid;

    private Date differentialBaseTime;

    private BigDecimal redoStartLsn;

    private String redoStartForkGuid;

    private BigDecimal redoTargetLsn;

    private String redoTargetForkGuid;

    private BigDecimal backupLsn;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileGuid() {
        return fileGuid;
    }

    public void setFileGuid(String fileGuid) {
        this.fileGuid = fileGuid == null ? null : fileGuid.trim();
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

    public Integer getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(Integer dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhysicalName() {
        return physicalName;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName == null ? null : physicalName.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Boolean getIsMediaReadOnly() {
        return isMediaReadOnly;
    }

    public void setIsMediaReadOnly(Boolean isMediaReadOnly) {
        this.isMediaReadOnly = isMediaReadOnly;
    }

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public Boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(Boolean isSparse) {
        this.isSparse = isSparse;
    }

    public Boolean getIsPercentGrowth() {
        return isPercentGrowth;
    }

    public void setIsPercentGrowth(Boolean isPercentGrowth) {
        this.isPercentGrowth = isPercentGrowth;
    }

    public Boolean getIsNameReserved() {
        return isNameReserved;
    }

    public void setIsNameReserved(Boolean isNameReserved) {
        this.isNameReserved = isNameReserved;
    }

    public BigDecimal getCreateLsn() {
        return createLsn;
    }

    public void setCreateLsn(BigDecimal createLsn) {
        this.createLsn = createLsn;
    }

    public BigDecimal getDropLsn() {
        return dropLsn;
    }

    public void setDropLsn(BigDecimal dropLsn) {
        this.dropLsn = dropLsn;
    }

    public BigDecimal getReadOnlyLsn() {
        return readOnlyLsn;
    }

    public void setReadOnlyLsn(BigDecimal readOnlyLsn) {
        this.readOnlyLsn = readOnlyLsn;
    }

    public BigDecimal getReadWriteLsn() {
        return readWriteLsn;
    }

    public void setReadWriteLsn(BigDecimal readWriteLsn) {
        this.readWriteLsn = readWriteLsn;
    }

    public BigDecimal getDifferentialBaseLsn() {
        return differentialBaseLsn;
    }

    public void setDifferentialBaseLsn(BigDecimal differentialBaseLsn) {
        this.differentialBaseLsn = differentialBaseLsn;
    }

    public String getDifferentialBaseGuid() {
        return differentialBaseGuid;
    }

    public void setDifferentialBaseGuid(String differentialBaseGuid) {
        this.differentialBaseGuid = differentialBaseGuid == null ? null : differentialBaseGuid.trim();
    }

    public Date getDifferentialBaseTime() {
        return differentialBaseTime;
    }

    public void setDifferentialBaseTime(Date differentialBaseTime) {
        this.differentialBaseTime = differentialBaseTime;
    }

    public BigDecimal getRedoStartLsn() {
        return redoStartLsn;
    }

    public void setRedoStartLsn(BigDecimal redoStartLsn) {
        this.redoStartLsn = redoStartLsn;
    }

    public String getRedoStartForkGuid() {
        return redoStartForkGuid;
    }

    public void setRedoStartForkGuid(String redoStartForkGuid) {
        this.redoStartForkGuid = redoStartForkGuid == null ? null : redoStartForkGuid.trim();
    }

    public BigDecimal getRedoTargetLsn() {
        return redoTargetLsn;
    }

    public void setRedoTargetLsn(BigDecimal redoTargetLsn) {
        this.redoTargetLsn = redoTargetLsn;
    }

    public String getRedoTargetForkGuid() {
        return redoTargetForkGuid;
    }

    public void setRedoTargetForkGuid(String redoTargetForkGuid) {
        this.redoTargetForkGuid = redoTargetForkGuid == null ? null : redoTargetForkGuid.trim();
    }

    public BigDecimal getBackupLsn() {
        return backupLsn;
    }

    public void setBackupLsn(BigDecimal backupLsn) {
        this.backupLsn = backupLsn;
    }
}