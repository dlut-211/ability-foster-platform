package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsOutstandingBatches {
    private Integer databaseId;

    private Integer catalogId;

    private Integer tableId;

    private Integer batchId;

    private Integer hrBatch;

    private Boolean isRetryBatch;

    private Integer retryHints;

    private String retryHintsDescription;

    private Long docFailed;

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

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Integer getHrBatch() {
        return hrBatch;
    }

    public void setHrBatch(Integer hrBatch) {
        this.hrBatch = hrBatch;
    }

    public Boolean getIsRetryBatch() {
        return isRetryBatch;
    }

    public void setIsRetryBatch(Boolean isRetryBatch) {
        this.isRetryBatch = isRetryBatch;
    }

    public Integer getRetryHints() {
        return retryHints;
    }

    public void setRetryHints(Integer retryHints) {
        this.retryHints = retryHints;
    }

    public String getRetryHintsDescription() {
        return retryHintsDescription;
    }

    public void setRetryHintsDescription(String retryHintsDescription) {
        this.retryHintsDescription = retryHintsDescription == null ? null : retryHintsDescription.trim();
    }

    public Long getDocFailed() {
        return docFailed;
    }

    public void setDocFailed(Long docFailed) {
        this.docFailed = docFailed;
    }
}