package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsWorkers {
    private Integer status;

    private Boolean isPreemptive;

    private Boolean isFiber;

    private Boolean isSick;

    private Boolean isInCcException;

    private Boolean isFatalException;

    private Boolean isInsideCatch;

    private Boolean isInPollingIoCompletionRoutine;

    private Integer contextSwitchCount;

    private Integer pendingIoCount;

    private Long pendingIoByteCount;

    private Integer pendingIoByteAverage;

    private Long waitStartedMsTicks;

    private Long waitResumedMsTicks;

    private Long taskBoundMsTicks;

    private Long workerCreatedMsTicks;

    private Integer exceptionNum;

    private Integer exceptionSeverity;

    private Long affinity;

    private String state;

    private Long startQuantum;

    private Long endQuantum;

    private String lastWaitType;

    private Integer returnCode;

    private Long quantumUsed;

    private Long maxQuantum;

    private Integer boostCount;

    private Integer tasksProcessedCount;

    private Short processorGroup;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsPreemptive() {
        return isPreemptive;
    }

    public void setIsPreemptive(Boolean isPreemptive) {
        this.isPreemptive = isPreemptive;
    }

    public Boolean getIsFiber() {
        return isFiber;
    }

    public void setIsFiber(Boolean isFiber) {
        this.isFiber = isFiber;
    }

    public Boolean getIsSick() {
        return isSick;
    }

    public void setIsSick(Boolean isSick) {
        this.isSick = isSick;
    }

    public Boolean getIsInCcException() {
        return isInCcException;
    }

    public void setIsInCcException(Boolean isInCcException) {
        this.isInCcException = isInCcException;
    }

    public Boolean getIsFatalException() {
        return isFatalException;
    }

    public void setIsFatalException(Boolean isFatalException) {
        this.isFatalException = isFatalException;
    }

    public Boolean getIsInsideCatch() {
        return isInsideCatch;
    }

    public void setIsInsideCatch(Boolean isInsideCatch) {
        this.isInsideCatch = isInsideCatch;
    }

    public Boolean getIsInPollingIoCompletionRoutine() {
        return isInPollingIoCompletionRoutine;
    }

    public void setIsInPollingIoCompletionRoutine(Boolean isInPollingIoCompletionRoutine) {
        this.isInPollingIoCompletionRoutine = isInPollingIoCompletionRoutine;
    }

    public Integer getContextSwitchCount() {
        return contextSwitchCount;
    }

    public void setContextSwitchCount(Integer contextSwitchCount) {
        this.contextSwitchCount = contextSwitchCount;
    }

    public Integer getPendingIoCount() {
        return pendingIoCount;
    }

    public void setPendingIoCount(Integer pendingIoCount) {
        this.pendingIoCount = pendingIoCount;
    }

    public Long getPendingIoByteCount() {
        return pendingIoByteCount;
    }

    public void setPendingIoByteCount(Long pendingIoByteCount) {
        this.pendingIoByteCount = pendingIoByteCount;
    }

    public Integer getPendingIoByteAverage() {
        return pendingIoByteAverage;
    }

    public void setPendingIoByteAverage(Integer pendingIoByteAverage) {
        this.pendingIoByteAverage = pendingIoByteAverage;
    }

    public Long getWaitStartedMsTicks() {
        return waitStartedMsTicks;
    }

    public void setWaitStartedMsTicks(Long waitStartedMsTicks) {
        this.waitStartedMsTicks = waitStartedMsTicks;
    }

    public Long getWaitResumedMsTicks() {
        return waitResumedMsTicks;
    }

    public void setWaitResumedMsTicks(Long waitResumedMsTicks) {
        this.waitResumedMsTicks = waitResumedMsTicks;
    }

    public Long getTaskBoundMsTicks() {
        return taskBoundMsTicks;
    }

    public void setTaskBoundMsTicks(Long taskBoundMsTicks) {
        this.taskBoundMsTicks = taskBoundMsTicks;
    }

    public Long getWorkerCreatedMsTicks() {
        return workerCreatedMsTicks;
    }

    public void setWorkerCreatedMsTicks(Long workerCreatedMsTicks) {
        this.workerCreatedMsTicks = workerCreatedMsTicks;
    }

    public Integer getExceptionNum() {
        return exceptionNum;
    }

    public void setExceptionNum(Integer exceptionNum) {
        this.exceptionNum = exceptionNum;
    }

    public Integer getExceptionSeverity() {
        return exceptionSeverity;
    }

    public void setExceptionSeverity(Integer exceptionSeverity) {
        this.exceptionSeverity = exceptionSeverity;
    }

    public Long getAffinity() {
        return affinity;
    }

    public void setAffinity(Long affinity) {
        this.affinity = affinity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getStartQuantum() {
        return startQuantum;
    }

    public void setStartQuantum(Long startQuantum) {
        this.startQuantum = startQuantum;
    }

    public Long getEndQuantum() {
        return endQuantum;
    }

    public void setEndQuantum(Long endQuantum) {
        this.endQuantum = endQuantum;
    }

    public String getLastWaitType() {
        return lastWaitType;
    }

    public void setLastWaitType(String lastWaitType) {
        this.lastWaitType = lastWaitType == null ? null : lastWaitType.trim();
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public Long getQuantumUsed() {
        return quantumUsed;
    }

    public void setQuantumUsed(Long quantumUsed) {
        this.quantumUsed = quantumUsed;
    }

    public Long getMaxQuantum() {
        return maxQuantum;
    }

    public void setMaxQuantum(Long maxQuantum) {
        this.maxQuantum = maxQuantum;
    }

    public Integer getBoostCount() {
        return boostCount;
    }

    public void setBoostCount(Integer boostCount) {
        this.boostCount = boostCount;
    }

    public Integer getTasksProcessedCount() {
        return tasksProcessedCount;
    }

    public void setTasksProcessedCount(Integer tasksProcessedCount) {
        this.tasksProcessedCount = tasksProcessedCount;
    }

    public Short getProcessorGroup() {
        return processorGroup;
    }

    public void setProcessorGroup(Short processorGroup) {
        this.processorGroup = processorGroup;
    }
}