package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysusers {
    private Short uid;

    private Short status;

    private String name;

    private Date createdate;

    private Date updatedate;

    private Short altuid;

    private Short gid;

    private String environ;

    private Integer hasdbaccess;

    private Integer islogin;

    private Integer isntname;

    private Integer isntgroup;

    private Integer isntuser;

    private Integer issqluser;

    private Integer isaliased;

    private Integer issqlrole;

    private Integer isapprole;

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Short getAltuid() {
        return altuid;
    }

    public void setAltuid(Short altuid) {
        this.altuid = altuid;
    }

    public Short getGid() {
        return gid;
    }

    public void setGid(Short gid) {
        this.gid = gid;
    }

    public String getEnviron() {
        return environ;
    }

    public void setEnviron(String environ) {
        this.environ = environ == null ? null : environ.trim();
    }

    public Integer getHasdbaccess() {
        return hasdbaccess;
    }

    public void setHasdbaccess(Integer hasdbaccess) {
        this.hasdbaccess = hasdbaccess;
    }

    public Integer getIslogin() {
        return islogin;
    }

    public void setIslogin(Integer islogin) {
        this.islogin = islogin;
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

    public Integer getIssqluser() {
        return issqluser;
    }

    public void setIssqluser(Integer issqluser) {
        this.issqluser = issqluser;
    }

    public Integer getIsaliased() {
        return isaliased;
    }

    public void setIsaliased(Integer isaliased) {
        this.isaliased = isaliased;
    }

    public Integer getIssqlrole() {
        return issqlrole;
    }

    public void setIssqlrole(Integer issqlrole) {
        this.issqlrole = issqlrole;
    }

    public Integer getIsapprole() {
        return isapprole;
    }

    public void setIsapprole(Integer isapprole) {
        this.isapprole = isapprole;
    }
}