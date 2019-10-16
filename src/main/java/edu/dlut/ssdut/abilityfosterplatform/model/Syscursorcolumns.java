package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscursorcolumns {
    private Integer cursorHandle;

    private String columnName;

    private Integer ordinalPosition;

    private Integer columnCharacteristicsFlags;

    private Integer columnSize;

    private Integer dataTypeSql;

    private Byte columnPrecision;

    private Byte columnScale;

    private Integer orderPosition;

    private String orderDirection;

    private Short hiddenColumn;

    private Integer columnid;

    private Integer objectid;

    private Integer dbid;

    private String dbname;

    public Integer getCursorHandle() {
        return cursorHandle;
    }

    public void setCursorHandle(Integer cursorHandle) {
        this.cursorHandle = cursorHandle;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public Integer getColumnCharacteristicsFlags() {
        return columnCharacteristicsFlags;
    }

    public void setColumnCharacteristicsFlags(Integer columnCharacteristicsFlags) {
        this.columnCharacteristicsFlags = columnCharacteristicsFlags;
    }

    public Integer getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(Integer columnSize) {
        this.columnSize = columnSize;
    }

    public Integer getDataTypeSql() {
        return dataTypeSql;
    }

    public void setDataTypeSql(Integer dataTypeSql) {
        this.dataTypeSql = dataTypeSql;
    }

    public Byte getColumnPrecision() {
        return columnPrecision;
    }

    public void setColumnPrecision(Byte columnPrecision) {
        this.columnPrecision = columnPrecision;
    }

    public Byte getColumnScale() {
        return columnScale;
    }

    public void setColumnScale(Byte columnScale) {
        this.columnScale = columnScale;
    }

    public Integer getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(Integer orderPosition) {
        this.orderPosition = orderPosition;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection == null ? null : orderDirection.trim();
    }

    public Short getHiddenColumn() {
        return hiddenColumn;
    }

    public void setHiddenColumn(Short hiddenColumn) {
        this.hiddenColumn = hiddenColumn;
    }

    public Integer getColumnid() {
        return columnid;
    }

    public void setColumnid(Integer columnid) {
        this.columnid = columnid;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname == null ? null : dbname.trim();
    }
}