package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmOsMemoryObjects {
    private Long pagesInBytes;

    private Integer creationOptions;

    private Long bytesUsed;

    private String type;

    private String name;

    private Short memoryNodeId;

    private Date creationTime;

    private Integer pageSizeInBytes;

    private Long maxPagesInBytes;

    private Integer sequenceNum;

    public Long getPagesInBytes() {
        return pagesInBytes;
    }

    public void setPagesInBytes(Long pagesInBytes) {
        this.pagesInBytes = pagesInBytes;
    }

    public Integer getCreationOptions() {
        return creationOptions;
    }

    public void setCreationOptions(Integer creationOptions) {
        this.creationOptions = creationOptions;
    }

    public Long getBytesUsed() {
        return bytesUsed;
    }

    public void setBytesUsed(Long bytesUsed) {
        this.bytesUsed = bytesUsed;
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

    public Short getMemoryNodeId() {
        return memoryNodeId;
    }

    public void setMemoryNodeId(Short memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getPageSizeInBytes() {
        return pageSizeInBytes;
    }

    public void setPageSizeInBytes(Integer pageSizeInBytes) {
        this.pageSizeInBytes = pageSizeInBytes;
    }

    public Long getMaxPagesInBytes() {
        return maxPagesInBytes;
    }

    public void setMaxPagesInBytes(Long maxPagesInBytes) {
        this.maxPagesInBytes = maxPagesInBytes;
    }

    public Integer getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(Integer sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
}