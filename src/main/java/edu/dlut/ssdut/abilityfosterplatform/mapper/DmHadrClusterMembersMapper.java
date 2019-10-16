package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmHadrClusterMembers;

public interface DmHadrClusterMembersMapper {
    int insert(DmHadrClusterMembers record);

    int insertSelective(DmHadrClusterMembers record);
}