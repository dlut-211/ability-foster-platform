package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmLogpoolHashentries;

public interface DmLogpoolHashentriesMapper {
    int insert(DmLogpoolHashentries record);

    int insertSelective(DmLogpoolHashentries record);
}