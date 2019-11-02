package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATETIME: 2019/11/1 - 08:29
 * DESCRIPTION:
 **/
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {

    List<Classroom> findAllByCourseId(Integer courseId);

}
