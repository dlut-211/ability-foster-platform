package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmIoVirtualFileStats {
    private Short databaseId;

    private Short fileId;

    private Integer sampleMs;

    private Long numOfReads;

    private Long numOfBytesRead;

    private Long ioStallReadMs;

    private Long ioStallQueuedReadMs;

    private Long numOfWrites;

    private Long numOfBytesWritten;

    private Long ioStallWriteMs;

    private Long ioStallQueuedWriteMs;

    private Long ioStall;

    private Long sizeOnDiskBytes;

    private byte[] fileHandle;

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Short getFileId() {
        return fileId;
    }

    public void setFileId(Short fileId) {
        this.fileId = fileId;
    }

    public Integer getSampleMs() {
        return sampleMs;
    }

    public void setSampleMs(Integer sampleMs) {
        this.sampleMs = sampleMs;
    }

    public Long getNumOfReads() {
        return numOfReads;
    }

    public void setNumOfReads(Long numOfReads) {
        this.numOfReads = numOfReads;
    }

    public Long getNumOfBytesRead() {
        return numOfBytesRead;
    }

    public void setNumOfBytesRead(Long numOfBytesRead) {
        this.numOfBytesRead = numOfBytesRead;
    }

    public Long getIoStallReadMs() {
        return ioStallReadMs;
    }

    public void setIoStallReadMs(Long ioStallReadMs) {
        this.ioStallReadMs = ioStallReadMs;
    }

    public Long getIoStallQueuedReadMs() {
        return ioStallQueuedReadMs;
    }

    public void setIoStallQueuedReadMs(Long ioStallQueuedReadMs) {
        this.ioStallQueuedReadMs = ioStallQueuedReadMs;
    }

    public Long getNumOfWrites() {
        return numOfWrites;
    }

    public void setNumOfWrites(Long numOfWrites) {
        this.numOfWrites = numOfWrites;
    }

    public Long getNumOfBytesWritten() {
        return numOfBytesWritten;
    }

    public void setNumOfBytesWritten(Long numOfBytesWritten) {
        this.numOfBytesWritten = numOfBytesWritten;
    }

    public Long getIoStallWriteMs() {
        return ioStallWriteMs;
    }

    public void setIoStallWriteMs(Long ioStallWriteMs) {
        this.ioStallWriteMs = ioStallWriteMs;
    }

    public Long getIoStallQueuedWriteMs() {
        return ioStallQueuedWriteMs;
    }

    public void setIoStallQueuedWriteMs(Long ioStallQueuedWriteMs) {
        this.ioStallQueuedWriteMs = ioStallQueuedWriteMs;
    }

    public Long getIoStall() {
        return ioStall;
    }

    public void setIoStall(Long ioStall) {
        this.ioStall = ioStall;
    }

    public Long getSizeOnDiskBytes() {
        return sizeOnDiskBytes;
    }

    public void setSizeOnDiskBytes(Long sizeOnDiskBytes) {
        this.sizeOnDiskBytes = sizeOnDiskBytes;
    }

    public byte[] getFileHandle() {
        return fileHandle;
    }

    public void setFileHandle(byte[] fileHandle) {
        this.fileHandle = fileHandle;
    }
}