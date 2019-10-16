package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscsdictionaries {
    private Long hobtId;

    private Integer columnId;

    private Integer dictionaryId;

    private Integer version;

    private Integer type;

    private Long flags;

    private Integer lastId;

    private Long entryCount;

    private Long onDiskSize;

    private byte[] dataPtr;

    public Long getHobtId() {
        return hobtId;
    }

    public void setHobtId(Long hobtId) {
        this.hobtId = hobtId;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(Integer dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getFlags() {
        return flags;
    }

    public void setFlags(Long flags) {
        this.flags = flags;
    }

    public Integer getLastId() {
        return lastId;
    }

    public void setLastId(Integer lastId) {
        this.lastId = lastId;
    }

    public Long getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(Long entryCount) {
        this.entryCount = entryCount;
    }

    public Long getOnDiskSize() {
        return onDiskSize;
    }

    public void setOnDiskSize(Long onDiskSize) {
        this.onDiskSize = onDiskSize;
    }

    public byte[] getDataPtr() {
        return dataPtr;
    }

    public void setDataPtr(byte[] dataPtr) {
        this.dataPtr = dataPtr;
    }
}