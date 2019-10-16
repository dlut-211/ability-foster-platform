package edu.dlut.ssdut.abilityfosterplatform.model;

public class ViewColumnUsage {
    private String viewCatalog;

    private String viewSchema;

    private String viewName;

    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String columnName;

    public String getViewCatalog() {
        return viewCatalog;
    }

    public void setViewCatalog(String viewCatalog) {
        this.viewCatalog = viewCatalog == null ? null : viewCatalog.trim();
    }

    public String getViewSchema() {
        return viewSchema;
    }

    public void setViewSchema(String viewSchema) {
        this.viewSchema = viewSchema == null ? null : viewSchema.trim();
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName == null ? null : viewName.trim();
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }
}