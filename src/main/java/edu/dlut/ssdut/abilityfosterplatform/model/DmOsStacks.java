package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsStacks {
    private Integer frameIndex;

    private byte[] stackAddress;

    private byte[] frameAddress;

    public Integer getFrameIndex() {
        return frameIndex;
    }

    public void setFrameIndex(Integer frameIndex) {
        this.frameIndex = frameIndex;
    }

    public byte[] getStackAddress() {
        return stackAddress;
    }

    public void setStackAddress(byte[] stackAddress) {
        this.stackAddress = stackAddress;
    }

    public byte[] getFrameAddress() {
        return frameAddress;
    }

    public void setFrameAddress(byte[] frameAddress) {
        this.frameAddress = frameAddress;
    }
}