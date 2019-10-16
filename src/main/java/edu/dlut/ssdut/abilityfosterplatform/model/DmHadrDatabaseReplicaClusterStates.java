package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class DmHadrDatabaseReplicaClusterStates {
    private String replicaId;

    private String groupDatabaseId;

    private String databaseName;

    private Boolean isFailoverReady;

    private Boolean isPendingSecondarySuspend;

    private Boolean isDatabaseJoined;

    private BigDecimal recoveryLsn;

    private BigDecimal truncationLsn;

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

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public Boolean getIsFailoverReady() {
        return isFailoverReady;
    }

    public void setIsFailoverReady(Boolean isFailoverReady) {
        this.isFailoverReady = isFailoverReady;
    }

    public Boolean getIsPendingSecondarySuspend() {
        return isPendingSecondarySuspend;
    }

    public void setIsPendingSecondarySuspend(Boolean isPendingSecondarySuspend) {
        this.isPendingSecondarySuspend = isPendingSecondarySuspend;
    }

    public Boolean getIsDatabaseJoined() {
        return isDatabaseJoined;
    }

    public void setIsDatabaseJoined(Boolean isDatabaseJoined) {
        this.isDatabaseJoined = isDatabaseJoined;
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
}