package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysprotects {
    private Integer id;

    private Short uid;

    private Byte action;

    private Byte protecttype;

    private Short grantor;

    private byte[] columns;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }

    public Byte getProtecttype() {
        return protecttype;
    }

    public void setProtecttype(Byte protecttype) {
        this.protecttype = protecttype;
    }

    public Short getGrantor() {
        return grantor;
    }

    public void setGrantor(Short grantor) {
        this.grantor = grantor;
    }

    public byte[] getColumns() {
        return columns;
    }

    public void setColumns(byte[] columns) {
        this.columns = columns;
    }
}