package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnMyPermissions {
    private String entityName;

    private String subentityName;

    private String permissionName;

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName == null ? null : entityName.trim();
    }

    public String getSubentityName() {
        return subentityName;
    }

    public void setSubentityName(String subentityName) {
        this.subentityName = subentityName == null ? null : subentityName.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }
}