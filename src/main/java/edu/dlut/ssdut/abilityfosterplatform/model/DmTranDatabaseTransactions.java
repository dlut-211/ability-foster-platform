package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;
import java.util.Date;

public class DmTranDatabaseTransactions {
    private Long transactionId;

    private Integer databaseId;

    private Date databaseTransactionBeginTime;

    private Integer databaseTransactionType;

    private Integer databaseTransactionState;

    private Integer databaseTransactionStatus;

    private Integer databaseTransactionStatus2;

    private Long databaseTransactionLogRecordCount;

    private Integer databaseTransactionReplicateRecordCount;

    private Long databaseTransactionLogBytesUsed;

    private Long databaseTransactionLogBytesReserved;

    private Integer databaseTransactionLogBytesUsedSystem;

    private Integer databaseTransactionLogBytesReservedSystem;

    private BigDecimal databaseTransactionBeginLsn;

    private BigDecimal databaseTransactionLastLsn;

    private BigDecimal databaseTransactionMostRecentSavepointLsn;

    private BigDecimal databaseTransactionCommitLsn;

    private BigDecimal databaseTransactionLastRollbackLsn;

    private BigDecimal databaseTransactionNextUndoLsn;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Date getDatabaseTransactionBeginTime() {
        return databaseTransactionBeginTime;
    }

    public void setDatabaseTransactionBeginTime(Date databaseTransactionBeginTime) {
        this.databaseTransactionBeginTime = databaseTransactionBeginTime;
    }

    public Integer getDatabaseTransactionType() {
        return databaseTransactionType;
    }

    public void setDatabaseTransactionType(Integer databaseTransactionType) {
        this.databaseTransactionType = databaseTransactionType;
    }

    public Integer getDatabaseTransactionState() {
        return databaseTransactionState;
    }

    public void setDatabaseTransactionState(Integer databaseTransactionState) {
        this.databaseTransactionState = databaseTransactionState;
    }

    public Integer getDatabaseTransactionStatus() {
        return databaseTransactionStatus;
    }

    public void setDatabaseTransactionStatus(Integer databaseTransactionStatus) {
        this.databaseTransactionStatus = databaseTransactionStatus;
    }

    public Integer getDatabaseTransactionStatus2() {
        return databaseTransactionStatus2;
    }

    public void setDatabaseTransactionStatus2(Integer databaseTransactionStatus2) {
        this.databaseTransactionStatus2 = databaseTransactionStatus2;
    }

    public Long getDatabaseTransactionLogRecordCount() {
        return databaseTransactionLogRecordCount;
    }

    public void setDatabaseTransactionLogRecordCount(Long databaseTransactionLogRecordCount) {
        this.databaseTransactionLogRecordCount = databaseTransactionLogRecordCount;
    }

    public Integer getDatabaseTransactionReplicateRecordCount() {
        return databaseTransactionReplicateRecordCount;
    }

    public void setDatabaseTransactionReplicateRecordCount(Integer databaseTransactionReplicateRecordCount) {
        this.databaseTransactionReplicateRecordCount = databaseTransactionReplicateRecordCount;
    }

    public Long getDatabaseTransactionLogBytesUsed() {
        return databaseTransactionLogBytesUsed;
    }

    public void setDatabaseTransactionLogBytesUsed(Long databaseTransactionLogBytesUsed) {
        this.databaseTransactionLogBytesUsed = databaseTransactionLogBytesUsed;
    }

    public Long getDatabaseTransactionLogBytesReserved() {
        return databaseTransactionLogBytesReserved;
    }

    public void setDatabaseTransactionLogBytesReserved(Long databaseTransactionLogBytesReserved) {
        this.databaseTransactionLogBytesReserved = databaseTransactionLogBytesReserved;
    }

    public Integer getDatabaseTransactionLogBytesUsedSystem() {
        return databaseTransactionLogBytesUsedSystem;
    }

    public void setDatabaseTransactionLogBytesUsedSystem(Integer databaseTransactionLogBytesUsedSystem) {
        this.databaseTransactionLogBytesUsedSystem = databaseTransactionLogBytesUsedSystem;
    }

    public Integer getDatabaseTransactionLogBytesReservedSystem() {
        return databaseTransactionLogBytesReservedSystem;
    }

    public void setDatabaseTransactionLogBytesReservedSystem(Integer databaseTransactionLogBytesReservedSystem) {
        this.databaseTransactionLogBytesReservedSystem = databaseTransactionLogBytesReservedSystem;
    }

    public BigDecimal getDatabaseTransactionBeginLsn() {
        return databaseTransactionBeginLsn;
    }

    public void setDatabaseTransactionBeginLsn(BigDecimal databaseTransactionBeginLsn) {
        this.databaseTransactionBeginLsn = databaseTransactionBeginLsn;
    }

    public BigDecimal getDatabaseTransactionLastLsn() {
        return databaseTransactionLastLsn;
    }

    public void setDatabaseTransactionLastLsn(BigDecimal databaseTransactionLastLsn) {
        this.databaseTransactionLastLsn = databaseTransactionLastLsn;
    }

    public BigDecimal getDatabaseTransactionMostRecentSavepointLsn() {
        return databaseTransactionMostRecentSavepointLsn;
    }

    public void setDatabaseTransactionMostRecentSavepointLsn(BigDecimal databaseTransactionMostRecentSavepointLsn) {
        this.databaseTransactionMostRecentSavepointLsn = databaseTransactionMostRecentSavepointLsn;
    }

    public BigDecimal getDatabaseTransactionCommitLsn() {
        return databaseTransactionCommitLsn;
    }

    public void setDatabaseTransactionCommitLsn(BigDecimal databaseTransactionCommitLsn) {
        this.databaseTransactionCommitLsn = databaseTransactionCommitLsn;
    }

    public BigDecimal getDatabaseTransactionLastRollbackLsn() {
        return databaseTransactionLastRollbackLsn;
    }

    public void setDatabaseTransactionLastRollbackLsn(BigDecimal databaseTransactionLastRollbackLsn) {
        this.databaseTransactionLastRollbackLsn = databaseTransactionLastRollbackLsn;
    }

    public BigDecimal getDatabaseTransactionNextUndoLsn() {
        return databaseTransactionNextUndoLsn;
    }

    public void setDatabaseTransactionNextUndoLsn(BigDecimal databaseTransactionNextUndoLsn) {
        this.databaseTransactionNextUndoLsn = databaseTransactionNextUndoLsn;
    }
}