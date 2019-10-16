package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmLogconsumerPrivatecachebuffers {
    private Integer databaseId;

    private Integer recoveryUnitId;

    private Long consumerId;

    private Integer size;

    private Long startLogBlockId;

    private Long lastLogBlockId;

    private Integer refCounter;

    private Byte isLogReadAhead;

    private Integer persistenceStatus;

    private Byte incomplete;

    private Integer futureInterest;

    private Byte isEmergentMem;

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

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getStartLogBlockId() {
        return startLogBlockId;
    }

    public void setStartLogBlockId(Long startLogBlockId) {
        this.startLogBlockId = startLogBlockId;
    }

    public Long getLastLogBlockId() {
        return lastLogBlockId;
    }

    public void setLastLogBlockId(Long lastLogBlockId) {
        this.lastLogBlockId = lastLogBlockId;
    }

    public Integer getRefCounter() {
        return refCounter;
    }

    public void setRefCounter(Integer refCounter) {
        this.refCounter = refCounter;
    }

    public Byte getIsLogReadAhead() {
        return isLogReadAhead;
    }

    public void setIsLogReadAhead(Byte isLogReadAhead) {
        this.isLogReadAhead = isLogReadAhead;
    }

    public Integer getPersistenceStatus() {
        return persistenceStatus;
    }

    public void setPersistenceStatus(Integer persistenceStatus) {
        this.persistenceStatus = persistenceStatus;
    }

    public Byte getIncomplete() {
        return incomplete;
    }

    public void setIncomplete(Byte incomplete) {
        this.incomplete = incomplete;
    }

    public Integer getFutureInterest() {
        return futureInterest;
    }

    public void setFutureInterest(Integer futureInterest) {
        this.futureInterest = futureInterest;
    }

    public Byte getIsEmergentMem() {
        return isEmergentMem;
    }

    public void setIsEmergentMem(Byte isEmergentMem) {
        this.isEmergentMem = isEmergentMem;
    }

    public byte[] getCacheBuffer() {
        return cacheBuffer;
    }

    public void setCacheBuffer(byte[] cacheBuffer) {
        this.cacheBuffer = cacheBuffer;
    }
}