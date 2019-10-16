package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscompfragments {
    private Integer cprelid;

    private Integer fragid;

    private Integer fragobjid;

    private Integer status;

    private Long datasize;

    private Long itemcnt;

    private Long rowcnt;

    private byte[] ts;

    public Integer getCprelid() {
        return cprelid;
    }

    public void setCprelid(Integer cprelid) {
        this.cprelid = cprelid;
    }

    public Integer getFragid() {
        return fragid;
    }

    public void setFragid(Integer fragid) {
        this.fragid = fragid;
    }

    public Integer getFragobjid() {
        return fragobjid;
    }

    public void setFragobjid(Integer fragobjid) {
        this.fragobjid = fragobjid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getDatasize() {
        return datasize;
    }

    public void setDatasize(Long datasize) {
        this.datasize = datasize;
    }

    public Long getItemcnt() {
        return itemcnt;
    }

    public void setItemcnt(Long itemcnt) {
        this.itemcnt = itemcnt;
    }

    public Long getRowcnt() {
        return rowcnt;
    }

    public void setRowcnt(Long rowcnt) {
        this.rowcnt = rowcnt;
    }

    public byte[] getTs() {
        return ts;
    }

    public void setTs(byte[] ts) {
        this.ts = ts;
    }
}