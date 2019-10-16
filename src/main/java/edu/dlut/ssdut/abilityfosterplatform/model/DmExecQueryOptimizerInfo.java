package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecQueryOptimizerInfo {
    private String counter;

    private Long occurrence;

    private Double value;

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter == null ? null : counter.trim();
    }

    public Long getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Long occurrence) {
        this.occurrence = occurrence;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}