package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysrmtlgns {
    private Integer srvid;

    private String name;

    private Integer lgnid;

    private Integer status;

    private Date modate;

    public Integer getSrvid() {
        return srvid;
    }

    public void setSrvid(Integer srvid) {
        this.srvid = srvid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLgnid() {
        return lgnid;
    }

    public void setLgnid(Integer lgnid) {
        this.lgnid = lgnid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getModate() {
        return modate;
    }

    public void setModate(Date modate) {
        this.modate = modate;
    }
}