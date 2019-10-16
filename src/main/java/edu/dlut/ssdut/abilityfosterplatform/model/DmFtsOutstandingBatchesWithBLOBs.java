package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsOutstandingBatchesWithBLOBs extends DmFtsOutstandingBatches {
    private byte[] memoryAddress;

    private byte[] crawlMemoryAddress;

    private byte[] memregionMemoryAddress;

    private byte[] batchTimestamp;

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    public byte[] getCrawlMemoryAddress() {
        return crawlMemoryAddress;
    }

    public void setCrawlMemoryAddress(byte[] crawlMemoryAddress) {
        this.crawlMemoryAddress = crawlMemoryAddress;
    }

    public byte[] getMemregionMemoryAddress() {
        return memregionMemoryAddress;
    }

    public void setMemregionMemoryAddress(byte[] memregionMemoryAddress) {
        this.memregionMemoryAddress = memregionMemoryAddress;
    }

    public byte[] getBatchTimestamp() {
        return batchTimestamp;
    }

    public void setBatchTimestamp(byte[] batchTimestamp) {
        this.batchTimestamp = batchTimestamp;
    }
}