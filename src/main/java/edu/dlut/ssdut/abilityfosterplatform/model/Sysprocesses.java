package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysprocesses {
    private Short spid;

    private Short kpid;

    private Short blocked;

    private Long waittime;

    private String lastwaittype;

    private String waitresource;

    private Short dbid;

    private Short uid;

    private Integer cpu;

    private Long physicalIo;

    private Integer memusage;

    private Date loginTime;

    private Date lastBatch;

    private Short ecid;

    private Short openTran;

    private String status;

    private String hostname;

    private String programName;

    private String hostprocess;

    private String cmd;

    private String ntDomain;

    private String ntUsername;

    private String netAddress;

    private String netLibrary;

    private String loginame;

    private Integer stmtStart;

    private Integer stmtEnd;

    private Integer requestId;

    public Short getSpid() {
        return spid;
    }

    public void setSpid(Short spid) {
        this.spid = spid;
    }

    public Short getKpid() {
        return kpid;
    }

    public void setKpid(Short kpid) {
        this.kpid = kpid;
    }

    public Short getBlocked() {
        return blocked;
    }

    public void setBlocked(Short blocked) {
        this.blocked = blocked;
    }

    public Long getWaittime() {
        return waittime;
    }

    public void setWaittime(Long waittime) {
        this.waittime = waittime;
    }

    public String getLastwaittype() {
        return lastwaittype;
    }

    public void setLastwaittype(String lastwaittype) {
        this.lastwaittype = lastwaittype == null ? null : lastwaittype.trim();
    }

    public String getWaitresource() {
        return waitresource;
    }

    public void setWaitresource(String waitresource) {
        this.waitresource = waitresource == null ? null : waitresource.trim();
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Long getPhysicalIo() {
        return physicalIo;
    }

    public void setPhysicalIo(Long physicalIo) {
        this.physicalIo = physicalIo;
    }

    public Integer getMemusage() {
        return memusage;
    }

    public void setMemusage(Integer memusage) {
        this.memusage = memusage;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastBatch() {
        return lastBatch;
    }

    public void setLastBatch(Date lastBatch) {
        this.lastBatch = lastBatch;
    }

    public Short getEcid() {
        return ecid;
    }

    public void setEcid(Short ecid) {
        this.ecid = ecid;
    }

    public Short getOpenTran() {
        return openTran;
    }

    public void setOpenTran(Short openTran) {
        this.openTran = openTran;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    public String getHostprocess() {
        return hostprocess;
    }

    public void setHostprocess(String hostprocess) {
        this.hostprocess = hostprocess == null ? null : hostprocess.trim();
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd == null ? null : cmd.trim();
    }

    public String getNtDomain() {
        return ntDomain;
    }

    public void setNtDomain(String ntDomain) {
        this.ntDomain = ntDomain == null ? null : ntDomain.trim();
    }

    public String getNtUsername() {
        return ntUsername;
    }

    public void setNtUsername(String ntUsername) {
        this.ntUsername = ntUsername == null ? null : ntUsername.trim();
    }

    public String getNetAddress() {
        return netAddress;
    }

    public void setNetAddress(String netAddress) {
        this.netAddress = netAddress == null ? null : netAddress.trim();
    }

    public String getNetLibrary() {
        return netLibrary;
    }

    public void setNetLibrary(String netLibrary) {
        this.netLibrary = netLibrary == null ? null : netLibrary.trim();
    }

    public String getLoginame() {
        return loginame;
    }

    public void setLoginame(String loginame) {
        this.loginame = loginame == null ? null : loginame.trim();
    }

    public Integer getStmtStart() {
        return stmtStart;
    }

    public void setStmtStart(Integer stmtStart) {
        this.stmtStart = stmtStart;
    }

    public Integer getStmtEnd() {
        return stmtEnd;
    }

    public void setStmtEnd(Integer stmtEnd) {
        this.stmtEnd = stmtEnd;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }
}