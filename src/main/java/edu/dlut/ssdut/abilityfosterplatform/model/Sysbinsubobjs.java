package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysbinsubobjs {
    private Byte class;

    private Integer idmajor;

    private Integer subid;

    private String name;

    private Integer status;

    private Integer intprop;

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

    public Integer getIdmajor() {
        return idmajor;
    }

    public void setIdmajor(Integer idmajor) {
        this.idmajor = idmajor;
    }

    public Integer getSubid() {
        return subid;
    }

    public void setSubid(Integer subid) {
        this.subid = subid;
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

    public Integer getIntprop() {
        return intprop;
    }

    public void setIntprop(Integer intprop) {
        this.intprop = intprop;
    }
}