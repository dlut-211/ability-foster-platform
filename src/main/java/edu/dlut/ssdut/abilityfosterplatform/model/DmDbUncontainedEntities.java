package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbUncontainedEntities {
    private Integer class;

    private String classDesc;

    private Integer majorId;

    private Integer statementLineNumber;

    private Integer statementOffsetBegin;

    private Integer statementOffsetEnd;

    private String statementType;

    private String featureName;

    private String featureTypeName;

    public Integer getClass() {
        return class;
    }

    public void setClass(Integer class) {
        this.class = class;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getStatementLineNumber() {
        return statementLineNumber;
    }

    public void setStatementLineNumber(Integer statementLineNumber) {
        this.statementLineNumber = statementLineNumber;
    }

    public Integer getStatementOffsetBegin() {
        return statementOffsetBegin;
    }

    public void setStatementOffsetBegin(Integer statementOffsetBegin) {
        this.statementOffsetBegin = statementOffsetBegin;
    }

    public Integer getStatementOffsetEnd() {
        return statementOffsetEnd;
    }

    public void setStatementOffsetEnd(Integer statementOffsetEnd) {
        this.statementOffsetEnd = statementOffsetEnd;
    }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType == null ? null : statementType.trim();
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName == null ? null : featureName.trim();
    }

    public String getFeatureTypeName() {
        return featureTypeName;
    }

    public void setFeatureTypeName(String featureTypeName) {
        this.featureTypeName = featureTypeName == null ? null : featureTypeName.trim();
    }
}