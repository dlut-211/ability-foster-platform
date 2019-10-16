package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysendpts {
    private Integer id;

    private String name;

    private Byte protocol;

    private Byte type;

    private Short bstat;

    private Long affinity;

    private Short pstat;

    private Short tstat;

    private Integer typeint;

    private Integer port1;

    private Integer port2;

    private String site;

    private String dfltns;

    private String wsdlproc;

    private String dfltdb;

    private String authrealm;

    private String dfltdm;

    private Integer maxconn;

    private Byte encalg;

    private Byte authtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getProtocol() {
        return protocol;
    }

    public void setProtocol(Byte protocol) {
        this.protocol = protocol;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Short getBstat() {
        return bstat;
    }

    public void setBstat(Short bstat) {
        this.bstat = bstat;
    }

    public Long getAffinity() {
        return affinity;
    }

    public void setAffinity(Long affinity) {
        this.affinity = affinity;
    }

    public Short getPstat() {
        return pstat;
    }

    public void setPstat(Short pstat) {
        this.pstat = pstat;
    }

    public Short getTstat() {
        return tstat;
    }

    public void setTstat(Short tstat) {
        this.tstat = tstat;
    }

    public Integer getTypeint() {
        return typeint;
    }

    public void setTypeint(Integer typeint) {
        this.typeint = typeint;
    }

    public Integer getPort1() {
        return port1;
    }

    public void setPort1(Integer port1) {
        this.port1 = port1;
    }

    public Integer getPort2() {
        return port2;
    }

    public void setPort2(Integer port2) {
        this.port2 = port2;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getDfltns() {
        return dfltns;
    }

    public void setDfltns(String dfltns) {
        this.dfltns = dfltns == null ? null : dfltns.trim();
    }

    public String getWsdlproc() {
        return wsdlproc;
    }

    public void setWsdlproc(String wsdlproc) {
        this.wsdlproc = wsdlproc == null ? null : wsdlproc.trim();
    }

    public String getDfltdb() {
        return dfltdb;
    }

    public void setDfltdb(String dfltdb) {
        this.dfltdb = dfltdb == null ? null : dfltdb.trim();
    }

    public String getAuthrealm() {
        return authrealm;
    }

    public void setAuthrealm(String authrealm) {
        this.authrealm = authrealm == null ? null : authrealm.trim();
    }

    public String getDfltdm() {
        return dfltdm;
    }

    public void setDfltdm(String dfltdm) {
        this.dfltdm = dfltdm == null ? null : dfltdm.trim();
    }

    public Integer getMaxconn() {
        return maxconn;
    }

    public void setMaxconn(Integer maxconn) {
        this.maxconn = maxconn;
    }

    public Byte getEncalg() {
        return encalg;
    }

    public void setEncalg(Byte encalg) {
        this.encalg = encalg;
    }

    public Byte getAuthtype() {
        return authtype;
    }

    public void setAuthtype(Byte authtype) {
        this.authtype = authtype;
    }
}