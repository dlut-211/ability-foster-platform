package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysclsobjs {
    private Byte class;

    private Integer id;

    private String name;

    private Integer status;

    private String type;

    private Integer intprop;

    private Date created;

    private Date modified;

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

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
}