package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.converter.TimeFormatConverter;
import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentWorkDetailMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkDetail;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkDetail;
import edu.dlut.ssdut.abilityfosterplatform.repository.VStudentWorkDetailRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkDetailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
@Service
public class VStudentWorkDetailServiceImpl implements VStudentWorkDetailService {

    @Autowired
    private VStudentWorkDetailRepository vStudentWorkDetailRepository;

    @Autowired
    private StudentWorkDetailMapper studentWorkDetailMapper;
    /**
     * 按照学生作业ID获取学生作业详情列表
     * @param studentWorkId
     * @return
     */
    @Transactional
    @Override
    public List<VStudentWorkDetailDTO> findAllByStudentWorkId(Integer studentWorkId) {
        List<VStudentWorkDetailDTO> vStudentWorkDetailDTOList = new ArrayList<>();
        List<VStudentWorkDetail> vStudentWorkDetailList = vStudentWorkDetailRepository.findAllByStudentWorkId(studentWorkId);
        if (CollectionUtils.isEmpty(vStudentWorkDetailList)) {
            return vStudentWorkDetailDTOList;
        }
        for (VStudentWorkDetail vStudentWorkDetail : vStudentWorkDetailList) {
            VStudentWorkDetailDTO vStudentWorkDetailDTO = new VStudentWorkDetailDTO();
            BeanUtils.copyProperties(vStudentWorkDetail, vStudentWorkDetailDTO);
            if (!ObjectUtils.isEmpty(vStudentWorkDetail.getUseTime())) {
                vStudentWorkDetailDTO.setUseTimeFormat(TimeFormatConverter.second2DHMS(vStudentWorkDetail.getUseTime()));
            }
            vStudentWorkDetailDTOList.add(vStudentWorkDetailDTO);
        }
        return vStudentWorkDetailDTOList;
    }

    @Override
    public Integer insert(StudentWorkDetail studentWorkDetail) {
        return studentWorkDetailMapper.insert(studentWorkDetail);
    }
}
