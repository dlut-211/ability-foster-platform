package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecBackgroundJobQueue;

public interface DmExecBackgroundJobQueueMapper {
    int insert(DmExecBackgroundJobQueue record);

    int insertSelective(DmExecBackgroundJobQueue record);
}