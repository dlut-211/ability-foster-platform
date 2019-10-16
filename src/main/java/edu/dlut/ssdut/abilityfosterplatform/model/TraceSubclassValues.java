package edu.dlut.ssdut.abilityfosterplatform.model;

public class TraceSubclassValues {
    private Short traceEventId;

    private Short traceColumnId;

    private String subclassName;

    private Short subclassValue;

    public Short getTraceEventId() {
        return traceEventId;
    }

    public void setTraceEventId(Short traceEventId) {
        this.traceEventId = traceEventId;
    }

    public Short getTraceColumnId() {
        return traceColumnId;
    }

    public void setTraceColumnId(Short traceColumnId) {
        this.traceColumnId = traceColumnId;
    }

    public String getSubclassName() {
        return subclassName;
    }

    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName == null ? null : subclassName.trim();
    }

    public Short getSubclassValue() {
        return subclassValue;
    }

    public void setSubclassValue(Short subclassValue) {
        this.subclassValue = subclassValue;
    }
}