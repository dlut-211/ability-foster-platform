package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysdercvWithBLOBs extends Sysdercv {
    private byte[] outseskey;

    private byte[] inseskey;

    public byte[] getOutseskey() {
        return outseskey;
    }

    public void setOutseskey(byte[] outseskey) {
        this.outseskey = outseskey;
    }

    public byte[] getInseskey() {
        return inseskey;
    }

    public void setInseskey(byte[] inseskey) {
        this.inseskey = inseskey;
    }
}