package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnDblogWithBLOBs extends FnDblog {
    private byte[] tagBits;

    private byte[] flagBits;

    private byte[] beginlogStatus;

    private byte[] transactionSid;

    private byte[] replMsg;

    private byte[] rowbitsBitValue;

    private byte[] newValue;

    private byte[] oldValue;

    private byte[] metaStatus;

    private byte[] fileStatus;

    private byte[] textptr;

    private byte[] rowlogContents0;

    private byte[] rowlogContents1;

    private byte[] rowlogContents2;

    private byte[] rowlogContents3;

    private byte[] rowlogContents4;

    private byte[] rowlogContents5;

    private byte[] compressionInfo;

    private byte[] logRecord;

    public byte[] getTagBits() {
        return tagBits;
    }

    public void setTagBits(byte[] tagBits) {
        this.tagBits = tagBits;
    }

    public byte[] getFlagBits() {
        return flagBits;
    }

    public void setFlagBits(byte[] flagBits) {
        this.flagBits = flagBits;
    }

    public byte[] getBeginlogStatus() {
        return beginlogStatus;
    }

    public void setBeginlogStatus(byte[] beginlogStatus) {
        this.beginlogStatus = beginlogStatus;
    }

    public byte[] getTransactionSid() {
        return transactionSid;
    }

    public void setTransactionSid(byte[] transactionSid) {
        this.transactionSid = transactionSid;
    }

    public byte[] getReplMsg() {
        return replMsg;
    }

    public void setReplMsg(byte[] replMsg) {
        this.replMsg = replMsg;
    }

    public byte[] getRowbitsBitValue() {
        return rowbitsBitValue;
    }

    public void setRowbitsBitValue(byte[] rowbitsBitValue) {
        this.rowbitsBitValue = rowbitsBitValue;
    }

    public byte[] getNewValue() {
        return newValue;
    }

    public void setNewValue(byte[] newValue) {
        this.newValue = newValue;
    }

    public byte[] getOldValue() {
        return oldValue;
    }

    public void setOldValue(byte[] oldValue) {
        this.oldValue = oldValue;
    }

    public byte[] getMetaStatus() {
        return metaStatus;
    }

    public void setMetaStatus(byte[] metaStatus) {
        this.metaStatus = metaStatus;
    }

    public byte[] getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(byte[] fileStatus) {
        this.fileStatus = fileStatus;
    }

    public byte[] getTextptr() {
        return textptr;
    }

    public void setTextptr(byte[] textptr) {
        this.textptr = textptr;
    }

    public byte[] getRowlogContents0() {
        return rowlogContents0;
    }

    public void setRowlogContents0(byte[] rowlogContents0) {
        this.rowlogContents0 = rowlogContents0;
    }

    public byte[] getRowlogContents1() {
        return rowlogContents1;
    }

    public void setRowlogContents1(byte[] rowlogContents1) {
        this.rowlogContents1 = rowlogContents1;
    }

    public byte[] getRowlogContents2() {
        return rowlogContents2;
    }

    public void setRowlogContents2(byte[] rowlogContents2) {
        this.rowlogContents2 = rowlogContents2;
    }

    public byte[] getRowlogContents3() {
        return rowlogContents3;
    }

    public void setRowlogContents3(byte[] rowlogContents3) {
        this.rowlogContents3 = rowlogContents3;
    }

    public byte[] getRowlogContents4() {
        return rowlogContents4;
    }

    public void setRowlogContents4(byte[] rowlogContents4) {
        this.rowlogContents4 = rowlogContents4;
    }

    public byte[] getRowlogContents5() {
        return rowlogContents5;
    }

    public void setRowlogContents5(byte[] rowlogContents5) {
        this.rowlogContents5 = rowlogContents5;
    }

    public byte[] getCompressionInfo() {
        return compressionInfo;
    }

    public void setCompressionInfo(byte[] compressionInfo) {
        this.compressionInfo = compressionInfo;
    }

    public byte[] getLogRecord() {
        return logRecord;
    }

    public void setLogRecord(byte[] logRecord) {
        this.logRecord = logRecord;
    }
}