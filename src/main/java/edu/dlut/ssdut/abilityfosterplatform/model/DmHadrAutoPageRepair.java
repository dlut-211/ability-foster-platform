package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmHadrAutoPageRepair {
    private Integer databaseId;

    private Integer fileId;

    private Long pageId;

    private Short errorType;

    private Byte pageStatus;

    private Date modificationTime;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Long getPageId() {
        return pageId;
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }

    public Short getErrorType() {
        return errorType;
    }

    public void setErrorType(Short errorType) {
        this.errorType = errorType;
    }

    public Byte getPageStatus() {
        return pageStatus;
    }

    public void setPageStatus(Byte pageStatus) {
        this.pageStatus = pageStatus;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }
}