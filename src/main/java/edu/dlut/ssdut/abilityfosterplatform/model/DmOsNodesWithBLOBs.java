package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsNodesWithBLOBs extends DmOsNodes {
    private byte[] memoryObjectAddress;

    private byte[] memoryClerkAddress;

    private byte[] ioCompletionWorkerAddress;

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getMemoryClerkAddress() {
        return memoryClerkAddress;
    }

    public void setMemoryClerkAddress(byte[] memoryClerkAddress) {
        this.memoryClerkAddress = memoryClerkAddress;
    }

    public byte[] getIoCompletionWorkerAddress() {
        return ioCompletionWorkerAddress;
    }

    public void setIoCompletionWorkerAddress(byte[] ioCompletionWorkerAddress) {
        this.ioCompletionWorkerAddress = ioCompletionWorkerAddress;
    }
}