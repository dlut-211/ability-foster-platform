package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysscalartypes {
    private Integer id;

    private Integer schid;

    private String name;

    private Byte xtype;

    private Short length;

    private Byte prec;

    private Byte scale;

    private Integer collationid;

    private Integer status;

    private Date created;

    private Date modified;

    private Integer dflt;

    private Integer chk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchid() {
        return schid;
    }

    public void setSchid(Integer schid) {
        this.schid = schid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getXtype() {
        return xtype;
    }

    public void setXtype(Byte xtype) {
        this.xtype = xtype;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public Byte getPrec() {
        return prec;
    }

    public void setPrec(Byte prec) {
        this.prec = prec;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public Integer getCollationid() {
        return collationid;
    }

    public void setCollationid(Integer collationid) {
        this.collationid = collationid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getDflt() {
        return dflt;
    }

    public void setDflt(Integer dflt) {
        this.dflt = dflt;
    }

    public Integer getChk() {
        return chk;
    }

    public void setChk(Integer chk) {
        this.chk = chk;
    }
}