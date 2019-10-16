package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscolumns {
    private String name;

    private Integer id;

    private Byte xtype;

    private Byte typestat;

    private Short xusertype;

    private Short length;

    private Byte xprec;

    private Byte xscale;

    private Short colid;

    private Short xoffset;

    private Byte bitpos;

    private Byte reserved;

    private Short colstat;

    private Integer cdefault;

    private Integer domain;

    private Short number;

    private Short colorder;

    private Short offset;

    private Integer collationid;

    private Integer language;

    private Byte status;

    private Byte type;

    private Short usertype;

    private String printfmt;

    private Short prec;

    private Integer scale;

    private Integer iscomputed;

    private Integer isoutparam;

    private Integer isnullable;

    private String collation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getXtype() {
        return xtype;
    }

    public void setXtype(Byte xtype) {
        this.xtype = xtype;
    }

    public Byte getTypestat() {
        return typestat;
    }

    public void setTypestat(Byte typestat) {
        this.typestat = typestat;
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

    public Short getColid() {
        return colid;
    }

    public void setColid(Short colid) {
        this.colid = colid;
    }

    public Short getXoffset() {
        return xoffset;
    }

    public void setXoffset(Short xoffset) {
        this.xoffset = xoffset;
    }

    public Byte getBitpos() {
        return bitpos;
    }

    public void setBitpos(Byte bitpos) {
        this.bitpos = bitpos;
    }

    public Byte getReserved() {
        return reserved;
    }

    public void setReserved(Byte reserved) {
        this.reserved = reserved;
    }

    public Short getColstat() {
        return colstat;
    }

    public void setColstat(Short colstat) {
        this.colstat = colstat;
    }

    public Integer getCdefault() {
        return cdefault;
    }

    public void setCdefault(Integer cdefault) {
        this.cdefault = cdefault;
    }

    public Integer getDomain() {
        return domain;
    }

    public void setDomain(Integer domain) {
        this.domain = domain;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Short getColorder() {
        return colorder;
    }

    public void setColorder(Short colorder) {
        this.colorder = colorder;
    }

    public Short getOffset() {
        return offset;
    }

    public void setOffset(Short offset) {
        this.offset = offset;
    }

    public Integer getCollationid() {
        return collationid;
    }

    public void setCollationid(Integer collationid) {
        this.collationid = collationid;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Short getUsertype() {
        return usertype;
    }

    public void setUsertype(Short usertype) {
        this.usertype = usertype;
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

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getIscomputed() {
        return iscomputed;
    }

    public void setIscomputed(Integer iscomputed) {
        this.iscomputed = iscomputed;
    }

    public Integer getIsoutparam() {
        return isoutparam;
    }

    public void setIsoutparam(Integer isoutparam) {
        this.isoutparam = isoutparam;
    }

    public Integer getIsnullable() {
        return isnullable;
    }

    public void setIsnullable(Integer isnullable) {
        this.isnullable = isnullable;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation == null ? null : collation.trim();
    }
}