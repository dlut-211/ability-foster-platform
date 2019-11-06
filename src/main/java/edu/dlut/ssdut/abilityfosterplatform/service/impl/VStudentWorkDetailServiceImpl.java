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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
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
    public Page<VStudentWorkDetailDTO> findAllByStudentWorkId(Integer studentWorkId, Pageable pageable) {
        Page<VStudentWorkDetail> vStudentWorkDetailPage = vStudentWorkDetailRepository.findAllByStudentWorkId(studentWorkId, pageable);
        List<VStudentWorkDetailDTO> vStudentWorkDetailDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(vStudentWorkDetailPage.getContent())) {
            for (VStudentWorkDetail vStudentWorkDetail : vStudentWorkDetailPage.getContent()) {
                VStudentWorkDetailDTO vStudentWorkDetailDTO = new VStudentWorkDetailDTO();
                BeanUtils.copyProperties(vStudentWorkDetail, vStudentWorkDetailDTO);
                if (!ObjectUtils.isEmpty(vStudentWorkDetail.getUseTime())) {
                    vStudentWorkDetailDTO.setUseTimeFormat(TimeFormatConverter.second2DHMS(vStudentWorkDetail.getUseTime()));
                }
                vStudentWorkDetailDTOList.add(vStudentWorkDetailDTO);
            }
        }
        Page<VStudentWorkDetailDTO> page = new PageImpl<>(vStudentWorkDetailDTOList, pageable, vStudentWorkDetailPage.getTotalElements());
        return page;
    }

    @Override
    public Integer insert(StudentWorkDetail studentWorkDetail) {
        return studentWorkDetailMapper.insert(studentWorkDetail);
    }

    @Override
    public List<StudentWorkDetail> selectByStudentWorkId(Integer studentWorkId) {
        return studentWorkDetailMapper.selectByStudentWorkId(studentWorkId);
    }
}
