package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ConversationEndpoints;

public interface ConversationEndpointsMapper {
    int insert(ConversationEndpoints record);

    int insertSelective(ConversationEndpoints record);
}