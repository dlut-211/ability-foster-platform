package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsMemoryBuffers {
    private Integer poolId;

    private String name;

    private Boolean isFree;

    private Integer rowCount;

    private Integer bytesUsed;

    private Integer percentUsed;

    private byte[] memoryAddress;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getBytesUsed() {
        return bytesUsed;
    }

    public void setBytesUsed(Integer bytesUsed) {
        this.bytesUsed = bytesUsed;
    }

    public Integer getPercentUsed() {
        return percentUsed;
    }

    public void setPercentUsed(Integer percentUsed) {
        this.percentUsed = percentUsed;
    }

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }
}