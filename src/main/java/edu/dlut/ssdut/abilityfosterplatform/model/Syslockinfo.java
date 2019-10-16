package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syslockinfo {
    private String rscText;

    private Short rscDbid;

    private Short rscIndid;

    private Integer rscObjid;

    private Byte rscType;

    private Byte rscFlag;

    private Byte reqMode;

    private Byte reqStatus;

    private Short reqRefcnt;

    private Short reqCryrefcnt;

    private Integer reqLifetime;

    private Integer reqSpid;

    private Integer reqEcid;

    private Short reqOwnertype;

    private Long reqTransactionid;

    private String reqTransactionuow;

    public String getRscText() {
        return rscText;
    }

    public void setRscText(String rscText) {
        this.rscText = rscText == null ? null : rscText.trim();
    }

    public Short getRscDbid() {
        return rscDbid;
    }

    public void setRscDbid(Short rscDbid) {
        this.rscDbid = rscDbid;
    }

    public Short getRscIndid() {
        return rscIndid;
    }

    public void setRscIndid(Short rscIndid) {
        this.rscIndid = rscIndid;
    }

    public Integer getRscObjid() {
        return rscObjid;
    }

    public void setRscObjid(Integer rscObjid) {
        this.rscObjid = rscObjid;
    }

    public Byte getRscType() {
        return rscType;
    }

    public void setRscType(Byte rscType) {
        this.rscType = rscType;
    }

    public Byte getRscFlag() {
        return rscFlag;
    }

    public void setRscFlag(Byte rscFlag) {
        this.rscFlag = rscFlag;
    }

    public Byte getReqMode() {
        return reqMode;
    }

    public void setReqMode(Byte reqMode) {
        this.reqMode = reqMode;
    }

    public Byte getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(Byte reqStatus) {
        this.reqStatus = reqStatus;
    }

    public Short getReqRefcnt() {
        return reqRefcnt;
    }

    public void setReqRefcnt(Short reqRefcnt) {
        this.reqRefcnt = reqRefcnt;
    }

    public Short getReqCryrefcnt() {
        return reqCryrefcnt;
    }

    public void setReqCryrefcnt(Short reqCryrefcnt) {
        this.reqCryrefcnt = reqCryrefcnt;
    }

    public Integer getReqLifetime() {
        return reqLifetime;
    }

    public void setReqLifetime(Integer reqLifetime) {
        this.reqLifetime = reqLifetime;
    }

    public Integer getReqSpid() {
        return reqSpid;
    }

    public void setReqSpid(Integer reqSpid) {
        this.reqSpid = reqSpid;
    }

    public Integer getReqEcid() {
        return reqEcid;
    }

    public void setReqEcid(Integer reqEcid) {
        this.reqEcid = reqEcid;
    }

    public Short getReqOwnertype() {
        return reqOwnertype;
    }

    public void setReqOwnertype(Short reqOwnertype) {
        this.reqOwnertype = reqOwnertype;
    }

    public Long getReqTransactionid() {
        return reqTransactionid;
    }

    public void setReqTransactionid(Long reqTransactionid) {
        this.reqTransactionid = reqTransactionid;
    }

    public String getReqTransactionuow() {
        return reqTransactionuow;
    }

    public void setReqTransactionuow(String reqTransactionuow) {
        this.reqTransactionuow = reqTransactionuow == null ? null : reqTransactionuow.trim();
    }
}