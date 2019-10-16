package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsWindowsInfo {
    private String windowsRelease;

    private String windowsServicePackLevel;

    private Integer windowsSku;

    private Integer osLanguageVersion;

    public String getWindowsRelease() {
        return windowsRelease;
    }

    public void setWindowsRelease(String windowsRelease) {
        this.windowsRelease = windowsRelease == null ? null : windowsRelease.trim();
    }

    public String getWindowsServicePackLevel() {
        return windowsServicePackLevel;
    }

    public void setWindowsServicePackLevel(String windowsServicePackLevel) {
        this.windowsServicePackLevel = windowsServicePackLevel == null ? null : windowsServicePackLevel.trim();
    }

    public Integer getWindowsSku() {
        return windowsSku;
    }

    public void setWindowsSku(Integer windowsSku) {
        this.windowsSku = windowsSku;
    }

    public Integer getOsLanguageVersion() {
        return osLanguageVersion;
    }

    public void setOsLanguageVersion(Integer osLanguageVersion) {
        this.osLanguageVersion = osLanguageVersion;
    }
}