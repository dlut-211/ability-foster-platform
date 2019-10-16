package edu.dlut.ssdut.abilityfosterplatform.model;

public class EndpointWebmethods {
    private Integer endpointId;

    private String namespace;

    private String methodAlias;

    private String objectName;

    private Byte resultSchema;

    private String resultSchemaDesc;

    private Byte resultFormat;

    private String resultFormatDesc;

    public Integer getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(Integer endpointId) {
        this.endpointId = endpointId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace == null ? null : namespace.trim();
    }

    public String getMethodAlias() {
        return methodAlias;
    }

    public void setMethodAlias(String methodAlias) {
        this.methodAlias = methodAlias == null ? null : methodAlias.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public Byte getResultSchema() {
        return resultSchema;
    }

    public void setResultSchema(Byte resultSchema) {
        this.resultSchema = resultSchema;
    }

    public String getResultSchemaDesc() {
        return resultSchemaDesc;
    }

    public void setResultSchemaDesc(String resultSchemaDesc) {
        this.resultSchemaDesc = resultSchemaDesc == null ? null : resultSchemaDesc.trim();
    }

    public Byte getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(Byte resultFormat) {
        this.resultFormat = resultFormat;
    }

    public String getResultFormatDesc() {
        return resultFormatDesc;
    }

    public void setResultFormatDesc(String resultFormatDesc) {
        this.resultFormatDesc = resultFormatDesc == null ? null : resultFormatDesc.trim();
    }
}