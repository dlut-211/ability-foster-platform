package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysobjects {
    private String name;

    private Integer id;

    private String xtype;

    private Short uid;

    private Short info;

    private Integer status;

    private Integer baseSchemaVer;

    private Integer replinfo;

    private Integer parentObj;

    private Date crdate;

    private Short ftcatid;

    private Integer schemaVer;

    private Integer statsSchemaVer;

    private String type;

    private Short userstat;

    private Short sysstat;

    private Short indexdel;

    private Date refdate;

    private Integer version;

    private Integer deltrig;

    private Integer instrig;

    private Integer updtrig;

    private Integer seltrig;

    private Integer category;

    private Short cache;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXtype() {
        return xtype;
    }

    public void setXtype(String xtype) {
        this.xtype = xtype == null ? null : xtype.trim();
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Short getInfo() {
        return info;
    }

    public void setInfo(Short info) {
        this.info = info;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBaseSchemaVer() {
        return baseSchemaVer;
    }

    public void setBaseSchemaVer(Integer baseSchemaVer) {
        this.baseSchemaVer = baseSchemaVer;
    }

    public Integer getReplinfo() {
        return replinfo;
    }

    public void setReplinfo(Integer replinfo) {
        this.replinfo = replinfo;
    }

    public Integer getParentObj() {
        return parentObj;
    }

    public void setParentObj(Integer parentObj) {
        this.parentObj = parentObj;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public Short getFtcatid() {
        return ftcatid;
    }

    public void setFtcatid(Short ftcatid) {
        this.ftcatid = ftcatid;
    }

    public Integer getSchemaVer() {
        return schemaVer;
    }

    public void setSchemaVer(Integer schemaVer) {
        this.schemaVer = schemaVer;
    }

    public Integer getStatsSchemaVer() {
        return statsSchemaVer;
    }

    public void setStatsSchemaVer(Integer statsSchemaVer) {
        this.statsSchemaVer = statsSchemaVer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Short getUserstat() {
        return userstat;
    }

    public void setUserstat(Short userstat) {
        this.userstat = userstat;
    }

    public Short getSysstat() {
        return sysstat;
    }

    public void setSysstat(Short sysstat) {
        this.sysstat = sysstat;
    }

    public Short getIndexdel() {
        return indexdel;
    }

    public void setIndexdel(Short indexdel) {
        this.indexdel = indexdel;
    }

    public Date getRefdate() {
        return refdate;
    }

    public void setRefdate(Date refdate) {
        this.refdate = refdate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeltrig() {
        return deltrig;
    }

    public void setDeltrig(Integer deltrig) {
        this.deltrig = deltrig;
    }

    public Integer getInstrig() {
        return instrig;
    }

    public void setInstrig(Integer instrig) {
        this.instrig = instrig;
    }

    public Integer getUpdtrig() {
        return updtrig;
    }

    public void setUpdtrig(Integer updtrig) {
        this.updtrig = updtrig;
    }

    public Integer getSeltrig() {
        return seltrig;
    }

    public void setSeltrig(Integer seltrig) {
        this.seltrig = seltrig;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Short getCache() {
        return cache;
    }

    public void setCache(Short cache) {
        this.cache = cache;
    }
}