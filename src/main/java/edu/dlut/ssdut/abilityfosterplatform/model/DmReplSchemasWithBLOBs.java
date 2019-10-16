package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmReplSchemasWithBLOBs extends DmReplSchemas {
    private byte[] artcacheSchemaAddress;

    private byte[] pcitee;

    public byte[] getArtcacheSchemaAddress() {
        return artcacheSchemaAddress;
    }

    public void setArtcacheSchemaAddress(byte[] artcacheSchemaAddress) {
        this.artcacheSchemaAddress = artcacheSchemaAddress;
    }

    public byte[] getPcitee() {
        return pcitee;
    }

    public void setPcitee(byte[] pcitee) {
        this.pcitee = pcitee;
    }
}