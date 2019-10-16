package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Certificates {
    private String name;

    private Integer certificateId;

    private Integer principalId;

    private String pvtKeyEncryptionType;

    private String pvtKeyEncryptionTypeDesc;

    private Boolean isActiveForBeginDialog;

    private String issuerName;

    private String certSerialNumber;

    private String stringSid;

    private String subject;

    private Date expiryDate;

    private Date startDate;

    private String attestedBy;

    private Date pvtKeyLastBackupDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getPvtKeyEncryptionType() {
        return pvtKeyEncryptionType;
    }

    public void setPvtKeyEncryptionType(String pvtKeyEncryptionType) {
        this.pvtKeyEncryptionType = pvtKeyEncryptionType == null ? null : pvtKeyEncryptionType.trim();
    }

    public String getPvtKeyEncryptionTypeDesc() {
        return pvtKeyEncryptionTypeDesc;
    }

    public void setPvtKeyEncryptionTypeDesc(String pvtKeyEncryptionTypeDesc) {
        this.pvtKeyEncryptionTypeDesc = pvtKeyEncryptionTypeDesc == null ? null : pvtKeyEncryptionTypeDesc.trim();
    }

    public Boolean getIsActiveForBeginDialog() {
        return isActiveForBeginDialog;
    }

    public void setIsActiveForBeginDialog(Boolean isActiveForBeginDialog) {
        this.isActiveForBeginDialog = isActiveForBeginDialog;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName == null ? null : issuerName.trim();
    }

    public String getCertSerialNumber() {
        return certSerialNumber;
    }

    public void setCertSerialNumber(String certSerialNumber) {
        this.certSerialNumber = certSerialNumber == null ? null : certSerialNumber.trim();
    }

    public String getStringSid() {
        return stringSid;
    }

    public void setStringSid(String stringSid) {
        this.stringSid = stringSid == null ? null : stringSid.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getAttestedBy() {
        return attestedBy;
    }

    public void setAttestedBy(String attestedBy) {
        this.attestedBy = attestedBy == null ? null : attestedBy.trim();
    }

    public Date getPvtKeyLastBackupDate() {
        return pvtKeyLastBackupDate;
    }

    public void setPvtKeyLastBackupDate(Date pvtKeyLastBackupDate) {
        this.pvtKeyLastBackupDate = pvtKeyLastBackupDate;
    }
}