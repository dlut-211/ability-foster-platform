package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscolpars {
    private Integer id;

    private Short number;

    private Integer colid;

    private String name;

    private Byte xtype;

    private Integer utype;

    private Short length;

    private Byte prec;

    private Byte scale;

    private Integer collationid;

    private Integer status;

    private Short maxinrow;

    private Integer xmlns;

    private Integer dflt;

    private Integer chk;

    private byte[] idtval;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Integer getColid() {
        return colid;
    }

    public void setColid(Integer colid) {
        this.colid = colid;
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

    public Short getMaxinrow() {
        return maxinrow;
    }

    public void setMaxinrow(Short maxinrow) {
        this.maxinrow = maxinrow;
    }

    public Integer getXmlns() {
        return xmlns;
    }

    public void setXmlns(Integer xmlns) {
        this.xmlns = xmlns;
    }

    public Integer getDflt() {
        return dflt;
    }

    public void setDflt(Integer dflt) {
        this.dflt = dflt;
    }

    public Integer getChk() {
        return chk;
    }

    public void setChk(Integer chk) {
        this.chk = chk;
    }

    public byte[] getIdtval() {
        return idtval;
    }

    public void setIdtval(byte[] idtval) {
        this.idtval = idtval;
    }
}