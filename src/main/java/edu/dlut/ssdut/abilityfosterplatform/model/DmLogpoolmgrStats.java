package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmLogpoolmgrStats {
    private Integer databaseId;

    private Integer recoveryUnitId;

    private Long logConsumerIdSeed;

    private Integer logConsumerCount;

    private Byte newLogInteresting;

    private Byte logConsumptionDeactivated;

    private Byte pushEnabled;

    private Long memStatusStamp;

    private Long totalRequests;

    private Long totalCacheMisses;

    private Long totalDiskReads;

    private Integer lowWeightCacheBufferCount;

    private Integer highWeightCacheBufferCount;

    private Integer memStatus;

    private Long sharedPoolSize;

    private Integer frequencyCheckTicks;

    private Integer warmColdCheckTicks;

    private Long truncatePoint;

    private Long activeLogSize;

    private Byte logpoolmgrDeleting;

    private Integer logpoolmgrRefCounter;

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

    public Long getLogConsumerIdSeed() {
        return logConsumerIdSeed;
    }

    public void setLogConsumerIdSeed(Long logConsumerIdSeed) {
        this.logConsumerIdSeed = logConsumerIdSeed;
    }

    public Integer getLogConsumerCount() {
        return logConsumerCount;
    }

    public void setLogConsumerCount(Integer logConsumerCount) {
        this.logConsumerCount = logConsumerCount;
    }

    public Byte getNewLogInteresting() {
        return newLogInteresting;
    }

    public void setNewLogInteresting(Byte newLogInteresting) {
        this.newLogInteresting = newLogInteresting;
    }

    public Byte getLogConsumptionDeactivated() {
        return logConsumptionDeactivated;
    }

    public void setLogConsumptionDeactivated(Byte logConsumptionDeactivated) {
        this.logConsumptionDeactivated = logConsumptionDeactivated;
    }

    public Byte getPushEnabled() {
        return pushEnabled;
    }

    public void setPushEnabled(Byte pushEnabled) {
        this.pushEnabled = pushEnabled;
    }

    public Long getMemStatusStamp() {
        return memStatusStamp;
    }

    public void setMemStatusStamp(Long memStatusStamp) {
        this.memStatusStamp = memStatusStamp;
    }

    public Long getTotalRequests() {
        return totalRequests;
    }

    public void setTotalRequests(Long totalRequests) {
        this.totalRequests = totalRequests;
    }

    public Long getTotalCacheMisses() {
        return totalCacheMisses;
    }

    public void setTotalCacheMisses(Long totalCacheMisses) {
        this.totalCacheMisses = totalCacheMisses;
    }

    public Long getTotalDiskReads() {
        return totalDiskReads;
    }

    public void setTotalDiskReads(Long totalDiskReads) {
        this.totalDiskReads = totalDiskReads;
    }

    public Integer getLowWeightCacheBufferCount() {
        return lowWeightCacheBufferCount;
    }

    public void setLowWeightCacheBufferCount(Integer lowWeightCacheBufferCount) {
        this.lowWeightCacheBufferCount = lowWeightCacheBufferCount;
    }

    public Integer getHighWeightCacheBufferCount() {
        return highWeightCacheBufferCount;
    }

    public void setHighWeightCacheBufferCount(Integer highWeightCacheBufferCount) {
        this.highWeightCacheBufferCount = highWeightCacheBufferCount;
    }

    public Integer getMemStatus() {
        return memStatus;
    }

    public void setMemStatus(Integer memStatus) {
        this.memStatus = memStatus;
    }

    public Long getSharedPoolSize() {
        return sharedPoolSize;
    }

    public void setSharedPoolSize(Long sharedPoolSize) {
        this.sharedPoolSize = sharedPoolSize;
    }

    public Integer getFrequencyCheckTicks() {
        return frequencyCheckTicks;
    }

    public void setFrequencyCheckTicks(Integer frequencyCheckTicks) {
        this.frequencyCheckTicks = frequencyCheckTicks;
    }

    public Integer getWarmColdCheckTicks() {
        return warmColdCheckTicks;
    }

    public void setWarmColdCheckTicks(Integer warmColdCheckTicks) {
        this.warmColdCheckTicks = warmColdCheckTicks;
    }

    public Long getTruncatePoint() {
        return truncatePoint;
    }

    public void setTruncatePoint(Long truncatePoint) {
        this.truncatePoint = truncatePoint;
    }

    public Long getActiveLogSize() {
        return activeLogSize;
    }

    public void setActiveLogSize(Long activeLogSize) {
        this.activeLogSize = activeLogSize;
    }

    public Byte getLogpoolmgrDeleting() {
        return logpoolmgrDeleting;
    }

    public void setLogpoolmgrDeleting(Byte logpoolmgrDeleting) {
        this.logpoolmgrDeleting = logpoolmgrDeleting;
    }

    public Integer getLogpoolmgrRefCounter() {
        return logpoolmgrRefCounter;
    }

    public void setLogpoolmgrRefCounter(Integer logpoolmgrRefCounter) {
        this.logpoolmgrRefCounter = logpoolmgrRefCounter;
    }
}