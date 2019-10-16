package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsClusterProperties {
    private Long verboselogging;

    private Long sqldumperdumpflags;

    private String sqldumperdumppath;

    private Long sqldumperdumptimeout;

    private Long failureconditionlevel;

    private Long healthchecktimeout;

    public Long getVerboselogging() {
        return verboselogging;
    }

    public void setVerboselogging(Long verboselogging) {
        this.verboselogging = verboselogging;
    }

    public Long getSqldumperdumpflags() {
        return sqldumperdumpflags;
    }

    public void setSqldumperdumpflags(Long sqldumperdumpflags) {
        this.sqldumperdumpflags = sqldumperdumpflags;
    }

    public String getSqldumperdumppath() {
        return sqldumperdumppath;
    }

    public void setSqldumperdumppath(String sqldumperdumppath) {
        this.sqldumperdumppath = sqldumperdumppath == null ? null : sqldumperdumppath.trim();
    }

    public Long getSqldumperdumptimeout() {
        return sqldumperdumptimeout;
    }

    public void setSqldumperdumptimeout(Long sqldumperdumptimeout) {
        this.sqldumperdumptimeout = sqldumperdumptimeout;
    }

    public Long getFailureconditionlevel() {
        return failureconditionlevel;
    }

    public void setFailureconditionlevel(Long failureconditionlevel) {
        this.failureconditionlevel = failureconditionlevel;
    }

    public Long getHealthchecktimeout() {
        return healthchecktimeout;
    }

    public void setHealthchecktimeout(Long healthchecktimeout) {
        this.healthchecktimeout = healthchecktimeout;
    }
}