package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecQueryProfilesWithBLOBs extends DmExecQueryProfiles {
    private byte[] sqlHandle;

    private byte[] planHandle;

    private byte[] taskAddress;

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

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }
}