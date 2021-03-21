package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.ClassTestDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;

import java.util.List;

/**
 * @Author: Wdz
 * @Date 2021/3/12 16:59
 * @Description:
 */
public interface KnowledgeTestService {
    KnowledgeTest add(KnowledgeTest knowledgeTest);

    List<KnowledgeTest> list(Integer courseId, Integer chapterId);

    int edit(KnowledgeTest knowledgeTest);

    void delect(Long id);

    List<KnowledgeTest> findTreeInfo(Integer courseId, Integer knowledgeId);

    List<ClassTestDTO> findClassWorkInfo(Integer classroomId, Integer chapterId);
}
