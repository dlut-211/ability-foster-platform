package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscurconfigs {
    private Integer value;

    private Short config;

    private String comment;

    private Short status;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Short getConfig() {
        return config;
    }

    public void setConfig(Short config) {
        this.config = config;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}