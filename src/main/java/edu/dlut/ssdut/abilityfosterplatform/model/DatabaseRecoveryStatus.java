package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class DatabaseRecoveryStatus {
    private Integer databaseId;

    private String databaseGuid;

    private String familyGuid;

    private BigDecimal lastLogBackupLsn;

    private String recoveryForkGuid;

    private String firstRecoveryForkGuid;

    private BigDecimal forkPointLsn;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDatabaseGuid() {
        return databaseGuid;
    }

    public void setDatabaseGuid(String databaseGuid) {
        this.databaseGuid = databaseGuid == null ? null : databaseGuid.trim();
    }

    public String getFamilyGuid() {
        return familyGuid;
    }

    public void setFamilyGuid(String familyGuid) {
        this.familyGuid = familyGuid == null ? null : familyGuid.trim();
    }

    public BigDecimal getLastLogBackupLsn() {
        return lastLogBackupLsn;
    }

    public void setLastLogBackupLsn(BigDecimal lastLogBackupLsn) {
        this.lastLogBackupLsn = lastLogBackupLsn;
    }

    public String getRecoveryForkGuid() {
        return recoveryForkGuid;
    }

    public void setRecoveryForkGuid(String recoveryForkGuid) {
        this.recoveryForkGuid = recoveryForkGuid == null ? null : recoveryForkGuid.trim();
    }

    public String getFirstRecoveryForkGuid() {
        return firstRecoveryForkGuid;
    }

    public void setFirstRecoveryForkGuid(String firstRecoveryForkGuid) {
        this.firstRecoveryForkGuid = firstRecoveryForkGuid == null ? null : firstRecoveryForkGuid.trim();
    }

    public BigDecimal getForkPointLsn() {
        return forkPointLsn;
    }

    public void setForkPointLsn(BigDecimal forkPointLsn) {
        this.forkPointLsn = forkPointLsn;
    }
}