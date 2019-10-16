package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsSpinlockStats {
    private String name;

    private Long collisions;

    private Long spins;

    private Float spinsPerCollision;

    private Long sleepTime;

    private Integer backoffs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCollisions() {
        return collisions;
    }

    public void setCollisions(Long collisions) {
        this.collisions = collisions;
    }

    public Long getSpins() {
        return spins;
    }

    public void setSpins(Long spins) {
        this.spins = spins;
    }

    public Float getSpinsPerCollision() {
        return spinsPerCollision;
    }

    public void setSpinsPerCollision(Float spinsPerCollision) {
        this.spinsPerCollision = spinsPerCollision;
    }

    public Long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(Long sleepTime) {
        this.sleepTime = sleepTime;
    }

    public Integer getBackoffs() {
        return backoffs;
    }

    public void setBackoffs(Integer backoffs) {
        this.backoffs = backoffs;
    }
}