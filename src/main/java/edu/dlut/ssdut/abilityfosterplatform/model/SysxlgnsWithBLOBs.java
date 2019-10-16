package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysxlgnsWithBLOBs extends Sysxlgns {
    private byte[] sid;

    private byte[] pwdhash;

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getPwdhash() {
        return pwdhash;
    }

    public void setPwdhash(byte[] pwdhash) {
        this.pwdhash = pwdhash;
    }
}