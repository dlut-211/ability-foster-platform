package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsIndexPopulationWithBLOBs extends DmFtsIndexPopulation {
    private byte[] memoryAddress;

    private byte[] incrementalTimestamp;

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public byte[] getIncrementalTimestamp() {
        return incrementalTimestamp;
    }

    public void setIncrementalTimestamp(byte[] incrementalTimestamp) {
        this.incrementalTimestamp = incrementalTimestamp;
    }
}