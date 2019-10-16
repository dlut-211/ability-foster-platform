package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecQueryStatsWithBLOBs extends DmExecQueryStats {
    private byte[] sqlHandle;

    private byte[] planHandle;

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