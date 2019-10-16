package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysreferencesWithBLOBs extends Sysreferences {
    private byte[] forkeys;

    private byte[] refkeys;

    public byte[] getForkeys() {
        return forkeys;
    }

    public void setForkeys(byte[] forkeys) {
        this.forkeys = forkeys;
    }

    public byte[] getRefkeys() {
        return refkeys;
    }

    public void setRefkeys(byte[] refkeys) {
        this.refkeys = refkeys;
    }
}