package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServerSqlModules {
    private Integer objectId;

    private String definition;

    private Boolean usesAnsiNulls;

    private Boolean usesQuotedIdentifier;

    private Integer executeAsPrincipalId;

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

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }
}