package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.WorkKnowledge;

public interface WorkKnowledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkKnowledge record);

    int insertSelective(WorkKnowledge record);

    WorkKnowledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkKnowledge record);

    int updateByPrimaryKey(WorkKnowledge record);
}