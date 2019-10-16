package edu.dlut.ssdut.abilityfosterplatform.model;

public class XmlSchemaNamespaces {
    private Integer xmlCollectionId;

    private String name;

    private Integer xmlNamespaceId;

    public Integer getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(Integer xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getXmlNamespaceId() {
        return xmlNamespaceId;
    }

    public void setXmlNamespaceId(Integer xmlNamespaceId) {
        this.xmlNamespaceId = xmlNamespaceId;
    }
}