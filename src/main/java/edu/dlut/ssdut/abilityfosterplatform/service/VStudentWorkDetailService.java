package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
public interface VStudentWorkDetailService {
    Integer insert(StudentWorkDetail studentWorkDetail);


    List<StudentWorkDetail> selectByStudentWorkId(Integer studentWorkId);

    Page<VStudentWorkDetailDTO> findAllByStudentWorkId(Integer studentWorkId, Pageable pageable);

}
