package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.WorkKnowledge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/24 18:47
 * @Description:
 **/
public interface WorkKnowledgeRepository extends JpaRepository<WorkKnowledge, Integer> {
    List<WorkKnowledge> findAllByWorkId(Integer workId);
}
