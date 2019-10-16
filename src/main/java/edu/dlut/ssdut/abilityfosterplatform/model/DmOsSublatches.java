package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsSublatches {
    private Integer partitionId;

    private byte[] superlatchAddress;

    private byte[] sublatchAddress;

    public Integer getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Integer partitionId) {
        this.partitionId = partitionId;
    }

    public byte[] getSuperlatchAddress() {
        return superlatchAddress;
    }

    public void setSuperlatchAddress(byte[] superlatchAddress) {
        this.superlatchAddress = superlatchAddress;
    }

    public byte[] getSublatchAddress() {
        return sublatchAddress;
    }

    public void setSublatchAddress(byte[] sublatchAddress) {
        this.sublatchAddress = sublatchAddress;
    }
}