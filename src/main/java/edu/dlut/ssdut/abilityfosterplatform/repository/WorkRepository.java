package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/24 17:17
 * @Description:
 **/
public interface WorkRepository extends JpaRepository<Work, Integer> {
    List<Work> findAllByChapterId(Integer chapterId);
}
