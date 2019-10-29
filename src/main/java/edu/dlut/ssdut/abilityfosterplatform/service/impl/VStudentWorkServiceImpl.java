package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.converter.TimeFormatConverter;
import edu.dlut.ssdut.abilityfosterplatform.dto.StudentWorkDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import edu.dlut.ssdut.abilityfosterplatform.repository.VStudentWorkRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkService;
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
 * DESCRIPTION: 学生作业业务逻辑实现层
 **/
@Service
public class VStudentWorkServiceImpl implements VStudentWorkService {

    @Autowired
    private VStudentWorkRepository repository;

    /**
     * 获取班级作业列表
     * @param classroomWorkId
     * @return
     */
    @Transactional
    @Override
    public StudentWorkDTO findStudentWork(Integer classroomWorkId) {
        StudentWorkDTO studentWorkDTO = new StudentWorkDTO();
        List<VStudentWork> vStudentWorkList = repository.findAllByClassroomWorkId(classroomWorkId);
        // 1 判断查询到到列表是否为空
        if (CollectionUtils.isEmpty(vStudentWorkList)) {
            return studentWorkDTO;
        }
        studentWorkDTO.setScoreCount(repository.getScoreCount(classroomWorkId));
        studentWorkDTO.setSubmitCount(repository.getSubmitCount(classroomWorkId));
        float completionRate = 0.0f;
        if (!ObjectUtils.isEmpty(repository.getSubmitCount(classroomWorkId)) && !ObjectUtils.isEmpty(repository.countByClassroomWorkId(classroomWorkId))) {
            // 3 计算完成率
            completionRate = (float) (100 * repository.getSubmitCount(classroomWorkId) / repository.countByClassroomWorkId(classroomWorkId));
        }
        float avgScore = 0.0f;
        if (!ObjectUtils.isEmpty(repository.getScoreCount(classroomWorkId)) && !ObjectUtils.isEmpty(repository.sumScore(classroomWorkId))) {
            // 4 计算平均分
            avgScore = (float) (repository.sumScore(classroomWorkId) / repository.getScoreCount(classroomWorkId));
        }
        studentWorkDTO.setCompletionRate(completionRate);
        studentWorkDTO.setAvgScore(avgScore);
        // 2 拼装List<VStudentWorkDTO>
        List<VStudentWorkDTO> vStudentWorkDTOList = new ArrayList<>();
        for (VStudentWork vStudentWork : vStudentWorkList) {
            VStudentWorkDTO vStudentWorkDTO = new VStudentWorkDTO();
            BeanUtils.copyProperties(vStudentWork, vStudentWorkDTO);
            // 2.1 useTime格式化
            if (!ObjectUtils.isEmpty(vStudentWork.getUseTime())) {
                vStudentWorkDTO.setUseTimeFormat(TimeFormatConverter.second2DHMS(vStudentWork.getUseTime()));
            }
            vStudentWorkDTOList.add(vStudentWorkDTO);
        }
        studentWorkDTO.setVStudentWorkDTOList(vStudentWorkDTOList);
        return studentWorkDTO;
    }
}
