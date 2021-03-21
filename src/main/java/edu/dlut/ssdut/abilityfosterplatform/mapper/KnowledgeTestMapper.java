package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.ClassTestDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;

import java.util.List;

public interface KnowledgeTestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KnowledgeTest record);

    int insertSelective(KnowledgeTest record);

    KnowledgeTest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(KnowledgeTest record);

    int updateByPrimaryKey(KnowledgeTest record);

    List<KnowledgeTest> getTestByTestIds(List<Integer> testIds, int chapterId);

    List<KnowledgeTest> findListByCourseIdAndChapterId(int courseId, int chapterId);

    List<ClassTestDTO> findClassWorkInfo(int classroomId, int chapterId);
}