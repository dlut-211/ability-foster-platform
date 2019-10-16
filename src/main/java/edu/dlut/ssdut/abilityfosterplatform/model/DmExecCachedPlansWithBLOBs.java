package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecCachedPlansWithBLOBs extends DmExecCachedPlans {
    private byte[] memoryObjectAddress;

    private byte[] planHandle;

    private byte[] parentPlanHandle;

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }

    public byte[] getParentPlanHandle() {
        return parentPlanHandle;
    }

    public void setParentPlanHandle(byte[] parentPlanHandle) {
        this.parentPlanHandle = parentPlanHandle;
    }
}