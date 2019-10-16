package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysmessages {
    private Integer error;

    private Byte severity;

    private Short dlevel;

    private String description;

    private Short msglangid;

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public Byte getSeverity() {
        return severity;
    }

    public void setSeverity(Byte severity) {
        this.severity = severity;
    }

    public Short getDlevel() {
        return dlevel;
    }

    public void setDlevel(Short dlevel) {
        this.dlevel = dlevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Short getMsglangid() {
        return msglangid;
    }

    public void setMsglangid(Short msglangid) {
        this.msglangid = msglangid;
    }
}