package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysusersWithBLOBs extends Sysusers {
    private byte[] sid;

    private byte[] roles;

    private byte[] password;

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getRoles() {
        return roles;
    }

    public void setRoles(byte[] roles) {
        this.roles = roles;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}