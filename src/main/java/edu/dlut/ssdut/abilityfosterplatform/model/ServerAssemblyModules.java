package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServerAssemblyModules {
    private Integer objectId;

    private Integer assemblyId;

    private String assemblyClass;

    private String assemblyMethod;

    private Integer executeAsPrincipalId;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(Integer assemblyId) {
        this.assemblyId = assemblyId;
    }

    public String getAssemblyClass() {
        return assemblyClass;
    }

    public void setAssemblyClass(String assemblyClass) {
        this.assemblyClass = assemblyClass == null ? null : assemblyClass.trim();
    }

    public String getAssemblyMethod() {
        return assemblyMethod;
    }

    public void setAssemblyMethod(String assemblyMethod) {
        this.assemblyMethod = assemblyMethod == null ? null : assemblyMethod.trim();
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }
}