package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecCachedPlans {
    private Integer bucketid;

    private Integer refcounts;

    private Integer usecounts;

    private Integer sizeInBytes;

    private String cacheobjtype;

    private String objtype;

    private Integer poolId;

    public Integer getBucketid() {
        return bucketid;
    }

    public void setBucketid(Integer bucketid) {
        this.bucketid = bucketid;
    }

    public Integer getRefcounts() {
        return refcounts;
    }

    public void setRefcounts(Integer refcounts) {
        this.refcounts = refcounts;
    }

    public Integer getUsecounts() {
        return usecounts;
    }

    public void setUsecounts(Integer usecounts) {
        this.usecounts = usecounts;
    }

    public Integer getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public String getCacheobjtype() {
        return cacheobjtype;
    }

    public void setCacheobjtype(String cacheobjtype) {
        this.cacheobjtype = cacheobjtype == null ? null : cacheobjtype.trim();
    }

    public String getObjtype() {
        return objtype;
    }

    public void setObjtype(String objtype) {
        this.objtype = objtype == null ? null : objtype.trim();
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }
}