package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VTestPaperDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: lhd
 * @Date: 2019/10/25 20:55
 * @Description:
 **/
public interface VTestPaperDetailRepository extends JpaRepository<VTestPaperDetail,String> {
    @Query(value = "select @rownum\\:=@rownum+1 as id, v_test_paper_detail.* \n" +
            "from v_test_paper_detail, (select @rownum\\:=0) temp\n"+
            "WHERE v_test_paper_detail.test_paper_id = ?1 and v_test_paper_detail.detail_type =?2"
            , nativeQuery = true)
    Page<VTestPaperDetail> findVTestPaperDetailByTestPaperIdAAndDetailType(Integer testPaperId,Integer detailType,Pageable pageable);
}
