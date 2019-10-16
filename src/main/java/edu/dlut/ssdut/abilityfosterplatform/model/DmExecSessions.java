package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecSessions {
    private Short sessionId;

    private Date loginTime;

    private String hostName;

    private String programName;

    private Integer hostProcessId;

    private Integer clientVersion;

    private String clientInterfaceName;

    private String loginName;

    private String ntDomain;

    private String ntUserName;

    private String status;

    private Integer cpuTime;

    private Integer memoryUsage;

    private Integer totalScheduledTime;

    private Integer totalElapsedTime;

    private Integer endpointId;

    private Date lastRequestStartTime;

    private Date lastRequestEndTime;

    private Long reads;

    private Long writes;

    private Long logicalReads;

    private Boolean isUserProcess;

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

    private String originalLoginName;

    private Date lastSuccessfulLogon;

    private Date lastUnsuccessfulLogon;

    private Long unsuccessfulLogons;

    private Integer groupId;

    private Short databaseId;

    private Integer authenticatingDatabaseId;

    private Integer openTransactionCount;

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    public Integer getHostProcessId() {
        return hostProcessId;
    }

    public void setHostProcessId(Integer hostProcessId) {
        this.hostProcessId = hostProcessId;
    }

    public Integer getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(Integer clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getClientInterfaceName() {
        return clientInterfaceName;
    }

    public void setClientInterfaceName(String clientInterfaceName) {
        this.clientInterfaceName = clientInterfaceName == null ? null : clientInterfaceName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getNtDomain() {
        return ntDomain;
    }

    public void setNtDomain(String ntDomain) {
        this.ntDomain = ntDomain == null ? null : ntDomain.trim();
    }

    public String getNtUserName() {
        return ntUserName;
    }

    public void setNtUserName(String ntUserName) {
        this.ntUserName = ntUserName == null ? null : ntUserName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
    }

    public Integer getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(Integer memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public Integer getTotalScheduledTime() {
        return totalScheduledTime;
    }

    public void setTotalScheduledTime(Integer totalScheduledTime) {
        this.totalScheduledTime = totalScheduledTime;
    }

    public Integer getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(Integer totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public Integer getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(Integer endpointId) {
        this.endpointId = endpointId;
    }

    public Date getLastRequestStartTime() {
        return lastRequestStartTime;
    }

    public void setLastRequestStartTime(Date lastRequestStartTime) {
        this.lastRequestStartTime = lastRequestStartTime;
    }

    public Date getLastRequestEndTime() {
        return lastRequestEndTime;
    }

    public void setLastRequestEndTime(Date lastRequestEndTime) {
        this.lastRequestEndTime = lastRequestEndTime;
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

    public Boolean getIsUserProcess() {
        return isUserProcess;
    }

    public void setIsUserProcess(Boolean isUserProcess) {
        this.isUserProcess = isUserProcess;
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

    public String getOriginalLoginName() {
        return originalLoginName;
    }

    public void setOriginalLoginName(String originalLoginName) {
        this.originalLoginName = originalLoginName == null ? null : originalLoginName.trim();
    }

    public Date getLastSuccessfulLogon() {
        return lastSuccessfulLogon;
    }

    public void setLastSuccessfulLogon(Date lastSuccessfulLogon) {
        this.lastSuccessfulLogon = lastSuccessfulLogon;
    }

    public Date getLastUnsuccessfulLogon() {
        return lastUnsuccessfulLogon;
    }

    public void setLastUnsuccessfulLogon(Date lastUnsuccessfulLogon) {
        this.lastUnsuccessfulLogon = lastUnsuccessfulLogon;
    }

    public Long getUnsuccessfulLogons() {
        return unsuccessfulLogons;
    }

    public void setUnsuccessfulLogons(Long unsuccessfulLogons) {
        this.unsuccessfulLogons = unsuccessfulLogons;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getAuthenticatingDatabaseId() {
        return authenticatingDatabaseId;
    }

    public void setAuthenticatingDatabaseId(Integer authenticatingDatabaseId) {
        this.authenticatingDatabaseId = authenticatingDatabaseId;
    }

    public Integer getOpenTransactionCount() {
        return openTransactionCount;
    }

    public void setOpenTransactionCount(Integer openTransactionCount) {
        this.openTransactionCount = openTransactionCount;
    }
}