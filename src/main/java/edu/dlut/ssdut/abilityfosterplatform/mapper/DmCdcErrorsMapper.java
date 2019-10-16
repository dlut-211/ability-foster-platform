package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmCdcErrors;

public interface DmCdcErrorsMapper {
    int insert(DmCdcErrors record);

    int insertSelective(DmCdcErrors record);
}