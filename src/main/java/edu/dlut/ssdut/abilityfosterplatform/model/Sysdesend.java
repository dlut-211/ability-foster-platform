package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysdesend {
    private String handle;

    private String diagid;

    private Byte initiator;

    private Long sendseq;

    private byte[] sendxact;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle == null ? null : handle.trim();
    }

    public String getDiagid() {
        return diagid;
    }

    public void setDiagid(String diagid) {
        this.diagid = diagid == null ? null : diagid.trim();
    }

    public Byte getInitiator() {
        return initiator;
    }

    public void setInitiator(Byte initiator) {
        this.initiator = initiator;
    }

    public Long getSendseq() {
        return sendseq;
    }

    public void setSendseq(Long sendseq) {
        this.sendseq = sendseq;
    }

    public byte[] getSendxact() {
        return sendxact;
    }

    public void setSendxact(byte[] sendxact) {
        this.sendxact = sendxact;
    }
}