package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryClerksWithBLOBs extends DmOsMemoryClerks {
    private byte[] memoryClerkAddress;

    private byte[] pageAllocatorAddress;

    private byte[] hostAddress;

    public byte[] getMemoryClerkAddress() {
        return memoryClerkAddress;
    }

    public void setMemoryClerkAddress(byte[] memoryClerkAddress) {
        this.memoryClerkAddress = memoryClerkAddress;
    }

    public byte[] getPageAllocatorAddress() {
        return pageAllocatorAddress;
    }

    public void setPageAllocatorAddress(byte[] pageAllocatorAddress) {
        this.pageAllocatorAddress = pageAllocatorAddress;
    }

    public byte[] getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(byte[] hostAddress) {
        this.hostAddress = hostAddress;
    }
}