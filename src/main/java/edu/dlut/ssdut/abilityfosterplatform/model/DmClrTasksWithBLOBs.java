package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmClrTasksWithBLOBs extends DmClrTasks {
    private byte[] taskAddress;

    private byte[] sosTaskAddress;

    private byte[] appdomainAddress;

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public byte[] getSosTaskAddress() {
        return sosTaskAddress;
    }

    public void setSosTaskAddress(byte[] sosTaskAddress) {
        this.sosTaskAddress = sosTaskAddress;
    }

    public byte[] getAppdomainAddress() {
        return appdomainAddress;
    }

    public void setAppdomainAddress(byte[] appdomainAddress) {
        this.appdomainAddress = appdomainAddress;
    }
}