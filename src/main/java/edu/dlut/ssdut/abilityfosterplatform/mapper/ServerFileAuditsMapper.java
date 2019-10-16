package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerFileAudits;

public interface ServerFileAuditsMapper {
    int insert(ServerFileAudits record);

    int insertSelective(ServerFileAudits record);
}