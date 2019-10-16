package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmLogpoolSharedcachebuffers {
    private Integer databaseId;

    private Integer recoveryUnitId;

    private Long logBlockId;

    private Integer size;

    private Integer refCounter;

    private Integer futureInterest;

    private Byte isPushed;

    private Long diskReadConsumerId;

    private Byte isLogReadAhead;

    private Byte isTranConsumed;

    private Byte isHadronConsumed;

    private Byte isReplayConsumed;

    private Byte isReplConsumed;

    private Integer persistenceStatus;

    private Integer entryScanDirection;

    private Integer weight;

    private byte[] cacheBuffer;

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

    public Long getLogBlockId() {
        return logBlockId;
    }

    public void setLogBlockId(Long logBlockId) {
        this.logBlockId = logBlockId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getRefCounter() {
        return refCounter;
    }

    public void setRefCounter(Integer refCounter) {
        this.refCounter = refCounter;
    }

    public Integer getFutureInterest() {
        return futureInterest;
    }

    public void setFutureInterest(Integer futureInterest) {
        this.futureInterest = futureInterest;
    }

    public Byte getIsPushed() {
        return isPushed;
    }

    public void setIsPushed(Byte isPushed) {
        this.isPushed = isPushed;
    }

    public Long getDiskReadConsumerId() {
        return diskReadConsumerId;
    }

    public void setDiskReadConsumerId(Long diskReadConsumerId) {
        this.diskReadConsumerId = diskReadConsumerId;
    }

    public Byte getIsLogReadAhead() {
        return isLogReadAhead;
    }

    public void setIsLogReadAhead(Byte isLogReadAhead) {
        this.isLogReadAhead = isLogReadAhead;
    }

    public Byte getIsTranConsumed() {
        return isTranConsumed;
    }

    public void setIsTranConsumed(Byte isTranConsumed) {
        this.isTranConsumed = isTranConsumed;
    }

    public Byte getIsHadronConsumed() {
        return isHadronConsumed;
    }

    public void setIsHadronConsumed(Byte isHadronConsumed) {
        this.isHadronConsumed = isHadronConsumed;
    }

    public Byte getIsReplayConsumed() {
        return isReplayConsumed;
    }

    public void setIsReplayConsumed(Byte isReplayConsumed) {
        this.isReplayConsumed = isReplayConsumed;
    }

    public Byte getIsReplConsumed() {
        return isReplConsumed;
    }

    public void setIsReplConsumed(Byte isReplConsumed) {
        this.isReplConsumed = isReplConsumed;
    }

    public Integer getPersistenceStatus() {
        return persistenceStatus;
    }

    public void setPersistenceStatus(Integer persistenceStatus) {
        this.persistenceStatus = persistenceStatus;
    }

    public Integer getEntryScanDirection() {
        return entryScanDirection;
    }

    public void setEntryScanDirection(Integer entryScanDirection) {
        this.entryScanDirection = entryScanDirection;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public byte[] getCacheBuffer() {
        return cacheBuffer;
    }

    public void setCacheBuffer(byte[] cacheBuffer) {
        this.cacheBuffer = cacheBuffer;
    }
}