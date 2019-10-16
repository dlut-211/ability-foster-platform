package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryCacheClockHands {
    private String name;

    private String type;

    private String clockHand;

    private String clockStatus;

    private Long roundsCount;

    private Long removedAllRoundsCount;

    private Long updatedLastRoundCount;

    private Long removedLastRoundCount;

    private Long lastTickTime;

    private Long roundStartTime;

    private Long lastRoundStartTime;

    private byte[] cacheAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getClockHand() {
        return clockHand;
    }

    public void setClockHand(String clockHand) {
        this.clockHand = clockHand == null ? null : clockHand.trim();
    }

    public String getClockStatus() {
        return clockStatus;
    }

    public void setClockStatus(String clockStatus) {
        this.clockStatus = clockStatus == null ? null : clockStatus.trim();
    }

    public Long getRoundsCount() {
        return roundsCount;
    }

    public void setRoundsCount(Long roundsCount) {
        this.roundsCount = roundsCount;
    }

    public Long getRemovedAllRoundsCount() {
        return removedAllRoundsCount;
    }

    public void setRemovedAllRoundsCount(Long removedAllRoundsCount) {
        this.removedAllRoundsCount = removedAllRoundsCount;
    }

    public Long getUpdatedLastRoundCount() {
        return updatedLastRoundCount;
    }

    public void setUpdatedLastRoundCount(Long updatedLastRoundCount) {
        this.updatedLastRoundCount = updatedLastRoundCount;
    }

    public Long getRemovedLastRoundCount() {
        return removedLastRoundCount;
    }

    public void setRemovedLastRoundCount(Long removedLastRoundCount) {
        this.removedLastRoundCount = removedLastRoundCount;
    }

    public Long getLastTickTime() {
        return lastTickTime;
    }

    public void setLastTickTime(Long lastTickTime) {
        this.lastTickTime = lastTickTime;
    }

    public Long getRoundStartTime() {
        return roundStartTime;
    }

    public void setRoundStartTime(Long roundStartTime) {
        this.roundStartTime = roundStartTime;
    }

    public Long getLastRoundStartTime() {
        return lastRoundStartTime;
    }

    public void setLastRoundStartTime(Long lastRoundStartTime) {
        this.lastRoundStartTime = lastRoundStartTime;
    }

    public byte[] getCacheAddress() {
        return cacheAddress;
    }

    public void setCacheAddress(byte[] cacheAddress) {
        this.cacheAddress = cacheAddress;
    }
}