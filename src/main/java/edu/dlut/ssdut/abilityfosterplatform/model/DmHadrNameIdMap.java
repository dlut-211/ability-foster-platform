package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmHadrNameIdMap {
    private String agName;

    private String agId;

    private String agResourceId;

    private String agGroupId;

    public String getAgName() {
        return agName;
    }

    public void setAgName(String agName) {
        this.agName = agName == null ? null : agName.trim();
    }

    public String getAgId() {
        return agId;
    }

    public void setAgId(String agId) {
        this.agId = agId == null ? null : agId.trim();
    }

    public String getAgResourceId() {
        return agResourceId;
    }

    public void setAgResourceId(String agResourceId) {
        this.agResourceId = agResourceId == null ? null : agResourceId.trim();
    }

    public String getAgGroupId() {
        return agGroupId;
    }

    public void setAgGroupId(String agGroupId) {
        this.agGroupId = agGroupId == null ? null : agGroupId.trim();
    }
}