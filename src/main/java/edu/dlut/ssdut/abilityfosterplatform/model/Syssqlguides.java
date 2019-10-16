package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Syssqlguides {
    private Integer id;

    private String name;

    private Byte scopetype;

    private Integer scopeid;

    private Integer status;

    private Date created;

    private Date modified;

    private String batchtext;

    private String paramorhinttext;

    private byte[] hash;

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

    public Byte getScopetype() {
        return scopetype;
    }

    public void setScopetype(Byte scopetype) {
        this.scopetype = scopetype;
    }

    public Integer getScopeid() {
        return scopeid;
    }

    public void setScopeid(Integer scopeid) {
        this.scopeid = scopeid;
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

    public String getBatchtext() {
        return batchtext;
    }

    public void setBatchtext(String batchtext) {
        this.batchtext = batchtext == null ? null : batchtext.trim();
    }

    public String getParamorhinttext() {
        return paramorhinttext;
    }

    public void setParamorhinttext(String paramorhinttext) {
        this.paramorhinttext = paramorhinttext == null ? null : paramorhinttext.trim();
    }

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }
}