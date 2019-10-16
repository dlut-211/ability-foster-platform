package edu.dlut.ssdut.abilityfosterplatform.model;

public class SystemInternalsAllocationUnits {
    private Long allocationUnitId;

    private Byte type;

    private String typeDesc;

    private Long containerId;

    private Short filegroupId;

    private Long totalPages;

    private Long usedPages;

    private Long dataPages;

    public Long getAllocationUnitId() {
        return allocationUnitId;
    }

    public void setAllocationUnitId(Long allocationUnitId) {
        this.allocationUnitId = allocationUnitId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Long getContainerId() {
        return containerId;
    }

    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }

    public Short getFilegroupId() {
        return filegroupId;
    }

    public void setFilegroupId(Short filegroupId) {
        this.filegroupId = filegroupId;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getUsedPages() {
        return usedPages;
    }

    public void setUsedPages(Long usedPages) {
        this.usedPages = usedPages;
    }

    public Long getDataPages() {
        return dataPages;
    }

    public void setDataPages(Long dataPages) {
        this.dataPages = dataPages;
    }
}