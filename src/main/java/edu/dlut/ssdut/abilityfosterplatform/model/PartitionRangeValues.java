package edu.dlut.ssdut.abilityfosterplatform.model;

public class PartitionRangeValues {
    private Integer functionId;

    private Integer boundaryId;

    private Integer parameterId;

    private Object value;

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public Integer getBoundaryId() {
        return boundaryId;
    }

    public void setBoundaryId(Integer boundaryId) {
        this.boundaryId = boundaryId;
    }

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}