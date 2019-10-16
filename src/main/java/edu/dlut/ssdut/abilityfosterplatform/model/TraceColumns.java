package edu.dlut.ssdut.abilityfosterplatform.model;

public class TraceColumns {
    private Short traceColumnId;

    private String name;

    private String typeName;

    private Integer maxSize;

    private Boolean isFilterable;

    private Boolean isRepeatable;

    private Boolean isRepeatedBase;

    public Short getTraceColumnId() {
        return traceColumnId;
    }

    public void setTraceColumnId(Short traceColumnId) {
        this.traceColumnId = traceColumnId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Boolean getIsFilterable() {
        return isFilterable;
    }

    public void setIsFilterable(Boolean isFilterable) {
        this.isFilterable = isFilterable;
    }

    public Boolean getIsRepeatable() {
        return isRepeatable;
    }

    public void setIsRepeatable(Boolean isRepeatable) {
        this.isRepeatable = isRepeatable;
    }

    public Boolean getIsRepeatedBase() {
        return isRepeatedBase;
    }

    public void setIsRepeatedBase(Boolean isRepeatedBase) {
        this.isRepeatedBase = isRepeatedBase;
    }
}