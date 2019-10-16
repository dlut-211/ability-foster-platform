package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysoledbusers {
    private Short rmtsrvid;

    private String rmtloginame;

    private String rmtpassword;

    private Short status;

    private Date changedate;

    private byte[] loginsid;

    public Short getRmtsrvid() {
        return rmtsrvid;
    }

    public void setRmtsrvid(Short rmtsrvid) {
        this.rmtsrvid = rmtsrvid;
    }

    public String getRmtloginame() {
        return rmtloginame;
    }

    public void setRmtloginame(String rmtloginame) {
        this.rmtloginame = rmtloginame == null ? null : rmtloginame.trim();
    }

    public String getRmtpassword() {
        return rmtpassword;
    }

    public void setRmtpassword(String rmtpassword) {
        this.rmtpassword = rmtpassword == null ? null : rmtpassword.trim();
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

    public byte[] getLoginsid() {
        return loginsid;
    }

    public void setLoginsid(byte[] loginsid) {
        this.loginsid = loginsid;
    }
}