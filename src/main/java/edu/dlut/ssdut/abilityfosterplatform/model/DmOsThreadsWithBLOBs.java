package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsThreadsWithBLOBs extends DmOsThreads {
    private byte[] threadAddress;

    private byte[] instructionAddress;

    private byte[] stackBaseAddress;

    private byte[] stackEndAddress;

    private byte[] token;

    private byte[] fiberData;

    private byte[] threadHandle;

    private byte[] eventHandle;

    private byte[] schedulerAddress;

    private byte[] workerAddress;

    private byte[] fiberContextAddress;

    private byte[] selfAddress;

    public byte[] getThreadAddress() {
        return threadAddress;
    }

    public void setThreadAddress(byte[] threadAddress) {
        this.threadAddress = threadAddress;
    }

    public byte[] getInstructionAddress() {
        return instructionAddress;
    }

    public void setInstructionAddress(byte[] instructionAddress) {
        this.instructionAddress = instructionAddress;
    }

    public byte[] getStackBaseAddress() {
        return stackBaseAddress;
    }

    public void setStackBaseAddress(byte[] stackBaseAddress) {
        this.stackBaseAddress = stackBaseAddress;
    }

    public byte[] getStackEndAddress() {
        return stackEndAddress;
    }

    public void setStackEndAddress(byte[] stackEndAddress) {
        this.stackEndAddress = stackEndAddress;
    }

    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    public byte[] getFiberData() {
        return fiberData;
    }

    public void setFiberData(byte[] fiberData) {
        this.fiberData = fiberData;
    }

    public byte[] getThreadHandle() {
        return threadHandle;
    }

    public void setThreadHandle(byte[] threadHandle) {
        this.threadHandle = threadHandle;
    }

    public byte[] getEventHandle() {
        return eventHandle;
    }

    public void setEventHandle(byte[] eventHandle) {
        this.eventHandle = eventHandle;
    }

    public byte[] getSchedulerAddress() {
        return schedulerAddress;
    }

    public void setSchedulerAddress(byte[] schedulerAddress) {
        this.schedulerAddress = schedulerAddress;
    }

    public byte[] getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(byte[] workerAddress) {
        this.workerAddress = workerAddress;
    }

    public byte[] getFiberContextAddress() {
        return fiberContextAddress;
    }

    public void setFiberContextAddress(byte[] fiberContextAddress) {
        this.fiberContextAddress = fiberContextAddress;
    }

    public byte[] getSelfAddress() {
        return selfAddress;
    }

    public void setSelfAddress(byte[] selfAddress) {
        this.selfAddress = selfAddress;
    }
}