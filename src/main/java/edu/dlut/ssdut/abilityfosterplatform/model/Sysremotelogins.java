package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysremotelogins {
    private Short remoteserverid;

    private String remoteusername;

    private Short status;

    private Date changedate;

    private byte[] sid;

    public Short getRemoteserverid() {
        return remoteserverid;
    }

    public void setRemoteserverid(Short remoteserverid) {
        this.remoteserverid = remoteserverid;
    }

    public String getRemoteusername() {
        return remoteusername;
    }

    public void setRemoteusername(String remoteusername) {
        this.remoteusername = remoteusername == null ? null : remoteusername.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }
}