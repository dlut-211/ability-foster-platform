package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecCursorsWithBLOBs extends DmExecCursors {
    private byte[] sqlHandle;

    private byte[] statementSqlHandle;

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public byte[] getStatementSqlHandle() {
        return statementSqlHandle;
    }

    public void setStatementSqlHandle(byte[] statementSqlHandle) {
        this.statementSqlHandle = statementSqlHandle;
    }
}