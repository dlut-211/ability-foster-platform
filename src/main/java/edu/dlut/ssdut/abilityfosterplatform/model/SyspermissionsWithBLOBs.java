package edu.dlut.ssdut.abilityfosterplatform.model;

public class SyspermissionsWithBLOBs extends Syspermissions {
    private byte[] seladd;

    private byte[] selmod;

    private byte[] updadd;

    private byte[] updmod;

    private byte[] refadd;

    private byte[] refmod;

    public byte[] getSeladd() {
        return seladd;
    }

    public void setSeladd(byte[] seladd) {
        this.seladd = seladd;
    }

    public byte[] getSelmod() {
        return selmod;
    }

    public void setSelmod(byte[] selmod) {
        this.selmod = selmod;
    }

    public byte[] getUpdadd() {
        return updadd;
    }

    public void setUpdadd(byte[] updadd) {
        this.updadd = updadd;
    }

    public byte[] getUpdmod() {
        return updmod;
    }

    public void setUpdmod(byte[] updmod) {
        this.updmod = updmod;
    }

    public byte[] getRefadd() {
        return refadd;
    }

    public void setRefadd(byte[] refadd) {
        this.refadd = refadd;
    }

    public byte[] getRefmod() {
        return refmod;
    }

    public void setRefmod(byte[] refmod) {
        this.refmod = refmod;
    }
}