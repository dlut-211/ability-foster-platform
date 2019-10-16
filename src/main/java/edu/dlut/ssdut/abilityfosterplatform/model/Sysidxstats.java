package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysidxstats {
    private Integer id;

    private Integer indid;

    private String name;

    private Integer status;

    private Integer intprop;

    private Byte fillfact;

    private Byte type;

    private Byte tinyprop;

    private Integer dataspace;

    private Integer lobds;

    private Long rowset;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIndid() {
        return indid;
    }

    public void setIndid(Integer indid) {
        this.indid = indid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIntprop() {
        return intprop;
    }

    public void setIntprop(Integer intprop) {
        this.intprop = intprop;
    }

    public Byte getFillfact() {
        return fillfact;
    }

    public void setFillfact(Byte fillfact) {
        this.fillfact = fillfact;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getTinyprop() {
        return tinyprop;
    }

    public void setTinyprop(Byte tinyprop) {
        this.tinyprop = tinyprop;
    }

    public Integer getDataspace() {
        return dataspace;
    }

    public void setDataspace(Integer dataspace) {
        this.dataspace = dataspace;
    }

    public Integer getLobds() {
        return lobds;
    }

    public void setLobds(Integer lobds) {
        this.lobds = lobds;
    }

    public Long getRowset() {
        return rowset;
    }

    public void setRowset(Long rowset) {
        this.rowset = rowset;
    }
}