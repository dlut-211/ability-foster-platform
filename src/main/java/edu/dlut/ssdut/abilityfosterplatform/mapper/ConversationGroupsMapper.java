package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ConversationGroups;

public interface ConversationGroupsMapper {
    int insert(ConversationGroups record);

    int insertSelective(ConversationGroups record);
}