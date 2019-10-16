package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbSessionSpaceUsage {
    private Short sessionId;

    private Integer databaseId;

    private Long userObjectsAllocPageCount;

    private Long userObjectsDeallocPageCount;

    private Long internalObjectsAllocPageCount;

    private Long internalObjectsDeallocPageCount;

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
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
}