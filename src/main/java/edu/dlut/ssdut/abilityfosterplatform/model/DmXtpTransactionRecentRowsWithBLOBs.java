package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXtpTransactionRecentRowsWithBLOBs extends DmXtpTransactionRecentRows {
    private byte[] rowAddress;

    private byte[] tableAddress;

    private byte[] outcome;

    public byte[] getRowAddress() {
        return rowAddress;
    }

    public void setRowAddress(byte[] rowAddress) {
        this.rowAddress = rowAddress;
    }

    public byte[] getTableAddress() {
        return tableAddress;
    }

    public void setTableAddress(byte[] tableAddress) {
        this.tableAddress = tableAddress;
    }

    public byte[] getOutcome() {
        return outcome;
    }

    public void setOutcome(byte[] outcome) {
        this.outcome = outcome;
    }
}