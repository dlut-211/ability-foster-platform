package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syspermissions {
    private Integer id;

    private Short grantee;

    private Short grantor;

    private Short actadd;

    private Short actmod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getGrantee() {
        return grantee;
    }

    public void setGrantee(Short grantee) {
        this.grantee = grantee;
    }

    public Short getGrantor() {
        return grantor;
    }

    public void setGrantor(Short grantor) {
        this.grantor = grantor;
    }

    public Short getActadd() {
        return actadd;
    }

    public void setActadd(Short actadd) {
        this.actadd = actadd;
    }

    public Short getActmod() {
        return actmod;
    }

    public void setActmod(Short actmod) {
        this.actmod = actmod;
    }
}