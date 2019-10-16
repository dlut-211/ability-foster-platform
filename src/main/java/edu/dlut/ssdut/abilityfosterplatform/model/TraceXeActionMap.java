package edu.dlut.ssdut.abilityfosterplatform.model;

public class TraceXeActionMap {
    private Short traceColumnId;

    private String packageName;

    private String xeActionName;

    public Short getTraceColumnId() {
        return traceColumnId;
    }

    public void setTraceColumnId(Short traceColumnId) {
        this.traceColumnId = traceColumnId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getXeActionName() {
        return xeActionName;
    }

    public void setXeActionName(String xeActionName) {
        this.xeActionName = xeActionName == null ? null : xeActionName.trim();
    }
}