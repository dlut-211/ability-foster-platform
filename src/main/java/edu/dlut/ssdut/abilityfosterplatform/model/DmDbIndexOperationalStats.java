package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbIndexOperationalStats {
    private Short databaseId;

    private Integer objectId;

    private Integer indexId;

    private Integer partitionNumber;

    private Long leafInsertCount;

    private Long leafDeleteCount;

    private Long leafUpdateCount;

    private Long leafGhostCount;

    private Long nonleafInsertCount;

    private Long nonleafDeleteCount;

    private Long nonleafUpdateCount;

    private Long leafAllocationCount;

    private Long nonleafAllocationCount;

    private Long leafPageMergeCount;

    private Long nonleafPageMergeCount;

    private Long rangeScanCount;

    private Long singletonLookupCount;

    private Long forwardedFetchCount;

    private Long lobFetchInPages;

    private Long lobFetchInBytes;

    private Long lobOrphanCreateCount;

    private Long lobOrphanInsertCount;

    private Long rowOverflowFetchInPages;

    private Long rowOverflowFetchInBytes;

    private Long columnValuePushOffRowCount;

    private Long columnValuePullInRowCount;

    private Long rowLockCount;

    private Long rowLockWaitCount;

    private Long rowLockWaitInMs;

    private Long pageLockCount;

    private Long pageLockWaitCount;

    private Long pageLockWaitInMs;

    private Long indexLockPromotionAttemptCount;

    private Long indexLockPromotionCount;

    private Long pageLatchWaitCount;

    private Long pageLatchWaitInMs;

    private Long pageIoLatchWaitCount;

    private Long pageIoLatchWaitInMs;

    private Long treePageLatchWaitCount;

    private Long treePageLatchWaitInMs;

    private Long treePageIoLatchWaitCount;

    private Long treePageIoLatchWaitInMs;

    private Long pageCompressionAttemptCount;

    private Long pageCompressionSuccessCount;

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public Long getLeafInsertCount() {
        return leafInsertCount;
    }

    public void setLeafInsertCount(Long leafInsertCount) {
        this.leafInsertCount = leafInsertCount;
    }

    public Long getLeafDeleteCount() {
        return leafDeleteCount;
    }

    public void setLeafDeleteCount(Long leafDeleteCount) {
        this.leafDeleteCount = leafDeleteCount;
    }

    public Long getLeafUpdateCount() {
        return leafUpdateCount;
    }

    public void setLeafUpdateCount(Long leafUpdateCount) {
        this.leafUpdateCount = leafUpdateCount;
    }

    public Long getLeafGhostCount() {
        return leafGhostCount;
    }

    public void setLeafGhostCount(Long leafGhostCount) {
        this.leafGhostCount = leafGhostCount;
    }

    public Long getNonleafInsertCount() {
        return nonleafInsertCount;
    }

    public void setNonleafInsertCount(Long nonleafInsertCount) {
        this.nonleafInsertCount = nonleafInsertCount;
    }

    public Long getNonleafDeleteCount() {
        return nonleafDeleteCount;
    }

    public void setNonleafDeleteCount(Long nonleafDeleteCount) {
        this.nonleafDeleteCount = nonleafDeleteCount;
    }

    public Long getNonleafUpdateCount() {
        return nonleafUpdateCount;
    }

    public void setNonleafUpdateCount(Long nonleafUpdateCount) {
        this.nonleafUpdateCount = nonleafUpdateCount;
    }

    public Long getLeafAllocationCount() {
        return leafAllocationCount;
    }

    public void setLeafAllocationCount(Long leafAllocationCount) {
        this.leafAllocationCount = leafAllocationCount;
    }

    public Long getNonleafAllocationCount() {
        return nonleafAllocationCount;
    }

    public void setNonleafAllocationCount(Long nonleafAllocationCount) {
        this.nonleafAllocationCount = nonleafAllocationCount;
    }

    public Long getLeafPageMergeCount() {
        return leafPageMergeCount;
    }

    public void setLeafPageMergeCount(Long leafPageMergeCount) {
        this.leafPageMergeCount = leafPageMergeCount;
    }

    public Long getNonleafPageMergeCount() {
        return nonleafPageMergeCount;
    }

    public void setNonleafPageMergeCount(Long nonleafPageMergeCount) {
        this.nonleafPageMergeCount = nonleafPageMergeCount;
    }

    public Long getRangeScanCount() {
        return rangeScanCount;
    }

    public void setRangeScanCount(Long rangeScanCount) {
        this.rangeScanCount = rangeScanCount;
    }

    public Long getSingletonLookupCount() {
        return singletonLookupCount;
    }

    public void setSingletonLookupCount(Long singletonLookupCount) {
        this.singletonLookupCount = singletonLookupCount;
    }

    public Long getForwardedFetchCount() {
        return forwardedFetchCount;
    }

    public void setForwardedFetchCount(Long forwardedFetchCount) {
        this.forwardedFetchCount = forwardedFetchCount;
    }

    public Long getLobFetchInPages() {
        return lobFetchInPages;
    }

    public void setLobFetchInPages(Long lobFetchInPages) {
        this.lobFetchInPages = lobFetchInPages;
    }

    public Long getLobFetchInBytes() {
        return lobFetchInBytes;
    }

    public void setLobFetchInBytes(Long lobFetchInBytes) {
        this.lobFetchInBytes = lobFetchInBytes;
    }

    public Long getLobOrphanCreateCount() {
        return lobOrphanCreateCount;
    }

    public void setLobOrphanCreateCount(Long lobOrphanCreateCount) {
        this.lobOrphanCreateCount = lobOrphanCreateCount;
    }

    public Long getLobOrphanInsertCount() {
        return lobOrphanInsertCount;
    }

    public void setLobOrphanInsertCount(Long lobOrphanInsertCount) {
        this.lobOrphanInsertCount = lobOrphanInsertCount;
    }

    public Long getRowOverflowFetchInPages() {
        return rowOverflowFetchInPages;
    }

    public void setRowOverflowFetchInPages(Long rowOverflowFetchInPages) {
        this.rowOverflowFetchInPages = rowOverflowFetchInPages;
    }

    public Long getRowOverflowFetchInBytes() {
        return rowOverflowFetchInBytes;
    }

    public void setRowOverflowFetchInBytes(Long rowOverflowFetchInBytes) {
        this.rowOverflowFetchInBytes = rowOverflowFetchInBytes;
    }

    public Long getColumnValuePushOffRowCount() {
        return columnValuePushOffRowCount;
    }

    public void setColumnValuePushOffRowCount(Long columnValuePushOffRowCount) {
        this.columnValuePushOffRowCount = columnValuePushOffRowCount;
    }

    public Long getColumnValuePullInRowCount() {
        return columnValuePullInRowCount;
    }

    public void setColumnValuePullInRowCount(Long columnValuePullInRowCount) {
        this.columnValuePullInRowCount = columnValuePullInRowCount;
    }

    public Long getRowLockCount() {
        return rowLockCount;
    }

    public void setRowLockCount(Long rowLockCount) {
        this.rowLockCount = rowLockCount;
    }

    public Long getRowLockWaitCount() {
        return rowLockWaitCount;
    }

    public void setRowLockWaitCount(Long rowLockWaitCount) {
        this.rowLockWaitCount = rowLockWaitCount;
    }

    public Long getRowLockWaitInMs() {
        return rowLockWaitInMs;
    }

    public void setRowLockWaitInMs(Long rowLockWaitInMs) {
        this.rowLockWaitInMs = rowLockWaitInMs;
    }

    public Long getPageLockCount() {
        return pageLockCount;
    }

    public void setPageLockCount(Long pageLockCount) {
        this.pageLockCount = pageLockCount;
    }

    public Long getPageLockWaitCount() {
        return pageLockWaitCount;
    }

    public void setPageLockWaitCount(Long pageLockWaitCount) {
        this.pageLockWaitCount = pageLockWaitCount;
    }

    public Long getPageLockWaitInMs() {
        return pageLockWaitInMs;
    }

    public void setPageLockWaitInMs(Long pageLockWaitInMs) {
        this.pageLockWaitInMs = pageLockWaitInMs;
    }

    public Long getIndexLockPromotionAttemptCount() {
        return indexLockPromotionAttemptCount;
    }

    public void setIndexLockPromotionAttemptCount(Long indexLockPromotionAttemptCount) {
        this.indexLockPromotionAttemptCount = indexLockPromotionAttemptCount;
    }

    public Long getIndexLockPromotionCount() {
        return indexLockPromotionCount;
    }

    public void setIndexLockPromotionCount(Long indexLockPromotionCount) {
        this.indexLockPromotionCount = indexLockPromotionCount;
    }

    public Long getPageLatchWaitCount() {
        return pageLatchWaitCount;
    }

    public void setPageLatchWaitCount(Long pageLatchWaitCount) {
        this.pageLatchWaitCount = pageLatchWaitCount;
    }

    public Long getPageLatchWaitInMs() {
        return pageLatchWaitInMs;
    }

    public void setPageLatchWaitInMs(Long pageLatchWaitInMs) {
        this.pageLatchWaitInMs = pageLatchWaitInMs;
    }

    public Long getPageIoLatchWaitCount() {
        return pageIoLatchWaitCount;
    }

    public void setPageIoLatchWaitCount(Long pageIoLatchWaitCount) {
        this.pageIoLatchWaitCount = pageIoLatchWaitCount;
    }

    public Long getPageIoLatchWaitInMs() {
        return pageIoLatchWaitInMs;
    }

    public void setPageIoLatchWaitInMs(Long pageIoLatchWaitInMs) {
        this.pageIoLatchWaitInMs = pageIoLatchWaitInMs;
    }

    public Long getTreePageLatchWaitCount() {
        return treePageLatchWaitCount;
    }

    public void setTreePageLatchWaitCount(Long treePageLatchWaitCount) {
        this.treePageLatchWaitCount = treePageLatchWaitCount;
    }

    public Long getTreePageLatchWaitInMs() {
        return treePageLatchWaitInMs;
    }

    public void setTreePageLatchWaitInMs(Long treePageLatchWaitInMs) {
        this.treePageLatchWaitInMs = treePageLatchWaitInMs;
    }

    public Long getTreePageIoLatchWaitCount() {
        return treePageIoLatchWaitCount;
    }

    public void setTreePageIoLatchWaitCount(Long treePageIoLatchWaitCount) {
        this.treePageIoLatchWaitCount = treePageIoLatchWaitCount;
    }

    public Long getTreePageIoLatchWaitInMs() {
        return treePageIoLatchWaitInMs;
    }

    public void setTreePageIoLatchWaitInMs(Long treePageIoLatchWaitInMs) {
        this.treePageIoLatchWaitInMs = treePageIoLatchWaitInMs;
    }

    public Long getPageCompressionAttemptCount() {
        return pageCompressionAttemptCount;
    }

    public void setPageCompressionAttemptCount(Long pageCompressionAttemptCount) {
        this.pageCompressionAttemptCount = pageCompressionAttemptCount;
    }

    public Long getPageCompressionSuccessCount() {
        return pageCompressionSuccessCount;
    }

    public void setPageCompressionSuccessCount(Long pageCompressionSuccessCount) {
        this.pageCompressionSuccessCount = pageCompressionSuccessCount;
    }
}