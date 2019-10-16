package edu.dlut.ssdut.abilityfosterplatform.model;

public class MasterKeyPasswords {
    private Integer credentialId;

    private String familyGuid;

    public Integer getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
    }

    public String getFamilyGuid() {
        return familyGuid;
    }

    public void setFamilyGuid(String familyGuid) {
        this.familyGuid = familyGuid == null ? null : familyGuid.trim();
    }
}