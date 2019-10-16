package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmIoBackupTapes {
    private String physicalDeviceName;

    private String logicalDeviceName;

    private Integer status;

    private String statusDesc;

    private Date mountRequestTime;

    private Date mountExpirationTime;

    private String databaseName;

    private Integer spid;

    private Integer command;

    private String commandDesc;

    private Integer mediaFamilyId;

    private String mediaSetName;

    private String mediaSetGuid;

    private Integer mediaSequenceNumber;

    private Integer tapeOperation;

    private String tapeOperationDesc;

    private Integer mountRequestType;

    private String mountRequestTypeDesc;

    public String getPhysicalDeviceName() {
        return physicalDeviceName;
    }

    public void setPhysicalDeviceName(String physicalDeviceName) {
        this.physicalDeviceName = physicalDeviceName == null ? null : physicalDeviceName.trim();
    }

    public String getLogicalDeviceName() {
        return logicalDeviceName;
    }

    public void setLogicalDeviceName(String logicalDeviceName) {
        this.logicalDeviceName = logicalDeviceName == null ? null : logicalDeviceName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc == null ? null : statusDesc.trim();
    }

    public Date getMountRequestTime() {
        return mountRequestTime;
    }

    public void setMountRequestTime(Date mountRequestTime) {
        this.mountRequestTime = mountRequestTime;
    }

    public Date getMountExpirationTime() {
        return mountExpirationTime;
    }

    public void setMountExpirationTime(Date mountExpirationTime) {
        this.mountExpirationTime = mountExpirationTime;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getCommand() {
        return command;
    }

    public void setCommand(Integer command) {
        this.command = command;
    }

    public String getCommandDesc() {
        return commandDesc;
    }

    public void setCommandDesc(String commandDesc) {
        this.commandDesc = commandDesc == null ? null : commandDesc.trim();
    }

    public Integer getMediaFamilyId() {
        return mediaFamilyId;
    }

    public void setMediaFamilyId(Integer mediaFamilyId) {
        this.mediaFamilyId = mediaFamilyId;
    }

    public String getMediaSetName() {
        return mediaSetName;
    }

    public void setMediaSetName(String mediaSetName) {
        this.mediaSetName = mediaSetName == null ? null : mediaSetName.trim();
    }

    public String getMediaSetGuid() {
        return mediaSetGuid;
    }

    public void setMediaSetGuid(String mediaSetGuid) {
        this.mediaSetGuid = mediaSetGuid == null ? null : mediaSetGuid.trim();
    }

    public Integer getMediaSequenceNumber() {
        return mediaSequenceNumber;
    }

    public void setMediaSequenceNumber(Integer mediaSequenceNumber) {
        this.mediaSequenceNumber = mediaSequenceNumber;
    }

    public Integer getTapeOperation() {
        return tapeOperation;
    }

    public void setTapeOperation(Integer tapeOperation) {
        this.tapeOperation = tapeOperation;
    }

    public String getTapeOperationDesc() {
        return tapeOperationDesc;
    }

    public void setTapeOperationDesc(String tapeOperationDesc) {
        this.tapeOperationDesc = tapeOperationDesc == null ? null : tapeOperationDesc.trim();
    }

    public Integer getMountRequestType() {
        return mountRequestType;
    }

    public void setMountRequestType(Integer mountRequestType) {
        this.mountRequestType = mountRequestType;
    }

    public String getMountRequestTypeDesc() {
        return mountRequestTypeDesc;
    }

    public void setMountRequestTypeDesc(String mountRequestTypeDesc) {
        this.mountRequestTypeDesc = mountRequestTypeDesc == null ? null : mountRequestTypeDesc.trim();
    }
}