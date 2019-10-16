package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnTraceGetfilterinfo {
    private Integer columnid;

    private Integer logicalOperator;

    private Integer comparisonOperator;

    private Object value;

    public Integer getColumnid() {
        return columnid;
    }

    public void setColumnid(Integer columnid) {
        this.columnid = columnid;
    }

    public Integer getLogicalOperator() {
        return logicalOperator;
    }

    public void setLogicalOperator(Integer logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public Integer getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(Integer comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}