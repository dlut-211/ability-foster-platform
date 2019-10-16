package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmFtsIndexPopulation {
    private Integer databaseId;

    private Integer catalogId;

    private Integer tableId;

    private Integer populationType;

    private String populationTypeDescription;

    private Boolean isClusteredIndexScan;

    private Integer rangeCount;

    private Integer completedRangeCount;

    private Integer outstandingBatchCount;

    private Integer status;

    private String statusDescription;

    private Integer completionType;

    private String completionTypeDescription;

    private Integer workerCount;

    private Integer queuedPopulationType;

    private String queuedPopulationTypeDescription;

    private Date startTime;

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

    public Integer getPopulationType() {
        return populationType;
    }

    public void setPopulationType(Integer populationType) {
        this.populationType = populationType;
    }

    public String getPopulationTypeDescription() {
        return populationTypeDescription;
    }

    public void setPopulationTypeDescription(String populationTypeDescription) {
        this.populationTypeDescription = populationTypeDescription == null ? null : populationTypeDescription.trim();
    }

    public Boolean getIsClusteredIndexScan() {
        return isClusteredIndexScan;
    }

    public void setIsClusteredIndexScan(Boolean isClusteredIndexScan) {
        this.isClusteredIndexScan = isClusteredIndexScan;
    }

    public Integer getRangeCount() {
        return rangeCount;
    }

    public void setRangeCount(Integer rangeCount) {
        this.rangeCount = rangeCount;
    }

    public Integer getCompletedRangeCount() {
        return completedRangeCount;
    }

    public void setCompletedRangeCount(Integer completedRangeCount) {
        this.completedRangeCount = completedRangeCount;
    }

    public Integer getOutstandingBatchCount() {
        return outstandingBatchCount;
    }

    public void setOutstandingBatchCount(Integer outstandingBatchCount) {
        this.outstandingBatchCount = outstandingBatchCount;
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

    public Integer getQueuedPopulationType() {
        return queuedPopulationType;
    }

    public void setQueuedPopulationType(Integer queuedPopulationType) {
        this.queuedPopulationType = queuedPopulationType;
    }

    public String getQueuedPopulationTypeDescription() {
        return queuedPopulationTypeDescription;
    }

    public void setQueuedPopulationTypeDescription(String queuedPopulationTypeDescription) {
        this.queuedPopulationTypeDescription = queuedPopulationTypeDescription == null ? null : queuedPopulationTypeDescription.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}