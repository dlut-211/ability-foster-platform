package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    /** 通过课程编号和课程名称模糊查询课程列表 **/
    List<Course> findByCodeContainingAndNameContaining(String code, String name);
}
