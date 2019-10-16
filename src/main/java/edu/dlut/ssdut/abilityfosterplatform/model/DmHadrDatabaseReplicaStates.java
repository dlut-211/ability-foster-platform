package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;
import java.util.Date;

public class DmHadrDatabaseReplicaStates {
    private Integer databaseId;

    private String groupId;

    private String replicaId;

    private String groupDatabaseId;

    private Boolean isLocal;

    private Boolean isPrimaryReplica;

    private Byte synchronizationState;

    private String synchronizationStateDesc;

    private Boolean isCommitParticipant;

    private Byte synchronizationHealth;

    private String synchronizationHealthDesc;

    private Byte databaseState;

    private String databaseStateDesc;

    private Boolean isSuspended;

    private Byte suspendReason;

    private String suspendReasonDesc;

    private BigDecimal recoveryLsn;

    private BigDecimal truncationLsn;

    private BigDecimal lastSentLsn;

    private Date lastSentTime;

    private BigDecimal lastReceivedLsn;

    private Date lastReceivedTime;

    private BigDecimal lastHardenedLsn;

    private Date lastHardenedTime;

    private BigDecimal lastRedoneLsn;

    private Date lastRedoneTime;

    private Long logSendQueueSize;

    private Long logSendRate;

    private Long redoQueueSize;

    private Long redoRate;

    private Long filestreamSendRate;

    private BigDecimal endOfLogLsn;

    private BigDecimal lastCommitLsn;

    private Date lastCommitTime;

    private Long lowWaterMarkForGhosts;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
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

    public Boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Boolean getIsPrimaryReplica() {
        return isPrimaryReplica;
    }

    public void setIsPrimaryReplica(Boolean isPrimaryReplica) {
        this.isPrimaryReplica = isPrimaryReplica;
    }

    public Byte getSynchronizationState() {
        return synchronizationState;
    }

    public void setSynchronizationState(Byte synchronizationState) {
        this.synchronizationState = synchronizationState;
    }

    public String getSynchronizationStateDesc() {
        return synchronizationStateDesc;
    }

    public void setSynchronizationStateDesc(String synchronizationStateDesc) {
        this.synchronizationStateDesc = synchronizationStateDesc == null ? null : synchronizationStateDesc.trim();
    }

    public Boolean getIsCommitParticipant() {
        return isCommitParticipant;
    }

    public void setIsCommitParticipant(Boolean isCommitParticipant) {
        this.isCommitParticipant = isCommitParticipant;
    }

    public Byte getSynchronizationHealth() {
        return synchronizationHealth;
    }

    public void setSynchronizationHealth(Byte synchronizationHealth) {
        this.synchronizationHealth = synchronizationHealth;
    }

    public String getSynchronizationHealthDesc() {
        return synchronizationHealthDesc;
    }

    public void setSynchronizationHealthDesc(String synchronizationHealthDesc) {
        this.synchronizationHealthDesc = synchronizationHealthDesc == null ? null : synchronizationHealthDesc.trim();
    }

    public Byte getDatabaseState() {
        return databaseState;
    }

    public void setDatabaseState(Byte databaseState) {
        this.databaseState = databaseState;
    }

    public String getDatabaseStateDesc() {
        return databaseStateDesc;
    }

    public void setDatabaseStateDesc(String databaseStateDesc) {
        this.databaseStateDesc = databaseStateDesc == null ? null : databaseStateDesc.trim();
    }

