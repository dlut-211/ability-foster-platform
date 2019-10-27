package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomStudentInfo;
import edu.dlut.ssdut.abilityfosterplatform.repository.VClassroomStudentInfoRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.VClassroomStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/26
 * DESCRIPTION:
 **/
@Service
public class VClassroomStudentInfoServiceImpl implements VClassroomStudentInfoService {

    @Autowired
    private VClassroomStudentInfoRepository vClassroomStudentInfoRepository;

    @Override
    public Page<VClassroomStudentInfo> VStudentWorkInfoPage(Integer StudentId, Pageable pageable){
        return vClassroomStudentInfoRepository.findVStudentWorkByStudentId(StudentId, pageable);
    }
}
