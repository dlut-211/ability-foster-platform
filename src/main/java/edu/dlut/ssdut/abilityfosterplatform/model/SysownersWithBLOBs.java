package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysownersWithBLOBs extends Sysowners {
    private byte[] sid;

    private byte[] password;

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}