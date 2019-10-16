package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class FnSqlagentJobstepsLogs {
    private Integer logId;

    private String logText;

    private Date dateCreated;

    private String stepUid;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogText() {
        return logText;
    }

    public void setLogText(String logText) {
        this.logText = logText == null ? null : logText.trim();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStepUid() {
        return stepUid;
    }

    public void setStepUid(String stepUid) {
        this.stepUid = stepUid == null ? null : stepUid.trim();
    }
}