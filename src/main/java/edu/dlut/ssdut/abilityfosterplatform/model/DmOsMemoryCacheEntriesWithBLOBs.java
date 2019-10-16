package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryCacheEntriesWithBLOBs extends DmOsMemoryCacheEntries {
    private byte[] cacheAddress;

    private byte[] entryAddress;

    private byte[] entryDataAddress;

    private byte[] memoryObjectAddress;

    public byte[] getCacheAddress() {
        return cacheAddress;
    }

    public void setCacheAddress(byte[] cacheAddress) {
        this.cacheAddress = cacheAddress;
    }

    public byte[] getEntryAddress() {
        return entryAddress;
    }

    public void setEntryAddress(byte[] entryAddress) {
        this.entryAddress = entryAddress;
    }

    public byte[] getEntryDataAddress() {
        return entryDataAddress;
    }

    public void setEntryDataAddress(byte[] entryDataAddress) {
        this.entryDataAddress = entryDataAddress;
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }
}