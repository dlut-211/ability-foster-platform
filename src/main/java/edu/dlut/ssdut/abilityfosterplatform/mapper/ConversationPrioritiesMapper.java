package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ConversationPriorities;

public interface ConversationPrioritiesMapper {
    int insert(ConversationPriorities record);

    int insertSelective(ConversationPriorities record);
}