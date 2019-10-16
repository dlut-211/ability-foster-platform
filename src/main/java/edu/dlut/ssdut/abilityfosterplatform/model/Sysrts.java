package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysrts {
    private Integer id;

    private String name;

    private String remsvc;

    private String brkrinst;

    private String addr;

    private String miraddr;

    private Date lifetime;

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

    public String getRemsvc() {
        return remsvc;
    }

    public void setRemsvc(String remsvc) {
        this.remsvc = remsvc == null ? null : remsvc.trim();
    }

    public String getBrkrinst() {
        return brkrinst;
    }

    public void setBrkrinst(String brkrinst) {
        this.brkrinst = brkrinst == null ? null : brkrinst.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getMiraddr() {
        return miraddr;
    }

    public void setMiraddr(String miraddr) {
        this.miraddr = miraddr == null ? null : miraddr.trim();
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }
}