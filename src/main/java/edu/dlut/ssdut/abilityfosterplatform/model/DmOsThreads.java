package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmOsThreads {
    private Boolean startedBySqlservr;

    private Integer osThreadId;

    private Integer status;

    private Date creationTime;

    private Long kernelTime;

    private Long usermodeTime;

    private Integer stackBytesCommitted;

    private Integer stackBytesUsed;

    private Long affinity;

    private Integer priority;

    private Integer locale;

    private Integer isImpersonating;

    private Integer isWaitingOnLoaderLock;

    private Short processorGroup;

    public Boolean getStartedBySqlservr() {
        return startedBySqlservr;
    }

    public void setStartedBySqlservr(Boolean startedBySqlservr) {
        this.startedBySqlservr = startedBySqlservr;
    }

    public Integer getOsThreadId() {
        return osThreadId;
    }

    public void setOsThreadId(Integer osThreadId) {
        this.osThreadId = osThreadId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Long getKernelTime() {
        return kernelTime;
    }

    public void setKernelTime(Long kernelTime) {
        this.kernelTime = kernelTime;
    }

    public Long getUsermodeTime() {
        return usermodeTime;
    }

    public void setUsermodeTime(Long usermodeTime) {
        this.usermodeTime = usermodeTime;
    }

    public Integer getStackBytesCommitted() {
        return stackBytesCommitted;
    }

    public void setStackBytesCommitted(Integer stackBytesCommitted) {
        this.stackBytesCommitted = stackBytesCommitted;
    }

    public Integer getStackBytesUsed() {
        return stackBytesUsed;
    }

    public void setStackBytesUsed(Integer stackBytesUsed) {
        this.stackBytesUsed = stackBytesUsed;
    }

    public Long getAffinity() {
        return affinity;
    }

    public void setAffinity(Long affinity) {
        this.affinity = affinity;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getLocale() {
        return locale;
    }

    public void setLocale(Integer locale) {
        this.locale = locale;
    }

    public Integer getIsImpersonating() {
        return isImpersonating;
    }

    public void setIsImpersonating(Integer isImpersonating) {
        this.isImpersonating = isImpersonating;
    }

    public Integer getIsWaitingOnLoaderLock() {
        return isWaitingOnLoaderLock;
    }

    public void setIsWaitingOnLoaderLock(Integer isWaitingOnLoaderLock) {
        this.isWaitingOnLoaderLock = isWaitingOnLoaderLock;
    }

    public Short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(Short processorGroup) {
        this.processorGroup = processorGroup;
    }
}