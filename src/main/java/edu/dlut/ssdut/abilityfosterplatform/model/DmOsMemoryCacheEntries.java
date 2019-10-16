package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryCacheEntries {
    private String name;

    private String type;

    private Integer inUseCount;

    private Boolean isDirty;

    private Integer diskIosCount;

    private Integer contextSwitchesCount;

    private Integer originalCost;

    private Integer currentCost;

    private Long pagesKb;

    private String entryData;

    private Integer poolId;

    private Double timeToGenerate;

    private Long useCount;

    private Double averageTimeBetweenUses;

    private Double timeSinceLastUse;

    private Double probabilityOfReuse;

    private Double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getInUseCount() {
        return inUseCount;
    }

    public void setInUseCount(Integer inUseCount) {
        this.inUseCount = inUseCount;
    }

    public Boolean getIsDirty() {
        return isDirty;
    }

    public void setIsDirty(Boolean isDirty) {
        this.isDirty = isDirty;
    }

    public Integer getDiskIosCount() {
        return diskIosCount;
    }

    public void setDiskIosCount(Integer diskIosCount) {
        this.diskIosCount = diskIosCount;
    }

    public Integer getContextSwitchesCount() {
        return contextSwitchesCount;
    }

    public void setContextSwitchesCount(Integer contextSwitchesCount) {
        this.contextSwitchesCount = contextSwitchesCount;
    }

    public Integer getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(Integer originalCost) {
        this.originalCost = originalCost;
    }

    public Integer getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(Integer currentCost) {
        this.currentCost = currentCost;
    }

    public Long getPagesKb() {
        return pagesKb;
    }

    public void setPagesKb(Long pagesKb) {
        this.pagesKb = pagesKb;
    }

    public String getEntryData() {
        return entryData;
    }

    public void setEntryData(String entryData) {
        this.entryData = entryData == null ? null : entryData.trim();
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Double getTimeToGenerate() {
        return timeToGenerate;
    }

    public void setTimeToGenerate(Double timeToGenerate) {
        this.timeToGenerate = timeToGenerate;
    }

    public Long getUseCount() {
        return useCount;
    }

    public void setUseCount(Long useCount) {
        this.useCount = useCount;
    }

    public Double getAverageTimeBetweenUses() {
        return averageTimeBetweenUses;
    }

    public void setAverageTimeBetweenUses(Double averageTimeBetweenUses) {
        this.averageTimeBetweenUses = averageTimeBetweenUses;
    }

    public Double getTimeSinceLastUse() {
        return timeSinceLastUse;
    }

    public void setTimeSinceLastUse(Double timeSinceLastUse) {
        this.timeSinceLastUse = timeSinceLastUse;
    }

    public Double getProbabilityOfReuse() {
        return probabilityOfReuse;
    }

    public void setProbabilityOfReuse(Double probabilityOfReuse) {
        this.probabilityOfReuse = probabilityOfReuse;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}