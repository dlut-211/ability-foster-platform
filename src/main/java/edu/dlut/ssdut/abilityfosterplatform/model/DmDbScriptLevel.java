package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbScriptLevel {
    private Integer databaseId;

    private Integer scriptId;

    private String scriptName;

    private Integer version;

    private Integer scriptLevel;

    private Integer downgradeStartLevel;

    private Integer downgradeTargetLevel;

    private Integer upgradeStartLevel;

    private Integer upgradeTargetLevel;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getScriptId() {
        return scriptId;
    }

    public void setScriptId(Integer scriptId) {
        this.scriptId = scriptId;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName == null ? null : scriptName.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getScriptLevel() {
        return scriptLevel;
    }

    public void setScriptLevel(Integer scriptLevel) {
        this.scriptLevel = scriptLevel;
    }

    public Integer getDowngradeStartLevel() {
        return downgradeStartLevel;
    }

    public void setDowngradeStartLevel(Integer downgradeStartLevel) {
        this.downgradeStartLevel = downgradeStartLevel;
    }

    public Integer getDowngradeTargetLevel() {
        return downgradeTargetLevel;
    }

    public void setDowngradeTargetLevel(Integer downgradeTargetLevel) {
        this.downgradeTargetLevel = downgradeTargetLevel;
    }

    public Integer getUpgradeStartLevel() {
        return upgradeStartLevel;
    }

    public void setUpgradeStartLevel(Integer upgradeStartLevel) {
        this.upgradeStartLevel = upgradeStartLevel;
    }

    public Integer getUpgradeTargetLevel() {
        return upgradeTargetLevel;
    }

    public void setUpgradeTargetLevel(Integer upgradeTargetLevel) {
        this.upgradeTargetLevel = upgradeTargetLevel;
    }
}