package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnRowdumpcracker {
    private Long partitionId;

    private String colname;

    private Boolean isinrow;

    private Boolean issparse;

    private Boolean isrecordprefixcompressed;

    private Boolean issymbol;

    private Integer prefixbytes;

    private Integer inrowlength;

    public Long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Long partitionId) {
        this.partitionId = partitionId;
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname == null ? null : colname.trim();
    }

    public Boolean getIsinrow() {
        return isinrow;
    }

    public void setIsinrow(Boolean isinrow) {
        this.isinrow = isinrow;
    }

    public Boolean getIssparse() {
        return issparse;
    }

    public void setIssparse(Boolean issparse) {
        this.issparse = issparse;
    }

    public Boolean getIsrecordprefixcompressed() {
        return isrecordprefixcompressed;
    }

    public void setIsrecordprefixcompressed(Boolean isrecordprefixcompressed) {
        this.isrecordprefixcompressed = isrecordprefixcompressed;
    }

    public Boolean getIssymbol() {
        return issymbol;
    }

    public void setIssymbol(Boolean issymbol) {
        this.issymbol = issymbol;
    }

    public Integer getPrefixbytes() {
        return prefixbytes;
    }

    public void setPrefixbytes(Integer prefixbytes) {
        this.prefixbytes = prefixbytes;
    }

    public Integer getInrowlength() {
        return inrowlength;
    }

    public void setInrowlength(Integer inrowlength) {
        this.inrowlength = inrowlength;
    }
}