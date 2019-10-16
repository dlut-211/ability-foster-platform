package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysusermsgs {
    private Integer id;

    private Short msglangid;

    private Short severity;

    private Short status;

    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getMsglangid() {
        return msglangid;
    }

    public void setMsglangid(Short msglangid) {
        this.msglangid = msglangid;
    }

    public Short getSeverity() {
        return severity;
    }

    public void setSeverity(Short severity) {
        this.severity = severity;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}