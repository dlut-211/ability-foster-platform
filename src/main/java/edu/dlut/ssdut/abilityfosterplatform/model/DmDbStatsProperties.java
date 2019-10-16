package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmDbStatsProperties {
    private Integer objectId;

    private Integer statsId;

    private Date lastUpdated;

    private Long rows;

    private Long rowsSampled;

    private Integer steps;

    private Long unfilteredRows;

    private Long modificationCounter;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getStatsId() {
        return statsId;
    }

    public void setStatsId(Integer statsId) {
        this.statsId = statsId;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public Long getRowsSampled() {
        return rowsSampled;
    }

    public void setRowsSampled(Long rowsSampled) {
        this.rowsSampled = rowsSampled;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public Long getUnfilteredRows() {
        return unfilteredRows;
    }

    public void setUnfilteredRows(Long unfilteredRows) {
        this.unfilteredRows = unfilteredRows;
    }

    public Long getModificationCounter() {
        return modificationCounter;
    }

    public void setModificationCounter(Long modificationCounter) {
        this.modificationCounter = modificationCounter;
    }
}