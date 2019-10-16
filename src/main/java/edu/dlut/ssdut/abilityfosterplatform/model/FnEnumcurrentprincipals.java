package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnEnumcurrentprincipals {
    private String dbName;

    private String currentPrincipal;

    private Integer mirroringRole;

    private Integer mirroringState;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }

    public String getCurrentPrincipal() {
        return currentPrincipal;
    }

    public void setCurrentPrincipal(String currentPrincipal) {
        this.currentPrincipal = currentPrincipal == null ? null : currentPrincipal.trim();
    }

    public Integer getMirroringRole() {
        return mirroringRole;
    }

    public void setMirroringRole(Integer mirroringRole) {
        this.mirroringRole = mirroringRole;
    }

    public Integer getMirroringState() {
        return mirroringState;
    }

    public void setMirroringState(Integer mirroringState) {
        this.mirroringState = mirroringState;
    }
}