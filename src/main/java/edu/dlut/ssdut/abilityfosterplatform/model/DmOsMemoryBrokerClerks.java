package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryBrokerClerks {
    private String clerkName;

    private Long totalKb;

    private Long simulatedKb;

    private Double simulationBenefit;

    private Double internalBenefit;

    private Double externalBenefit;

    private Double valueOfMemory;

    private Long periodicFreedKb;

    private Long internalFreedKb;

    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName == null ? null : clerkName.trim();
    }

    public Long getTotalKb() {
        return totalKb;
    }

    public void setTotalKb(Long totalKb) {
        this.totalKb = totalKb;
    }

    public Long getSimulatedKb() {
        return simulatedKb;
    }

    public void setSimulatedKb(Long simulatedKb) {
        this.simulatedKb = simulatedKb;
    }

    public Double getSimulationBenefit() {
        return simulationBenefit;
    }

    public void setSimulationBenefit(Double simulationBenefit) {
        this.simulationBenefit = simulationBenefit;
    }

    public Double getInternalBenefit() {
        return internalBenefit;
    }

    public void setInternalBenefit(Double internalBenefit) {
        this.internalBenefit = internalBenefit;
    }

    public Double getExternalBenefit() {
        return externalBenefit;
    }

    public void setExternalBenefit(Double externalBenefit) {
        this.externalBenefit = externalBenefit;
    }

    public Double getValueOfMemory() {
        return valueOfMemory;
    }

    public void setValueOfMemory(Double valueOfMemory) {
        this.valueOfMemory = valueOfMemory;
    }

    public Long getPeriodicFreedKb() {
        return periodicFreedKb;
    }

    public void setPeriodicFreedKb(Long periodicFreedKb) {
        this.periodicFreedKb = periodicFreedKb;
    }

    public Long getInternalFreedKb() {
        return internalFreedKb;
    }

    public void setInternalFreedKb(Long internalFreedKb) {
        this.internalFreedKb = internalFreedKb;
    }
}