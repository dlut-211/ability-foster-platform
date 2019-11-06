package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
public interface VStudentWorkDetailRepository extends JpaRepository<VStudentWorkDetail, Integer> {
    Page<VStudentWorkDetail> findAllByStudentWorkId(Integer studentWorkId, Pageable pageable);
}
