package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syswebmethods {
    private Integer id;

    private String nmspace;

    private String alias;

    private String objname;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNmspace() {
        return nmspace;
    }

    public void setNmspace(String nmspace) {
        this.nmspace = nmspace == null ? null : nmspace.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getObjname() {
        return objname;
    }

    public void setObjname(String objname) {
        this.objname = objname == null ? null : objname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}