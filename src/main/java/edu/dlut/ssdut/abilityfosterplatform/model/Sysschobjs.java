package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysschobjs {
    private Integer id;

    private String name;

    private Integer nsid;

    private Byte nsclass;

    private Integer status;

    private String type;

    private Integer pid;

    private Byte pclass;

    private Integer intprop;

    private Date created;

    private Date modified;

    private Integer status2;

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

    public Integer getNsid() {
        return nsid;
    }

    public void setNsid(Integer nsid) {
        this.nsid = nsid;
    }

    public Byte getNsclass() {
        return nsclass;
    }

    public void setNsclass(Byte nsclass) {
        this.nsclass = nsclass;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getPclass() {
        return pclass;
    }

    public void setPclass(Byte pclass) {
        this.pclass = pclass;
    }

    public Integer getIntprop() {
        return intprop;
    }

    public void setIntprop(Integer intprop) {
        this.intprop = intprop;
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

    public Integer getStatus2() {
        return status2;
    }

    public void setStatus2(Integer status2) {
        this.status2 = status2;
    }
}