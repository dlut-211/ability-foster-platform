package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmOsMemoryAllocations {
    private Long sizeInBytes;

    private Date creationTime;

    private Short memoryNodeId;

    private String sourceFile;

    private Integer lineNum;

    private Integer sequenceNum;

    private Integer tag;

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Short getMemoryNodeId() {
        return memoryNodeId;
    }

    public void setMemoryNodeId(Short memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile == null ? null : sourceFile.trim();
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public Integer getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(Integer sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }
}