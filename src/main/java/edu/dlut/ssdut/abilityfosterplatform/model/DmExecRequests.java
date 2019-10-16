package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecRequests {
    private Short sessionId;

    private Integer requestId;

    private Date startTime;

    private String status;

    private String command;

    private Integer statementStartOffset;

    private Integer statementEndOffset;

    private Short databaseId;

    private Integer userId;

    private String connectionId;

    private Short blockingSessionId;

    private String waitType;

    private Integer waitTime;

    private String lastWaitType;

    private String waitResource;

    private Integer openTransactionCount;

    private Integer openResultsetCount;

    private Long transactionId;

    private Float percentComplete;

    private Long estimatedCompletionTime;

    private Integer cpuTime;

    private Integer totalElapsedTime;

    private Integer schedulerId;

    private Long reads;

    private Long writes;

    private Long logicalReads;

    private Integer textSize;

    private String language;

    private String dateFormat;

    private Short dateFirst;

    private Boolean quotedIdentifier;

    private Boolean arithabort;

    private Boolean ansiNullDfltOn;

    private Boolean ansiDefaults;

    private Boolean ansiWarnings;

    private Boolean ansiPadding;

    private Boolean ansiNulls;

    private Boolean concatNullYieldsNull;

    private Short transactionIsolationLevel;

    private Integer lockTimeout;

    private Integer deadlockPriority;

    private Long rowCount;

    private Integer prevError;

    private Integer nestLevel;

    private Integer grantedQueryMemory;

    private Boolean executingManagedCode;

    private Integer groupId;

    private Long statementContextId;

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
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

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId == null ? null : connectionId.trim();
    }

    public Short getBlockingSessionId() {
        return blockingSessionId;
    }

    public void setBlockingSessionId(Short blockingSessionId) {
        this.blockingSessionId = blockingSessionId;
    }

    public String getWaitType() {
        return waitType;
    }

    public void setWaitType(String waitType) {
        this.waitType = waitType == null ? null : waitType.trim();
    }

    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    public String getLastWaitType() {
        return lastWaitType;
    }

    public void setLastWaitType(String lastWaitType) {
        this.lastWaitType = lastWaitType == null ? null : lastWaitType.trim();
    }

    public String getWaitResource() {
        return waitResource;
    }

    public void setWaitResource(String waitResource) {
        this.waitResource = waitResource == null ? null : waitResource.trim();
    }

    public Integer getOpenTransactionCount() {
        return openTransactionCount;
    }

    public void setOpenTransactionCount(Integer openTransactionCount) {
        this.openTransactionCount = openTransactionCount;
    }

    public Integer getOpenResultsetCount() {
        return openResultsetCount;
    }

    public void setOpenResultsetCount(Integer openResultsetCount) {
        this.openResultsetCount = openResultsetCount;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Float getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(Float percentComplete) {
        this.percentComplete = percentComplete;
    }

    public Long getEstimatedCompletionTime() {
        return estimatedCompletionTime;
    }

    public void setEstimatedCompletionTime(Long estimatedCompletionTime) {
        this.estimatedCompletionTime = estimatedCompletionTime;
    }

    public Integer getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
    }

    public Integer getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(Integer totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public Integer getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(Integer schedulerId) {
        this.schedulerId = schedulerId;
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

    public Long getLogicalReads() {
        return logicalReads;
    }

    public void setLogicalReads(Long logicalReads) {
        this.logicalReads = logicalReads;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat == null ? null : dateFormat.trim();
    }

    public Short getDateFirst() {
        return dateFirst;
    }

    public void setDateFirst(Short dateFirst) {
        this.dateFirst = dateFirst;
    }

    public Boolean getQuotedIdentifier() {
        return quotedIdentifier;
    }

    public void setQuotedIdentifier(Boolean quotedIdentifier) {
        this.quotedIdentifier = quotedIdentifier;
    }

    public Boolean getArithabort() {
        return arithabort;
    }

    public void setArithabort(Boolean arithabort) {
        this.arithabort = arithabort;
    }

    public Boolean getAnsiNullDfltOn() {
        return ansiNullDfltOn;
    }

    public void setAnsiNullDfltOn(Boolean ansiNullDfltOn) {
        this.ansiNullDfltOn = ansiNullDfltOn;
    }

    public Boolean getAnsiDefaults() {
        return ansiDefaults;
    }

    public void setAnsiDefaults(Boolean ansiDefaults) {
        this.ansiDefaults = ansiDefaults;
    }

    public Boolean getAnsiWarnings() {
        return ansiWarnings;
    }

    public void setAnsiWarnings(Boolean ansiWarnings) {
        this.ansiWarnings = ansiWarnings;
    }

    public Boolean getAnsiPadding() {
        return ansiPadding;
    }

    public void setAnsiPadding(Boolean ansiPadding) {
        this.ansiPadding = ansiPadding;
    }

    public Boolean getAnsiNulls() {
        return ansiNulls;
    }

    public void setAnsiNulls(Boolean ansiNulls) {
        this.ansiNulls = ansiNulls;
    }

    public Boolean getConcatNullYieldsNull() {
        return concatNullYieldsNull;
    }

    public void setConcatNullYieldsNull(Boolean concatNullYieldsNull) {
        this.concatNullYieldsNull = concatNullYieldsNull;
    }

    public Short getTransactionIsolationLevel() {
        return transactionIsolationLevel;
    }

    public void setTransactionIsolationLevel(Short transactionIsolationLevel) {
        this.transactionIsolationLevel = transactionIsolationLevel;
    }

    public Integer getLockTimeout() {
        return lockTimeout;
    }

    public void setLockTimeout(Integer lockTimeout) {
        this.lockTimeout = lockTimeout;
    }

    public Integer getDeadlockPriority() {
        return deadlockPriority;
    }

    public void setDeadlockPriority(Integer deadlockPriority) {
        this.deadlockPriority = deadlockPriority;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getPrevError() {
        return prevError;
    }

    public void setPrevError(Integer prevError) {
        this.prevError = prevError;
    }

    public Integer getNestLevel() {
        return nestLevel;
    }

    public void setNestLevel(Integer nestLevel) {
        this.nestLevel = nestLevel;
    }

    public Integer getGrantedQueryMemory() {
        return grantedQueryMemory;
    }

    public void setGrantedQueryMemory(Integer grantedQueryMemory) {
        this.grantedQueryMemory = grantedQueryMemory;
    }

    public Boolean getExecutingManagedCode() {
        return executingManagedCode;
    }

    public void setExecutingManagedCode(Boolean executingManagedCode) {
        this.executingManagedCode = executingManagedCode;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Long getStatementContextId() {
        return statementContextId;
    }

    public void setStatementContextId(Long statementContextId) {
        this.statementContextId = statementContextId;
    }
}