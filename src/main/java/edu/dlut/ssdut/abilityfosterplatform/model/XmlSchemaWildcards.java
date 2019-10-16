package edu.dlut.ssdut.abilityfosterplatform.model;

public class XmlSchemaWildcards {
    private Integer xmlComponentId;

    private Integer xmlCollectionId;

    private Integer xmlNamespaceId;

    private Boolean isQualified;

    private String name;

    private String symbolSpace;

    private String symbolSpaceDesc;

    private String kind;

    private String kindDesc;

    private String derivation;

    private String derivationDesc;

    private Integer baseXmlComponentId;

    private Integer scopingXmlComponentId;

    private String processContent;

    private String processContentDesc;

    private Boolean disallowNamespaces;

    public Integer getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(Integer xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public Integer getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(Integer xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public Integer getXmlNamespaceId() {
        return xmlNamespaceId;
    }

    public void setXmlNamespaceId(Integer xmlNamespaceId) {
        this.xmlNamespaceId = xmlNamespaceId;
    }

    public Boolean getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(Boolean isQualified) {
        this.isQualified = isQualified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSymbolSpace() {
        return symbolSpace;
    }

    public void setSymbolSpace(String symbolSpace) {
        this.symbolSpace = symbolSpace == null ? null : symbolSpace.trim();
    }

    public String getSymbolSpaceDesc() {
        return symbolSpaceDesc;
    }

    public void setSymbolSpaceDesc(String symbolSpaceDesc) {
        this.symbolSpaceDesc = symbolSpaceDesc == null ? null : symbolSpaceDesc.trim();
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

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation == null ? null : derivation.trim();
    }

    public String getDerivationDesc() {
        return derivationDesc;
    }

    public void setDerivationDesc(String derivationDesc) {
        this.derivationDesc = derivationDesc == null ? null : derivationDesc.trim();
    }

    public Integer getBaseXmlComponentId() {
        return baseXmlComponentId;
    }

    public void setBaseXmlComponentId(Integer baseXmlComponentId) {
        this.baseXmlComponentId = baseXmlComponentId;
    }

    public Integer getScopingXmlComponentId() {
        return scopingXmlComponentId;
    }

    public void setScopingXmlComponentId(Integer scopingXmlComponentId) {
        this.scopingXmlComponentId = scopingXmlComponentId;
    }

    public String getProcessContent() {
        return processContent;
    }

    public void setProcessContent(String processContent) {
        this.processContent = processContent == null ? null : processContent.trim();
    }

    public String getProcessContentDesc() {
        return processContentDesc;
    }

    public void setProcessContentDesc(String processContentDesc) {
        this.processContentDesc = processContentDesc == null ? null : processContentDesc.trim();
    }

    public Boolean getDisallowNamespaces() {
        return disallowNamespaces;
    }

    public void setDisallowNamespaces(Boolean disallowNamespaces) {
        this.disallowNamespaces = disallowNamespaces;
    }
}