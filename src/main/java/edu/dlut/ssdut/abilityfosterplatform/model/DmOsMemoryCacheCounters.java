package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryCacheCounters {
    private String name;

    private String type;

    private Long pagesKb;

    private Long pagesInUseKb;

    private Long entriesCount;

    private Long entriesInUseCount;

    private byte[] cacheAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getPagesKb() {
        return pagesKb;
    }

    public void setPagesKb(Long pagesKb) {
        this.pagesKb = pagesKb;
    }

    public Long getPagesInUseKb() {
        return pagesInUseKb;
    }

    public void setPagesInUseKb(Long pagesInUseKb) {
        this.pagesInUseKb = pagesInUseKb;
    }

    public Long getEntriesCount() {
        return entriesCount;
    }

    public void setEntriesCount(Long entriesCount) {
        this.entriesCount = entriesCount;
    }

    public Long getEntriesInUseCount() {
        return entriesInUseCount;
    }

    public void setEntriesInUseCount(Long entriesInUseCount) {
        this.entriesInUseCount = entriesInUseCount;
    }

    public byte[] getCacheAddress() {
        return cacheAddress;
    }

    public void setCacheAddress(byte[] cacheAddress) {
        this.cacheAddress = cacheAddress;
    }
}