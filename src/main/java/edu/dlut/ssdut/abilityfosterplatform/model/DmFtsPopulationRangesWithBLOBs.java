package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsPopulationRangesWithBLOBs extends DmFtsPopulationRanges {
    private byte[] memoryAddress;

    private byte[] parentMemoryAddress;

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public byte[] getParentMemoryAddress() {
        return parentMemoryAddress;
    }

    public void setParentMemoryAddress(byte[] parentMemoryAddress) {
        this.parentMemoryAddress = parentMemoryAddress;
    }
}