package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysfoqueues {
    private Integer id;

    private Integer epoch;

    private Long csn;

    private Date created;

    private byte[] lsn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public Long getCsn() {
        return csn;
    }

    public void setCsn(Long csn) {
        this.csn = csn;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public byte[] getLsn() {
        return lsn;
    }

    public void setLsn(byte[] lsn) {
        this.lsn = lsn;
    }
}