    public Boolean getIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }

    public Byte getSuspendReason() {
        return suspendReason;
    }

    public void setSuspendReason(Byte suspendReason) {
        this.suspendReason = suspendReason;
    }

    public String getSuspendReasonDesc() {
        return suspendReasonDesc;
    }

    public void setSuspendReasonDesc(String suspendReasonDesc) {
        this.suspendReasonDesc = suspendReasonDesc == null ? null : suspendReasonDesc.trim();
    }

    public BigDecimal getRecoveryLsn() {
        return recoveryLsn;
    }

    public void setRecoveryLsn(BigDecimal recoveryLsn) {
        this.recoveryLsn = recoveryLsn;
    }

    public BigDecimal getTruncationLsn() {
        return truncationLsn;
    }

    public void setTruncationLsn(BigDecimal truncationLsn) {
        this.truncationLsn = truncationLsn;
    }

    public BigDecimal getLastSentLsn() {
        return lastSentLsn;
    }

    public void setLastSentLsn(BigDecimal lastSentLsn) {
        this.lastSentLsn = lastSentLsn;
    }

    public Date getLastSentTime() {
        return lastSentTime;
    }

    public void setLastSentTime(Date lastSentTime) {
        this.lastSentTime = lastSentTime;
    }

    public BigDecimal getLastReceivedLsn() {
        return lastReceivedLsn;
    }

    public void setLastReceivedLsn(BigDecimal lastReceivedLsn) {
        this.lastReceivedLsn = lastReceivedLsn;
    }

    public Date getLastReceivedTime() {
        return lastReceivedTime;
    }

    public void setLastReceivedTime(Date lastReceivedTime) {
        this.lastReceivedTime = lastReceivedTime;
    }

    public BigDecimal getLastHardenedLsn() {
        return lastHardenedLsn;
    }

    public void setLastHardenedLsn(BigDecimal lastHardenedLsn) {
        this.lastHardenedLsn = lastHardenedLsn;
    }

    public Date getLastHardenedTime() {
        return lastHardenedTime;
    }

    public void setLastHardenedTime(Date lastHardenedTime) {
        this.lastHardenedTime = lastHardenedTime;
    }

    public BigDecimal getLastRedoneLsn() {
        return lastRedoneLsn;
    }

    public void setLastRedoneLsn(BigDecimal lastRedoneLsn) {
        this.lastRedoneLsn = lastRedoneLsn;
    }

    public Date getLastRedoneTime() {
        return lastRedoneTime;
    }

    public void setLastRedoneTime(Date lastRedoneTime) {
        this.lastRedoneTime = lastRedoneTime;
    }

    public Long getLogSendQueueSize() {
        return logSendQueueSize;
    }

    public void setLogSendQueueSize(Long logSendQueueSize) {
        this.logSendQueueSize = logSendQueueSize;
    }

    public Long getLogSendRate() {
        return logSendRate;
    }

    public void setLogSendRate(Long logSendRate) {
        this.logSendRate = logSendRate;
    }

    public Long getRedoQueueSize() {
        return redoQueueSize;
    }

    public void setRedoQueueSize(Long redoQueueSize) {
        this.redoQueueSize = redoQueueSize;
    }

    public Long getRedoRate() {
        return redoRate;
    }

    public void setRedoRate(Long redoRate) {
        this.redoRate = redoRate;
    }

    public Long getFilestreamSendRate() {
        return filestreamSendRate;
    }

    public void setFilestreamSendRate(Long filestreamSendRate) {
        this.filestreamSendRate = filestreamSendRate;
    }

    public BigDecimal getEndOfLogLsn() {
        return endOfLogLsn;
    }

    public void setEndOfLogLsn(BigDecimal endOfLogLsn) {
        this.endOfLogLsn = endOfLogLsn;
    }

    public BigDecimal getLastCommitLsn() {
        return lastCommitLsn;
    }

    public void setLastCommitLsn(BigDecimal lastCommitLsn) {
        this.lastCommitLsn = lastCommitLsn;
    }

    public Date getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(Date lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
    }

    public Long getLowWaterMarkForGhosts() {
        return lowWaterMarkForGhosts;
    }

    public void setLowWaterMarkForGhosts(Long lowWaterMarkForGhosts) {
        this.lowWaterMarkForGhosts = lowWaterMarkForGhosts;
    }
}