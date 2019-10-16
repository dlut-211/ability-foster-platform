package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryAllocationsWithBLOBs extends DmOsMemoryAllocations {
    private byte[] memoryAllocationAddress;

    private byte[] memoryObjectAddress;

    private byte[] allocatorStackAddress;

    public byte[] getMemoryAllocationAddress() {
        return memoryAllocationAddress;
    }

    public void setMemoryAllocationAddress(byte[] memoryAllocationAddress) {
        this.memoryAllocationAddress = memoryAllocationAddress;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getAllocatorStackAddress() {
        return allocatorStackAddress;
    }

    public void setAllocatorStackAddress(byte[] allocatorStackAddress) {
        this.allocatorStackAddress = allocatorStackAddress;
    }
}