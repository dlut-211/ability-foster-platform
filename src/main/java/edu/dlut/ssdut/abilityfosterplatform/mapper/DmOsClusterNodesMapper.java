package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsClusterNodes;

public interface DmOsClusterNodesMapper {
    int insert(DmOsClusterNodes record);

    int insertSelective(DmOsClusterNodes record);
}