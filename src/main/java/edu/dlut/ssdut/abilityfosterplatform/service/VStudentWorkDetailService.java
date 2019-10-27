package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkDetailDTO;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
public interface VStudentWorkDetailService {
    List<VStudentWorkDetailDTO> findAllByStudentWorkId(Integer studentWorkId);
}
