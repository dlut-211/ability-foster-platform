package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsVolumeStats {
    private Integer databaseId;

    private Integer fileId;

    private String volumeMountPoint;

    private String volumeId;

    private String logicalVolumeName;

    private String fileSystemType;

    private Long totalBytes;

    private Long availableBytes;

    private Byte supportsCompression;

    private Byte supportsAlternateStreams;

    private Byte supportsSparseFiles;

    private Byte isReadOnly;

    private Byte isCompressed;

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

    public String getVolumeMountPoint() {
        return volumeMountPoint;
    }

    public void setVolumeMountPoint(String volumeMountPoint) {
        this.volumeMountPoint = volumeMountPoint == null ? null : volumeMountPoint.trim();
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId == null ? null : volumeId.trim();
    }

    public String getLogicalVolumeName() {
        return logicalVolumeName;
    }

    public void setLogicalVolumeName(String logicalVolumeName) {
        this.logicalVolumeName = logicalVolumeName == null ? null : logicalVolumeName.trim();
    }

    public String getFileSystemType() {
        return fileSystemType;
    }

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType == null ? null : fileSystemType.trim();
    }

    public Long getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
    }

    public Long getAvailableBytes() {
        return availableBytes;
    }

    public void setAvailableBytes(Long availableBytes) {
        this.availableBytes = availableBytes;
    }

    public Byte getSupportsCompression() {
        return supportsCompression;
    }

    public void setSupportsCompression(Byte supportsCompression) {
        this.supportsCompression = supportsCompression;
    }

    public Byte getSupportsAlternateStreams() {
        return supportsAlternateStreams;
    }

    public void setSupportsAlternateStreams(Byte supportsAlternateStreams) {
        this.supportsAlternateStreams = supportsAlternateStreams;
    }

    public Byte getSupportsSparseFiles() {
        return supportsSparseFiles;
    }

    public void setSupportsSparseFiles(Byte supportsSparseFiles) {
        this.supportsSparseFiles = supportsSparseFiles;
    }

    public Byte getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(Byte isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public Byte getIsCompressed() {
        return isCompressed;
    }

    public void setIsCompressed(Byte isCompressed) {
        this.isCompressed = isCompressed;
    }
}