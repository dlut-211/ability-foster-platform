package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbPersistedSkuFeatures {
    private String featureName;

    private Integer featureId;

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName == null ? null : featureName.trim();
    }

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }
}