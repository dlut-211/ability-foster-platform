package edu.dlut.ssdut.abilityfosterplatform.model;

public class Configurations {
    private Integer configurationId;

    private String name;

    private Object value;

    private Object minimum;

    private Object maximum;

    private Object valueInUse;

    private String description;

    private Boolean isDynamic;

    private Boolean isAdvanced;

    public Integer getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Integer configurationId) {
        this.configurationId = configurationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getMinimum() {
        return minimum;
    }

    public void setMinimum(Object minimum) {
        this.minimum = minimum;
    }

    public Object getMaximum() {
        return maximum;
    }

    public void setMaximum(Object maximum) {
        this.maximum = maximum;
    }

    public Object getValueInUse() {
        return valueInUse;
    }

    public void setValueInUse(Object valueInUse) {
        this.valueInUse = valueInUse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    public Boolean getIsAdvanced() {
        return isAdvanced;
    }

    public void setIsAdvanced(Boolean isAdvanced) {
        this.isAdvanced = isAdvanced;
    }
}