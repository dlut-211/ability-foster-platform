package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Routines {
    private String specificCatalog;

    private String specificSchema;

    private String specificName;

    private String routineCatalog;

    private String routineSchema;

    private String routineName;

    private String routineType;

    private String moduleCatalog;

    private String moduleSchema;

    private String moduleName;

    private String udtCatalog;

    private String udtSchema;

    private String udtName;

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

    private String typeUdtCatalog;

    private String typeUdtSchema;

    private String typeUdtName;

    private String scopeCatalog;

    private String scopeSchema;

    private String scopeName;

    private Long maximumCardinality;

    private String dtdIdentifier;

    private String routineBody;

    private String routineDefinition;

    private String externalName;

    private String externalLanguage;

    private String parameterStyle;

    private String isDeterministic;

    private String sqlDataAccess;

    private String isNullCall;

    private String sqlPath;

    private String schemaLevelRoutine;

    private Short maxDynamicResultSets;

    private String isUserDefinedCast;

    private String isImplicitlyInvocable;

    private Date created;

    private Date lastAltered;

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

    public String getRoutineCatalog() {
        return routineCatalog;
    }

    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog == null ? null : routineCatalog.trim();
    }

    public String getRoutineSchema() {
        return routineSchema;
    }

    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema == null ? null : routineSchema.trim();
    }

    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName == null ? null : routineName.trim();
    }

    public String getRoutineType() {
        return routineType;
    }

    public void setRoutineType(String routineType) {
        this.routineType = routineType == null ? null : routineType.trim();
    }

    public String getModuleCatalog() {
        return moduleCatalog;
    }

    public void setModuleCatalog(String moduleCatalog) {
        this.moduleCatalog = moduleCatalog == null ? null : moduleCatalog.trim();
    }

    public String getModuleSchema() {
        return moduleSchema;
    }

    public void setModuleSchema(String moduleSchema) {
        this.moduleSchema = moduleSchema == null ? null : moduleSchema.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getUdtCatalog() {
        return udtCatalog;
    }

    public void setUdtCatalog(String udtCatalog) {
        this.udtCatalog = udtCatalog == null ? null : udtCatalog.trim();
    }

    public String getUdtSchema() {
        return udtSchema;
    }

    public void setUdtSchema(String udtSchema) {
        this.udtSchema = udtSchema == null ? null : udtSchema.trim();
    }

    public String getUdtName() {
        return udtName;
    }

    public void setUdtName(String udtName) {
        this.udtName = udtName == null ? null : udtName.trim();
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

    public String getTypeUdtCatalog() {
        return typeUdtCatalog;
    }

    public void setTypeUdtCatalog(String typeUdtCatalog) {
        this.typeUdtCatalog = typeUdtCatalog == null ? null : typeUdtCatalog.trim();
    }

    public String getTypeUdtSchema() {
        return typeUdtSchema;
    }

    public void setTypeUdtSchema(String typeUdtSchema) {
        this.typeUdtSchema = typeUdtSchema == null ? null : typeUdtSchema.trim();
    }

    public String getTypeUdtName() {
        return typeUdtName;
    }

    public void setTypeUdtName(String typeUdtName) {
        this.typeUdtName = typeUdtName == null ? null : typeUdtName.trim();
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

    public Long getMaximumCardinality() {
        return maximumCardinality;
    }

    public void setMaximumCardinality(Long maximumCardinality) {
        this.maximumCardinality = maximumCardinality;
    }

    public String getDtdIdentifier() {
        return dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier == null ? null : dtdIdentifier.trim();
    }

    public String getRoutineBody() {
        return routineBody;
    }

    public void setRoutineBody(String routineBody) {
        this.routineBody = routineBody == null ? null : routineBody.trim();
    }

    public String getRoutineDefinition() {
        return routineDefinition;
    }

    public void setRoutineDefinition(String routineDefinition) {
        this.routineDefinition = routineDefinition == null ? null : routineDefinition.trim();
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName == null ? null : externalName.trim();
    }

    public String getExternalLanguage() {
        return externalLanguage;
    }

    public void setExternalLanguage(String externalLanguage) {
        this.externalLanguage = externalLanguage == null ? null : externalLanguage.trim();
    }

    public String getParameterStyle() {
        return parameterStyle;
    }

    public void setParameterStyle(String parameterStyle) {
        this.parameterStyle = parameterStyle == null ? null : parameterStyle.trim();
    }

    public String getIsDeterministic() {
        return isDeterministic;
    }

    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic == null ? null : isDeterministic.trim();
    }

    public String getSqlDataAccess() {
        return sqlDataAccess;
    }

    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess == null ? null : sqlDataAccess.trim();
    }

    public String getIsNullCall() {
        return isNullCall;
    }

    public void setIsNullCall(String isNullCall) {
        this.isNullCall = isNullCall == null ? null : isNullCall.trim();
    }

    public String getSqlPath() {
        return sqlPath;
    }

    public void setSqlPath(String sqlPath) {
        this.sqlPath = sqlPath == null ? null : sqlPath.trim();
    }

    public String getSchemaLevelRoutine() {
        return schemaLevelRoutine;
    }

    public void setSchemaLevelRoutine(String schemaLevelRoutine) {
        this.schemaLevelRoutine = schemaLevelRoutine == null ? null : schemaLevelRoutine.trim();
    }

    public Short getMaxDynamicResultSets() {
        return maxDynamicResultSets;
    }

    public void setMaxDynamicResultSets(Short maxDynamicResultSets) {
        this.maxDynamicResultSets = maxDynamicResultSets;
    }

    public String getIsUserDefinedCast() {
        return isUserDefinedCast;
    }

    public void setIsUserDefinedCast(String isUserDefinedCast) {
        this.isUserDefinedCast = isUserDefinedCast == null ? null : isUserDefinedCast.trim();
    }

    public String getIsImplicitlyInvocable() {
        return isImplicitlyInvocable;
    }

    public void setIsImplicitlyInvocable(String isImplicitlyInvocable) {
        this.isImplicitlyInvocable = isImplicitlyInvocable == null ? null : isImplicitlyInvocable.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastAltered() {
        return lastAltered;
    }

    public void setLastAltered(Date lastAltered) {
        this.lastAltered = lastAltered;
    }
}