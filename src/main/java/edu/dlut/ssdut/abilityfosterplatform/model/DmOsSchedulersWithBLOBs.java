package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsSchedulersWithBLOBs extends DmOsSchedulers {
    private byte[] schedulerAddress;

    private byte[] activeWorkerAddress;

    private byte[] memoryObjectAddress;

    private byte[] taskMemoryObjectAddress;

    public byte[] getSchedulerAddress() {
        return schedulerAddress;
    }

    public void setSchedulerAddress(byte[] schedulerAddress) {
        this.schedulerAddress = schedulerAddress;
    }

    public byte[] getActiveWorkerAddress() {
        return activeWorkerAddress;
    }

    public void setActiveWorkerAddress(byte[] activeWorkerAddress) {
        this.activeWorkerAddress = activeWorkerAddress;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getTaskMemoryObjectAddress() {
        return taskMemoryObjectAddress;
    }

    public void setTaskMemoryObjectAddress(byte[] taskMemoryObjectAddress) {
        this.taskMemoryObjectAddress = taskMemoryObjectAddress;
    }
}