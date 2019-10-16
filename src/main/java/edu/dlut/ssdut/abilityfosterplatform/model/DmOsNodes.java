package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsNodes {
    private Short nodeId;

    private String nodeStateDesc;

    private Short memoryNodeId;

    private Long cpuAffinityMask;

    private Short onlineSchedulerCount;

    private Short idleSchedulerCount;

    private Integer activeWorkerCount;

    private Integer avgLoadBalance;

    private Long timerTaskAffinityMask;

    private Long permanentTaskAffinityMask;

    private Boolean resourceMonitorState;

    private Long onlineSchedulerMask;

    private Short processorGroup;

    public Short getNodeId() {
        return nodeId;
    }

    public void setNodeId(Short nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeStateDesc() {
        return nodeStateDesc;
    }

    public void setNodeStateDesc(String nodeStateDesc) {
        this.nodeStateDesc = nodeStateDesc == null ? null : nodeStateDesc.trim();
    }

    public Short getMemoryNodeId() {
        return memoryNodeId;
    }

    public void setMemoryNodeId(Short memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
    }

    public Long getCpuAffinityMask() {
        return cpuAffinityMask;
    }

    public void setCpuAffinityMask(Long cpuAffinityMask) {
        this.cpuAffinityMask = cpuAffinityMask;
    }

    public Short getOnlineSchedulerCount() {
        return onlineSchedulerCount;
    }

    public void setOnlineSchedulerCount(Short onlineSchedulerCount) {
        this.onlineSchedulerCount = onlineSchedulerCount;
    }

    public Short getIdleSchedulerCount() {
        return idleSchedulerCount;
    }

    public void setIdleSchedulerCount(Short idleSchedulerCount) {
        this.idleSchedulerCount = idleSchedulerCount;
    }

    public Integer getActiveWorkerCount() {
        return activeWorkerCount;
    }

    public void setActiveWorkerCount(Integer activeWorkerCount) {
        this.activeWorkerCount = activeWorkerCount;
    }

    public Integer getAvgLoadBalance() {
        return avgLoadBalance;
    }

    public void setAvgLoadBalance(Integer avgLoadBalance) {
        this.avgLoadBalance = avgLoadBalance;
    }

    public Long getTimerTaskAffinityMask() {
        return timerTaskAffinityMask;
    }

    public void setTimerTaskAffinityMask(Long timerTaskAffinityMask) {
        this.timerTaskAffinityMask = timerTaskAffinityMask;
    }

    public Long getPermanentTaskAffinityMask() {
        return permanentTaskAffinityMask;
    }

    public void setPermanentTaskAffinityMask(Long permanentTaskAffinityMask) {
        this.permanentTaskAffinityMask = permanentTaskAffinityMask;
    }

    public Boolean getResourceMonitorState() {
        return resourceMonitorState;
    }

    public void setResourceMonitorState(Boolean resourceMonitorState) {
        this.resourceMonitorState = resourceMonitorState;
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
}