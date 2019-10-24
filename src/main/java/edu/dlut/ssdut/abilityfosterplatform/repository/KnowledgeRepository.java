package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Knowledge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/23 21:07
 * @Description: 知识点列表JPA
 **/
public interface KnowledgeRepository extends JpaRepository<Knowledge, Integer> {
    List<Knowledge> findAllByCourseId(Integer courseId);
}
