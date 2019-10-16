package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysxmlcomponent {
    private Integer id;

    private Integer xsdid;

    private Integer uriord;

    private Byte qual;

    private Integer nameid;

    private String symspace;

    private Integer nmscope;

    private String kind;

    private String deriv;

    private Integer status;

    private String enum;

    private String defval;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXsdid() {
        return xsdid;
    }

    public void setXsdid(Integer xsdid) {
        this.xsdid = xsdid;
    }

    public Integer getUriord() {
        return uriord;
    }

    public void setUriord(Integer uriord) {
        this.uriord = uriord;
    }

    public Byte getQual() {
        return qual;
    }

    public void setQual(Byte qual) {
        this.qual = qual;
    }

    public Integer getNameid() {
        return nameid;
    }

    public void setNameid(Integer nameid) {
        this.nameid = nameid;
    }

    public String getSymspace() {
        return symspace;
    }

    public void setSymspace(String symspace) {
        this.symspace = symspace == null ? null : symspace.trim();
    }

    public Integer getNmscope() {
        return nmscope;
    }

    public void setNmscope(Integer nmscope) {
        this.nmscope = nmscope;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getDeriv() {
        return deriv;
    }

    public void setDeriv(String deriv) {
        this.deriv = deriv == null ? null : deriv.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEnum() {
        return enum;
    }

    public void setEnum(String enum) {
        this.enum = enum == null ? null : enum.trim();
    }

    public String getDefval() {
        return defval;
    }

    public void setDefval(String defval) {
        this.defval = defval == null ? null : defval.trim();
    }
}