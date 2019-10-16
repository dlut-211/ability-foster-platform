package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Syscerts {
    private Integer id;

    private String name;

    private String encrtype;

    private Integer status;

    private Date lastpkeybackup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEncrtype() {
        return encrtype;
    }

    public void setEncrtype(String encrtype) {
        this.encrtype = encrtype == null ? null : encrtype.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastpkeybackup() {
        return lastpkeybackup;
    }

    public void setLastpkeybackup(Date lastpkeybackup) {
        this.lastpkeybackup = lastpkeybackup;
    }
}