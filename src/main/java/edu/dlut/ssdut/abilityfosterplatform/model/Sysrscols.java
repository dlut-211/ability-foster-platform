package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysrscols {
    private Long rsid;

    private Integer rscolid;

    private Integer hbcolid;

    private Long rcmodified;

    private Integer ti;

    private Integer cid;

    private Short ordkey;

    private Short maxinrowlen;

    private Integer status;

    private Integer offset;

    private Integer nullbit;

    private Short bitpos;

    private byte[] colguid;

    public Long getRsid() {
        return rsid;
    }

    public void setRsid(Long rsid) {
        this.rsid = rsid;
    }

    public Integer getRscolid() {
        return rscolid;
    }

    public void setRscolid(Integer rscolid) {
        this.rscolid = rscolid;
    }

    public Integer getHbcolid() {
        return hbcolid;
    }

    public void setHbcolid(Integer hbcolid) {
        this.hbcolid = hbcolid;
    }

    public Long getRcmodified() {
        return rcmodified;
    }

    public void setRcmodified(Long rcmodified) {
        this.rcmodified = rcmodified;
    }

    public Integer getTi() {
        return ti;
    }

    public void setTi(Integer ti) {
        this.ti = ti;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Short getOrdkey() {
        return ordkey;
    }

    public void setOrdkey(Short ordkey) {
        this.ordkey = ordkey;
    }

    public Short getMaxinrowlen() {
        return maxinrowlen;
    }

    public void setMaxinrowlen(Short maxinrowlen) {
        this.maxinrowlen = maxinrowlen;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getNullbit() {
        return nullbit;
    }

    public void setNullbit(Integer nullbit) {
        this.nullbit = nullbit;
    }

    public Short getBitpos() {
        return bitpos;
    }

    public void setBitpos(Short bitpos) {
        this.bitpos = bitpos;
    }

    public byte[] getColguid() {
        return colguid;
    }

    public void setColguid(byte[] colguid) {
        this.colguid = colguid;
    }
}