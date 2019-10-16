package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbTaskSpaceUsage {
    private Boolean isRemoteTask;

    private Short sessionId;

    private Integer requestId;

    private Integer execContextId;

    private Integer databaseId;

    private Long userObjectsAllocPageCount;

    private Long userObjectsDeallocPageCount;

    private Long internalObjectsAllocPageCount;

    private Long internalObjectsDeallocPageCount;

    private byte[] taskAddress;

    public Boolean getIsRemoteTask() {
        return isRemoteTask;
    }

    public void setIsRemoteTask(Boolean isRemoteTask) {
        this.isRemoteTask = isRemoteTask;
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getExecContextId() {
        return execContextId;
    }

    public void setExecContextId(Integer execContextId) {
        this.execContextId = execContextId;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Long getUserObjectsAllocPageCount() {
        return userObjectsAllocPageCount;
    }

    public void setUserObjectsAllocPageCount(Long userObjectsAllocPageCount) {
        this.userObjectsAllocPageCount = userObjectsAllocPageCount;
    }

    public Long getUserObjectsDeallocPageCount() {
        return userObjectsDeallocPageCount;
    }

    public void setUserObjectsDeallocPageCount(Long userObjectsDeallocPageCount) {
        this.userObjectsDeallocPageCount = userObjectsDeallocPageCount;
    }

    public Long getInternalObjectsAllocPageCount() {
        return internalObjectsAllocPageCount;
    }

    public void setInternalObjectsAllocPageCount(Long internalObjectsAllocPageCount) {
        this.internalObjectsAllocPageCount = internalObjectsAllocPageCount;
    }

    public Long getInternalObjectsDeallocPageCount() {
        return internalObjectsDeallocPageCount;
    }

    public void setInternalObjectsDeallocPageCount(Long internalObjectsDeallocPageCount) {
        this.internalObjectsDeallocPageCount = internalObjectsDeallocPageCount;
    }

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }
}