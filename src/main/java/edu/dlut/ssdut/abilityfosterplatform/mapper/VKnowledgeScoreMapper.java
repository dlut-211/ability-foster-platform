package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VKnowledgeScore;

public interface VKnowledgeScoreMapper {
    int insert(VKnowledgeScore record);

    int insertSelective(VKnowledgeScore record);
}