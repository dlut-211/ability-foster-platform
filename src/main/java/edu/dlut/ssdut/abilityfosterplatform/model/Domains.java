package edu.dlut.ssdut.abilityfosterplatform.model;

public class Domains {
    private String domainCatalog;

    private String domainSchema;

    private String domainName;

    private String dataType;

    private Integer characterMaximumLength;

    private Integer characterOctetLength;

    private String collationCatalog;

    private String collationSchema;

    private String collationName;

    private String characterSetCatalog;

    private String characterSetSchema;

    private String characterSetName;

    private Byte numericPrecision;

    private Short numericPrecisionRadix;

    private Integer numericScale;

    private Short datetimePrecision;

    private String domainDefault;

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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public Integer getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public Integer getCharacterOctetLength() {
        return characterOctetLength;
    }

    public void setCharacterOctetLength(Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    public String getCollationCatalog() {
        return collationCatalog;
    }

    public void setCollationCatalog(String collationCatalog) {
        this.collationCatalog = collationCatalog == null ? null : collationCatalog.trim();
    }

    public String getCollationSchema() {
        return collationSchema;
    }

    public void setCollationSchema(String collationSchema) {
        this.collationSchema = collationSchema == null ? null : collationSchema.trim();
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName == null ? null : collationName.trim();
    }

    public String getCharacterSetCatalog() {
        return characterSetCatalog;
    }

    public void setCharacterSetCatalog(String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog == null ? null : characterSetCatalog.trim();
    }

    public String getCharacterSetSchema() {
        return characterSetSchema;
    }

    public void setCharacterSetSchema(String characterSetSchema) {
        this.characterSetSchema = characterSetSchema == null ? null : characterSetSchema.trim();
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName == null ? null : characterSetName.trim();
    }

    public Byte getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Byte numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Short getNumericPrecisionRadix() {
        return numericPrecisionRadix;
    }

    public void setNumericPrecisionRadix(Short numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    public Integer getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    public Short getDatetimePrecision() {
        return datetimePrecision;
    }

    public void setDatetimePrecision(Short datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    public String getDomainDefault() {
        return domainDefault;
    }

    public void setDomainDefault(String domainDefault) {
        this.domainDefault = domainDefault == null ? null : domainDefault.trim();
    }
}