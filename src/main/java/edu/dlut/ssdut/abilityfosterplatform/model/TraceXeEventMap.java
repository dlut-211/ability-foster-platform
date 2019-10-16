package edu.dlut.ssdut.abilityfosterplatform.model;

public class TraceXeEventMap {
    private Short traceEventId;

    private String packageName;

    private String xeEventName;

    public Short getTraceEventId() {
        return traceEventId;
    }

    public void setTraceEventId(Short traceEventId) {
        this.traceEventId = traceEventId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getXeEventName() {
        return xeEventName;
    }

    public void setXeEventName(String xeEventName) {
        this.xeEventName = xeEventName == null ? null : xeEventName.trim();
    }
}