package edu.dlut.ssdut.abilityfosterplatform.model;

public class XmlSchemaFacets {
    private Integer xmlComponentId;

    private Integer facetId;

    private String kind;

    private String kindDesc;

    private Boolean isFixed;

    private String value;

    public Integer getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(Integer xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public Integer getFacetId() {
        return facetId;
    }

    public void setFacetId(Integer facetId) {
        this.facetId = facetId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getKindDesc() {
        return kindDesc;
    }

    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc == null ? null : kindDesc.trim();
    }

    public Boolean getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(Boolean isFixed) {
        this.isFixed = isFixed;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}