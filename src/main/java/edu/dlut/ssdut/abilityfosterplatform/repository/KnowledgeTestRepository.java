package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Wdz
 * @Date 2021/3/12 16:33
 * @Description:
 */
public interface KnowledgeTestRepository extends JpaRepository<KnowledgeTest, Integer> {

    List<KnowledgeTest> findAllByCourseIdAndAndKnowledgeId(Integer courseId, Integer knowledgeId);

    List<KnowledgeTest> findAllByCourseId(Integer courseId);

}
