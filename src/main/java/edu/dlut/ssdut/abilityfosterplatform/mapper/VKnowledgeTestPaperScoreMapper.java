package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VKnowledgeTestPaperScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface VKnowledgeTestPaperScoreMapper {
    int insert(VKnowledgeTestPaperScore record);

    int insertSelective(VKnowledgeTestPaperScore record);

    ArrayList<VKnowledgeTestPaperScore> selectByPaperId(int paperId);
}