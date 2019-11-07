package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.dto.PStudentTestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentTestPaper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: lhd
 * @Date 2019/10/26 14:01
 * @Description:
 **/
public interface VStudentTestPaperRepository extends JpaRepository<PStudentTestPaperDTO, Integer> {
    @Query(value="SELECT * from (SELECT  @rownum\\:=@rownum+1 as id, v_student_test_paper.* \n" +
            " FROM v_student_test_paper ,(select @rownum\\:=0) temp \n" +
            "WHERE test_paper_id = ?) as A" +
            "\tGROUP BY student_number,student_name,test_paper_id,detail_type",nativeQuery = true)
    List<PStudentTestPaperDTO> getVStudentTestPapersByTestPaperId(Integer testPaperId);

    @Query(value="\t\t select COUNT(*) from \n" +
            "\t\t\t\t(SELECT count(*) \n" +
            "\t\t\t\t\t\tFROM ( SELECT student_number,student_name,test_paper_id,detail_type,detail_number,score  \n" +
            "\t\t\t\t\t\t\t\t\tFROM v_student_test_paper \n" +
            "\t\t\t\t\t\t\t\t\tWHERE test_paper_id = ?) as A\n" +
            "\t\tGROUP BY student_number,student_name,test_paper_id,detail_type) as B",nativeQuery = true)
    int getCountStudentTestPaper(Integer testPaperId);

    @Query(value="SELECT sum(case detail_number when ? then score else 0 end)\n" +
            "\tFROM ( \n" +
            "\t\tSELECT student_number,student_name,test_paper_id,detail_type,detail_number,score  FROM v_student_test_paper WHERE test_paper_id = ?) AS A GROUP BY student_number,student_name,test_paper_id,detail_type",nativeQuery = true)
    int[] getScoreByDAndDetailNumberAndTestPaperId(Integer detailNumber,Integer testPaperId);
}
