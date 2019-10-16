package edu.dlut.ssdut.abilityfosterplatform.model;

public class Systypedsubobjs {
    private Byte class;

    private Integer idmajor;

    private Integer subid;

    private String name;

    private Byte xtype;

    private Integer utype;

    private Short length;

    private Byte prec;

    private Byte scale;

    private Integer collationid;

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

    public Byte getXtype() {
        return xtype;
    }

    public void setXtype(Byte xtype) {
        this.xtype = xtype;
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public Byte getPrec() {
        return prec;
    }

    public void setPrec(Byte prec) {
        this.prec = prec;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public Integer getCollationid() {
        return collationid;
    }

    public void setCollationid(Integer collationid) {
        this.collationid = collationid;
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