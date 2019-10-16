package edu.dlut.ssdut.abilityfosterplatform.model;

public class CertificatesWithBLOBs extends Certificates {
    private byte[] sid;

    private byte[] thumbprint;

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }
}