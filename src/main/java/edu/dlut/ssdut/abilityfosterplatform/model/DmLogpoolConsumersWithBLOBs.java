package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmLogpoolConsumersWithBLOBs extends DmLogpoolConsumers {
    private byte[] currentCacheBuffer;

    private byte[] incompleteCacheBuffer;

    private byte[] privatePoolLastAccessPoint;

    private byte[] privatePoolLastRaAccessPoint;

    public byte[] getCurrentCacheBuffer() {
        return currentCacheBuffer;
    }

    public void setCurrentCacheBuffer(byte[] currentCacheBuffer) {
        this.currentCacheBuffer = currentCacheBuffer;
    }

    public byte[] getIncompleteCacheBuffer() {
        return incompleteCacheBuffer;
    }

    public void setIncompleteCacheBuffer(byte[] incompleteCacheBuffer) {
        this.incompleteCacheBuffer = incompleteCacheBuffer;
    }

    public byte[] getPrivatePoolLastAccessPoint() {
        return privatePoolLastAccessPoint;
    }

    public void setPrivatePoolLastAccessPoint(byte[] privatePoolLastAccessPoint) {
        this.privatePoolLastAccessPoint = privatePoolLastAccessPoint;
    }

    public byte[] getPrivatePoolLastRaAccessPoint() {
        return privatePoolLastRaAccessPoint;
    }

    public void setPrivatePoolLastRaAccessPoint(byte[] privatePoolLastRaAccessPoint) {
        this.privatePoolLastRaAccessPoint = privatePoolLastRaAccessPoint;
    }
}