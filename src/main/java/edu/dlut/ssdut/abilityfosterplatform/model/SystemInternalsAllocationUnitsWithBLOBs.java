package edu.dlut.ssdut.abilityfosterplatform.model;

public class SystemInternalsAllocationUnitsWithBLOBs extends SystemInternalsAllocationUnits {
    private byte[] firstPage;

    private byte[] rootPage;

    private byte[] firstIamPage;

    public byte[] getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(byte[] firstPage) {
        this.firstPage = firstPage;
    }

    public byte[] getRootPage() {
        return rootPage;
    }

    public void setRootPage(byte[] rootPage) {
        this.rootPage = rootPage;
    }

    public byte[] getFirstIamPage() {
        return firstIamPage;
    }

    public void setFirstIamPage(byte[] firstIamPage) {
        this.firstIamPage = firstIamPage;
    }
}