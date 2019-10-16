package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecCursors {
    private Integer sessionId;

    private Integer cursorId;

    private String name;

    private String properties;

    private Integer statementStartOffset;

    private Integer statementEndOffset;

    private Long planGenerationNum;

    private Date creationTime;

    private Boolean isOpen;

    private Boolean isAsyncPopulation;

    private Boolean isCloseOnCommit;

    private Integer fetchStatus;

    private Integer fetchBufferSize;

    private Integer fetchBufferStart;

    private Integer ansiPosition;

    private Long workerTime;

    private Long reads;

    private Long writes;

    private Long dormantDuration;

    private Long statementContextId;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getCursorId() {
        return cursorId;
    }

    public void setCursorId(Integer cursorId) {
        this.cursorId = cursorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }

    public Integer getStatementStartOffset() {
        return statementStartOffset;
    }

    public void setStatementStartOffset(Integer statementStartOffset) {
        this.statementStartOffset = statementStartOffset;
    }

    public Integer getStatementEndOffset() {
        return statementEndOffset;
    }

    public void setStatementEndOffset(Integer statementEndOffset) {
        this.statementEndOffset = statementEndOffset;
    }

    public Long getPlanGenerationNum() {
        return planGenerationNum;
    }

    public void setPlanGenerationNum(Long planGenerationNum) {
        this.planGenerationNum = planGenerationNum;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsAsyncPopulation() {
        return isAsyncPopulation;
    }

    public void setIsAsyncPopulation(Boolean isAsyncPopulation) {
        this.isAsyncPopulation = isAsyncPopulation;
    }

    public Boolean getIsCloseOnCommit() {
        return isCloseOnCommit;
    }

    public void setIsCloseOnCommit(Boolean isCloseOnCommit) {
        this.isCloseOnCommit = isCloseOnCommit;
    }

    public Integer getFetchStatus() {
        return fetchStatus;
    }

    public void setFetchStatus(Integer fetchStatus) {
        this.fetchStatus = fetchStatus;
    }

    public Integer getFetchBufferSize() {
        return fetchBufferSize;
    }

    public void setFetchBufferSize(Integer fetchBufferSize) {
        this.fetchBufferSize = fetchBufferSize;
    }

    public Integer getFetchBufferStart() {
        return fetchBufferStart;
    }

    public void setFetchBufferStart(Integer fetchBufferStart) {
        this.fetchBufferStart = fetchBufferStart;
    }

    public Integer getAnsiPosition() {
        return ansiPosition;
    }

    public void setAnsiPosition(Integer ansiPosition) {
        this.ansiPosition = ansiPosition;
    }

    public Long getWorkerTime() {
        return workerTime;
    }

    public void setWorkerTime(Long workerTime) {
        this.workerTime = workerTime;
    }

    public Long getReads() {
        return reads;
    }

    public void setReads(Long reads) {
        this.reads = reads;
    }

    public Long getWrites() {
        return writes;
    }

    public void setWrites(Long writes) {
        this.writes = writes;
    }

    public Long getDormantDuration() {
        return dormantDuration;
    }

    public void setDormantDuration(Long dormantDuration) {
        this.dormantDuration = dormantDuration;
    }

    public Long getStatementContextId() {
        return statementContextId;
    }

    public void setStatementContextId(Long statementContextId) {
        this.statementContextId = statementContextId;
    }
}