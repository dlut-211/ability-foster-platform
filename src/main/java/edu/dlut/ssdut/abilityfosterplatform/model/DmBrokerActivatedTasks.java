package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmBrokerActivatedTasks {
    private Integer spid;

    private Short databaseId;

    private Integer queueId;

    private String procedureName;

    private Integer executeAs;

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName == null ? null : procedureName.trim();
    }

    public Integer getExecuteAs() {
        return executeAs;
    }

    public void setExecuteAs(Integer executeAs) {
        this.executeAs = executeAs;
    }
}