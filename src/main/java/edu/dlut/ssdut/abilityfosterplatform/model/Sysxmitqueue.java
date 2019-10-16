package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysxmitqueue {
    private String dlgid;

    private Boolean finitiator;

    private String tosvc;

    private String tobrkrinst;

    private String fromsvc;

    private String frombrkrinst;

    private String svccontr;

    private Long msgseqnum;

    private String msgtype;

    private Integer unackmfn;

    private Integer status;

    private Date enqtime;

    private Date rsndtime;

    private Integer dlgerr;

    private String msgid;

    private Short hdrpartlen;

    private Short hdrseclen;

    private Byte msgenc;

    private Integer msgbodylen;

    private Long msgref;

    private byte[] msgbody;

    public String getDlgid() {
        return dlgid;
    }

    public void setDlgid(String dlgid) {
        this.dlgid = dlgid == null ? null : dlgid.trim();
    }

    public Boolean getFinitiator() {
        return finitiator;
    }

    public void setFinitiator(Boolean finitiator) {
        this.finitiator = finitiator;
    }

    public String getTosvc() {
        return tosvc;
    }

    public void setTosvc(String tosvc) {
        this.tosvc = tosvc == null ? null : tosvc.trim();
    }

    public String getTobrkrinst() {
        return tobrkrinst;
    }

    public void setTobrkrinst(String tobrkrinst) {
        this.tobrkrinst = tobrkrinst == null ? null : tobrkrinst.trim();
    }

    public String getFromsvc() {
        return fromsvc;
    }

    public void setFromsvc(String fromsvc) {
        this.fromsvc = fromsvc == null ? null : fromsvc.trim();
    }

    public String getFrombrkrinst() {
        return frombrkrinst;
    }

    public void setFrombrkrinst(String frombrkrinst) {
        this.frombrkrinst = frombrkrinst == null ? null : frombrkrinst.trim();
    }

    public String getSvccontr() {
        return svccontr;
    }

    public void setSvccontr(String svccontr) {
        this.svccontr = svccontr == null ? null : svccontr.trim();
    }

    public Long getMsgseqnum() {
        return msgseqnum;
    }

    public void setMsgseqnum(Long msgseqnum) {
        this.msgseqnum = msgseqnum;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype == null ? null : msgtype.trim();
    }

    public Integer getUnackmfn() {
        return unackmfn;
    }

    public void setUnackmfn(Integer unackmfn) {
        this.unackmfn = unackmfn;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getEnqtime() {
        return enqtime;
    }

    public void setEnqtime(Date enqtime) {
        this.enqtime = enqtime;
    }

    public Date getRsndtime() {
        return rsndtime;
    }

    public void setRsndtime(Date rsndtime) {
        this.rsndtime = rsndtime;
    }

    public Integer getDlgerr() {
        return dlgerr;
    }

    public void setDlgerr(Integer dlgerr) {
        this.dlgerr = dlgerr;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid == null ? null : msgid.trim();
    }

    public Short getHdrpartlen() {
        return hdrpartlen;
    }

    public void setHdrpartlen(Short hdrpartlen) {
        this.hdrpartlen = hdrpartlen;
    }

    public Short getHdrseclen() {
        return hdrseclen;
    }

    public void setHdrseclen(Short hdrseclen) {
        this.hdrseclen = hdrseclen;
    }

    public Byte getMsgenc() {
        return msgenc;
    }

    public void setMsgenc(Byte msgenc) {
        this.msgenc = msgenc;
    }

    public Integer getMsgbodylen() {
        return msgbodylen;
    }

    public void setMsgbodylen(Integer msgbodylen) {
        this.msgbodylen = msgbodylen;
    }

    public Long getMsgref() {
        return msgref;
    }

    public void setMsgref(Long msgref) {
        this.msgref = msgref;
    }

    public byte[] getMsgbody() {
        return msgbody;
    }

    public void setMsgbody(byte[] msgbody) {
        this.msgbody = msgbody;
    }
}