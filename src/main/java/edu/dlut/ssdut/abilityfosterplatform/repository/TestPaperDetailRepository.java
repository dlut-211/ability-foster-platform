package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION:
 **/
public interface TestPaperDetailRepository extends JpaRepository<TestPaperDetail, Integer> {

    @Query(value = "select count(*) from test_paper_detail where test_paper_id = ? AND detail_type = 1 order by detail_number",nativeQuery = true)
    int getCountByTestPaperId(Integer testPaperId);

    List<TestPaperDetail> findAllByTestPaperId(Integer testPaperId);

}
