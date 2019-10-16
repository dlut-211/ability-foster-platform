package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmOsSysInfo {
    private Long cpuTicks;

    private Long msTicks;

    private Integer cpuCount;

    private Integer hyperthreadRatio;

    private Long physicalMemoryKb;

    private Long virtualMemoryKb;

    private Long committedKb;

    private Long committedTargetKb;

    private Long visibleTargetKb;

    private Integer stackSizeInBytes;

    private Long osQuantum;

    private Integer osErrorMode;

    private Integer osPriorityClass;

    private Integer maxWorkersCount;

    private Integer schedulerCount;

    private Integer schedulerTotalCount;

    private Integer deadlockMonitorSerialNumber;

    private Long sqlserverStartTimeMsTicks;

    private Date sqlserverStartTime;

    private Integer affinityType;

    private String affinityTypeDesc;

    private Long processKernelTimeMs;

    private Long processUserTimeMs;

    private Integer timeSource;

    private String timeSourceDesc;

    private Integer virtualMachineType;

    private String virtualMachineTypeDesc;

    public Long getCpuTicks() {
        return cpuTicks;
    }

    public void setCpuTicks(Long cpuTicks) {
        this.cpuTicks = cpuTicks;
    }

    public Long getMsTicks() {
        return msTicks;
    }

    public void setMsTicks(Long msTicks) {
        this.msTicks = msTicks;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    public Integer getHyperthreadRatio() {
        return hyperthreadRatio;
    }

    public void setHyperthreadRatio(Integer hyperthreadRatio) {
        this.hyperthreadRatio = hyperthreadRatio;
    }

    public Long getPhysicalMemoryKb() {
        return physicalMemoryKb;
    }

    public void setPhysicalMemoryKb(Long physicalMemoryKb) {
        this.physicalMemoryKb = physicalMemoryKb;
    }

    public Long getVirtualMemoryKb() {
        return virtualMemoryKb;
    }

    public void setVirtualMemoryKb(Long virtualMemoryKb) {
        this.virtualMemoryKb = virtualMemoryKb;
    }

    public Long getCommittedKb() {
        return committedKb;
    }

    public void setCommittedKb(Long committedKb) {
        this.committedKb = committedKb;
    }

    public Long getCommittedTargetKb() {
        return committedTargetKb;
    }

    public void setCommittedTargetKb(Long committedTargetKb) {
        this.committedTargetKb = committedTargetKb;
    }

    public Long getVisibleTargetKb() {
        return visibleTargetKb;
    }

    public void setVisibleTargetKb(Long visibleTargetKb) {
        this.visibleTargetKb = visibleTargetKb;
    }

    public Integer getStackSizeInBytes() {
        return stackSizeInBytes;
    }

    public void setStackSizeInBytes(Integer stackSizeInBytes) {
        this.stackSizeInBytes = stackSizeInBytes;
    }

    public Long getOsQuantum() {
        return osQuantum;
    }

    public void setOsQuantum(Long osQuantum) {
        this.osQuantum = osQuantum;
    }

    public Integer getOsErrorMode() {
        return osErrorMode;
    }

    public void setOsErrorMode(Integer osErrorMode) {
        this.osErrorMode = osErrorMode;
    }

    public Integer getOsPriorityClass() {
        return osPriorityClass;
    }

    public void setOsPriorityClass(Integer osPriorityClass) {
        this.osPriorityClass = osPriorityClass;
    }

    public Integer getMaxWorkersCount() {
        return maxWorkersCount;
    }

    public void setMaxWorkersCount(Integer maxWorkersCount) {
        this.maxWorkersCount = maxWorkersCount;
    }

    public Integer getSchedulerCount() {
        return schedulerCount;
    }

    public void setSchedulerCount(Integer schedulerCount) {
        this.schedulerCount = schedulerCount;
    }

    public Integer getSchedulerTotalCount() {
        return schedulerTotalCount;
    }

    public void setSchedulerTotalCount(Integer schedulerTotalCount) {
        this.schedulerTotalCount = schedulerTotalCount;
    }

    public Integer getDeadlockMonitorSerialNumber() {
        return deadlockMonitorSerialNumber;
    }

    public void setDeadlockMonitorSerialNumber(Integer deadlockMonitorSerialNumber) {
        this.deadlockMonitorSerialNumber = deadlockMonitorSerialNumber;
    }

    public Long getSqlserverStartTimeMsTicks() {
        return sqlserverStartTimeMsTicks;
    }

    public void setSqlserverStartTimeMsTicks(Long sqlserverStartTimeMsTicks) {
        this.sqlserverStartTimeMsTicks = sqlserverStartTimeMsTicks;
    }

    public Date getSqlserverStartTime() {
        return sqlserverStartTime;
    }

    public void setSqlserverStartTime(Date sqlserverStartTime) {
        this.sqlserverStartTime = sqlserverStartTime;
    }

    public Integer getAffinityType() {
        return affinityType;
    }

    public void setAffinityType(Integer affinityType) {
        this.affinityType = affinityType;
    }

    public String getAffinityTypeDesc() {
        return affinityTypeDesc;
    }

    public void setAffinityTypeDesc(String affinityTypeDesc) {
        this.affinityTypeDesc = affinityTypeDesc == null ? null : affinityTypeDesc.trim();
    }

    public Long getProcessKernelTimeMs() {
        return processKernelTimeMs;
    }

    public void setProcessKernelTimeMs(Long processKernelTimeMs) {
        this.processKernelTimeMs = processKernelTimeMs;
    }

    public Long getProcessUserTimeMs() {
        return processUserTimeMs;
    }

    public void setProcessUserTimeMs(Long processUserTimeMs) {
        this.processUserTimeMs = processUserTimeMs;
    }

    public Integer getTimeSource() {
        return timeSource;
    }

    public void setTimeSource(Integer timeSource) {
        this.timeSource = timeSource;
    }

    public String getTimeSourceDesc() {
        return timeSourceDesc;
    }

    public void setTimeSourceDesc(String timeSourceDesc) {
        this.timeSourceDesc = timeSourceDesc == null ? null : timeSourceDesc.trim();
    }

    public Integer getVirtualMachineType() {
        return virtualMachineType;
    }

    public void setVirtualMachineType(Integer virtualMachineType) {
        this.virtualMachineType = virtualMachineType;
    }

    public String getVirtualMachineTypeDesc() {
        return virtualMachineTypeDesc;
    }

    public void setVirtualMachineTypeDesc(String virtualMachineTypeDesc) {
        this.virtualMachineTypeDesc = virtualMachineTypeDesc == null ? null : virtualMachineTypeDesc.trim();
    }
}