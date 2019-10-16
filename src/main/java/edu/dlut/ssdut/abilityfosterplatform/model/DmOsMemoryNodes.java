package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryNodes {
    private Short memoryNodeId;

    private Long virtualAddressSpaceReservedKb;

    private Long virtualAddressSpaceCommittedKb;

    private Long lockedPageAllocationsKb;

    private Long pagesKb;

    private Long sharedMemoryReservedKb;

    private Long sharedMemoryCommittedKb;

    private Long cpuAffinityMask;

    private Long onlineSchedulerMask;

    private Short processorGroup;

    private Long foreignCommittedKb;

    public Short getMemoryNodeId() {
        return memoryNodeId;
    }

    public void setMemoryNodeId(Short memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
    }

    public Long getVirtualAddressSpaceReservedKb() {
        return virtualAddressSpaceReservedKb;
    }

    public void setVirtualAddressSpaceReservedKb(Long virtualAddressSpaceReservedKb) {
        this.virtualAddressSpaceReservedKb = virtualAddressSpaceReservedKb;
    }

    public Long getVirtualAddressSpaceCommittedKb() {
        return virtualAddressSpaceCommittedKb;
    }

    public void setVirtualAddressSpaceCommittedKb(Long virtualAddressSpaceCommittedKb) {
        this.virtualAddressSpaceCommittedKb = virtualAddressSpaceCommittedKb;
    }

    public Long getLockedPageAllocationsKb() {
        return lockedPageAllocationsKb;
    }

    public void setLockedPageAllocationsKb(Long lockedPageAllocationsKb) {
        this.lockedPageAllocationsKb = lockedPageAllocationsKb;
    }

    public Long getPagesKb() {
        return pagesKb;
    }

    public void setPagesKb(Long pagesKb) {
        this.pagesKb = pagesKb;
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

    public Long getCpuAffinityMask() {
        return cpuAffinityMask;
    }

    public void setCpuAffinityMask(Long cpuAffinityMask) {
        this.cpuAffinityMask = cpuAffinityMask;
    }

    public Long getOnlineSchedulerMask() {
        return onlineSchedulerMask;
    }

    public void setOnlineSchedulerMask(Long onlineSchedulerMask) {
        this.onlineSchedulerMask = onlineSchedulerMask;
    }

    public Short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(Short processorGroup) {
        this.processorGroup = processorGroup;
    }

    public Long getForeignCommittedKb() {
        return foreignCommittedKb;
    }

    public void setForeignCommittedKb(Long foreignCommittedKb) {
        this.foreignCommittedKb = foreignCommittedKb;
    }
}