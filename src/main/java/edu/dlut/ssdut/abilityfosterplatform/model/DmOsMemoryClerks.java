package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryClerks {
    private String type;

    private String name;

    private Short memoryNodeId;

    private Long pagesKb;

    private Long virtualMemoryReservedKb;

    private Long virtualMemoryCommittedKb;

    private Long aweAllocatedKb;

    private Long sharedMemoryReservedKb;

    private Long sharedMemoryCommittedKb;

    private Long pageSizeInBytes;

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

    public Long getPagesKb() {
        return pagesKb;
    }

    public void setPagesKb(Long pagesKb) {
        this.pagesKb = pagesKb;
    }

    public Long getVirtualMemoryReservedKb() {
        return virtualMemoryReservedKb;
    }

    public void setVirtualMemoryReservedKb(Long virtualMemoryReservedKb) {
        this.virtualMemoryReservedKb = virtualMemoryReservedKb;
    }

    public Long getVirtualMemoryCommittedKb() {
        return virtualMemoryCommittedKb;
    }

    public void setVirtualMemoryCommittedKb(Long virtualMemoryCommittedKb) {
        this.virtualMemoryCommittedKb = virtualMemoryCommittedKb;
    }

    public Long getAweAllocatedKb() {
        return aweAllocatedKb;
    }

    public void setAweAllocatedKb(Long aweAllocatedKb) {
        this.aweAllocatedKb = aweAllocatedKb;
    }

    public Long getSharedMemoryReservedKb() {
        return sharedMemoryReservedKb;
    }

    public void setSharedMemoryReservedKb(Long sharedMemoryReservedKb) {
        this.sharedMemoryReservedKb = sharedMemoryReservedKb;
    }

    public Long getSharedMemoryCommittedKb() {
        return sharedMemoryCommittedKb;
    }

    public void setSharedMemoryCommittedKb(Long sharedMemoryCommittedKb) {
        this.sharedMemoryCommittedKb = sharedMemoryCommittedKb;
    }

    public Long getPageSizeInBytes() {
        return pageSizeInBytes;
    }

    public void setPageSizeInBytes(Long pageSizeInBytes) {
        this.pageSizeInBytes = pageSizeInBytes;
    }
}