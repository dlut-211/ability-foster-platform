package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysrowsetsWithBLOBs;

public interface SysrowsetsMapper {
    int insert(SysrowsetsWithBLOBs record);

    int insertSelective(SysrowsetsWithBLOBs record);
}