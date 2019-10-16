package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryPools {
    private Integer poolId;

    private String type;

    private String name;

    private Long maxFreeEntriesCount;

    private Long freeEntriesCount;

    private Long removedInAllRoundsCount;

    private byte[] memoryPoolAddress;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getMaxFreeEntriesCount() {
        return maxFreeEntriesCount;
    }

    public void setMaxFreeEntriesCount(Long maxFreeEntriesCount) {
        this.maxFreeEntriesCount = maxFreeEntriesCount;
    }

    public Long getFreeEntriesCount() {
        return freeEntriesCount;
    }

    public void setFreeEntriesCount(Long freeEntriesCount) {
        this.freeEntriesCount = freeEntriesCount;
    }

    public Long getRemovedInAllRoundsCount() {
        return removedInAllRoundsCount;
    }

    public void setRemovedInAllRoundsCount(Long removedInAllRoundsCount) {
        this.removedInAllRoundsCount = removedInAllRoundsCount;
    }

    public byte[] getMemoryPoolAddress() {
        return memoryPoolAddress;
    }

    public void setMemoryPoolAddress(byte[] memoryPoolAddress) {
        this.memoryPoolAddress = memoryPoolAddress;
    }
}