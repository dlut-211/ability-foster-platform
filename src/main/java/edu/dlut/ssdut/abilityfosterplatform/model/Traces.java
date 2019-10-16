package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Traces {
    private Integer id;

    private Integer status;

    private String path;

    private Long maxSize;

    private Date stopTime;

    private Integer maxFiles;

    private Boolean isRowset;

    private Boolean isRollover;

    private Boolean isShutdown;

    private Boolean isDefault;

    private Integer bufferCount;

    private Integer bufferSize;

    private Long filePosition;

    private Integer readerSpid;

    private Date startTime;

    private Date lastEventTime;

    private Long eventCount;

    private Integer droppedEventCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Long getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Integer getMaxFiles() {
        return maxFiles;
    }

    public void setMaxFiles(Integer maxFiles) {
        this.maxFiles = maxFiles;
    }

    public Boolean getIsRowset() {
        return isRowset;
    }

    public void setIsRowset(Boolean isRowset) {
        this.isRowset = isRowset;
    }

    public Boolean getIsRollover() {
        return isRollover;
    }

    public void setIsRollover(Boolean isRollover) {
        this.isRollover = isRollover;
    }

    public Boolean getIsShutdown() {
        return isShutdown;
    }

    public void setIsShutdown(Boolean isShutdown) {
        this.isShutdown = isShutdown;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getBufferCount() {
        return bufferCount;
    }

    public void setBufferCount(Integer bufferCount) {
        this.bufferCount = bufferCount;
    }

    public Integer getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(Integer bufferSize) {
        this.bufferSize = bufferSize;
    }

    public Long getFilePosition() {
        return filePosition;
    }

    public void setFilePosition(Long filePosition) {
        this.filePosition = filePosition;
    }

    public Integer getReaderSpid() {
        return readerSpid;
    }

    public void setReaderSpid(Integer readerSpid) {
        this.readerSpid = readerSpid;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getLastEventTime() {
        return lastEventTime;
    }

    public void setLastEventTime(Date lastEventTime) {
        this.lastEventTime = lastEventTime;
    }

    public Long getEventCount() {
        return eventCount;
    }

    public void setEventCount(Long eventCount) {
        this.eventCount = eventCount;
    }

    public Integer getDroppedEventCount() {
        return droppedEventCount;
    }

    public void setDroppedEventCount(Integer droppedEventCount) {
        this.droppedEventCount = droppedEventCount;
    }
}