package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnSqlagentJobHistory {
    private Integer instanceId;

    private String jobId;

    private Integer stepId;

    private Integer sqlMessageId;

    private Integer sqlSeverity;

    private String message;

    private Integer runStatus;

    private Integer runDate;

    private Integer runTime;

    private Integer runDuration;

    private Integer operatorIdEmailed;

    private Integer operatorIdPaged;

    private Integer retriesAttempted;

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public Integer getStepId() {
        return stepId;
    }

    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    public Integer getSqlMessageId() {
        return sqlMessageId;
    }

    public void setSqlMessageId(Integer sqlMessageId) {
        this.sqlMessageId = sqlMessageId;
    }

    public Integer getSqlSeverity() {
        return sqlSeverity;
    }

    public void setSqlSeverity(Integer sqlSeverity) {
        this.sqlSeverity = sqlSeverity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getRunDate() {
        return runDate;
    }

    public void setRunDate(Integer runDate) {
        this.runDate = runDate;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public Integer getRunDuration() {
        return runDuration;
    }

    public void setRunDuration(Integer runDuration) {
        this.runDuration = runDuration;
    }

    public Integer getOperatorIdEmailed() {
        return operatorIdEmailed;
    }

    public void setOperatorIdEmailed(Integer operatorIdEmailed) {
        this.operatorIdEmailed = operatorIdEmailed;
    }

    public Integer getOperatorIdPaged() {
        return operatorIdPaged;
    }

    public void setOperatorIdPaged(Integer operatorIdPaged) {
        this.operatorIdPaged = operatorIdPaged;
    }

    public Integer getRetriesAttempted() {
        return retriesAttempted;
    }

    public void setRetriesAttempted(Integer retriesAttempted) {
        this.retriesAttempted = retriesAttempted;
    }
}