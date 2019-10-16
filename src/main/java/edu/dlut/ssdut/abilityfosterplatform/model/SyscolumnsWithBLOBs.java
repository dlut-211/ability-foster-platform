package edu.dlut.ssdut.abilityfosterplatform.model;

public class SyscolumnsWithBLOBs extends Syscolumns {
    private byte[] autoval;

    private byte[] tdscollation;

    public byte[] getAutoval() {
        return autoval;
    }

    public void setAutoval(byte[] autoval) {
        this.autoval = autoval;
    }

    public byte[] getTdscollation() {
        return tdscollation;
    }

    public void setTdscollation(byte[] tdscollation) {
        this.tdscollation = tdscollation;
    }
}