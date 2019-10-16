package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbXtpNonclusteredIndexStats {
    private Integer objectId;

    private Integer indexId;

    private Long deltaPages;

    private Long internalPages;

    private Long leafPages;

    private Long outstandingRetiredNodes;

    private Long pageUpdateCount;

    private Long pageUpdateRetryCount;

    private Long pageConsolidationCount;

    private Long pageConsolidationRetryCount;

    private Long pageSplitCount;

    private Long pageSplitRetryCount;

    private Long keySplitCount;

    private Long keySplitRetryCount;

    private Long pageMergeCount;

    private Long pageMergeRetryCount;

    private Long keyMergeCount;

    private Long keyMergeRetryCount;

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

    public Long getDeltaPages() {
        return deltaPages;
    }

    public void setDeltaPages(Long deltaPages) {
        this.deltaPages = deltaPages;
    }

    public Long getInternalPages() {
        return internalPages;
    }

    public void setInternalPages(Long internalPages) {
        this.internalPages = internalPages;
    }

    public Long getLeafPages() {
        return leafPages;
    }

    public void setLeafPages(Long leafPages) {
        this.leafPages = leafPages;
    }

    public Long getOutstandingRetiredNodes() {
        return outstandingRetiredNodes;
    }

    public void setOutstandingRetiredNodes(Long outstandingRetiredNodes) {
        this.outstandingRetiredNodes = outstandingRetiredNodes;
    }

    public Long getPageUpdateCount() {
        return pageUpdateCount;
    }

    public void setPageUpdateCount(Long pageUpdateCount) {
        this.pageUpdateCount = pageUpdateCount;
    }

    public Long getPageUpdateRetryCount() {
        return pageUpdateRetryCount;
    }

    public void setPageUpdateRetryCount(Long pageUpdateRetryCount) {
        this.pageUpdateRetryCount = pageUpdateRetryCount;
    }

    public Long getPageConsolidationCount() {
        return pageConsolidationCount;
    }

    public void setPageConsolidationCount(Long pageConsolidationCount) {
        this.pageConsolidationCount = pageConsolidationCount;
    }

    public Long getPageConsolidationRetryCount() {
        return pageConsolidationRetryCount;
    }

    public void setPageConsolidationRetryCount(Long pageConsolidationRetryCount) {
        this.pageConsolidationRetryCount = pageConsolidationRetryCount;
    }

    public Long getPageSplitCount() {
        return pageSplitCount;
    }

    public void setPageSplitCount(Long pageSplitCount) {
        this.pageSplitCount = pageSplitCount;
    }

    public Long getPageSplitRetryCount() {
        return pageSplitRetryCount;
    }

    public void setPageSplitRetryCount(Long pageSplitRetryCount) {
        this.pageSplitRetryCount = pageSplitRetryCount;
    }

    public Long getKeySplitCount() {
        return keySplitCount;
    }

    public void setKeySplitCount(Long keySplitCount) {
        this.keySplitCount = keySplitCount;
    }

    public Long getKeySplitRetryCount() {
        return keySplitRetryCount;
    }

    public void setKeySplitRetryCount(Long keySplitRetryCount) {
        this.keySplitRetryCount = keySplitRetryCount;
    }

    public Long getPageMergeCount() {
        return pageMergeCount;
    }

    public void setPageMergeCount(Long pageMergeCount) {
        this.pageMergeCount = pageMergeCount;
    }

    public Long getPageMergeRetryCount() {
        return pageMergeRetryCount;
    }

    public void setPageMergeRetryCount(Long pageMergeRetryCount) {
        this.pageMergeRetryCount = pageMergeRetryCount;
    }

    public Long getKeyMergeCount() {
        return keyMergeCount;
    }

    public void setKeyMergeCount(Long keyMergeCount) {
        this.keyMergeCount = keyMergeCount;
    }

    public Long getKeyMergeRetryCount() {
        return keyMergeRetryCount;
    }

    public void setKeyMergeRetryCount(Long keyMergeRetryCount) {
        this.keyMergeRetryCount = keyMergeRetryCount;
    }
}