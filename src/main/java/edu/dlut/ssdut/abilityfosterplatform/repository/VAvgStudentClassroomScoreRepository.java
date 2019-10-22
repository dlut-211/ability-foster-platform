package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VAvgStudentClassroomScore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author: raymond
 * @Date 2019/10/22 10:13
 * @Description: 展示各个班级内的学生排名
 **/
public interface VAvgStudentClassroomScoreRepository extends JpaRepository<VAvgStudentClassroomScore, Integer> {
    @Query(value = "select \n" +
            "\t\t*, @row_num\\:=@row_num+1 as id\n" +
            "from (\n" +
            "\t\tselect  \n" +
            "\t\t\t@row_num\\:=CASE when @classroom_id=v.classroom_id then @row_num+1 else 1 end as rank,\n" +
            "\t\t\tv.student_id, @classroom_id\\:=v.classroom_id as classroom_id, v.classroom_name, v.avg_score\n" +
            "\t\tfrom\n" +
            "\t\t(\n" +
            "\t\t\tselect \n" +
            "\t\t\t\t*\n" +
            "\t\t\tfrom v_avg_student_classroom_score\n" +
            "\t\t) v ,(select @row_num\\:=1, @classroom_id\\:='') as temp\n" +
            "\t\tORDER BY v.classroom_id, v.avg_score DESC, v.student_id\n" +
            ") temp", nativeQuery = true)
    Page<VAvgStudentClassroomScore> findVAvgStudentClassroomScores(Pageable pageable);
}
