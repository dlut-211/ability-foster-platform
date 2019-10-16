package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysindexesWithBLOBs extends Sysindexes {
    private byte[] first;

    private byte[] root;

    private byte[] firstiam;

    private byte[] keys;

    private byte[] statblob;

    public byte[] getFirst() {
        return first;
    }

    public void setFirst(byte[] first) {
        this.first = first;
    }

    public byte[] getRoot() {
        return root;
    }

    public void setRoot(byte[] root) {
        this.root = root;
    }

    public byte[] getFirstiam() {
        return firstiam;
    }

    public void setFirstiam(byte[] firstiam) {
        this.firstiam = firstiam;
    }

    public byte[] getKeys() {
        return keys;
    }

    public void setKeys(byte[] keys) {
        this.keys = keys;
    }

    public byte[] getStatblob() {
        return statblob;
    }

    public void setStatblob(byte[] statblob) {
        this.statblob = statblob;
    }
}