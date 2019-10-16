package edu.dlut.ssdut.abilityfosterplatform.model;

public class Filetables {
    private Integer objectId;

    private Boolean isEnabled;

    private String directoryName;

    private Integer filenameCollationId;

    private String filenameCollationName;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName == null ? null : directoryName.trim();
    }

    public Integer getFilenameCollationId() {
        return filenameCollationId;
    }

    public void setFilenameCollationId(Integer filenameCollationId) {
        this.filenameCollationId = filenameCollationId;
    }

    public String getFilenameCollationName() {
        return filenameCollationName;
    }

    public void setFilenameCollationName(String filenameCollationName) {
        this.filenameCollationName = filenameCollationName == null ? null : filenameCollationName.trim();
    }
}