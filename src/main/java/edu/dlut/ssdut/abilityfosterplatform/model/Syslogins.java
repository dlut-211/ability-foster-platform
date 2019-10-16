package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Syslogins {
    private Short status;

    private Date createdate;

    private Date updatedate;

    private Date accdate;

    private Integer totcpu;

    private Integer totio;

    private Integer spacelimit;

    private Integer timelimit;

    private Integer resultlimit;

    private String name;

    private String dbname;

    private String password;

    private String language;

    private Integer denylogin;

    private Integer hasaccess;

    private Integer isntname;

    private Integer isntgroup;

    private Integer isntuser;

    private Integer sysadmin;

    private Integer securityadmin;

    private Integer serveradmin;

    private Integer setupadmin;

    private Integer processadmin;

    private Integer diskadmin;

    private Integer dbcreator;

    private Integer bulkadmin;

    private String loginname;

    private byte[] sid;

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Date getAccdate() {
        return accdate;
    }

    public void setAccdate(Date accdate) {
        this.accdate = accdate;
    }

    public Integer getTotcpu() {
        return totcpu;
    }

    public void setTotcpu(Integer totcpu) {
        this.totcpu = totcpu;
    }

    public Integer getTotio() {
        return totio;
    }

    public void setTotio(Integer totio) {
        this.totio = totio;
    }

    public Integer getSpacelimit() {
        return spacelimit;
    }

    public void setSpacelimit(Integer spacelimit) {
        this.spacelimit = spacelimit;
    }

    public Integer getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Integer timelimit) {
        this.timelimit = timelimit;
    }

    public Integer getResultlimit() {
        return resultlimit;
    }

    public void setResultlimit(Integer resultlimit) {
        this.resultlimit = resultlimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname == null ? null : dbname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getDenylogin() {
        return denylogin;
    }

    public void setDenylogin(Integer denylogin) {
        this.denylogin = denylogin;
    }

    public Integer getHasaccess() {
        return hasaccess;
    }

    public void setHasaccess(Integer hasaccess) {
        this.hasaccess = hasaccess;
    }

    public Integer getIsntname() {
        return isntname;
    }

    public void setIsntname(Integer isntname) {
        this.isntname = isntname;
    }

    public Integer getIsntgroup() {
        return isntgroup;
    }

    public void setIsntgroup(Integer isntgroup) {
        this.isntgroup = isntgroup;
    }

    public Integer getIsntuser() {
        return isntuser;
    }

    public void setIsntuser(Integer isntuser) {
        this.isntuser = isntuser;
    }

    public Integer getSysadmin() {
        return sysadmin;
    }

    public void setSysadmin(Integer sysadmin) {
        this.sysadmin = sysadmin;
    }

    public Integer getSecurityadmin() {
        return securityadmin;
    }

    public void setSecurityadmin(Integer securityadmin) {
        this.securityadmin = securityadmin;
    }

    public Integer getServeradmin() {
        return serveradmin;
    }

    public void setServeradmin(Integer serveradmin) {
        this.serveradmin = serveradmin;
    }

    public Integer getSetupadmin() {
        return setupadmin;
    }

    public void setSetupadmin(Integer setupadmin) {
        this.setupadmin = setupadmin;
    }

    public Integer getProcessadmin() {
        return processadmin;
    }

    public void setProcessadmin(Integer processadmin) {
        this.processadmin = processadmin;
    }

    public Integer getDiskadmin() {
        return diskadmin;
    }

    public void setDiskadmin(Integer diskadmin) {
        this.diskadmin = diskadmin;
    }

    public Integer getDbcreator() {
        return dbcreator;
    }

    public void setDbcreator(Integer dbcreator) {
        this.dbcreator = dbcreator;
    }

    public Integer getBulkadmin() {
        return bulkadmin;
    }

    public void setBulkadmin(Integer bulkadmin) {
        this.bulkadmin = bulkadmin;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }
}