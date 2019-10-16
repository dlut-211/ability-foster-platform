package edu.dlut.ssdut.abilityfosterplatform.model;

public class FulltextCatalogs {
    private Integer fulltextCatalogId;

    private String name;

    private String path;

    private Boolean isDefault;

    private Boolean isAccentSensitivityOn;

    private Integer dataSpaceId;

    private Integer fileId;

    private Integer principalId;

    private Boolean isImporting;

    public Integer getFulltextCatalogId() {
        return fulltextCatalogId;
    }

    public void setFulltextCatalogId(Integer fulltextCatalogId) {
        this.fulltextCatalogId = fulltextCatalogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsAccentSensitivityOn() {
        return isAccentSensitivityOn;
    }

    public void setIsAccentSensitivityOn(Boolean isAccentSensitivityOn) {
        this.isAccentSensitivityOn = isAccentSensitivityOn;
    }

    public Integer getDataSpaceId() {
        return dataSpaceId;
    }

    public void setDataSpaceId(Integer dataSpaceId) {
        this.dataSpaceId = dataSpaceId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Boolean getIsImporting() {
        return isImporting;
    }

    public void setIsImporting(Boolean isImporting) {
        this.isImporting = isImporting;
    }
}