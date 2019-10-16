package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmFtsSemanticSimilarityPopulation {
    private Integer databaseId;

    private Integer catalogId;

    private Integer tableId;

    private Long documentCount;

    private Long documentProcessedCount;

    private Integer completionType;

    private String completionTypeDescription;

    private Integer workerCount;

    private Integer status;

    private String statusDescription;

    private Date startTime;

    private byte[] incrementalTimestamp;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Long getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(Long documentCount) {
        this.documentCount = documentCount;
    }

    public Long getDocumentProcessedCount() {
        return documentProcessedCount;
    }

    public void setDocumentProcessedCount(Long documentProcessedCount) {
        this.documentProcessedCount = documentProcessedCount;
    }

    public Integer getCompletionType() {
        return completionType;
    }

    public void setCompletionType(Integer completionType) {
        this.completionType = completionType;
    }

    public String getCompletionTypeDescription() {
        return completionTypeDescription;
    }

    public void setCompletionTypeDescription(String completionTypeDescription) {
        this.completionTypeDescription = completionTypeDescription == null ? null : completionTypeDescription.trim();
    }

    public Integer getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription == null ? null : statusDescription.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public byte[] getIncrementalTimestamp() {
        return incrementalTimestamp;
    }

    public void setIncrementalTimestamp(byte[] incrementalTimestamp) {
        this.incrementalTimestamp = incrementalTimestamp;
    }
}