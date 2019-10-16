package edu.dlut.ssdut.abilityfosterplatform.model;

public class Schemata {
    private String catalogName;

    private String schemaName;

    private String schemaOwner;

    private String defaultCharacterSetCatalog;

    private String defaultCharacterSetSchema;

    private String defaultCharacterSetName;

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName == null ? null : schemaName.trim();
    }

    public String getSchemaOwner() {
        return schemaOwner;
    }

    public void setSchemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner == null ? null : schemaOwner.trim();
    }

    public String getDefaultCharacterSetCatalog() {
        return defaultCharacterSetCatalog;
    }

    public void setDefaultCharacterSetCatalog(String defaultCharacterSetCatalog) {
        this.defaultCharacterSetCatalog = defaultCharacterSetCatalog == null ? null : defaultCharacterSetCatalog.trim();
    }

    public String getDefaultCharacterSetSchema() {
        return defaultCharacterSetSchema;
    }

    public void setDefaultCharacterSetSchema(String defaultCharacterSetSchema) {
        this.defaultCharacterSetSchema = defaultCharacterSetSchema == null ? null : defaultCharacterSetSchema.trim();
    }

    public String getDefaultCharacterSetName() {
        return defaultCharacterSetName;
    }

    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName == null ? null : defaultCharacterSetName.trim();
    }
}