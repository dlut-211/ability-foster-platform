package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecCachedPlanDependentObjects {
    private Integer usecounts;

    private String cacheobjtype;

    private byte[] memoryObjectAddress;

    public Integer getUsecounts() {
        return usecounts;
    }

    public void setUsecounts(Integer usecounts) {
        this.usecounts = usecounts;
    }

    public String getCacheobjtype() {
        return cacheobjtype;
    }

    public void setCacheobjtype(String cacheobjtype) {
        this.cacheobjtype = cacheobjtype == null ? null : cacheobjtype.trim();
    }

    public byte[] getMemoryObjectAddress() {
        return memoryObjectAddress;
    }

    public void setMemoryObjectAddress(byte[] memoryObjectAddress) {
        this.memoryObjectAddress = memoryObjectAddress;
    }
}