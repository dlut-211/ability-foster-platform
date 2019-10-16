package edu.dlut.ssdut.abilityfosterplatform.model;

public class DomainConstraints {
    private String constraintCatalog;

    private String constraintSchema;

    private String constraintName;

    private String domainCatalog;

    private String domainSchema;

    private String domainName;

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

    public String getDomainCatalog() {
        return domainCatalog;
    }

    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog == null ? null : domainCatalog.trim();
    }

    public String getDomainSchema() {
        return domainSchema;
    }

    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema == null ? null : domainSchema.trim();
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
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