package edu.dlut.ssdut.abilityfosterplatform.model;

public class SyscertsWithBLOBs extends Syscerts {
    private byte[] issuer;

    private byte[] snum;

    private byte[] thumbprint;

    private byte[] pkey;

    private byte[] cert;

    public byte[] getIssuer() {
        return issuer;
    }

    public void setIssuer(byte[] issuer) {
        this.issuer = issuer;
    }

    public byte[] getSnum() {
        return snum;
    }

    public void setSnum(byte[] snum) {
        this.snum = snum;
    }

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

    public byte[] getCert() {
        return cert;
    }

    public void setCert(byte[] cert) {
        this.cert = cert;
    }
}