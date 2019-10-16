package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysseobjvalues {
    private Byte valclass;

    private Long id;

    private Long subid;

    private Integer valnum;

    private Object value;

    private byte[] imageval;

    public Byte getValclass() {
        return valclass;
    }

    public void setValclass(Byte valclass) {
        this.valclass = valclass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubid() {
        return subid;
    }

    public void setSubid(Long subid) {
        this.subid = subid;
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