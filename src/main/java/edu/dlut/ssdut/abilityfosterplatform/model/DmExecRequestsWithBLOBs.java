package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecRequestsWithBLOBs extends DmExecRequests {
    private byte[] sqlHandle;

    private byte[] planHandle;

    private byte[] contextInfo;

    private byte[] taskAddress;

    private byte[] queryHash;

    private byte[] queryPlanHash;

    private byte[] statementSqlHandle;

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }

    public byte[] getContextInfo() {
        return contextInfo;
    }

    public void setContextInfo(byte[] contextInfo) {
        this.contextInfo = contextInfo;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public byte[] getQueryHash() {
        return queryHash;
    }

    public void setQueryHash(byte[] queryHash) {
        this.queryHash = queryHash;
    }

    public byte[] getQueryPlanHash() {
        return queryPlanHash;
    }

    public void setQueryPlanHash(byte[] queryPlanHash) {
        this.queryPlanHash = queryPlanHash;
    }

    public byte[] getStatementSqlHandle() {
        return statementSqlHandle;
    }

    public void setStatementSqlHandle(byte[] statementSqlHandle) {
        this.statementSqlHandle = statementSqlHandle;
    }
}