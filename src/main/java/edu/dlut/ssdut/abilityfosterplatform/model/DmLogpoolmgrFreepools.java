package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmLogpoolmgrFreepools {
    private Integer databaseId;

    private Integer recoveryUnitId;

    private Integer bufferSize;

    private Long occurrences;

    private Byte frequent;

    private Integer warmCount;

    private Integer coldCount;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getRecoveryUnitId() {
        return recoveryUnitId;
    }

    public void setRecoveryUnitId(Integer recoveryUnitId) {
        this.recoveryUnitId = recoveryUnitId;
    }

    public Integer getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(Integer bufferSize) {
        this.bufferSize = bufferSize;
    }

    public Long getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(Long occurrences) {
        this.occurrences = occurrences;
    }

    public Byte getFrequent() {
        return frequent;
    }

    public void setFrequent(Byte frequent) {
        this.frequent = frequent;
    }

    public Integer getWarmCount() {
        return warmCount;
    }

    public void setWarmCount(Integer warmCount) {
        this.warmCount = warmCount;
    }

    public Integer getColdCount() {
        return coldCount;
    }

    public void setColdCount(Integer coldCount) {
        this.coldCount = coldCount;
    }
}