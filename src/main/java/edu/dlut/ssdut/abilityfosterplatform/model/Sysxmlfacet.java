package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysxmlfacet {
    private Integer compid;

    private Integer ord;

    private String kind;

    private Short status;

    private String dflt;

    public Integer getCompid() {
        return compid;
    }

    public void setCompid(Integer compid) {
        this.compid = compid;
    }

    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getDflt() {
        return dflt;
    }

    public void setDflt(String dflt) {
        this.dflt = dflt == null ? null : dflt.trim();
    }
}