package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecBackgroundJobQueue {
    private Date timeQueued;

    private Integer jobId;

    private Integer databaseId;

    private Integer objectId1;

    private Integer objectId2;

    private Integer objectId3;

    private Integer objectId4;

    private Integer errorCode;

    private Short requestType;

    private Short retryCount;

    private Short inProgress;

    private Short sessionId;

    public Date getTimeQueued() {
        return timeQueued;
    }

    public void setTimeQueued(Date timeQueued) {
        this.timeQueued = timeQueued;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getObjectId1() {
        return objectId1;
    }

    public void setObjectId1(Integer objectId1) {
        this.objectId1 = objectId1;
    }

    public Integer getObjectId2() {
        return objectId2;
    }

    public void setObjectId2(Integer objectId2) {
        this.objectId2 = objectId2;
    }

    public Integer getObjectId3() {
        return objectId3;
    }

    public void setObjectId3(Integer objectId3) {
        this.objectId3 = objectId3;
    }

    public Integer getObjectId4() {
        return objectId4;
    }

    public void setObjectId4(Integer objectId4) {
        this.objectId4 = objectId4;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Short getRequestType() {
        return requestType;
    }

    public void setRequestType(Short requestType) {
        this.requestType = requestType;
    }

    public Short getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Short retryCount) {
        this.retryCount = retryCount;
    }

    public Short getInProgress() {
        return inProgress;
    }

    public void setInProgress(Short inProgress) {
        this.inProgress = inProgress;
    }

    public Short getSessionId() {
        return sessionId;
    }

    public void setSessionId(Short sessionId) {
        this.sessionId = sessionId;
    }
}