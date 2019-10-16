package edu.dlut.ssdut.abilityfosterplatform.model;

public class SqlLoginsWithBLOBs extends SqlLogins {
    private byte[] sid;

    private byte[] passwordHash;

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }
}