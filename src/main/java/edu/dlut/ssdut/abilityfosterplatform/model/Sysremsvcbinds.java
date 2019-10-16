package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysremsvcbinds {
    private Integer id;

    private String name;

    private Integer scid;

    private String remsvc;

    private Integer status;

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

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public String getRemsvc() {
        return remsvc;
    }

    public void setRemsvc(String remsvc) {
        this.remsvc = remsvc == null ? null : remsvc.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}