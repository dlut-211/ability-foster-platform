package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsProcessMemory {
    private Long physicalMemoryInUseKb;

    private Long largePageAllocationsKb;

    private Long lockedPageAllocationsKb;

    private Long totalVirtualAddressSpaceKb;

    private Long virtualAddressSpaceReservedKb;

    private Long virtualAddressSpaceCommittedKb;

    private Long virtualAddressSpaceAvailableKb;

    private Long pageFaultCount;

    private Integer memoryUtilizationPercentage;

    private Long availableCommitLimitKb;

    private Boolean processPhysicalMemoryLow;

    private Boolean processVirtualMemoryLow;

    public Long getPhysicalMemoryInUseKb() {
        return physicalMemoryInUseKb;
    }

    public void setPhysicalMemoryInUseKb(Long physicalMemoryInUseKb) {
        this.physicalMemoryInUseKb = physicalMemoryInUseKb;
    }

    public Long getLargePageAllocationsKb() {
        return largePageAllocationsKb;
    }

    public void setLargePageAllocationsKb(Long largePageAllocationsKb) {
        this.largePageAllocationsKb = largePageAllocationsKb;
    }

    public Long getLockedPageAllocationsKb() {
        return lockedPageAllocationsKb;
    }

    public void setLockedPageAllocationsKb(Long lockedPageAllocationsKb) {
        this.lockedPageAllocationsKb = lockedPageAllocationsKb;
    }

    public Long getTotalVirtualAddressSpaceKb() {
        return totalVirtualAddressSpaceKb;
    }

    public void setTotalVirtualAddressSpaceKb(Long totalVirtualAddressSpaceKb) {
        this.totalVirtualAddressSpaceKb = totalVirtualAddressSpaceKb;
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

    public Long getVirtualAddressSpaceAvailableKb() {
        return virtualAddressSpaceAvailableKb;
    }

    public void setVirtualAddressSpaceAvailableKb(Long virtualAddressSpaceAvailableKb) {
        this.virtualAddressSpaceAvailableKb = virtualAddressSpaceAvailableKb;
    }

    public Long getPageFaultCount() {
        return pageFaultCount;
    }

    public void setPageFaultCount(Long pageFaultCount) {
        this.pageFaultCount = pageFaultCount;
    }

    public Integer getMemoryUtilizationPercentage() {
        return memoryUtilizationPercentage;
    }

    public void setMemoryUtilizationPercentage(Integer memoryUtilizationPercentage) {
        this.memoryUtilizationPercentage = memoryUtilizationPercentage;
    }

    public Long getAvailableCommitLimitKb() {
        return availableCommitLimitKb;
    }

    public void setAvailableCommitLimitKb(Long availableCommitLimitKb) {
        this.availableCommitLimitKb = availableCommitLimitKb;
    }

    public Boolean getProcessPhysicalMemoryLow() {
        return processPhysicalMemoryLow;
    }

    public void setProcessPhysicalMemoryLow(Boolean processPhysicalMemoryLow) {
        this.processPhysicalMemoryLow = processPhysicalMemoryLow;
    }

    public Boolean getProcessVirtualMemoryLow() {
        return processVirtualMemoryLow;
    }

    public void setProcessVirtualMemoryLow(Boolean processVirtualMemoryLow) {
        this.processVirtualMemoryLow = processVirtualMemoryLow;
    }
}