package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnCheckObjectSignatures {
    private String type;

    private Integer entityId;

    private Integer isSigned;

    private Integer isSignatureValid;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(Integer isSigned) {
        this.isSigned = isSigned;
    }

    public Integer getIsSignatureValid() {
        return isSignatureValid;
    }

    public void setIsSignatureValid(Integer isSignatureValid) {
        this.isSignatureValid = isSignatureValid;
    }
}