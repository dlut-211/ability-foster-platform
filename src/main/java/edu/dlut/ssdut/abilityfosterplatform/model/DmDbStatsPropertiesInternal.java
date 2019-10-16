package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmDbStatsPropertiesInternal {
    private Integer objectId;

    private Integer statsId;

    private Date lastUpdated;

    private Long rows;

    private Long rowsSampled;

    private Integer steps;

    private Long unfilteredRows;

    private Long modificationCounter;

    private Integer nodeId;

    private Integer firstChild;

    private Integer nextSibling;

    private Object leftBoundary;

    private Object rightBoundary;

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

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(Integer firstChild) {
        this.firstChild = firstChild;
    }

    public Integer getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(Integer nextSibling) {
        this.nextSibling = nextSibling;
    }

    public Object getLeftBoundary() {
        return leftBoundary;
    }

    public void setLeftBoundary(Object leftBoundary) {
        this.leftBoundary = leftBoundary;
    }

    public Object getRightBoundary() {
        return rightBoundary;
    }

    public void setRightBoundary(Object rightBoundary) {
        this.rightBoundary = rightBoundary;
    }
}