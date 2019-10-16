package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnValidatePlanGuide {
    private Integer msgnum;

    private Byte severity;

    private Short state;

    private String message;

    public Integer getMsgnum() {
        return msgnum;
    }

    public void setMsgnum(Integer msgnum) {
        this.msgnum = msgnum;
    }

    public Byte getSeverity() {
        return severity;
    }

    public void setSeverity(Byte severity) {
        this.severity = severity;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}