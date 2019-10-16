package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Syschildinsts {
    private String iname;

    private String ipipename;

    private Integer pid;

    private Integer status;

    private Date crdate;

    private Date modate;

    private String sysdbpath;

    private byte[] lsid;

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public String getIpipename() {
        return ipipename;
    }

    public void setIpipename(String ipipename) {
        this.ipipename = ipipename == null ? null : ipipename.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public Date getModate() {
        return modate;
    }

    public void setModate(Date modate) {
        this.modate = modate;
    }

    public String getSysdbpath() {
        return sysdbpath;
    }

    public void setSysdbpath(String sysdbpath) {
        this.sysdbpath = sysdbpath == null ? null : sysdbpath.trim();
    }

    public byte[] getLsid() {
        return lsid;
    }

    public void setLsid(byte[] lsid) {
        this.lsid = lsid;
    }
}