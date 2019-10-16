package edu.dlut.ssdut.abilityfosterplatform.model;

public class TraceEvents {
    private Short traceEventId;

    private Short categoryId;

    private String name;

    public Short getTraceEventId() {
        return traceEventId;
    }

    public void setTraceEventId(Short traceEventId) {
        this.traceEventId = traceEventId;
    }

    public Short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}