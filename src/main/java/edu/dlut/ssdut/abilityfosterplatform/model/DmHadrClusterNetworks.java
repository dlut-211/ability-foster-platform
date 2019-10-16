package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmHadrClusterNetworks {
    private String memberName;

    private String networkSubnetIp;

    private String networkSubnetIpv4Mask;

    private Integer networkSubnetPrefixLength;

    private Boolean isPublic;

    private Boolean isIpv4;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getNetworkSubnetIp() {
        return networkSubnetIp;
    }

    public void setNetworkSubnetIp(String networkSubnetIp) {
        this.networkSubnetIp = networkSubnetIp == null ? null : networkSubnetIp.trim();
    }

    public String getNetworkSubnetIpv4Mask() {
        return networkSubnetIpv4Mask;
    }

    public void setNetworkSubnetIpv4Mask(String networkSubnetIpv4Mask) {
        this.networkSubnetIpv4Mask = networkSubnetIpv4Mask == null ? null : networkSubnetIpv4Mask.trim();
    }

    public Integer getNetworkSubnetPrefixLength() {
        return networkSubnetPrefixLength;
    }

    public void setNetworkSubnetPrefixLength(Integer networkSubnetPrefixLength) {
        this.networkSubnetPrefixLength = networkSubnetPrefixLength;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getIsIpv4() {
        return isIpv4;
    }

    public void setIsIpv4(Boolean isIpv4) {
        this.isIpv4 = isIpv4;
    }
}