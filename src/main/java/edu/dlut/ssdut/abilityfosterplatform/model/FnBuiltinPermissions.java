package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnBuiltinPermissions {
    private String classDesc;

    private String permissionName;

    private String type;

    private String coveringPermissionName;

    private String parentClassDesc;

    private String parentCoveringPermissionName;

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCoveringPermissionName() {
        return coveringPermissionName;
    }

    public void setCoveringPermissionName(String coveringPermissionName) {
        this.coveringPermissionName = coveringPermissionName == null ? null : coveringPermissionName.trim();
    }

    public String getParentClassDesc() {
        return parentClassDesc;
    }

    public void setParentClassDesc(String parentClassDesc) {
        this.parentClassDesc = parentClassDesc == null ? null : parentClassDesc.trim();
    }

    public String getParentCoveringPermissionName() {
        return parentCoveringPermissionName;
    }

    public void setParentCoveringPermissionName(String parentCoveringPermissionName) {
        this.parentCoveringPermissionName = parentCoveringPermissionName == null ? null : parentCoveringPermissionName.trim();
    }
}