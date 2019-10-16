package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecPlanAttributes {
    private String attribute;

    private Object value;

    private Boolean isCacheKey;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Boolean getIsCacheKey() {
        return isCacheKey;
    }

    public void setIsCacheKey(Boolean isCacheKey) {
        this.isCacheKey = isCacheKey;
    }
}