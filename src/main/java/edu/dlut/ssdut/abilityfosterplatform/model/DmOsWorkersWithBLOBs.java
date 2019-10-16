package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsWorkersWithBLOBs extends DmOsWorkers {
    private byte[] workerAddress;

    private byte[] exceptionAddress;

    private byte[] fiberAddress;

    private byte[] taskAddress;

    private byte[] memoryObjectAddress;

    private byte[] threadAddress;

    private byte[] signalWorkerAddress;

    private byte[] schedulerAddress;

    public byte[] getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(byte[] workerAddress) {
        this.workerAddress = workerAddress;
    }

    public byte[] getExceptionAddress() {
        return exceptionAddress;
    }

    public void setExceptionAddress(byte[] exceptionAddress) {
        this.exceptionAddress = exceptionAddress;
    }

    public byte[] getFiberAddress() {
        return fiberAddress;
    }

    public void setFiberAddress(byte[] fiberAddress) {
        this.fiberAddress = fiberAddress;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getThreadAddress() {
        return threadAddress;
    }

    public void setThreadAddress(byte[] threadAddress) {
        this.threadAddress = threadAddress;
    }

    public byte[] getSignalWorkerAddress() {
        return signalWorkerAddress;
    }

    public void setSignalWorkerAddress(byte[] signalWorkerAddress) {
        this.signalWorkerAddress = signalWorkerAddress;
    }

    public byte[] getSchedulerAddress() {
        return schedulerAddress;
    }

    public void setSchedulerAddress(byte[] schedulerAddress) {
        this.schedulerAddress = schedulerAddress;
    }
}