package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysallocunits {
    private Long auid;

    private Byte type;

    private Long ownerid;

    private Integer status;

    private Short fgid;

    private Long pcused;

    private Long pcdata;

    private Long pcreserved;

    public Long getAuid() {
        return auid;
    }

    public void setAuid(Long auid) {
        this.auid = auid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Short getFgid() {
        return fgid;
    }

    public void setFgid(Short fgid) {
        this.fgid = fgid;
    }

    public Long getPcused() {
        return pcused;
    }

    public void setPcused(Long pcused) {
        this.pcused = pcused;
    }

    public Long getPcdata() {
        return pcdata;
    }

    public void setPcdata(Long pcdata) {
        this.pcdata = pcdata;
    }

    public Long getPcreserved() {
        return pcreserved;
    }

    public void setPcreserved(Long pcreserved) {
        this.pcreserved = pcreserved;
    }
}