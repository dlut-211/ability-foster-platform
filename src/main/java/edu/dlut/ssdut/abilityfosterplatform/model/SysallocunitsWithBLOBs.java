package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysallocunitsWithBLOBs extends Sysallocunits {
    private byte[] pgfirst;

    private byte[] pgroot;

    private byte[] pgfirstiam;

    public byte[] getPgfirst() {
        return pgfirst;
    }

    public void setPgfirst(byte[] pgfirst) {
        this.pgfirst = pgfirst;
    }

    public byte[] getPgroot() {
        return pgroot;
    }

    public void setPgroot(byte[] pgroot) {
        this.pgroot = pgroot;
    }

    public byte[] getPgfirstiam() {
        return pgfirstiam;
    }

    public void setPgfirstiam(byte[] pgfirstiam) {
        this.pgfirstiam = pgfirstiam;
    }
}