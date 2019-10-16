package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmBrokerForwardedMessages;

public interface DmBrokerForwardedMessagesMapper {
    int insert(DmBrokerForwardedMessages record);

    int insertSelective(DmBrokerForwardedMessages record);
}