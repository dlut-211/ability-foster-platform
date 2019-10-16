package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsRingBuffers {
    private String ringBufferType;

    private Long timestamp;

    private String record;

    private byte[] ringBufferAddress;

    public String getRingBufferType() {
        return ringBufferType;
    }

    public void setRingBufferType(String ringBufferType) {
        this.ringBufferType = ringBufferType == null ? null : ringBufferType.trim();
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public byte[] getRingBufferAddress() {
        return ringBufferAddress;
    }

    public void setRingBufferAddress(byte[] ringBufferAddress) {
        this.ringBufferAddress = ringBufferAddress;
    }
}