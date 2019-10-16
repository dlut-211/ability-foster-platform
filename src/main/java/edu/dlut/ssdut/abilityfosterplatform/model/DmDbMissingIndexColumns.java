package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbMissingIndexColumns {
    private Integer columnId;

    private String columnName;

    private String columnUsage;

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public String getColumnUsage() {
        return columnUsage;
    }

    public void setColumnUsage(String columnUsage) {
        this.columnUsage = columnUsage == null ? null : columnUsage.trim();
    }
}