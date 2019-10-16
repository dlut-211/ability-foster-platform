package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.CertificatesWithBLOBs;

public interface CertificatesMapper {
    int insert(CertificatesWithBLOBs record);

    int insertSelective(CertificatesWithBLOBs record);
}