package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsSysMemory {
    private Long totalPhysicalMemoryKb;

    private Long availablePhysicalMemoryKb;

    private Long totalPageFileKb;

    private Long availablePageFileKb;

    private Long systemCacheKb;

    private Long kernelPagedPoolKb;

    private Long kernelNonpagedPoolKb;

    private Boolean systemHighMemorySignalState;

    private Boolean systemLowMemorySignalState;

    private String systemMemoryStateDesc;

    public Long getTotalPhysicalMemoryKb() {
        return totalPhysicalMemoryKb;
    }

    public void setTotalPhysicalMemoryKb(Long totalPhysicalMemoryKb) {
        this.totalPhysicalMemoryKb = totalPhysicalMemoryKb;
    }

    public Long getAvailablePhysicalMemoryKb() {
        return availablePhysicalMemoryKb;
    }

    public void setAvailablePhysicalMemoryKb(Long availablePhysicalMemoryKb) {
        this.availablePhysicalMemoryKb = availablePhysicalMemoryKb;
    }

    public Long getTotalPageFileKb() {
        return totalPageFileKb;
    }

    public void setTotalPageFileKb(Long totalPageFileKb) {
        this.totalPageFileKb = totalPageFileKb;
    }

    public Long getAvailablePageFileKb() {
        return availablePageFileKb;
    }

    public void setAvailablePageFileKb(Long availablePageFileKb) {
        this.availablePageFileKb = availablePageFileKb;
    }

    public Long getSystemCacheKb() {
        return systemCacheKb;
    }

    public void setSystemCacheKb(Long systemCacheKb) {
        this.systemCacheKb = systemCacheKb;
    }

    public Long getKernelPagedPoolKb() {
        return kernelPagedPoolKb;
    }

    public void setKernelPagedPoolKb(Long kernelPagedPoolKb) {
        this.kernelPagedPoolKb = kernelPagedPoolKb;
    }

    public Long getKernelNonpagedPoolKb() {
        return kernelNonpagedPoolKb;
    }

    public void setKernelNonpagedPoolKb(Long kernelNonpagedPoolKb) {
        this.kernelNonpagedPoolKb = kernelNonpagedPoolKb;
    }

    public Boolean getSystemHighMemorySignalState() {
        return systemHighMemorySignalState;
    }

    public void setSystemHighMemorySignalState(Boolean systemHighMemorySignalState) {
        this.systemHighMemorySignalState = systemHighMemorySignalState;
    }

    public Boolean getSystemLowMemorySignalState() {
        return systemLowMemorySignalState;
    }

    public void setSystemLowMemorySignalState(Boolean systemLowMemorySignalState) {
        this.systemLowMemorySignalState = systemLowMemorySignalState;
    }

    public String getSystemMemoryStateDesc() {
        return systemMemoryStateDesc;
    }

    public void setSystemMemoryStateDesc(String systemMemoryStateDesc) {
        this.systemMemoryStateDesc = systemMemoryStateDesc == null ? null : systemMemoryStateDesc.trim();
    }
}