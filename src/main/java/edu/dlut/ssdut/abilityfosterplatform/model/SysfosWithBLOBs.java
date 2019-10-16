package edu.dlut.ssdut.abilityfosterplatform.model;

public class SysfosWithBLOBs extends Sysfos {
    private byte[] low;

    private byte[] high;

    private byte[] history;

    public byte[] getLow() {
        return low;
    }

    public void setLow(byte[] low) {
        this.low = low;
    }

    public byte[] getHigh() {
        return high;
    }

    public void setHigh(byte[] high) {
        this.high = high;
    }

    public byte[] getHistory() {
        return history;
    }

    public void setHistory(byte[] history) {
        this.history = history;
    }
}