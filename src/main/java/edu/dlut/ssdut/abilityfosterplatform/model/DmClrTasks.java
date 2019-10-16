package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmClrTasks {
    private String state;

    private String abortState;

    private String type;

    private Integer affinityCount;

    private Integer forcedYieldCount;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAbortState() {
        return abortState;
    }

    public void setAbortState(String abortState) {
        this.abortState = abortState == null ? null : abortState.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getAffinityCount() {
        return affinityCount;
    }

    public void setAffinityCount(Integer affinityCount) {
        this.affinityCount = affinityCount;
    }

    public Integer getForcedYieldCount() {
        return forcedYieldCount;
    }

    public void setForcedYieldCount(Integer forcedYieldCount) {
        this.forcedYieldCount = forcedYieldCount;
    }
}