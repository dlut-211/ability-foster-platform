package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syssoftobjrefs {
    private Byte depclass;

    private Integer depid;

    private Byte indepclass;

    private String indepname;

    private String indepschema;

    private String indepdb;

    private String indepserver;

    private Integer number;

    private Integer status;

    public Byte getDepclass() {
        return depclass;
    }

    public void setDepclass(Byte depclass) {
        this.depclass = depclass;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public Byte getIndepclass() {
        return indepclass;
    }

    public void setIndepclass(Byte indepclass) {
        this.indepclass = indepclass;
    }

    public String getIndepname() {
        return indepname;
    }

    public void setIndepname(String indepname) {
        this.indepname = indepname == null ? null : indepname.trim();
    }

    public String getIndepschema() {
        return indepschema;
    }

    public void setIndepschema(String indepschema) {
        this.indepschema = indepschema == null ? null : indepschema.trim();
    }

    public String getIndepdb() {
        return indepdb;
    }

    public void setIndepdb(String indepdb) {
        this.indepdb = indepdb == null ? null : indepdb.trim();
    }

    public String getIndepserver() {
        return indepserver;
    }

    public void setIndepserver(String indepserver) {
        this.indepserver = indepserver == null ? null : indepserver.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}