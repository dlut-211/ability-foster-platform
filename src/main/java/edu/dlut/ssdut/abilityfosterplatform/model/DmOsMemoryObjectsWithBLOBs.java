package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryObjectsWithBLOBs extends DmOsMemoryObjects {
    private byte[] memoryObjectAddress;

    private byte[] parentAddress;

    private byte[] pageAllocatorAddress;

    private byte[] creationStackAddress;

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }

    public byte[] getParentAddress() {
        return parentAddress;
    }

    public void setParentAddress(byte[] parentAddress) {
        this.parentAddress = parentAddress;
    }

    public byte[] getPageAllocatorAddress() {
        return pageAllocatorAddress;
    }

    public void setPageAllocatorAddress(byte[] pageAllocatorAddress) {
        this.pageAllocatorAddress = pageAllocatorAddress;
    }

    public byte[] getCreationStackAddress() {
        return creationStackAddress;
    }

    public void setCreationStackAddress(byte[] creationStackAddress) {
        this.creationStackAddress = creationStackAddress;
    }
}