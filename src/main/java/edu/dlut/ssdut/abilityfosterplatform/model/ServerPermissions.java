package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServerPermissions {
    private Byte class;

    private String classDesc;

    private Integer majorId;

    private Integer minorId;

    private Integer granteePrincipalId;

    private Integer grantorPrincipalId;

    private String type;

    private String permissionName;

    private String state;

    private String stateDesc;

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
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

    public Integer getMinorId() {
        return minorId;
    }

    public void setMinorId(Integer minorId) {
        this.minorId = minorId;
    }

    public Integer getGranteePrincipalId() {
        return granteePrincipalId;
    }

    public void setGranteePrincipalId(Integer granteePrincipalId) {
        this.granteePrincipalId = granteePrincipalId;
    }

    public Integer getGrantorPrincipalId() {
        return grantorPrincipalId;
    }

    public void setGrantorPrincipalId(Integer grantorPrincipalId) {
        this.grantorPrincipalId = grantorPrincipalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }
}