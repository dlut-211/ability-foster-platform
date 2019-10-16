package edu.dlut.ssdut.abilityfosterplatform.model;

public class Stats {
    private Integer objectId;

    private String name;

    private Integer statsId;

    private Boolean autoCreated;

    private Boolean userCreated;

    private Boolean noRecompute;

    private Boolean hasFilter;

    private String filterDefinition;

    private Boolean isTemporary;

    private Boolean isIncremental;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatsId() {
        return statsId;
    }

    public void setStatsId(Integer statsId) {
        this.statsId = statsId;
    }

    public Boolean getAutoCreated() {
        return autoCreated;
    }

    public void setAutoCreated(Boolean autoCreated) {
        this.autoCreated = autoCreated;
    }

    public Boolean getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Boolean userCreated) {
        this.userCreated = userCreated;
    }

    public Boolean getNoRecompute() {
        return noRecompute;
    }

    public void setNoRecompute(Boolean noRecompute) {
        this.noRecompute = noRecompute;
    }

    public Boolean getHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(Boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public String getFilterDefinition() {
        return filterDefinition;
    }

    public void setFilterDefinition(String filterDefinition) {
        this.filterDefinition = filterDefinition == null ? null : filterDefinition.trim();
    }

    public Boolean getIsTemporary() {
        return isTemporary;
    }

    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

    public Boolean getIsIncremental() {
        return isIncremental;
    }

    public void setIsIncremental(Boolean isIncremental) {
        this.isIncremental = isIncremental;
    }
}