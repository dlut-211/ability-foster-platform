package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmIoPendingIoRequestsWithBLOBs extends DmIoPendingIoRequests {
    private byte[] ioCompletionRequestAddress;

    private byte[] ioCompletionRoutineAddress;

    private byte[] ioUserDataAddress;

    private byte[] schedulerAddress;

    private byte[] ioHandle;

    public byte[] getIoCompletionRequestAddress() {
        return ioCompletionRequestAddress;
    }

    public void setIoCompletionRequestAddress(byte[] ioCompletionRequestAddress) {
        this.ioCompletionRequestAddress = ioCompletionRequestAddress;
    }

    public byte[] getIoCompletionRoutineAddress() {
        return ioCompletionRoutineAddress;
    }

    public void setIoCompletionRoutineAddress(byte[] ioCompletionRoutineAddress) {
        this.ioCompletionRoutineAddress = ioCompletionRoutineAddress;
    }

    public byte[] getIoUserDataAddress() {
        return ioUserDataAddress;
    }

    public void setIoUserDataAddress(byte[] ioUserDataAddress) {
        this.ioUserDataAddress = ioUserDataAddress;
    }

    public byte[] getSchedulerAddress() {
        return schedulerAddress;
    }

    public void setSchedulerAddress(byte[] schedulerAddress) {
        this.schedulerAddress = schedulerAddress;
    }

    public byte[] getIoHandle() {
        return ioHandle;
    }

    public void setIoHandle(byte[] ioHandle) {
        this.ioHandle = ioHandle;
    }
}