package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsWaitingTasksWithBLOBs extends DmOsWaitingTasks {
    private byte[] waitingTaskAddress;

    private byte[] resourceAddress;

    private byte[] blockingTaskAddress;

    public byte[] getWaitingTaskAddress() {
        return waitingTaskAddress;
    }

    public void setWaitingTaskAddress(byte[] waitingTaskAddress) {
        this.waitingTaskAddress = waitingTaskAddress;
    }

    public byte[] getResourceAddress() {
        return resourceAddress;
    }

    public void setResourceAddress(byte[] resourceAddress) {
        this.resourceAddress = resourceAddress;
    }

    public byte[] getBlockingTaskAddress() {
        return blockingTaskAddress;
    }

    public void setBlockingTaskAddress(byte[] blockingTaskAddress) {
        this.blockingTaskAddress = blockingTaskAddress;
    }
}