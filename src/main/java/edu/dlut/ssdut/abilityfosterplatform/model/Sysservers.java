package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysservers {
    private Short srvid;

    private Short srvstatus;

    private String srvname;

    private String srvproduct;

    private String providername;

    private String datasource;

    private String location;

    private String providerstring;

    private Date schemadate;

    private Integer topologyx;

    private Integer topologyy;

    private String catalog;

    private String srvcollation;

    private Integer connecttimeout;

    private Integer querytimeout;

    private String srvnetname;

    private Boolean isremote;

    private Boolean rpc;

    private Boolean pub;

    private Boolean sub;

    private Boolean dist;

    private Boolean dpub;

    private Boolean rpcout;

    private Boolean dataaccess;

    private Boolean collationcompatible;

    private Boolean system;

    private Boolean useremotecollation;

    private Boolean lazyschemavalidation;

    private String collation;

    private Boolean nonsqlsub;

    public Short getSrvid() {
        return srvid;
    }

    public void setSrvid(Short srvid) {
        this.srvid = srvid;
    }

    public Short getSrvstatus() {
        return srvstatus;
    }

    public void setSrvstatus(Short srvstatus) {
        this.srvstatus = srvstatus;
    }

    public String getSrvname() {
        return srvname;
    }

    public void setSrvname(String srvname) {
        this.srvname = srvname == null ? null : srvname.trim();
    }

    public String getSrvproduct() {
        return srvproduct;
    }

    public void setSrvproduct(String srvproduct) {
        this.srvproduct = srvproduct == null ? null : srvproduct.trim();
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername == null ? null : providername.trim();
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getProviderstring() {
        return providerstring;
    }

    public void setProviderstring(String providerstring) {
        this.providerstring = providerstring == null ? null : providerstring.trim();
    }

    public Date getSchemadate() {
        return schemadate;
    }

    public void setSchemadate(Date schemadate) {
        this.schemadate = schemadate;
    }

    public Integer getTopologyx() {
        return topologyx;
    }

    public void setTopologyx(Integer topologyx) {
        this.topologyx = topologyx;
    }

    public Integer getTopologyy() {
        return topologyy;
    }

    public void setTopologyy(Integer topologyy) {
        this.topologyy = topologyy;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getSrvcollation() {
        return srvcollation;
    }

    public void setSrvcollation(String srvcollation) {
        this.srvcollation = srvcollation == null ? null : srvcollation.trim();
    }

    public Integer getConnecttimeout() {
        return connecttimeout;
    }

    public void setConnecttimeout(Integer connecttimeout) {
        this.connecttimeout = connecttimeout;
    }

    public Integer getQuerytimeout() {
        return querytimeout;
    }

    public void setQuerytimeout(Integer querytimeout) {
        this.querytimeout = querytimeout;
    }

    public String getSrvnetname() {
        return srvnetname;
    }

    public void setSrvnetname(String srvnetname) {
        this.srvnetname = srvnetname == null ? null : srvnetname.trim();
    }

    public Boolean getIsremote() {
        return isremote;
    }

    public void setIsremote(Boolean isremote) {
        this.isremote = isremote;
    }

    public Boolean getRpc() {
        return rpc;
    }

    public void setRpc(Boolean rpc) {
        this.rpc = rpc;
    }

    public Boolean getPub() {
        return pub;
    }

    public void setPub(Boolean pub) {
        this.pub = pub;
    }

    public Boolean getSub() {
        return sub;
    }

    public void setSub(Boolean sub) {
        this.sub = sub;
    }

    public Boolean getDist() {
        return dist;
    }

    public void setDist(Boolean dist) {
        this.dist = dist;
    }

    public Boolean getDpub() {
        return dpub;
    }

    public void setDpub(Boolean dpub) {
        this.dpub = dpub;
    }

    public Boolean getRpcout() {
        return rpcout;
    }

    public void setRpcout(Boolean rpcout) {
        this.rpcout = rpcout;
    }

    public Boolean getDataaccess() {
        return dataaccess;
    }

    public void setDataaccess(Boolean dataaccess) {
        this.dataaccess = dataaccess;
    }

    public Boolean getCollationcompatible() {
        return collationcompatible;
    }

    public void setCollationcompatible(Boolean collationcompatible) {
        this.collationcompatible = collationcompatible;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public Boolean getUseremotecollation() {
        return useremotecollation;
    }

    public void setUseremotecollation(Boolean useremotecollation) {
        this.useremotecollation = useremotecollation;
    }

    public Boolean getLazyschemavalidation() {
        return lazyschemavalidation;
    }

    public void setLazyschemavalidation(Boolean lazyschemavalidation) {
        this.lazyschemavalidation = lazyschemavalidation;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation == null ? null : collation.trim();
    }

    public Boolean getNonsqlsub() {
        return nonsqlsub;
    }

    public void setNonsqlsub(Boolean nonsqlsub) {
        this.nonsqlsub = nonsqlsub;
    }
}