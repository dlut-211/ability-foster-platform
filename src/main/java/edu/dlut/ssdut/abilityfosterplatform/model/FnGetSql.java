package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnGetSql {
    private Short dbid;

    private Integer objectid;

    private Short number;

    private Boolean encrypted;

    private String text;

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}