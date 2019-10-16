package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmReplArticlesWithBLOBs extends DmReplArticles {
    private byte[] artcacheDbAddress;

    private byte[] artcacheTableAddress;

    private byte[] artcacheSchemaAddress;

    private byte[] artcacheArticleAddress;

    public byte[] getArtcacheDbAddress() {
        return artcacheDbAddress;
    }

    public void setArtcacheDbAddress(byte[] artcacheDbAddress) {
        this.artcacheDbAddress = artcacheDbAddress;
    }

    public byte[] getArtcacheTableAddress() {
        return artcacheTableAddress;
    }

    public void setArtcacheTableAddress(byte[] artcacheTableAddress) {
        this.artcacheTableAddress = artcacheTableAddress;
    }

    public byte[] getArtcacheSchemaAddress() {
        return artcacheSchemaAddress;
    }

    public void setArtcacheSchemaAddress(byte[] artcacheSchemaAddress) {
        this.artcacheSchemaAddress = artcacheSchemaAddress;
    }

    public byte[] getArtcacheArticleAddress() {
        return artcacheArticleAddress;
    }

    public void setArtcacheArticleAddress(byte[] artcacheArticleAddress) {
        this.artcacheArticleAddress = artcacheArticleAddress;
    }
}