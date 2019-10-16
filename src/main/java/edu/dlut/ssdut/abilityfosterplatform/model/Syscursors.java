package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscursors {
    private Integer cursorHandle;

    private String cursorName;

    private Integer status;

    private Byte model;

    private Byte concurrency;

    private Byte scrollable;

    private Byte openStatus;

    private Long cursorRows;

    private Short fetchStatus;

    private Short columnCount;

    private Long rowCount;

    private Byte lastOperation;

    public Integer getCursorHandle() {
        return cursorHandle;
    }

    public void setCursorHandle(Integer cursorHandle) {
        this.cursorHandle = cursorHandle;
    }

    public String getCursorName() {
        return cursorName;
    }

    public void setCursorName(String cursorName) {
        this.cursorName = cursorName == null ? null : cursorName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Byte getModel() {
        return model;
    }

    public void setModel(Byte model) {
        this.model = model;
    }

    public Byte getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Byte concurrency) {
        this.concurrency = concurrency;
    }

    public Byte getScrollable() {
        return scrollable;
    }

    public void setScrollable(Byte scrollable) {
        this.scrollable = scrollable;
    }

    public Byte getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Byte openStatus) {
        this.openStatus = openStatus;
    }

    public Long getCursorRows() {
        return cursorRows;
    }

    public void setCursorRows(Long cursorRows) {
        this.cursorRows = cursorRows;
    }

    public Short getFetchStatus() {
        return fetchStatus;
    }

    public void setFetchStatus(Short fetchStatus) {
        this.fetchStatus = fetchStatus;
    }

    public Short getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Short columnCount) {
        this.columnCount = columnCount;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    public Byte getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(Byte lastOperation) {
        this.lastOperation = lastOperation;
    }
}