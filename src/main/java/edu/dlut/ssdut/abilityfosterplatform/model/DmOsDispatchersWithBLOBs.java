package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsDispatchersWithBLOBs extends DmOsDispatchers {
    private byte[] dispatcherPoolAddress;

    private byte[] taskAddress;

    public byte[] getDispatcherPoolAddress() {
        return dispatcherPoolAddress;
    }

    public void setDispatcherPoolAddress(byte[] dispatcherPoolAddress) {
        this.dispatcherPoolAddress = dispatcherPoolAddress;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }
}