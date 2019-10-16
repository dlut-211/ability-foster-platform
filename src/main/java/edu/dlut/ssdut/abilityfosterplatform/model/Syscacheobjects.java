package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscacheobjects {
    private Integer bucketid;

    private String cacheobjtype;

    private String objtype;

    private Integer objid;

    private Short dbid;

    private Short dbidexec;

    private Short uid;

    private Integer refcounts;

    private Integer usecounts;

    private Integer pagesused;

    private Integer setopts;

    private Short langid;

    private Short dateformat;

    private Integer status;

    private Long lasttime;

    private Long maxexectime;

    private Long avgexectime;

    private Long lastreads;

    private Long lastwrites;

    private Integer sqlbytes;

    private String sql;

    public Integer getBucketid() {
        return bucketid;
    }

    public void setBucketid(Integer bucketid) {
        this.bucketid = bucketid;
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

    public Integer getObjid() {
        return objid;
    }

    public void setObjid(Integer objid) {
        this.objid = objid;
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Short getDbidexec() {
        return dbidexec;
    }

    public void setDbidexec(Short dbidexec) {
        this.dbidexec = dbidexec;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
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

    public Integer getPagesused() {
        return pagesused;
    }

    public void setPagesused(Integer pagesused) {
        this.pagesused = pagesused;
    }

    public Integer getSetopts() {
        return setopts;
    }

    public void setSetopts(Integer setopts) {
        this.setopts = setopts;
    }

    public Short getLangid() {
        return langid;
    }

    public void setLangid(Short langid) {
        this.langid = langid;
    }

    public Short getDateformat() {
        return dateformat;
    }

    public void setDateformat(Short dateformat) {
        this.dateformat = dateformat;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getLasttime() {
        return lasttime;
    }

    public void setLasttime(Long lasttime) {
        this.lasttime = lasttime;
    }

    public Long getMaxexectime() {
        return maxexectime;
    }

    public void setMaxexectime(Long maxexectime) {
        this.maxexectime = maxexectime;
    }

    public Long getAvgexectime() {
        return avgexectime;
    }

    public void setAvgexectime(Long avgexectime) {
        this.avgexectime = avgexectime;
    }

    public Long getLastreads() {
        return lastreads;
    }

    public void setLastreads(Long lastreads) {
        this.lastreads = lastreads;
    }

    public Long getLastwrites() {
        return lastwrites;
    }

    public void setLastwrites(Long lastwrites) {
        this.lastwrites = lastwrites;
    }

    public Integer getSqlbytes() {
        return sqlbytes;
    }

    public void setSqlbytes(Integer sqlbytes) {
        this.sqlbytes = sqlbytes;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql == null ? null : sql.trim();
    }
}