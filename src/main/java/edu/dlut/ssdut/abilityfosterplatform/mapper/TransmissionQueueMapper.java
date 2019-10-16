package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TransmissionQueue;

public interface TransmissionQueueMapper {
    int insert(TransmissionQueue record);

    int insertSelective(TransmissionQueue record);
}