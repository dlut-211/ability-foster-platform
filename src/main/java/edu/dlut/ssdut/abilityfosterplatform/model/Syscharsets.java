package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscharsets {
    private Short type;

    private Byte id;

    private Byte csid;

    private Short status;

    private String name;

    private String description;

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Byte getCsid() {
        return csid;
    }

    public void setCsid(Byte csid) {
        this.csid = csid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}