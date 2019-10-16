package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysasymkeysWithBLOBs extends Sysasymkeys {
    private byte[] thumbprint;

    private byte[] pkey;

    private byte[] pukey;

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public byte[] getPkey() {
        return pkey;
    }

    public void setPkey(byte[] pkey) {
        this.pkey = pkey;
    }

    public byte[] getPukey() {
        return pukey;
    }

    public void setPukey(byte[] pukey) {
        this.pukey = pukey;
    }
}