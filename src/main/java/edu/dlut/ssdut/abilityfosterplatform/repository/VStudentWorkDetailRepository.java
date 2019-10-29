package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
public interface VStudentWorkDetailRepository extends JpaRepository<VStudentWorkDetail, Integer> {
    List<VStudentWorkDetail> findAllByStudentWorkId(Integer studentWorkId);
}
