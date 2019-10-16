package edu.dlut.ssdut.abilityfosterplatform.model;

public class NumberedProcedures {
    private Integer objectId;

    private Short procedureNumber;

    private String definition;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Short getProcedureNumber() {
        return procedureNumber;
    }

    public void setProcedureNumber(Short procedureNumber) {
        this.procedureNumber = procedureNumber;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }
}