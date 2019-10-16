package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysxmitbody {
    private Long msgref;

    private Integer count;

    private byte[] msgbody;

    public Long getMsgref() {
        return msgref;
    }

    public void setMsgref(Long msgref) {
        this.msgref = msgref;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public byte[] getMsgbody() {
        return msgbody;
    }

    public void setMsgbody(byte[] msgbody) {
        this.msgbody = msgbody;
    }
}