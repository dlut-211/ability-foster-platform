package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysftinds {
    private Integer id;

    private Integer indid;

    private Integer status;

    private String crtype;

    private Date crstart;

    private Date crend;

    private Long crrows;

    private Integer crerrors;

    private Byte sensitivity;

    private Byte bxvtdocidusebaset;

    private Integer batchsize;

    private Long nextdocid;

    private Integer fgid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIndid() {
        return indid;
    }

    public void setIndid(Integer indid) {
        this.indid = indid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCrtype() {
        return crtype;
    }

    public void setCrtype(String crtype) {
        this.crtype = crtype == null ? null : crtype.trim();
    }

    public Date getCrstart() {
        return crstart;
    }

    public void setCrstart(Date crstart) {
        this.crstart = crstart;
    }

    public Date getCrend() {
        return crend;
    }

    public void setCrend(Date crend) {
        this.crend = crend;
    }

    public Long getCrrows() {
        return crrows;
    }

    public void setCrrows(Long crrows) {
        this.crrows = crrows;
    }

    public Integer getCrerrors() {
        return crerrors;
    }

    public void setCrerrors(Integer crerrors) {
        this.crerrors = crerrors;
    }

    public Byte getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(Byte sensitivity) {
        this.sensitivity = sensitivity;
    }

    public Byte getBxvtdocidusebaset() {
        return bxvtdocidusebaset;
    }

    public void setBxvtdocidusebaset(Byte bxvtdocidusebaset) {
        this.bxvtdocidusebaset = bxvtdocidusebaset;
    }

    public Integer getBatchsize() {
        return batchsize;
    }

    public void setBatchsize(Integer batchsize) {
        this.batchsize = batchsize;
    }

    public Long getNextdocid() {
        return nextdocid;
    }

    public void setNextdocid(Long nextdocid) {
        this.nextdocid = nextdocid;
    }

    public Integer getFgid() {
        return fgid;
    }

    public void setFgid(Integer fgid) {
        this.fgid = fgid;
    }
}