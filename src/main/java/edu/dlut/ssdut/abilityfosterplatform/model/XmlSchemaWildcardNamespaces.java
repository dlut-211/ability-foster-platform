package edu.dlut.ssdut.abilityfosterplatform.model;

public class XmlSchemaWildcardNamespaces {
    private Integer xmlComponentId;

    private String namespace;

    public Integer getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(Integer xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace == null ? null : namespace.trim();
    }
}