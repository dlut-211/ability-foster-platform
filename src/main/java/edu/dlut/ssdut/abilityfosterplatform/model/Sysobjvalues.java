package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysobjvalues {
    private Byte valclass;

    private Integer objid;

    private Integer subobjid;

    private Integer valnum;

    private Object value;

    private byte[] imageval;

    public Byte getValclass() {
        return valclass;
    }

    public void setValclass(Byte valclass) {
        this.valclass = valclass;
    }

    public Integer getObjid() {
        return objid;
    }

    public void setObjid(Integer objid) {
        this.objid = objid;
    }

    public Integer getSubobjid() {
        return subobjid;
    }

    public void setSubobjid(Integer subobjid) {
        this.subobjid = subobjid;
    }

    public Integer getValnum() {
        return valnum;
    }

    public void setValnum(Integer valnum) {
        this.valnum = valnum;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public byte[] getImageval() {
        return imageval;
    }

    public void setImageval(byte[] imageval) {
        this.imageval = imageval;
    }
}