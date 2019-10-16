package edu.dlut.ssdut.abilityfosterplatform.model;

public class TableConstraints {
    private String constraintCatalog;

    private String constraintSchema;

    private String constraintName;

    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String constraintType;

    private String isDeferrable;

    private String initiallyDeferred;

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog == null ? null : constraintCatalog.trim();
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema == null ? null : constraintSchema.trim();
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName == null ? null : constraintName.trim();
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog == null ? null : tableCatalog.trim();
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType == null ? null : constraintType.trim();
    }

    public String getIsDeferrable() {
        return isDeferrable;
    }

    public void setIsDeferrable(String isDeferrable) {
        this.isDeferrable = isDeferrable == null ? null : isDeferrable.trim();
    }

    public String getInitiallyDeferred() {
        return initiallyDeferred;
    }

    public void setInitiallyDeferred(String initiallyDeferred) {
        this.initiallyDeferred = initiallyDeferred == null ? null : initiallyDeferred.trim();
    }
}