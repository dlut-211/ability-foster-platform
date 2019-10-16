package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmLogconsumerCachebufferrefs {
    private Integer databaseId;

    private Integer recoveryUnitId;

    private Long consumerId;

    private Long startLogBlockId;

    private Long lastLogBlockId;

    private Byte shared;

    private Short refCounter;

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

    public Byte getShared() {
        return shared;
    }

    public void setShared(Byte shared) {
        this.shared = shared;
    }

    public Short getRefCounter() {
        return refCounter;
    }

    public void setRefCounter(Short refCounter) {
        this.refCounter = refCounter;
    }

    public byte[] getCacheBuffer() {
        return cacheBuffer;
    }

    public void setCacheBuffer(byte[] cacheBuffer) {
        this.cacheBuffer = cacheBuffer;
    }
}