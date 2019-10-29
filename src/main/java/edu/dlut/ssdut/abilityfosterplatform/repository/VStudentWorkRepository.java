package edu.dlut.ssdut.abilityfosterplatform.repository;


import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
public interface VStudentWorkRepository extends JpaRepository<VStudentWork, Integer> {

    List<VStudentWork> findAllByClassroomWorkId(Integer classroomWorkId);

    Integer countByClassroomWorkId(Integer classroomWorkId);

    @Query("select count(o.isSubmit) from VStudentWork o where o.isSubmit = 1 and o.classroomWorkId = ?1")
    Integer getSubmitCount(Integer classroomWorkId);

    @Query("select count(o.score) from VStudentWork o where o.score IS NOT NULL and o.classroomWorkId = ?1")
    Integer getScoreCount(Integer classroomWorkId);

    @Query("select SUM(o.score) from VStudentWork o where o.classroomWorkId = ?1")
    Integer sumScore(Integer classroomWorkId);
}
