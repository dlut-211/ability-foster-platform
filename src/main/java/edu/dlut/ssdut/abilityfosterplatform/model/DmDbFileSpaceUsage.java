package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbFileSpaceUsage {
    private Integer databaseId;

    private Short fileId;

    private Short filegroupId;

    private Long totalPageCount;

    private Long allocatedExtentPageCount;

    private Long unallocatedExtentPageCount;

    private Long versionStoreReservedPageCount;

    private Long userObjectReservedPageCount;

    private Long internalObjectReservedPageCount;

    private Long mixedExtentPageCount;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Short getFileId() {
        return fileId;
    }

    public void setFileId(Short fileId) {
        this.fileId = fileId;
    }

    public Short getFilegroupId() {
        return filegroupId;
    }

    public void setFilegroupId(Short filegroupId) {
        this.filegroupId = filegroupId;
    }

    public Long getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Long totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Long getAllocatedExtentPageCount() {
        return allocatedExtentPageCount;
    }

    public void setAllocatedExtentPageCount(Long allocatedExtentPageCount) {
        this.allocatedExtentPageCount = allocatedExtentPageCount;
    }

    public Long getUnallocatedExtentPageCount() {
        return unallocatedExtentPageCount;
    }

    public void setUnallocatedExtentPageCount(Long unallocatedExtentPageCount) {
        this.unallocatedExtentPageCount = unallocatedExtentPageCount;
    }

    public Long getVersionStoreReservedPageCount() {
        return versionStoreReservedPageCount;
    }

    public void setVersionStoreReservedPageCount(Long versionStoreReservedPageCount) {
        this.versionStoreReservedPageCount = versionStoreReservedPageCount;
    }

    public Long getUserObjectReservedPageCount() {
        return userObjectReservedPageCount;
    }

    public void setUserObjectReservedPageCount(Long userObjectReservedPageCount) {
        this.userObjectReservedPageCount = userObjectReservedPageCount;
    }

    public Long getInternalObjectReservedPageCount() {
        return internalObjectReservedPageCount;
    }

    public void setInternalObjectReservedPageCount(Long internalObjectReservedPageCount) {
        this.internalObjectReservedPageCount = internalObjectReservedPageCount;
    }

    public Long getMixedExtentPageCount() {
        return mixedExtentPageCount;
    }

    public void setMixedExtentPageCount(Long mixedExtentPageCount) {
        this.mixedExtentPageCount = mixedExtentPageCount;
    }
}