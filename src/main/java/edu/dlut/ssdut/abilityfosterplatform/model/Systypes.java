package edu.dlut.ssdut.abilityfosterplatform.model;

public class Systypes {
    private String name;

    private Byte xtype;

    private Byte status;

    private Short xusertype;

    private Short length;

    private Byte xprec;

    private Byte xscale;

    private Integer tdefault;

    private Integer domain;

    private Short uid;

    private Short reserved;

    private Integer collationid;

    private Short usertype;

    private Boolean variable;

    private Boolean allownulls;

    private Byte type;

    private String printfmt;

    private Short prec;

    private Byte scale;

    private String collation;

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Short getXusertype() {
        return xusertype;
    }

    public void setXusertype(Short xusertype) {
        this.xusertype = xusertype;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public Byte getXprec() {
        return xprec;
    }

    public void setXprec(Byte xprec) {
        this.xprec = xprec;
    }

    public Byte getXscale() {
        return xscale;
    }

    public void setXscale(Byte xscale) {
        this.xscale = xscale;
    }

    public Integer getTdefault() {
        return tdefault;
    }

    public void setTdefault(Integer tdefault) {
        this.tdefault = tdefault;
    }

    public Integer getDomain() {
        return domain;
    }

    public void setDomain(Integer domain) {
        this.domain = domain;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Short getReserved() {
        return reserved;
    }

    public void setReserved(Short reserved) {
        this.reserved = reserved;
    }

    public Integer getCollationid() {
        return collationid;
    }

    public void setCollationid(Integer collationid) {
        this.collationid = collationid;
    }

    public Short getUsertype() {
        return usertype;
    }

    public void setUsertype(Short usertype) {
        this.usertype = usertype;
    }

    public Boolean getVariable() {
        return variable;
    }

    public void setVariable(Boolean variable) {
        this.variable = variable;
    }

    public Boolean getAllownulls() {
        return allownulls;
    }

    public void setAllownulls(Boolean allownulls) {
        this.allownulls = allownulls;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getPrintfmt() {
        return printfmt;
    }

    public void setPrintfmt(String printfmt) {
        this.printfmt = printfmt == null ? null : printfmt.trim();
    }

    public Short getPrec() {
        return prec;
    }

    public void setPrec(Short prec) {
        this.prec = prec;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation == null ? null : collation.trim();
    }
}