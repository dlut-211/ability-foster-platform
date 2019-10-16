package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Databases {
    private String name;

    private Integer databaseId;

    private Integer sourceDatabaseId;

    private Date createDate;

    private Byte compatibilityLevel;

    private String collationName;

    private Byte userAccess;

    private String userAccessDesc;

    private Boolean isReadOnly;

    private Boolean isAutoCloseOn;

    private Boolean isAutoShrinkOn;

    private Byte state;

    private String stateDesc;

    private Boolean isInStandby;

    private Boolean isCleanlyShutdown;

    private Boolean isSupplementalLoggingEnabled;

    private Byte snapshotIsolationState;

    private String snapshotIsolationStateDesc;

    private Boolean isReadCommittedSnapshotOn;

    private Byte recoveryModel;

    private String recoveryModelDesc;

    private Byte pageVerifyOption;

    private String pageVerifyOptionDesc;

    private Boolean isAutoCreateStatsOn;

    private Boolean isAutoCreateStatsIncrementalOn;

    private Boolean isAutoUpdateStatsOn;

    private Boolean isAutoUpdateStatsAsyncOn;

    private Boolean isAnsiNullDefaultOn;

    private Boolean isAnsiNullsOn;

    private Boolean isAnsiPaddingOn;

    private Boolean isAnsiWarningsOn;

    private Boolean isArithabortOn;

    private Boolean isConcatNullYieldsNullOn;

    private Boolean isNumericRoundabortOn;

    private Boolean isQuotedIdentifierOn;

    private Boolean isRecursiveTriggersOn;

    private Boolean isCursorCloseOnCommitOn;

    private Boolean isLocalCursorDefault;

    private Boolean isFulltextEnabled;

    private Boolean isTrustworthyOn;

    private Boolean isDbChainingOn;

    private Boolean isParameterizationForced;

    private Boolean isMasterKeyEncryptedByServer;

    private Boolean isQueryStoreOn;

    private Boolean isPublished;

    private Boolean isSubscribed;

    private Boolean isMergePublished;

    private Boolean isDistributor;

    private Boolean isSyncWithBackup;

    private String serviceBrokerGuid;

    private Boolean isBrokerEnabled;

    private Byte logReuseWait;

    private String logReuseWaitDesc;

    private Boolean isDateCorrelationOn;

    private Boolean isCdcEnabled;

    private Boolean isEncrypted;

    private Boolean isHonorBrokerPriorityOn;

    private String replicaId;

    private String groupDatabaseId;

    private Integer resourcePoolId;

    private Short defaultLanguageLcid;

    private String defaultLanguageName;

    private Integer defaultFulltextLanguageLcid;

    private String defaultFulltextLanguageName;

    private Boolean isNestedTriggersOn;

    private Boolean isTransformNoiseWordsOn;

    private Short twoDigitYearCutoff;

    private Byte containment;

    private String containmentDesc;

    private Integer targetRecoveryTimeInSeconds;

    private Integer delayedDurability;

    private String delayedDurabilityDesc;

    private Boolean isMemoryOptimizedElevateToSnapshotOn;

    private byte[] ownerSid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getSourceDatabaseId() {
        return sourceDatabaseId;
    }

    public void setSourceDatabaseId(Integer sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Byte getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(Byte compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName == null ? null : collationName.trim();
    }

    public Byte getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(Byte userAccess) {
        this.userAccess = userAccess;
    }

    public String getUserAccessDesc() {
        return userAccessDesc;
    }

    public void setUserAccessDesc(String userAccessDesc) {
        this.userAccessDesc = userAccessDesc == null ? null : userAccessDesc.trim();
    }

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public Boolean getIsAutoCloseOn() {
        return isAutoCloseOn;
    }

    public void setIsAutoCloseOn(Boolean isAutoCloseOn) {
        this.isAutoCloseOn = isAutoCloseOn;
    }

    public Boolean getIsAutoShrinkOn() {
        return isAutoShrinkOn;
    }

    public void setIsAutoShrinkOn(Boolean isAutoShrinkOn) {
        this.isAutoShrinkOn = isAutoShrinkOn;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public Boolean getIsInStandby() {
        return isInStandby;
    }

    public void setIsInStandby(Boolean isInStandby) {
        this.isInStandby = isInStandby;
    }

    public Boolean getIsCleanlyShutdown() {
        return isCleanlyShutdown;
    }

    public void setIsCleanlyShutdown(Boolean isCleanlyShutdown) {
        this.isCleanlyShutdown = isCleanlyShutdown;
    }

    public Boolean getIsSupplementalLoggingEnabled() {
        return isSupplementalLoggingEnabled;
    }

    public void setIsSupplementalLoggingEnabled(Boolean isSupplementalLoggingEnabled) {
        this.isSupplementalLoggingEnabled = isSupplementalLoggingEnabled;
    }

    public Byte getSnapshotIsolationState() {
        return snapshotIsolationState;
    }

    public void setSnapshotIsolationState(Byte snapshotIsolationState) {
        this.snapshotIsolationState = snapshotIsolationState;
    }

    public String getSnapshotIsolationStateDesc() {
        return snapshotIsolationStateDesc;
    }

    public void setSnapshotIsolationStateDesc(String snapshotIsolationStateDesc) {
        this.snapshotIsolationStateDesc = snapshotIsolationStateDesc == null ? null : snapshotIsolationStateDesc.trim();
    }

    public Boolean getIsReadCommittedSnapshotOn() {
        return isReadCommittedSnapshotOn;
    }

    public void setIsReadCommittedSnapshotOn(Boolean isReadCommittedSnapshotOn) {
        this.isReadCommittedSnapshotOn = isReadCommittedSnapshotOn;
    }

    public Byte getRecoveryModel() {
        return recoveryModel;
    }

    public void setRecoveryModel(Byte recoveryModel) {
        this.recoveryModel = recoveryModel;
    }

    public String getRecoveryModelDesc() {
        return recoveryModelDesc;
    }

    public void setRecoveryModelDesc(String recoveryModelDesc) {
        this.recoveryModelDesc = recoveryModelDesc == null ? null : recoveryModelDesc.trim();
    }

    public Byte getPageVerifyOption() {
        return pageVerifyOption;
    }

    public void setPageVerifyOption(Byte pageVerifyOption) {
        this.pageVerifyOption = pageVerifyOption;
    }

    public String getPageVerifyOptionDesc() {
        return pageVerifyOptionDesc;
    }

    public void setPageVerifyOptionDesc(String pageVerifyOptionDesc) {
        this.pageVerifyOptionDesc = pageVerifyOptionDesc == null ? null : pageVerifyOptionDesc.trim();
    }

    public Boolean getIsAutoCreateStatsOn() {
        return isAutoCreateStatsOn;
    }

    public void setIsAutoCreateStatsOn(Boolean isAutoCreateStatsOn) {
        this.isAutoCreateStatsOn = isAutoCreateStatsOn;
    }

    public Boolean getIsAutoCreateStatsIncrementalOn() {
        return isAutoCreateStatsIncrementalOn;
    }

    public void setIsAutoCreateStatsIncrementalOn(Boolean isAutoCreateStatsIncrementalOn) {
        this.isAutoCreateStatsIncrementalOn = isAutoCreateStatsIncrementalOn;
    }

    public Boolean getIsAutoUpdateStatsOn() {
        return isAutoUpdateStatsOn;
    }

    public void setIsAutoUpdateStatsOn(Boolean isAutoUpdateStatsOn) {
        this.isAutoUpdateStatsOn = isAutoUpdateStatsOn;
    }

    public Boolean getIsAutoUpdateStatsAsyncOn() {
        return isAutoUpdateStatsAsyncOn;
    }

    public void setIsAutoUpdateStatsAsyncOn(Boolean isAutoUpdateStatsAsyncOn) {
        this.isAutoUpdateStatsAsyncOn = isAutoUpdateStatsAsyncOn;
    }

    public Boolean getIsAnsiNullDefaultOn() {
        return isAnsiNullDefaultOn;
    }

    public void setIsAnsiNullDefaultOn(Boolean isAnsiNullDefaultOn) {
        this.isAnsiNullDefaultOn = isAnsiNullDefaultOn;
    }

    public Boolean getIsAnsiNullsOn() {
        return isAnsiNullsOn;
    }

    public void setIsAnsiNullsOn(Boolean isAnsiNullsOn) {
        this.isAnsiNullsOn = isAnsiNullsOn;
    }

    public Boolean getIsAnsiPaddingOn() {
        return isAnsiPaddingOn;
    }

    public void setIsAnsiPaddingOn(Boolean isAnsiPaddingOn) {
        this.isAnsiPaddingOn = isAnsiPaddingOn;
    }

    public Boolean getIsAnsiWarningsOn() {
        return isAnsiWarningsOn;
    }

    public void setIsAnsiWarningsOn(Boolean isAnsiWarningsOn) {
        this.isAnsiWarningsOn = isAnsiWarningsOn;
    }

    public Boolean getIsArithabortOn() {
        return isArithabortOn;
    }

    public void setIsArithabortOn(Boolean isArithabortOn) {
        this.isArithabortOn = isArithabortOn;
    }

    public Boolean getIsConcatNullYieldsNullOn() {
        return isConcatNullYieldsNullOn;
    }

    public void setIsConcatNullYieldsNullOn(Boolean isConcatNullYieldsNullOn) {
        this.isConcatNullYieldsNullOn = isConcatNullYieldsNullOn;
    }

    public Boolean getIsNumericRoundabortOn() {
        return isNumericRoundabortOn;
    }

    public void setIsNumericRoundabortOn(Boolean isNumericRoundabortOn) {
        this.isNumericRoundabortOn = isNumericRoundabortOn;
    }

    public Boolean getIsQuotedIdentifierOn() {
        return isQuotedIdentifierOn;
    }

    public void setIsQuotedIdentifierOn(Boolean isQuotedIdentifierOn) {
        this.isQuotedIdentifierOn = isQuotedIdentifierOn;
    }

    public Boolean getIsRecursiveTriggersOn() {
        return isRecursiveTriggersOn;
    }

    public void setIsRecursiveTriggersOn(Boolean isRecursiveTriggersOn) {
        this.isRecursiveTriggersOn = isRecursiveTriggersOn;
    }

    public Boolean getIsCursorCloseOnCommitOn() {
        return isCursorCloseOnCommitOn;
    }

    public void setIsCursorCloseOnCommitOn(Boolean isCursorCloseOnCommitOn) {
        this.isCursorCloseOnCommitOn = isCursorCloseOnCommitOn;
    }

    public Boolean getIsLocalCursorDefault() {
        return isLocalCursorDefault;
    }

    public void setIsLocalCursorDefault(Boolean isLocalCursorDefault) {
        this.isLocalCursorDefault = isLocalCursorDefault;
    }

    public Boolean getIsFulltextEnabled() {
        return isFulltextEnabled;
    }

    public void setIsFulltextEnabled(Boolean isFulltextEnabled) {
        this.isFulltextEnabled = isFulltextEnabled;
    }

    public Boolean getIsTrustworthyOn() {
        return isTrustworthyOn;
    }

    public void setIsTrustworthyOn(Boolean isTrustworthyOn) {
        this.isTrustworthyOn = isTrustworthyOn;
    }

    public Boolean getIsDbChainingOn() {
        return isDbChainingOn;
    }

    public void setIsDbChainingOn(Boolean isDbChainingOn) {
        this.isDbChainingOn = isDbChainingOn;
    }

    public Boolean getIsParameterizationForced() {
        return isParameterizationForced;
    }

    public void setIsParameterizationForced(Boolean isParameterizationForced) {
        this.isParameterizationForced = isParameterizationForced;
    }

    public Boolean getIsMasterKeyEncryptedByServer() {
        return isMasterKeyEncryptedByServer;
    }

    public void setIsMasterKeyEncryptedByServer(Boolean isMasterKeyEncryptedByServer) {
        this.isMasterKeyEncryptedByServer = isMasterKeyEncryptedByServer;
    }

    public Boolean getIsQueryStoreOn() {
        return isQueryStoreOn;
    }

    public void setIsQueryStoreOn(Boolean isQueryStoreOn) {
        this.isQueryStoreOn = isQueryStoreOn;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public Boolean getIsMergePublished() {
        return isMergePublished;
    }

    public void setIsMergePublished(Boolean isMergePublished) {
        this.isMergePublished = isMergePublished;
    }

    public Boolean getIsDistributor() {
        return isDistributor;
    }

    public void setIsDistributor(Boolean isDistributor) {
        this.isDistributor = isDistributor;
    }

    public Boolean getIsSyncWithBackup() {
        return isSyncWithBackup;
    }

    public void setIsSyncWithBackup(Boolean isSyncWithBackup) {
        this.isSyncWithBackup = isSyncWithBackup;
    }

    public String getServiceBrokerGuid() {
        return serviceBrokerGuid;
    }

    public void setServiceBrokerGuid(String serviceBrokerGuid) {
        this.serviceBrokerGuid = serviceBrokerGuid == null ? null : serviceBrokerGuid.trim();
    }

    public Boolean getIsBrokerEnabled() {
        return isBrokerEnabled;
    }

    public void setIsBrokerEnabled(Boolean isBrokerEnabled) {
        this.isBrokerEnabled = isBrokerEnabled;
    }

    public Byte getLogReuseWait() {
        return logReuseWait;
    }

    public void setLogReuseWait(Byte logReuseWait) {
        this.logReuseWait = logReuseWait;
    }

    public String getLogReuseWaitDesc() {
        return logReuseWaitDesc;
    }

    public void setLogReuseWaitDesc(String logReuseWaitDesc) {
        this.logReuseWaitDesc = logReuseWaitDesc == null ? null : logReuseWaitDesc.trim();
    }

    public Boolean getIsDateCorrelationOn() {
        return isDateCorrelationOn;
    }

    public void setIsDateCorrelationOn(Boolean isDateCorrelationOn) {
        this.isDateCorrelationOn = isDateCorrelationOn;
    }

    public Boolean getIsCdcEnabled() {
        return isCdcEnabled;
    }

    public void setIsCdcEnabled(Boolean isCdcEnabled) {
        this.isCdcEnabled = isCdcEnabled;
    }

    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    public Boolean getIsHonorBrokerPriorityOn() {
        return isHonorBrokerPriorityOn;
    }

    public void setIsHonorBrokerPriorityOn(Boolean isHonorBrokerPriorityOn) {
        this.isHonorBrokerPriorityOn = isHonorBrokerPriorityOn;
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId == null ? null : replicaId.trim();
    }

    public String getGroupDatabaseId() {
        return groupDatabaseId;
    }

    public void setGroupDatabaseId(String groupDatabaseId) {
        this.groupDatabaseId = groupDatabaseId == null ? null : groupDatabaseId.trim();
    }

    public Integer getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(Integer resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public Short getDefaultLanguageLcid() {
        return defaultLanguageLcid;
    }

    public void setDefaultLanguageLcid(Short defaultLanguageLcid) {
        this.defaultLanguageLcid = defaultLanguageLcid;
    }

    public String getDefaultLanguageName() {
        return defaultLanguageName;
    }

    public void setDefaultLanguageName(String defaultLanguageName) {
        this.defaultLanguageName = defaultLanguageName == null ? null : defaultLanguageName.trim();
    }

    public Integer getDefaultFulltextLanguageLcid() {
        return defaultFulltextLanguageLcid;
    }

    public void setDefaultFulltextLanguageLcid(Integer defaultFulltextLanguageLcid) {
        this.defaultFulltextLanguageLcid = defaultFulltextLanguageLcid;
    }

    public String getDefaultFulltextLanguageName() {
        return defaultFulltextLanguageName;
    }

    public void setDefaultFulltextLanguageName(String defaultFulltextLanguageName) {
        this.defaultFulltextLanguageName = defaultFulltextLanguageName == null ? null : defaultFulltextLanguageName.trim();
    }

    public Boolean getIsNestedTriggersOn() {
        return isNestedTriggersOn;
    }

    public void setIsNestedTriggersOn(Boolean isNestedTriggersOn) {
        this.isNestedTriggersOn = isNestedTriggersOn;
    }

    public Boolean getIsTransformNoiseWordsOn() {
        return isTransformNoiseWordsOn;
    }

    public void setIsTransformNoiseWordsOn(Boolean isTransformNoiseWordsOn) {
        this.isTransformNoiseWordsOn = isTransformNoiseWordsOn;
    }

    public Short getTwoDigitYearCutoff() {
        return twoDigitYearCutoff;
    }

    public void setTwoDigitYearCutoff(Short twoDigitYearCutoff) {
        this.twoDigitYearCutoff = twoDigitYearCutoff;
    }

    public Byte getContainment() {
        return containment;
    }

    public void setContainment(Byte containment) {
        this.containment = containment;
    }

    public String getContainmentDesc() {
        return containmentDesc;
    }

    public void setContainmentDesc(String containmentDesc) {
        this.containmentDesc = containmentDesc == null ? null : containmentDesc.trim();
    }

    public Integer getTargetRecoveryTimeInSeconds() {
        return targetRecoveryTimeInSeconds;
    }

    public void setTargetRecoveryTimeInSeconds(Integer targetRecoveryTimeInSeconds) {
        this.targetRecoveryTimeInSeconds = targetRecoveryTimeInSeconds;
    }

    public Integer getDelayedDurability() {
        return delayedDurability;
    }

    public void setDelayedDurability(Integer delayedDurability) {
        this.delayedDurability = delayedDurability;
    }

    public String getDelayedDurabilityDesc() {
        return delayedDurabilityDesc;
    }

    public void setDelayedDurabilityDesc(String delayedDurabilityDesc) {
        this.delayedDurabilityDesc = delayedDurabilityDesc == null ? null : delayedDurabilityDesc.trim();
    }

    public Boolean getIsMemoryOptimizedElevateToSnapshotOn() {
        return isMemoryOptimizedElevateToSnapshotOn;
    }

    public void setIsMemoryOptimizedElevateToSnapshotOn(Boolean isMemoryOptimizedElevateToSnapshotOn) {
        this.isMemoryOptimizedElevateToSnapshotOn = isMemoryOptimizedElevateToSnapshotOn;
    }

    public byte[] getOwnerSid() {
        return ownerSid;
    }

    public void setOwnerSid(byte[] ownerSid) {
        this.ownerSid = ownerSid;
    }
}