package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysdercv {
    private String diagid;

    private Byte initiator;

    private String handle;

    private Long rcvseq;

    private Integer rcvfrag;

    private Integer status;

    private String state;

    private Date lifetime;

    private Integer contract;

    private Integer svcid;

    private String convgroup;

    private Long sysseq;

    private Long enddlgseq;

    private Long firstoorder;

    private Long lastoorder;

    private Integer lastoorderfr;

    private Date dlgtimer;

    private Date dlgopened;

    private Integer princid;

    private String outseskeyid;

    private Integer farprincid;

    private String inseskeyid;

    private String farsvc;

    private String farbrkrinst;

    private Byte priority;

    public String getDiagid() {
        return diagid;
    }

    public void setDiagid(String diagid) {
        this.diagid = diagid == null ? null : diagid.trim();
    }

    public Byte getInitiator() {
        return initiator;
    }

    public void setInitiator(Byte initiator) {
        this.initiator = initiator;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle == null ? null : handle.trim();
    }

    public Long getRcvseq() {
        return rcvseq;
    }

    public void setRcvseq(Long rcvseq) {
        this.rcvseq = rcvseq;
    }

    public Integer getRcvfrag() {
        return rcvfrag;
    }

    public void setRcvfrag(Integer rcvfrag) {
        this.rcvfrag = rcvfrag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public Integer getContract() {
        return contract;
    }

    public void setContract(Integer contract) {
        this.contract = contract;
    }

    public Integer getSvcid() {
        return svcid;
    }

    public void setSvcid(Integer svcid) {
        this.svcid = svcid;
    }

    public String getConvgroup() {
        return convgroup;
    }

    public void setConvgroup(String convgroup) {
        this.convgroup = convgroup == null ? null : convgroup.trim();
    }

    public Long getSysseq() {
        return sysseq;
    }

    public void setSysseq(Long sysseq) {
        this.sysseq = sysseq;
    }

    public Long getEnddlgseq() {
        return enddlgseq;
    }

    public void setEnddlgseq(Long enddlgseq) {
        this.enddlgseq = enddlgseq;
    }

    public Long getFirstoorder() {
        return firstoorder;
    }

    public void setFirstoorder(Long firstoorder) {
        this.firstoorder = firstoorder;
    }

    public Long getLastoorder() {
        return lastoorder;
    }

    public void setLastoorder(Long lastoorder) {
        this.lastoorder = lastoorder;
    }

    public Integer getLastoorderfr() {
        return lastoorderfr;
    }

    public void setLastoorderfr(Integer lastoorderfr) {
        this.lastoorderfr = lastoorderfr;
    }

    public Date getDlgtimer() {
        return dlgtimer;
    }

    public void setDlgtimer(Date dlgtimer) {
        this.dlgtimer = dlgtimer;
    }

    public Date getDlgopened() {
        return dlgopened;
    }

    public void setDlgopened(Date dlgopened) {
        this.dlgopened = dlgopened;
    }

    public Integer getPrincid() {
        return princid;
    }

    public void setPrincid(Integer princid) {
        this.princid = princid;
    }

    public String getOutseskeyid() {
        return outseskeyid;
    }

    public void setOutseskeyid(String outseskeyid) {
        this.outseskeyid = outseskeyid == null ? null : outseskeyid.trim();
    }

    public Integer getFarprincid() {
        return farprincid;
    }

    public void setFarprincid(Integer farprincid) {
        this.farprincid = farprincid;
    }

    public String getInseskeyid() {
        return inseskeyid;
    }

    public void setInseskeyid(String inseskeyid) {
        this.inseskeyid = inseskeyid == null ? null : inseskeyid.trim();
    }

    public String getFarsvc() {
        return farsvc;
    }

    public void setFarsvc(String farsvc) {
        this.farsvc = farsvc == null ? null : farsvc.trim();
    }

    public String getFarbrkrinst() {
        return farbrkrinst;
    }

    public void setFarbrkrinst(String farbrkrinst) {
        this.farbrkrinst = farbrkrinst == null ? null : farbrkrinst.trim();
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }
}