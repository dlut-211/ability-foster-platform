package edu.dlut.ssdut.abilityfosterplatform.model;

public class SyscharsetsWithBLOBs extends Syscharsets {
    private byte[] binarydefinition;

    private byte[] definition;

    public byte[] getBinarydefinition() {
        return binarydefinition;
    }

    public void setBinarydefinition(byte[] binarydefinition) {
        this.binarydefinition = binarydefinition;
    }

    public byte[] getDefinition() {
        return definition;
    }

    public void setDefinition(byte[] definition) {
        this.definition = definition;
    }
}