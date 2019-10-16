package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmBrokerActivatedTasks;

public interface DmBrokerActivatedTasksMapper {
    int insert(DmBrokerActivatedTasks record);

    int insertSelective(DmBrokerActivatedTasks record);
}