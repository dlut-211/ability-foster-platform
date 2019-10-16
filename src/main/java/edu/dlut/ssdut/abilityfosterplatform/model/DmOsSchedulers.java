package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsSchedulers {
    private Integer parentNodeId;

    private Integer schedulerId;

    private Integer cpuId;

    private String status;

    private Boolean isOnline;

    private Boolean isIdle;

    private Integer preemptiveSwitchesCount;

    private Integer contextSwitchesCount;

    private Integer idleSwitchesCount;

    private Integer currentTasksCount;

    private Integer runnableTasksCount;

    private Integer currentWorkersCount;

    private Integer activeWorkersCount;

    private Long workQueueCount;

    private Integer pendingDiskIoCount;

    private Integer loadFactor;

    private Integer yieldCount;

    private Long lastTimerActivity;

    private Boolean failedToCreateWorker;

    private Long quantumLengthUs;

    public Integer getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public Integer getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(Integer schedulerId) {
        this.schedulerId = schedulerId;
    }

    public Integer getCpuId() {
        return cpuId;
    }

    public void setCpuId(Integer cpuId) {
        this.cpuId = cpuId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Boolean getIsIdle() {
        return isIdle;
    }

    public void setIsIdle(Boolean isIdle) {
        this.isIdle = isIdle;
    }

    public Integer getPreemptiveSwitchesCount() {
        return preemptiveSwitchesCount;
    }

    public void setPreemptiveSwitchesCount(Integer preemptiveSwitchesCount) {
        this.preemptiveSwitchesCount = preemptiveSwitchesCount;
    }

    public Integer getContextSwitchesCount() {
        return contextSwitchesCount;
    }

    public void setContextSwitchesCount(Integer contextSwitchesCount) {
        this.contextSwitchesCount = contextSwitchesCount;
    }

    public Integer getIdleSwitchesCount() {
        return idleSwitchesCount;
    }

    public void setIdleSwitchesCount(Integer idleSwitchesCount) {
        this.idleSwitchesCount = idleSwitchesCount;
    }

    public Integer getCurrentTasksCount() {
        return currentTasksCount;
    }

    public void setCurrentTasksCount(Integer currentTasksCount) {
        this.currentTasksCount = currentTasksCount;
    }

    public Integer getRunnableTasksCount() {
        return runnableTasksCount;
    }

    public void setRunnableTasksCount(Integer runnableTasksCount) {
        this.runnableTasksCount = runnableTasksCount;
    }

    public Integer getCurrentWorkersCount() {
        return currentWorkersCount;
    }

    public void setCurrentWorkersCount(Integer currentWorkersCount) {
        this.currentWorkersCount = currentWorkersCount;
    }

    public Integer getActiveWorkersCount() {
        return activeWorkersCount;
    }

    public void setActiveWorkersCount(Integer activeWorkersCount) {
        this.activeWorkersCount = activeWorkersCount;
    }

    public Long getWorkQueueCount() {
        return workQueueCount;
    }

    public void setWorkQueueCount(Long workQueueCount) {
        this.workQueueCount = workQueueCount;
    }

    public Integer getPendingDiskIoCount() {
        return pendingDiskIoCount;
    }

    public void setPendingDiskIoCount(Integer pendingDiskIoCount) {
        this.pendingDiskIoCount = pendingDiskIoCount;
    }

    public Integer getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(Integer loadFactor) {
        this.loadFactor = loadFactor;
    }

    public Integer getYieldCount() {
        return yieldCount;
    }

    public void setYieldCount(Integer yieldCount) {
        this.yieldCount = yieldCount;
    }

    public Long getLastTimerActivity() {
        return lastTimerActivity;
    }

    public void setLastTimerActivity(Long lastTimerActivity) {
        this.lastTimerActivity = lastTimerActivity;
    }

    public Boolean getFailedToCreateWorker() {
        return failedToCreateWorker;
    }

    public void setFailedToCreateWorker(Boolean failedToCreateWorker) {
        this.failedToCreateWorker = failedToCreateWorker;
    }

    public Long getQuantumLengthUs() {
        return quantumLengthUs;
    }

    public void setQuantumLengthUs(Long quantumLengthUs) {
        this.quantumLengthUs = quantumLengthUs;
    }
}