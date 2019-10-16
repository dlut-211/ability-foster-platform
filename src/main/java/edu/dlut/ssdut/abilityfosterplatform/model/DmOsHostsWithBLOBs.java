package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsHostsWithBLOBs extends DmOsHosts {
    private byte[] hostAddress;

    private byte[] defaultMemoryClerkAddress;

    public byte[] getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(byte[] hostAddress) {
        this.hostAddress = hostAddress;
    }

    public byte[] getDefaultMemoryClerkAddress() {
        return defaultMemoryClerkAddress;
    }

    public void setDefaultMemoryClerkAddress(byte[] defaultMemoryClerkAddress) {
        this.defaultMemoryClerkAddress = defaultMemoryClerkAddress;
    }
}