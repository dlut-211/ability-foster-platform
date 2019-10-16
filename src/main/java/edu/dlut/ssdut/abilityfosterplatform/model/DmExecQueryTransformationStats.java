package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecQueryTransformationStats {
    private String name;

    private Long promiseTotal;

    private Double promiseAvg;

    private Long promised;

    private Long builtSubstitute;

    private Long succeeded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPromiseTotal() {
        return promiseTotal;
    }

    public void setPromiseTotal(Long promiseTotal) {
        this.promiseTotal = promiseTotal;
    }

    public Double getPromiseAvg() {
        return promiseAvg;
    }

    public void setPromiseAvg(Double promiseAvg) {
        this.promiseAvg = promiseAvg;
    }

    public Long getPromised() {
        return promised;
    }

    public void setPromised(Long promised) {
        this.promised = promised;
    }

    public Long getBuiltSubstitute() {
        return builtSubstitute;
    }

    public void setBuiltSubstitute(Long builtSubstitute) {
        this.builtSubstitute = builtSubstitute;
    }

    public Long getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(Long succeeded) {
        this.succeeded = succeeded;
    }
}