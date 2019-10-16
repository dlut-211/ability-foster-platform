package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class FnSqlagentJobs {
    private String jobId;

    private String name;

    private Boolean enabled;

    private String description;

    private Integer startStepId;

    private Boolean notifyLevelEventlog;

    private Integer deleteLevel;

    private Date dateCreated;

    private Date dateModified;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getStartStepId() {
        return startStepId;
    }

    public void setStartStepId(Integer startStepId) {
        this.startStepId = startStepId;
    }

    public Boolean getNotifyLevelEventlog() {
        return notifyLevelEventlog;
    }

    public void setNotifyLevelEventlog(Boolean notifyLevelEventlog) {
        this.notifyLevelEventlog = notifyLevelEventlog;
    }

    public Integer getDeleteLevel() {
        return deleteLevel;
    }

    public void setDeleteLevel(Integer deleteLevel) {
        this.deleteLevel = deleteLevel;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}