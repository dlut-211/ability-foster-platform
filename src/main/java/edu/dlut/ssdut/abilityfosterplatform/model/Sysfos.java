package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysfos {
    private Integer id;

    private Integer tgid;

    private Long rowcnt;

    private Long size;

    private Long csn;

    private Integer epoch;

    private String status;

    private Date created;

    private Date modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTgid() {
        return tgid;
    }

    public void setTgid(Integer tgid) {
        this.tgid = tgid;
    }

    public Long getRowcnt() {
        return rowcnt;
    }

    public void setRowcnt(Long rowcnt) {
        this.rowcnt = rowcnt;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getCsn() {
        return csn;
    }

    public void setCsn(Long csn) {
        this.csn = csn;
    }

    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}