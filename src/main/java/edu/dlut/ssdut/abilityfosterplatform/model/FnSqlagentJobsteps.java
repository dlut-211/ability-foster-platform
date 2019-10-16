package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnSqlagentJobsteps {
    private String jobId;

    private Integer stepId;

    private String stepName;

    private String subsystem;

    private String command;

    private Integer flags;

    private String additionalParameters;

    private Integer cmdexecSuccessCode;

    private Byte onSuccessAction;

    private Integer onSuccessStepId;

    private Byte onFailAction;

    private Integer onFailStepId;

    private String server;

    private String databaseName;

    private String databaseUserName;

    private Integer retryAttempts;

    private Integer retryInterval;

    private Integer osRunPriority;

    private String outputFileName;

    private Integer lastRunOutcome;

    private Integer lastRunDuration;

    private Integer lastRunRetries;

    private Integer lastRunDate;

    private Integer lastRunTime;

    private String stepUid;

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

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }

    public String getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem == null ? null : subsystem.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getAdditionalParameters() {
        return additionalParameters;
    }

    public void setAdditionalParameters(String additionalParameters) {
        this.additionalParameters = additionalParameters == null ? null : additionalParameters.trim();
    }

    public Integer getCmdexecSuccessCode() {
        return cmdexecSuccessCode;
    }

    public void setCmdexecSuccessCode(Integer cmdexecSuccessCode) {
        this.cmdexecSuccessCode = cmdexecSuccessCode;
    }

    public Byte getOnSuccessAction() {
        return onSuccessAction;
    }

    public void setOnSuccessAction(Byte onSuccessAction) {
        this.onSuccessAction = onSuccessAction;
    }

    public Integer getOnSuccessStepId() {
        return onSuccessStepId;
    }

    public void setOnSuccessStepId(Integer onSuccessStepId) {
        this.onSuccessStepId = onSuccessStepId;
    }

    public Byte getOnFailAction() {
        return onFailAction;
    }

    public void setOnFailAction(Byte onFailAction) {
        this.onFailAction = onFailAction;
    }

    public Integer getOnFailStepId() {
        return onFailStepId;
    }

    public void setOnFailStepId(Integer onFailStepId) {
        this.onFailStepId = onFailStepId;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public String getDatabaseUserName() {
        return databaseUserName;
    }

    public void setDatabaseUserName(String databaseUserName) {
        this.databaseUserName = databaseUserName == null ? null : databaseUserName.trim();
    }

    public Integer getRetryAttempts() {
        return retryAttempts;
    }

    public void setRetryAttempts(Integer retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    public Integer getOsRunPriority() {
        return osRunPriority;
    }

    public void setOsRunPriority(Integer osRunPriority) {
        this.osRunPriority = osRunPriority;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName == null ? null : outputFileName.trim();
    }

    public Integer getLastRunOutcome() {
        return lastRunOutcome;
    }

    public void setLastRunOutcome(Integer lastRunOutcome) {
        this.lastRunOutcome = lastRunOutcome;
    }

    public Integer getLastRunDuration() {
        return lastRunDuration;
    }

    public void setLastRunDuration(Integer lastRunDuration) {
        this.lastRunDuration = lastRunDuration;
    }

    public Integer getLastRunRetries() {
        return lastRunRetries;
    }

    public void setLastRunRetries(Integer lastRunRetries) {
        this.lastRunRetries = lastRunRetries;
    }

    public Integer getLastRunDate() {
        return lastRunDate;
    }

    public void setLastRunDate(Integer lastRunDate) {
        this.lastRunDate = lastRunDate;
    }

    public Integer getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(Integer lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public String getStepUid() {
        return stepUid;
    }

    public void setStepUid(String stepUid) {
        this.stepUid = stepUid == null ? null : stepUid.trim();
    }
}