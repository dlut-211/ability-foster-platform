package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysprocessesWithBLOBs extends Sysprocesses {
    private byte[] waittype;

    private byte[] sid;

    private byte[] contextInfo;

    private byte[] sqlHandle;

    public byte[] getWaittype() {
        return waittype;
    }

    public void setWaittype(byte[] waittype) {
        this.waittype = waittype;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getContextInfo() {
        return contextInfo;
    }

    public void setContextInfo(byte[] contextInfo) {
        this.contextInfo = contextInfo;
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }
}