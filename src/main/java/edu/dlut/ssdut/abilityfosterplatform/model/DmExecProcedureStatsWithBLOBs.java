package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecProcedureStatsWithBLOBs extends DmExecProcedureStats {
    private byte[] sqlHandle;

    private byte[] planHandle;

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
}