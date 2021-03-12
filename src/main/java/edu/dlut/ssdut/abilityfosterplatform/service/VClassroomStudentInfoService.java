package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomStudentInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/26
 * DESCRIPTION:
 **/
public interface VClassroomStudentInfoService {
    Page<VClassroomStudentInfo> VStudentWorkInfoPage(Integer StudentId, Pageable pageable);

    List<VClassroomStudentInfo> getAllClassroomByStudentId(int studentId);
}
