package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbMissingIndexDetails {
    private Integer indexHandle;

    private Short databaseId;

    private Integer objectId;

    private String equalityColumns;

    private String inequalityColumns;

    private String includedColumns;

    private String statement;

    public Integer getIndexHandle() {
        return indexHandle;
    }

    public void setIndexHandle(Integer indexHandle) {
        this.indexHandle = indexHandle;
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getEqualityColumns() {
        return equalityColumns;
    }

    public void setEqualityColumns(String equalityColumns) {
        this.equalityColumns = equalityColumns == null ? null : equalityColumns.trim();
    }

    public String getInequalityColumns() {
        return inequalityColumns;
    }

    public void setInequalityColumns(String inequalityColumns) {
        this.inequalityColumns = inequalityColumns == null ? null : inequalityColumns.trim();
    }

    public String getIncludedColumns() {
        return includedColumns;
    }

    public void setIncludedColumns(String includedColumns) {
        this.includedColumns = includedColumns == null ? null : includedColumns.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }
}