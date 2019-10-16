package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmBrokerQueueMonitors {
    private Integer databaseId;

    private Integer queueId;

    private String state;

    private Date lastEmptyRowsetTime;

    private Date lastActivatedTime;

    private Integer tasksWaiting;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getLastEmptyRowsetTime() {
        return lastEmptyRowsetTime;
    }

    public void setLastEmptyRowsetTime(Date lastEmptyRowsetTime) {
        this.lastEmptyRowsetTime = lastEmptyRowsetTime;
    }

    public Date getLastActivatedTime() {
        return lastActivatedTime;
    }

    public void setLastActivatedTime(Date lastActivatedTime) {
        this.lastActivatedTime = lastActivatedTime;
    }

    public Integer getTasksWaiting() {
        return tasksWaiting;
    }

    public void setTasksWaiting(Integer tasksWaiting) {
        this.tasksWaiting = tasksWaiting;
    }
}