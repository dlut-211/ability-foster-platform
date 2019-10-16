package edu.dlut.ssdut.abilityfosterplatform.model;

public class SyslockinfoWithBLOBs extends Syslockinfo {
    private byte[] rscBin;

    private byte[] rscValblk;

    public byte[] getRscBin() {
        return rscBin;
    }

    public void setRscBin(byte[] rscBin) {
        this.rscBin = rscBin;
    }

    public byte[] getRscValblk() {
        return rscValblk;
    }

    public void setRscValblk(byte[] rscValblk) {
        this.rscValblk = rscValblk;
    }
}