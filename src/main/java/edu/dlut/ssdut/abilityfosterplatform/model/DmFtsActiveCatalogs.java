package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsActiveCatalogs {
    private Integer databaseId;

    private Integer catalogId;

    private String name;

    private Boolean isPaused;

    private Integer status;

    private String statusDescription;

    private Integer previousStatus;

    private String previousStatusDescription;

    private Integer workerCount;

    private Integer activeFtsIndexCount;

    private Integer autoPopulationCount;

    private Integer manualPopulationCount;

    private Integer fullIncrementalPopulationCount;

    private Integer rowCountInThousands;

    private Boolean isImporting;

    private byte[] memoryAddress;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIsPaused() {
        return isPaused;
    }

    public void setIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
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

    public Integer getPreviousStatus() {
        return previousStatus;
    }

    public void setPreviousStatus(Integer previousStatus) {
        this.previousStatus = previousStatus;
    }

    public String getPreviousStatusDescription() {
        return previousStatusDescription;
    }

    public void setPreviousStatusDescription(String previousStatusDescription) {
        this.previousStatusDescription = previousStatusDescription == null ? null : previousStatusDescription.trim();
    }

    public Integer getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
    }

    public Integer getActiveFtsIndexCount() {
        return activeFtsIndexCount;
    }

    public void setActiveFtsIndexCount(Integer activeFtsIndexCount) {
        this.activeFtsIndexCount = activeFtsIndexCount;
    }

    public Integer getAutoPopulationCount() {
        return autoPopulationCount;
    }

    public void setAutoPopulationCount(Integer autoPopulationCount) {
        this.autoPopulationCount = autoPopulationCount;
    }

    public Integer getManualPopulationCount() {
        return manualPopulationCount;
    }

    public void setManualPopulationCount(Integer manualPopulationCount) {
        this.manualPopulationCount = manualPopulationCount;
    }

    public Integer getFullIncrementalPopulationCount() {
        return fullIncrementalPopulationCount;
    }

    public void setFullIncrementalPopulationCount(Integer fullIncrementalPopulationCount) {
        this.fullIncrementalPopulationCount = fullIncrementalPopulationCount;
    }

    public Integer getRowCountInThousands() {
        return rowCountInThousands;
    }

    public void setRowCountInThousands(Integer rowCountInThousands) {
        this.rowCountInThousands = rowCountInThousands;
    }

    public Boolean getIsImporting() {
        return isImporting;
    }

    public void setIsImporting(Boolean isImporting) {
        this.isImporting = isImporting;
    }

    public byte[] getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(byte[] memoryAddress) {
        this.memoryAddress = memoryAddress;
    }
}