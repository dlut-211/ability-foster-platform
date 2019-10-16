package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServiceMessageTypes {
    private String name;

    private Integer messageTypeId;

    private Integer principalId;

    private String validation;

    private String validationDesc;

    private Integer xmlCollectionId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation == null ? null : validation.trim();
    }

    public String getValidationDesc() {
        return validationDesc;
    }

    public void setValidationDesc(String validationDesc) {
        this.validationDesc = validationDesc == null ? null : validationDesc.trim();
    }

    public Integer getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(Integer xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }
}