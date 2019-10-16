package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysrowsetsWithBLOBs extends Sysrowsets {
    private byte[] rsguid;

    private byte[] lockres;

    public byte[] getRsguid() {
        return rsguid;
    }

    public void setRsguid(byte[] rsguid) {
        this.rsguid = rsguid;
    }

    public byte[] getLockres() {
        return lockres;
    }

    public void setLockres(byte[] lockres) {
        this.lockres = lockres;
    }
}