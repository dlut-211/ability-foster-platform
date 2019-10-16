package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmHadrClusterMembers {
    private String memberName;

    private Byte memberType;

    private String memberTypeDesc;

    private Byte memberState;

    private String memberStateDesc;

    private Integer numberOfQuorumVotes;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Byte getMemberType() {
        return memberType;
    }

    public void setMemberType(Byte memberType) {
        this.memberType = memberType;
    }

    public String getMemberTypeDesc() {
        return memberTypeDesc;
    }

    public void setMemberTypeDesc(String memberTypeDesc) {
        this.memberTypeDesc = memberTypeDesc == null ? null : memberTypeDesc.trim();
    }

    public Byte getMemberState() {
        return memberState;
    }

    public void setMemberState(Byte memberState) {
        this.memberState = memberState;
    }

    public String getMemberStateDesc() {
        return memberStateDesc;
    }

    public void setMemberStateDesc(String memberStateDesc) {
        this.memberStateDesc = memberStateDesc == null ? null : memberStateDesc.trim();
    }

    public Integer getNumberOfQuorumVotes() {
        return numberOfQuorumVotes;
    }

    public void setNumberOfQuorumVotes(Integer numberOfQuorumVotes) {
        this.numberOfQuorumVotes = numberOfQuorumVotes;
    }
}