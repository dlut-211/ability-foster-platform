package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmServerMemoryDumps {
    private String filename;

    private Object creationTime;

    private Long sizeInBytes;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Object getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Object creationTime) {
        this.creationTime = creationTime;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
}