package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetailKnowledge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION:
 **/
public interface TestPaperDetailKnowledgeRepository extends JpaRepository<TestPaperDetailKnowledge, Integer> {
    List<TestPaperDetailKnowledge> findAllByTestPaperDetailId(Integer testPaperDetailId);
}
