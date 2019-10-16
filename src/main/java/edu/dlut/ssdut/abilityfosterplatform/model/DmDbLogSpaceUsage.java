package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbLogSpaceUsage {
    private Integer databaseId;

    private Long totalLogSizeInBytes;

    private Long usedLogSpaceInBytes;

    private Float usedLogSpaceInPercent;

    private Long logSpaceInBytesSinceLastBackup;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Long getTotalLogSizeInBytes() {
        return totalLogSizeInBytes;
    }

    public void setTotalLogSizeInBytes(Long totalLogSizeInBytes) {
        this.totalLogSizeInBytes = totalLogSizeInBytes;
    }

    public Long getUsedLogSpaceInBytes() {
        return usedLogSpaceInBytes;
    }

    public void setUsedLogSpaceInBytes(Long usedLogSpaceInBytes) {
        this.usedLogSpaceInBytes = usedLogSpaceInBytes;
    }

    public Float getUsedLogSpaceInPercent() {
        return usedLogSpaceInPercent;
    }

    public void setUsedLogSpaceInPercent(Float usedLogSpaceInPercent) {
        this.usedLogSpaceInPercent = usedLogSpaceInPercent;
    }

    public Long getLogSpaceInBytesSinceLastBackup() {
        return logSpaceInBytesSinceLastBackup;
    }

    public void setLogSpaceInBytesSinceLastBackup(Long logSpaceInBytesSinceLastBackup) {
        this.logSpaceInBytesSinceLastBackup = logSpaceInBytesSinceLastBackup;
    }
}