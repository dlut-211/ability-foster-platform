package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysftindsWithBLOBs extends Sysftinds {
    private byte[] crschver;

    private byte[] crtsnext;

    public byte[] getCrschver() {
        return crschver;
    }

    public void setCrschver(byte[] crschver) {
        this.crschver = crschver;
    }

    public byte[] getCrtsnext() {
        return crtsnext;
    }

    public void setCrtsnext(byte[] crtsnext) {
        this.crtsnext = crtsnext;
    }
}