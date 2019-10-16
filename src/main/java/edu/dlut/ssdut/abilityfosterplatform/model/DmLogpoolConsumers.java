package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class DmLogpoolConsumers {
    private Integer databaseId;

    private Integer recoveryUnitId;

    private Long consumerId;

    private String consumerName;

    private Integer resourcePoolId;

    private Byte isIdle;

    private Integer waitTimeBeforeIdle;

    private Integer progressCategory;

    private Byte persistentOnly;

    private Byte fullBlockOnly;

    private Integer shareIntention;

    private Integer scanDirection;

    private Integer readAheadTarget;

    private Byte statsEnabled;

    private BigDecimal startLsn;

    private BigDecimal currentLsn;

    private Long endLogBlockId;

    private Byte reachedEnd;

    private Byte outstandingRead;

    private Byte readAheadDone;

    private BigDecimal nextReadAheadLsn;

    private Integer readAheadDistance;

    private Long privatePoolSize;

    private Long privatePoolPages;

    private Long privatePoolHits;

    private Long privatePoolMisses;

    private Long privatePoolHitsRa;

    private Long privatePoolMissesRa;

    private Long privatePoolHitSearchLength;

    private Long privatePoolMissSearchLength;

    private Long privatePoolHitsSearchLengthRa;

    private Long privatePoolMissSearchLengthRa;

    private Integer referenceCount;

    private Byte freeRefSlotOccupied;

    private Long targetPrivatePoolSize;

    private Long truncatePoint;

    private Integer memStatus;

    private Integer scanStatus;

    private Long consumedBlockCount;

    private Long cacheMisses;

    private Long sigmaBlocksAhead;

    private Long blocksFromLc;

    private Long blocksFromLogpool;

    private Long blocksFromDisk;

    private Byte logConsumerDeleting;

    private Integer logConsumerRefCounter;

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

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName == null ? null : consumerName.trim();
    }

    public Integer getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(Integer resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public Byte getIsIdle() {
        return isIdle;
    }

    public void setIsIdle(Byte isIdle) {
        this.isIdle = isIdle;
    }

    public Integer getWaitTimeBeforeIdle() {
        return waitTimeBeforeIdle;
    }

    public void setWaitTimeBeforeIdle(Integer waitTimeBeforeIdle) {
        this.waitTimeBeforeIdle = waitTimeBeforeIdle;
    }

    public Integer getProgressCategory() {
        return progressCategory;
    }

    public void setProgressCategory(Integer progressCategory) {
        this.progressCategory = progressCategory;
    }

    public Byte getPersistentOnly() {
        return persistentOnly;
    }

    public void setPersistentOnly(Byte persistentOnly) {
        this.persistentOnly = persistentOnly;
    }

    public Byte getFullBlockOnly() {
        return fullBlockOnly;
    }

    public void setFullBlockOnly(Byte fullBlockOnly) {
        this.fullBlockOnly = fullBlockOnly;
    }

    public Integer getShareIntention() {
        return shareIntention;
    }

    public void setShareIntention(Integer shareIntention) {
        this.shareIntention = shareIntention;
    }

    public Integer getScanDirection() {
        return scanDirection;
    }

    public void setScanDirection(Integer scanDirection) {
        this.scanDirection = scanDirection;
    }

    public Integer getReadAheadTarget() {
        return readAheadTarget;
    }

    public void setReadAheadTarget(Integer readAheadTarget) {
        this.readAheadTarget = readAheadTarget;
    }

    public Byte getStatsEnabled() {
        return statsEnabled;
    }

    public void setStatsEnabled(Byte statsEnabled) {
        this.statsEnabled = statsEnabled;
    }

    public BigDecimal getStartLsn() {
        return startLsn;
    }

    public void setStartLsn(BigDecimal startLsn) {
        this.startLsn = startLsn;
    }

    public BigDecimal getCurrentLsn() {
        return currentLsn;
    }

    public void setCurrentLsn(BigDecimal currentLsn) {
        this.currentLsn = currentLsn;
    }

    public Long getEndLogBlockId() {
        return endLogBlockId;
    }

    public void setEndLogBlockId(Long endLogBlockId) {
        this.endLogBlockId = endLogBlockId;
    }

    public Byte getReachedEnd() {
        return reachedEnd;
    }

    public void setReachedEnd(Byte reachedEnd) {
        this.reachedEnd = reachedEnd;
    }

    public Byte getOutstandingRead() {
        return outstandingRead;
    }

    public void setOutstandingRead(Byte outstandingRead) {
        this.outstandingRead = outstandingRead;
    }

    public Byte getReadAheadDone() {
        return readAheadDone;
    }

    public void setReadAheadDone(Byte readAheadDone) {
        this.readAheadDone = readAheadDone;
    }

    public BigDecimal getNextReadAheadLsn() {
        return nextReadAheadLsn;
    }

    public void setNextReadAheadLsn(BigDecimal nextReadAheadLsn) {
        this.nextReadAheadLsn = nextReadAheadLsn;
    }

    public Integer getReadAheadDistance() {
        return readAheadDistance;
    }

    public void setReadAheadDistance(Integer readAheadDistance) {
        this.readAheadDistance = readAheadDistance;
    }

    public Long getPrivatePoolSize() {
        return privatePoolSize;
    }

    public void setPrivatePoolSize(Long privatePoolSize) {
        this.privatePoolSize = privatePoolSize;
    }

    public Long getPrivatePoolPages() {
        return privatePoolPages;
    }

    public void setPrivatePoolPages(Long privatePoolPages) {
        this.privatePoolPages = privatePoolPages;
    }

    public Long getPrivatePoolHits() {
        return privatePoolHits;
    }

    public void setPrivatePoolHits(Long privatePoolHits) {
        this.privatePoolHits = privatePoolHits;
    }

    public Long getPrivatePoolMisses() {
        return privatePoolMisses;
    }

    public void setPrivatePoolMisses(Long privatePoolMisses) {
        this.privatePoolMisses = privatePoolMisses;
    }

    public Long getPrivatePoolHitsRa() {
        return privatePoolHitsRa;
    }

    public void setPrivatePoolHitsRa(Long privatePoolHitsRa) {
        this.privatePoolHitsRa = privatePoolHitsRa;
    }

    public Long getPrivatePoolMissesRa() {
        return privatePoolMissesRa;
    }

    public void setPrivatePoolMissesRa(Long privatePoolMissesRa) {
        this.privatePoolMissesRa = privatePoolMissesRa;
    }

    public Long getPrivatePoolHitSearchLength() {
        return privatePoolHitSearchLength;
    }

    public void setPrivatePoolHitSearchLength(Long privatePoolHitSearchLength) {
        this.privatePoolHitSearchLength = privatePoolHitSearchLength;
    }

    public Long getPrivatePoolMissSearchLength() {
        return privatePoolMissSearchLength;
    }

    public void setPrivatePoolMissSearchLength(Long privatePoolMissSearchLength) {
        this.privatePoolMissSearchLength = privatePoolMissSearchLength;
    }

    public Long getPrivatePoolHitsSearchLengthRa() {
        return privatePoolHitsSearchLengthRa;
    }

    public void setPrivatePoolHitsSearchLengthRa(Long privatePoolHitsSearchLengthRa) {
        this.privatePoolHitsSearchLengthRa = privatePoolHitsSearchLengthRa;
    }

    public Long getPrivatePoolMissSearchLengthRa() {
        return privatePoolMissSearchLengthRa;
    }

    public void setPrivatePoolMissSearchLengthRa(Long privatePoolMissSearchLengthRa) {
        this.privatePoolMissSearchLengthRa = privatePoolMissSearchLengthRa;
    }

    public Integer getReferenceCount() {
        return referenceCount;
    }

    public void setReferenceCount(Integer referenceCount) {
        this.referenceCount = referenceCount;
    }

    public Byte getFreeRefSlotOccupied() {
        return freeRefSlotOccupied;
    }

    public void setFreeRefSlotOccupied(Byte freeRefSlotOccupied) {
        this.freeRefSlotOccupied = freeRefSlotOccupied;
    }

    public Long getTargetPrivatePoolSize() {
        return targetPrivatePoolSize;
    }

    public void setTargetPrivatePoolSize(Long targetPrivatePoolSize) {
        this.targetPrivatePoolSize = targetPrivatePoolSize;
    }

    public Long getTruncatePoint() {
        return truncatePoint;
    }

    public void setTruncatePoint(Long truncatePoint) {
        this.truncatePoint = truncatePoint;
    }

    public Integer getMemStatus() {
        return memStatus;
    }

    public void setMemStatus(Integer memStatus) {
        this.memStatus = memStatus;
    }

    public Integer getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(Integer scanStatus) {
        this.scanStatus = scanStatus;
    }

    public Long getConsumedBlockCount() {
        return consumedBlockCount;
    }

    public void setConsumedBlockCount(Long consumedBlockCount) {
        this.consumedBlockCount = consumedBlockCount;
    }

    public Long getCacheMisses() {
        return cacheMisses;
    }

    public void setCacheMisses(Long cacheMisses) {
        this.cacheMisses = cacheMisses;
    }

    public Long getSigmaBlocksAhead() {
        return sigmaBlocksAhead;
    }

    public void setSigmaBlocksAhead(Long sigmaBlocksAhead) {
        this.sigmaBlocksAhead = sigmaBlocksAhead;
    }

    public Long getBlocksFromLc() {
        return blocksFromLc;
    }

    public void setBlocksFromLc(Long blocksFromLc) {
        this.blocksFromLc = blocksFromLc;
    }

    public Long getBlocksFromLogpool() {
        return blocksFromLogpool;
    }

    public void setBlocksFromLogpool(Long blocksFromLogpool) {
        this.blocksFromLogpool = blocksFromLogpool;
    }

    public Long getBlocksFromDisk() {
        return blocksFromDisk;
    }

    public void setBlocksFromDisk(Long blocksFromDisk) {
        this.blocksFromDisk = blocksFromDisk;
    }

    public Byte getLogConsumerDeleting() {
        return logConsumerDeleting;
    }

    public void setLogConsumerDeleting(Byte logConsumerDeleting) {
        this.logConsumerDeleting = logConsumerDeleting;
    }

    public Integer getLogConsumerRefCounter() {
        return logConsumerRefCounter;
    }

    public void setLogConsumerRefCounter(Integer logConsumerRefCounter) {
        this.logConsumerRefCounter = logConsumerRefCounter;
    }
}