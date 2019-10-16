package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmTranLocks {
    private String resourceType;

    private String resourceSubtype;

    private Integer resourceDatabaseId;

    private String resourceDescription;

    private Long resourceAssociatedEntityId;

    private Integer resourceLockPartition;

    private String requestMode;

    private String requestType;

    private String requestStatus;

    private Short requestReferenceCount;

    private Integer requestLifetime;

    private Integer requestSessionId;

    private Integer requestExecContextId;

    private Integer requestRequestId;

    private String requestOwnerType;

    private Long requestOwnerId;

    private String requestOwnerGuid;

    private String requestOwnerLockspaceId;

    private byte[] lockOwnerAddress;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getResourceSubtype() {
        return resourceSubtype;
    }

    public void setResourceSubtype(String resourceSubtype) {
        this.resourceSubtype = resourceSubtype == null ? null : resourceSubtype.trim();
    }

    public Integer getResourceDatabaseId() {
        return resourceDatabaseId;
    }

    public void setResourceDatabaseId(Integer resourceDatabaseId) {
        this.resourceDatabaseId = resourceDatabaseId;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription == null ? null : resourceDescription.trim();
    }

    public Long getResourceAssociatedEntityId() {
        return resourceAssociatedEntityId;
    }

    public void setResourceAssociatedEntityId(Long resourceAssociatedEntityId) {
        this.resourceAssociatedEntityId = resourceAssociatedEntityId;
    }

    public Integer getResourceLockPartition() {
        return resourceLockPartition;
    }

    public void setResourceLockPartition(Integer resourceLockPartition) {
        this.resourceLockPartition = resourceLockPartition;
    }

    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode == null ? null : requestMode.trim();
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType == null ? null : requestType.trim();
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus == null ? null : requestStatus.trim();
    }

    public Short getRequestReferenceCount() {
        return requestReferenceCount;
    }

    public void setRequestReferenceCount(Short requestReferenceCount) {
        this.requestReferenceCount = requestReferenceCount;
    }

    public Integer getRequestLifetime() {
        return requestLifetime;
    }

    public void setRequestLifetime(Integer requestLifetime) {
        this.requestLifetime = requestLifetime;
    }

    public Integer getRequestSessionId() {
        return requestSessionId;
    }

    public void setRequestSessionId(Integer requestSessionId) {
        this.requestSessionId = requestSessionId;
    }

    public Integer getRequestExecContextId() {
        return requestExecContextId;
    }

    public void setRequestExecContextId(Integer requestExecContextId) {
        this.requestExecContextId = requestExecContextId;
    }

    public Integer getRequestRequestId() {
        return requestRequestId;
    }

    public void setRequestRequestId(Integer requestRequestId) {
        this.requestRequestId = requestRequestId;
    }

    public String getRequestOwnerType() {
        return requestOwnerType;
    }

    public void setRequestOwnerType(String requestOwnerType) {
        this.requestOwnerType = requestOwnerType == null ? null : requestOwnerType.trim();
    }

    public Long getRequestOwnerId() {
        return requestOwnerId;
    }

    public void setRequestOwnerId(Long requestOwnerId) {
        this.requestOwnerId = requestOwnerId;
    }

    public String getRequestOwnerGuid() {
        return requestOwnerGuid;
    }

    public void setRequestOwnerGuid(String requestOwnerGuid) {
        this.requestOwnerGuid = requestOwnerGuid == null ? null : requestOwnerGuid.trim();
    }

    public String getRequestOwnerLockspaceId() {
        return requestOwnerLockspaceId;
    }

    public void setRequestOwnerLockspaceId(String requestOwnerLockspaceId) {
        this.requestOwnerLockspaceId = requestOwnerLockspaceId == null ? null : requestOwnerLockspaceId.trim();
    }

    public byte[] getLockOwnerAddress() {
        return lockOwnerAddress;
    }

    public void setLockOwnerAddress(byte[] lockOwnerAddress) {
        this.lockOwnerAddress = lockOwnerAddress;
    }
}