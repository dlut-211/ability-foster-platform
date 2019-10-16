package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsDispatchers {
    private String state;

    private Long waitDuration;

    private Long currentItemDuration;

    private Long itemsProcessed;

    private Integer fadeEndTime;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getWaitDuration() {
        return waitDuration;
    }

    public void setWaitDuration(Long waitDuration) {
        this.waitDuration = waitDuration;
    }

    public Long getCurrentItemDuration() {
        return currentItemDuration;
    }

    public void setCurrentItemDuration(Long currentItemDuration) {
        this.currentItemDuration = currentItemDuration;
    }

    public Long getItemsProcessed() {
        return itemsProcessed;
    }

    public void setItemsProcessed(Long itemsProcessed) {
        this.itemsProcessed = itemsProcessed;
    }

    public Integer getFadeEndTime() {
        return fadeEndTime;
    }

    public void setFadeEndTime(Integer fadeEndTime) {
        this.fadeEndTime = fadeEndTime;
    }
}