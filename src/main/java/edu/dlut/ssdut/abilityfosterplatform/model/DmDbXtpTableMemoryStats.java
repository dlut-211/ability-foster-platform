package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbXtpTableMemoryStats {
    private Integer objectId;

    private Long memoryAllocatedForTableKb;

    private Long memoryUsedByTableKb;

    private Long memoryAllocatedForIndexesKb;

    private Long memoryUsedByIndexesKb;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Long getMemoryAllocatedForTableKb() {
        return memoryAllocatedForTableKb;
    }

    public void setMemoryAllocatedForTableKb(Long memoryAllocatedForTableKb) {
        this.memoryAllocatedForTableKb = memoryAllocatedForTableKb;
    }

    public Long getMemoryUsedByTableKb() {
        return memoryUsedByTableKb;
    }

    public void setMemoryUsedByTableKb(Long memoryUsedByTableKb) {
        this.memoryUsedByTableKb = memoryUsedByTableKb;
    }

    public Long getMemoryAllocatedForIndexesKb() {
        return memoryAllocatedForIndexesKb;
    }

    public void setMemoryAllocatedForIndexesKb(Long memoryAllocatedForIndexesKb) {
        this.memoryAllocatedForIndexesKb = memoryAllocatedForIndexesKb;
    }

    public Long getMemoryUsedByIndexesKb() {
        return memoryUsedByIndexesKb;
    }

    public void setMemoryUsedByIndexesKb(Long memoryUsedByIndexesKb) {
        this.memoryUsedByIndexesKb = memoryUsedByIndexesKb;
    }
}