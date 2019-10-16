package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmReplArticlesWithBLOBs;

public interface DmReplArticlesMapper {
    int insert(DmReplArticlesWithBLOBs record);

    int insertSelective(DmReplArticlesWithBLOBs record);
}