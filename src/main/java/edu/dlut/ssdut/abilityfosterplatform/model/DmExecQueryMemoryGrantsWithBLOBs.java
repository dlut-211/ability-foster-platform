package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecQueryMemoryGrantsWithBLOBs extends DmExecQueryMemoryGrants {
    private byte[] planHandle;

    private byte[] sqlHandle;

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }
}