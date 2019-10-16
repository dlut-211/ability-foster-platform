package edu.dlut.ssdut.abilityfosterplatform.model;

public class AsymmetricKeysWithBLOBs extends AsymmetricKeys {
    private byte[] thumbprint;

    private byte[] sid;

    private byte[] publicKey;

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(byte[] publicKey) {
        this.publicKey = publicKey;
    }
}