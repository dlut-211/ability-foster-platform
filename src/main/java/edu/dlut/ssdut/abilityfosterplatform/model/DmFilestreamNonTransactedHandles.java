package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmFilestreamNonTransactedHandles {
    private Integer databaseId;

    private Integer objectId;

    private Integer handleId;

    private Integer fileObjectType;

    private String fileObjectTypeDesc;

    private Integer state;

    private String stateDesc;

    private Integer currentWorkitemType;

    private String currentWorkitemTypeDesc;

    private Long fcbId;

    private Boolean isDirectory;

    private String itemName;

    private String openedFileName;

    private String databaseDirectoryName;

    private String tableDirectoryName;

    private String remainingFileName;

    private Date openTime;

    private Integer flags;

    private Integer loginId;

    private String loginName;

    private Boolean readAccess;

    private Boolean writeAccess;

    private Boolean deleteAccess;

    private Boolean shareRead;

    private Boolean shareWrite;

    private Boolean shareDelete;

    private Integer createDisposition;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getHandleId() {
        return handleId;
    }

    public void setHandleId(Integer handleId) {
        this.handleId = handleId;
    }

    public Integer getFileObjectType() {
        return fileObjectType;
    }

    public void setFileObjectType(Integer fileObjectType) {
        this.fileObjectType = fileObjectType;
    }

    public String getFileObjectTypeDesc() {
        return fileObjectTypeDesc;
    }

    public void setFileObjectTypeDesc(String fileObjectTypeDesc) {
        this.fileObjectTypeDesc = fileObjectTypeDesc == null ? null : fileObjectTypeDesc.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public Integer getCurrentWorkitemType() {
        return currentWorkitemType;
    }

    public void setCurrentWorkitemType(Integer currentWorkitemType) {
        this.currentWorkitemType = currentWorkitemType;
    }

    public String getCurrentWorkitemTypeDesc() {
        return currentWorkitemTypeDesc;
    }

    public void setCurrentWorkitemTypeDesc(String currentWorkitemTypeDesc) {
        this.currentWorkitemTypeDesc = currentWorkitemTypeDesc == null ? null : currentWorkitemTypeDesc.trim();
    }

    public Long getFcbId() {
        return fcbId;
    }

    public void setFcbId(Long fcbId) {
        this.fcbId = fcbId;
    }

    public Boolean getIsDirectory() {
        return isDirectory;
    }

    public void setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getOpenedFileName() {
        return openedFileName;
    }

    public void setOpenedFileName(String openedFileName) {
        this.openedFileName = openedFileName == null ? null : openedFileName.trim();
    }

    public String getDatabaseDirectoryName() {
        return databaseDirectoryName;
    }

    public void setDatabaseDirectoryName(String databaseDirectoryName) {
        this.databaseDirectoryName = databaseDirectoryName == null ? null : databaseDirectoryName.trim();
    }

    public String getTableDirectoryName() {
        return tableDirectoryName;
    }

    public void setTableDirectoryName(String tableDirectoryName) {
        this.tableDirectoryName = tableDirectoryName == null ? null : tableDirectoryName.trim();
    }

    public String getRemainingFileName() {
        return remainingFileName;
    }

    public void setRemainingFileName(String remainingFileName) {
        this.remainingFileName = remainingFileName == null ? null : remainingFileName.trim();
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public Boolean getReadAccess() {
        return readAccess;
    }

    public void setReadAccess(Boolean readAccess) {
        this.readAccess = readAccess;
    }

    public Boolean getWriteAccess() {
        return writeAccess;
    }

    public void setWriteAccess(Boolean writeAccess) {
        this.writeAccess = writeAccess;
    }

    public Boolean getDeleteAccess() {
        return deleteAccess;
    }

    public void setDeleteAccess(Boolean deleteAccess) {
        this.deleteAccess = deleteAccess;
    }

    public Boolean getShareRead() {
        return shareRead;
    }

    public void setShareRead(Boolean shareRead) {
        this.shareRead = shareRead;
    }

    public Boolean getShareWrite() {
        return shareWrite;
    }

    public void setShareWrite(Boolean shareWrite) {
        this.shareWrite = shareWrite;
    }

    public Boolean getShareDelete() {
        return shareDelete;
    }

    public void setShareDelete(Boolean shareDelete) {
        this.shareDelete = shareDelete;
    }

    public Integer getCreateDisposition() {
        return createDisposition;
    }

    public void setCreateDisposition(Integer createDisposition) {
        this.createDisposition = createDisposition;
    }
}