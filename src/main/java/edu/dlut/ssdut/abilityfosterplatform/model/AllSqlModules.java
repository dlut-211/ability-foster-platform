package edu.dlut.ssdut.abilityfosterplatform.model;

public class AllSqlModules {
    private Integer objectId;

    private String definition;

    private Boolean usesAnsiNulls;

    private Boolean usesQuotedIdentifier;

    private Boolean isSchemaBound;

    private Boolean usesDatabaseCollation;

    private Boolean isRecompiled;

    private Boolean nullOnNullInput;

    private Integer executeAsPrincipalId;

    private Boolean usesNativeCompilation;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    public Boolean getUsesAnsiNulls() {
        return usesAnsiNulls;
    }

    public void setUsesAnsiNulls(Boolean usesAnsiNulls) {
        this.usesAnsiNulls = usesAnsiNulls;
    }

    public Boolean getUsesQuotedIdentifier() {
        return usesQuotedIdentifier;
    }

    public void setUsesQuotedIdentifier(Boolean usesQuotedIdentifier) {
        this.usesQuotedIdentifier = usesQuotedIdentifier;
    }

    public Boolean getIsSchemaBound() {
        return isSchemaBound;
    }

    public void setIsSchemaBound(Boolean isSchemaBound) {
        this.isSchemaBound = isSchemaBound;
    }

    public Boolean getUsesDatabaseCollation() {
        return usesDatabaseCollation;
    }

    public void setUsesDatabaseCollation(Boolean usesDatabaseCollation) {
        this.usesDatabaseCollation = usesDatabaseCollation;
    }

    public Boolean getIsRecompiled() {
        return isRecompiled;
    }

    public void setIsRecompiled(Boolean isRecompiled) {
        this.isRecompiled = isRecompiled;
    }

    public Boolean getNullOnNullInput() {
        return nullOnNullInput;
    }

    public void setNullOnNullInput(Boolean nullOnNullInput) {
        this.nullOnNullInput = nullOnNullInput;
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }

    public Boolean getUsesNativeCompilation() {
        return usesNativeCompilation;
    }

    public void setUsesNativeCompilation(Boolean usesNativeCompilation) {
        this.usesNativeCompilation = usesNativeCompilation;
    }
}