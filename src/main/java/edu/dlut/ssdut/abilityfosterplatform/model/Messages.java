package edu.dlut.ssdut.abilityfosterplatform.model;

public class Messages {
    private Integer messageId;

    private Short languageId;

    private Byte severity;

    private Boolean isEventLogged;

    private String text;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Short getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Short languageId) {
        this.languageId = languageId;
    }

    public Byte getSeverity() {
        return severity;
    }

    public void setSeverity(Byte severity) {
        this.severity = severity;
    }

    public Boolean getIsEventLogged() {
        return isEventLogged;
    }

    public void setIsEventLogged(Boolean isEventLogged) {
        this.isEventLogged = isEventLogged;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}