package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscomments {
    private Integer id;

    private Short number;

    private Short colid;

    private Short status;

    private Short texttype;

    private Short language;

    private Boolean encrypted;

    private Boolean compressed;

    private String text;

    private byte[] ctext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Short getColid() {
        return colid;
    }

    public void setColid(Short colid) {
        this.colid = colid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getTexttype() {
        return texttype;
    }

    public void setTexttype(Short texttype) {
        this.texttype = texttype;
    }

    public Short getLanguage() {
        return language;
    }

    public void setLanguage(Short language) {
        this.language = language;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Boolean getCompressed() {
        return compressed;
    }

    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public byte[] getCtext() {
        return ctext;
    }

    public void setCtext(byte[] ctext) {
        this.ctext = ctext;
    }
}