package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmReplTraninfoWithBLOBs extends DmReplTraninfo {
    private byte[] compRangeAddress;

    private byte[] textinfoAddress;

    private byte[] fsinfoAddress;

    private byte[] artcacheTableAddress;

    public byte[] getCompRangeAddress() {
        return compRangeAddress;
    }

    public void setCompRangeAddress(byte[] compRangeAddress) {
        this.compRangeAddress = compRangeAddress;
    }

    public byte[] getTextinfoAddress() {
        return textinfoAddress;
    }

    public void setTextinfoAddress(byte[] textinfoAddress) {
        this.textinfoAddress = textinfoAddress;
    }

    public byte[] getFsinfoAddress() {
        return fsinfoAddress;
    }

    public void setFsinfoAddress(byte[] fsinfoAddress) {
        this.fsinfoAddress = fsinfoAddress;
    }

    public byte[] getArtcacheTableAddress() {
        return artcacheTableAddress;
    }

    public void setArtcacheTableAddress(byte[] artcacheTableAddress) {
        this.artcacheTableAddress = artcacheTableAddress;
    }
}