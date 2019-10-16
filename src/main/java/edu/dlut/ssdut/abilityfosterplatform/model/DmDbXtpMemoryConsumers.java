package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbXtpMemoryConsumers {
    private Long memoryConsumerId;

    private Integer memoryConsumerType;

    private String memoryConsumerTypeDesc;

    private String memoryConsumerDesc;

    private Integer objectId;

    private Integer indexId;

    private Long allocatedBytes;

    private Long usedBytes;

    private Integer allocationCount;

    private Integer partitionCount;

    private Integer sizeclassCount;

    private Integer minSizeclass;

    private Integer maxSizeclass;

    private byte[] memoryConsumerAddress;

    public Long getMemoryConsumerId() {
        return memoryConsumerId;
    }

    public void setMemoryConsumerId(Long memoryConsumerId) {
        this.memoryConsumerId = memoryConsumerId;
    }

    public Integer getMemoryConsumerType() {
        return memoryConsumerType;
    }

    public void setMemoryConsumerType(Integer memoryConsumerType) {
        this.memoryConsumerType = memoryConsumerType;
    }

    public String getMemoryConsumerTypeDesc() {
        return memoryConsumerTypeDesc;
    }

    public void setMemoryConsumerTypeDesc(String memoryConsumerTypeDesc) {
        this.memoryConsumerTypeDesc = memoryConsumerTypeDesc == null ? null : memoryConsumerTypeDesc.trim();
    }

    public String getMemoryConsumerDesc() {
        return memoryConsumerDesc;
    }

    public void setMemoryConsumerDesc(String memoryConsumerDesc) {
        this.memoryConsumerDesc = memoryConsumerDesc == null ? null : memoryConsumerDesc.trim();
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Long getAllocatedBytes() {
        return allocatedBytes;
    }

    public void setAllocatedBytes(Long allocatedBytes) {
        this.allocatedBytes = allocatedBytes;
    }

    public Long getUsedBytes() {
        return usedBytes;
    }

    public void setUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
    }

    public Integer getAllocationCount() {
        return allocationCount;
    }

    public void setAllocationCount(Integer allocationCount) {
        this.allocationCount = allocationCount;
    }

    public Integer getPartitionCount() {
        return partitionCount;
    }

    public void setPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
    }

    public Integer getSizeclassCount() {
        return sizeclassCount;
    }

    public void setSizeclassCount(Integer sizeclassCount) {
        this.sizeclassCount = sizeclassCount;
    }

    public Integer getMinSizeclass() {
        return minSizeclass;
    }

    public void setMinSizeclass(Integer minSizeclass) {
        this.minSizeclass = minSizeclass;
    }

    public Integer getMaxSizeclass() {
        return maxSizeclass;
    }

    public void setMaxSizeclass(Integer maxSizeclass) {
        this.maxSizeclass = maxSizeclass;
    }

    public byte[] getMemoryConsumerAddress() {
        return memoryConsumerAddress;
    }

    public void setMemoryConsumerAddress(byte[] memoryConsumerAddress) {
        this.memoryConsumerAddress = memoryConsumerAddress;
    }
}