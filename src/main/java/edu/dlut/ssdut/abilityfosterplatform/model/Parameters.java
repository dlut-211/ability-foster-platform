package edu.dlut.ssdut.abilityfosterplatform.model;

public class Parameters {
    private String specificCatalog;

    private String specificSchema;

    private String specificName;

    private Integer ordinalPosition;

    private String parameterMode;

    private String isResult;

    private String asLocator;

    private String parameterName;

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

    private String intervalType;

    private Short intervalPrecision;

    private String userDefinedTypeCatalog;

    private String userDefinedTypeSchema;

    private String userDefinedTypeName;

    private String scopeCatalog;

    private String scopeSchema;

    private String scopeName;

    public String getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog == null ? null : specificCatalog.trim();
    }

    public String getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema == null ? null : specificSchema.trim();
    }

    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName == null ? null : specificName.trim();
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getParameterMode() {
        return parameterMode;
    }

    public void setParameterMode(String parameterMode) {
        this.parameterMode = parameterMode == null ? null : parameterMode.trim();
    }

    public String getIsResult() {
        return isResult;
    }

    public void setIsResult(String isResult) {
        this.isResult = isResult == null ? null : isResult.trim();
    }

    public String getAsLocator() {
        return asLocator;
    }

    public void setAsLocator(String asLocator) {
        this.asLocator = asLocator == null ? null : asLocator.trim();
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName == null ? null : parameterName.trim();
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

    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType == null ? null : intervalType.trim();
    }

    public Short getIntervalPrecision() {
        return intervalPrecision;
    }

    public void setIntervalPrecision(Short intervalPrecision) {
        this.intervalPrecision = intervalPrecision;
    }

    public String getUserDefinedTypeCatalog() {
        return userDefinedTypeCatalog;
    }

    public void setUserDefinedTypeCatalog(String userDefinedTypeCatalog) {
        this.userDefinedTypeCatalog = userDefinedTypeCatalog == null ? null : userDefinedTypeCatalog.trim();
    }

    public String getUserDefinedTypeSchema() {
        return userDefinedTypeSchema;
    }

    public void setUserDefinedTypeSchema(String userDefinedTypeSchema) {
        this.userDefinedTypeSchema = userDefinedTypeSchema == null ? null : userDefinedTypeSchema.trim();
    }

    public String getUserDefinedTypeName() {
        return userDefinedTypeName;
    }

    public void setUserDefinedTypeName(String userDefinedTypeName) {
        this.userDefinedTypeName = userDefinedTypeName == null ? null : userDefinedTypeName.trim();
    }

    public String getScopeCatalog() {
        return scopeCatalog;
    }

    public void setScopeCatalog(String scopeCatalog) {
        this.scopeCatalog = scopeCatalog == null ? null : scopeCatalog.trim();
    }

    public String getScopeSchema() {
        return scopeSchema;
    }

    public void setScopeSchema(String scopeSchema) {
        this.scopeSchema = scopeSchema == null ? null : scopeSchema.trim();
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName == null ? null : scopeName.trim();
    }
}