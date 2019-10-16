package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnXeFileTargetReadFile {
    private String moduleGuid;

    private String packageGuid;

    private String objectName;

    private String eventData;

    private String fileName;

    private Long fileOffset;

    public String getModuleGuid() {
        return moduleGuid;
    }

    public void setModuleGuid(String moduleGuid) {
        this.moduleGuid = moduleGuid == null ? null : moduleGuid.trim();
    }

    public String getPackageGuid() {
        return packageGuid;
    }

    public void setPackageGuid(String packageGuid) {
        this.packageGuid = packageGuid == null ? null : packageGuid.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public String getEventData() {
        return eventData;
    }

    public void setEventData(String eventData) {
        this.eventData = eventData == null ? null : eventData.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Long getFileOffset() {
        return fileOffset;
    }

    public void setFileOffset(Long fileOffset) {
        this.fileOffset = fileOffset;
    }
}