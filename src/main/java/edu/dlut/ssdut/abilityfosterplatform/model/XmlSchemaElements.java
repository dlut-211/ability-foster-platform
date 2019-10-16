package edu.dlut.ssdut.abilityfosterplatform.model;

public class XmlSchemaElements {
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

    private Boolean isDefaultFixed;

    private Boolean isAbstract;

    private Boolean isNillable;

    private Boolean mustBeQualified;

    private Boolean isExtensionBlocked;

    private Boolean isRestrictionBlocked;

    private Boolean isSubstitutionBlocked;

    private Boolean isFinalExtension;

    private Boolean isFinalRestriction;

    private String defaultValue;

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

    public Boolean getIsDefaultFixed() {
        return isDefaultFixed;
    }

    public void setIsDefaultFixed(Boolean isDefaultFixed) {
        this.isDefaultFixed = isDefaultFixed;
    }

    public Boolean getIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(Boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public Boolean getIsNillable() {
        return isNillable;
    }

    public void setIsNillable(Boolean isNillable) {
        this.isNillable = isNillable;
    }

    public Boolean getMustBeQualified() {
        return mustBeQualified;
    }

    public void setMustBeQualified(Boolean mustBeQualified) {
        this.mustBeQualified = mustBeQualified;
    }

    public Boolean getIsExtensionBlocked() {
        return isExtensionBlocked;
    }

    public void setIsExtensionBlocked(Boolean isExtensionBlocked) {
        this.isExtensionBlocked = isExtensionBlocked;
    }

    public Boolean getIsRestrictionBlocked() {
        return isRestrictionBlocked;
    }

    public void setIsRestrictionBlocked(Boolean isRestrictionBlocked) {
        this.isRestrictionBlocked = isRestrictionBlocked;
    }

    public Boolean getIsSubstitutionBlocked() {
        return isSubstitutionBlocked;
    }

    public void setIsSubstitutionBlocked(Boolean isSubstitutionBlocked) {
        this.isSubstitutionBlocked = isSubstitutionBlocked;
    }

    public Boolean getIsFinalExtension() {
        return isFinalExtension;
    }

    public void setIsFinalExtension(Boolean isFinalExtension) {
        this.isFinalExtension = isFinalExtension;
    }

    public Boolean getIsFinalRestriction() {
        return isFinalRestriction;
    }

    public void setIsFinalRestriction(Boolean isFinalRestriction) {
        this.isFinalRestriction = isFinalRestriction;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }
}