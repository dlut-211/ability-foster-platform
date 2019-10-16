package edu.dlut.ssdut.abilityfosterplatform.model;

public class AvailabilityGroupListenerIpAddresses {
    private String listenerId;

    private String ipAddress;

    private String ipSubnetMask;

    private Boolean isDhcp;

    private String networkSubnetIp;

    private Integer networkSubnetPrefixLength;

    private String networkSubnetIpv4Mask;

    private Byte state;

    private String stateDesc;

    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId == null ? null : listenerId.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getIpSubnetMask() {
        return ipSubnetMask;
    }

    public void setIpSubnetMask(String ipSubnetMask) {
        this.ipSubnetMask = ipSubnetMask == null ? null : ipSubnetMask.trim();
    }

    public Boolean getIsDhcp() {
        return isDhcp;
    }

    public void setIsDhcp(Boolean isDhcp) {
        this.isDhcp = isDhcp;
    }

    public String getNetworkSubnetIp() {
        return networkSubnetIp;
    }

    public void setNetworkSubnetIp(String networkSubnetIp) {
        this.networkSubnetIp = networkSubnetIp == null ? null : networkSubnetIp.trim();
    }

    public Integer getNetworkSubnetPrefixLength() {
        return networkSubnetPrefixLength;
    }

    public void setNetworkSubnetPrefixLength(Integer networkSubnetPrefixLength) {
        this.networkSubnetPrefixLength = networkSubnetPrefixLength;
    }

    public String getNetworkSubnetIpv4Mask() {
        return networkSubnetIpv4Mask;
    }

    public void setNetworkSubnetIpv4Mask(String networkSubnetIpv4Mask) {
        this.networkSubnetIpv4Mask = networkSubnetIpv4Mask == null ? null : networkSubnetIpv4Mask.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }
}