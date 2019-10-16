package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsVirtualAddressDump {
    private Long regionSizeInBytes;

    private byte[] regionBaseAddress;

    private byte[] regionAllocationBaseAddress;

    private byte[] regionAllocationProtection;

    private byte[] regionState;

    private byte[] regionCurrentProtection;

    private byte[] regionType;

    public Long getRegionSizeInBytes() {
        return regionSizeInBytes;
    }

    public void setRegionSizeInBytes(Long regionSizeInBytes) {
        this.regionSizeInBytes = regionSizeInBytes;
    }

    public byte[] getRegionBaseAddress() {
        return regionBaseAddress;
    }

    public void setRegionBaseAddress(byte[] regionBaseAddress) {
        this.regionBaseAddress = regionBaseAddress;
    }

    public byte[] getRegionAllocationBaseAddress() {
        return regionAllocationBaseAddress;
    }

    public void setRegionAllocationBaseAddress(byte[] regionAllocationBaseAddress) {
        this.regionAllocationBaseAddress = regionAllocationBaseAddress;
    }

    public byte[] getRegionAllocationProtection() {
        return regionAllocationProtection;
    }

    public void setRegionAllocationProtection(byte[] regionAllocationProtection) {
        this.regionAllocationProtection = regionAllocationProtection;
    }

    public byte[] getRegionState() {
        return regionState;
    }

    public void setRegionState(byte[] regionState) {
        this.regionState = regionState;
    }

    public byte[] getRegionCurrentProtection() {
        return regionCurrentProtection;
    }

    public void setRegionCurrentProtection(byte[] regionCurrentProtection) {
        this.regionCurrentProtection = regionCurrentProtection;
    }

    public byte[] getRegionType() {
        return regionType;
    }

    public void setRegionType(byte[] regionType) {
        this.regionType = regionType;
    }
}