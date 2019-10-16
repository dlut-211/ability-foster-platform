package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbMirroringPastActions;

public interface DmDbMirroringPastActionsMapper {
    int insert(DmDbMirroringPastActions record);

    int insertSelective(DmDbMirroringPastActions record);
}