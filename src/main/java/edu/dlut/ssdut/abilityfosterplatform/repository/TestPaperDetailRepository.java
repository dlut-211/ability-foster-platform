package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION:
 **/
public interface TestPaperDetailRepository extends JpaRepository<TestPaperDetail, Integer> {
    List<TestPaperDetail> findAllByTestPaperId(Integer testPaperId);
}
