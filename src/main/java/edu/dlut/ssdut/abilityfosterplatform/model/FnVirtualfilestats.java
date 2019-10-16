package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnVirtualfilestats {
    private Short dbid;

    private Short fileid;

    private Integer timestamp;

    private Long numberreads;

    private Long bytesread;

    private Long iostallreadms;

    private Long numberwrites;

    private Long byteswritten;

    private Long iostallwritems;

    private Long iostallms;

    private Long bytesondisk;

    private byte[] filehandle;

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Short getFileid() {
        return fileid;
    }

    public void setFileid(Short fileid) {
        this.fileid = fileid;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Long getNumberreads() {
        return numberreads;
    }

    public void setNumberreads(Long numberreads) {
        this.numberreads = numberreads;
    }

    public Long getBytesread() {
        return bytesread;
    }

    public void setBytesread(Long bytesread) {
        this.bytesread = bytesread;
    }

    public Long getIostallreadms() {
        return iostallreadms;
    }

    public void setIostallreadms(Long iostallreadms) {
        this.iostallreadms = iostallreadms;
    }

    public Long getNumberwrites() {
        return numberwrites;
    }

    public void setNumberwrites(Long numberwrites) {
        this.numberwrites = numberwrites;
    }

    public Long getByteswritten() {
        return byteswritten;
    }

    public void setByteswritten(Long byteswritten) {
        this.byteswritten = byteswritten;
    }

    public Long getIostallwritems() {
        return iostallwritems;
    }

    public void setIostallwritems(Long iostallwritems) {
        this.iostallwritems = iostallwritems;
    }

    public Long getIostallms() {
        return iostallms;
    }

    public void setIostallms(Long iostallms) {
        this.iostallms = iostallms;
    }

    public Long getBytesondisk() {
        return bytesondisk;
    }

    public void setBytesondisk(Long bytesondisk) {
        this.bytesondisk = bytesondisk;
    }

    public byte[] getFilehandle() {
        return filehandle;
    }

    public void setFilehandle(byte[] filehandle) {
        this.filehandle = filehandle;
    }
}