package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysobjkeycryptsWithBLOBs extends Sysobjkeycrypts {
    private byte[] thumbprint;

    private byte[] crypto;

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public byte[] getCrypto() {
        return crypto;
    }

    public void setCrypto(byte[] crypto) {
        this.crypto = crypto;
    }
}