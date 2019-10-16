package edu.dlut.ssdut.abilityfosterplatform.model;

public class DatabaseRoleMembers {
    private Integer rolePrincipalId;

    private Integer memberPrincipalId;

    public Integer getRolePrincipalId() {
        return rolePrincipalId;
    }

    public void setRolePrincipalId(Integer rolePrincipalId) {
        this.rolePrincipalId = rolePrincipalId;
    }

    public Integer getMemberPrincipalId() {
        return memberPrincipalId;
    }

    public void setMemberPrincipalId(Integer memberPrincipalId) {
        this.memberPrincipalId = memberPrincipalId;
    }
}