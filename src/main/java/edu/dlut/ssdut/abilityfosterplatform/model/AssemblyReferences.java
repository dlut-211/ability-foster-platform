package edu.dlut.ssdut.abilityfosterplatform.model;

public class AssemblyReferences {
    private Integer assemblyId;

    private Integer referencedAssemblyId;

    public Integer getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(Integer assemblyId) {
        this.assemblyId = assemblyId;
    }

    public Integer getReferencedAssemblyId() {
        return referencedAssemblyId;
    }

    public void setReferencedAssemblyId(Integer referencedAssemblyId) {
        this.referencedAssemblyId = referencedAssemblyId;
    }
}